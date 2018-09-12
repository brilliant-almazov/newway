package com.rbkmoney.newway.poller.dominant;

import com.rbkmoney.damsel.domain_config.Commit;
import com.rbkmoney.damsel.domain_config.Operation;
import com.rbkmoney.damsel.domain_config.RepositorySrv;
import com.rbkmoney.newway.service.DominantService;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Service
@DependsOn("dbInitializer")
public class DominantPoller {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final List<DominantHandler> handlers;
    private final RepositorySrv.Iface dominantClient;
    private final int maxQuerySize;
    private long after;

    public DominantPoller(List<DominantHandler> handlers, RepositorySrv.Iface dominantClient,
                          DominantService dominantService, @Value("${dmt.polling.maxQuerySize}") int maxQuerySize) {
        this.handlers = handlers;
        this.dominantClient = dominantClient;
        this.after = dominantService.getLastVersionId().orElse(0L);
        this.maxQuerySize = maxQuerySize;
    }

    @Scheduled(fixedDelayString = "${dmt.polling.delay}")
    public void process() {
        Map<Long, Commit> pullRange = null;
        try {
            pullRange = dominantClient.pullRange(after, maxQuerySize);
            pullRange.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(e -> {
                List<Operation> operations = e.getValue().getOps();
                Long versionId = e.getKey();
                operations.forEach(op -> handlers.forEach(h -> {
                    if (h.accept(op)) {
                        h.handle(op, versionId);
                    }
                }));
                after = versionId;
            });
        } catch (TException e) {
            log.error("Error to polling dominant, versionId={}", after, e);
        } catch (RuntimeException e) {
            log.error("Unexpected error when polling dominant, versionId={}, pullRange={}", after, pullRange, e);
        }
    }
}
