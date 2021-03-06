package com.rbkmoney.newway.poller.event_stock.impl.deposit;

import com.rbkmoney.fistful.cashflow.FinalCashFlowPosting;
import com.rbkmoney.fistful.deposit.Change;
import com.rbkmoney.fistful.deposit.SinkEvent;
import com.rbkmoney.geck.common.util.TypeUtil;
import com.rbkmoney.geck.filter.Filter;
import com.rbkmoney.geck.filter.PathConditionFilter;
import com.rbkmoney.geck.filter.condition.IsNullCondition;
import com.rbkmoney.geck.filter.rule.PathConditionRule;
import com.rbkmoney.newway.dao.deposit.iface.DepositDao;
import com.rbkmoney.newway.dao.withdrawal.iface.FistfulCashFlowDao;
import com.rbkmoney.newway.domain.enums.DepositTransferStatus;
import com.rbkmoney.newway.domain.enums.FistfulCashFlowChangeType;
import com.rbkmoney.newway.domain.tables.pojos.Deposit;
import com.rbkmoney.newway.domain.tables.pojos.FistfulCashFlow;
import com.rbkmoney.newway.util.CashFlowUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class DepositTransferCreatedHandler extends AbstractDepositHandler {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final DepositDao depositDao;

    private final FistfulCashFlowDao fistfulCashFlowDao;

    private final Filter filter;

    public DepositTransferCreatedHandler(DepositDao depositDao, FistfulCashFlowDao fistfulCashFlowDao) {
        this.depositDao = depositDao;
        this.fistfulCashFlowDao = fistfulCashFlowDao;
        this.filter = new PathConditionFilter(new PathConditionRule("transfer.payload.created.transfer.cashflow", new IsNullCondition().not()));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void handle(Change change, SinkEvent event) {
        List<FinalCashFlowPosting> postings = change.getTransfer().getPayload().getCreated().getTransfer().getCashflow().getPostings();

        log.info("Start deposit transfer created handling, eventId={}, depositId={}, transferChange={}", event.getId(), event.getSource(), change.getTransfer());

        Deposit deposit = depositDao.get(event.getSource());

        deposit.setId(null);
        deposit.setWtime(null);
        deposit.setEventId(event.getId());
        deposit.setSequenceId(event.getPayload().getSequence());
        deposit.setEventCreatedAt(TypeUtil.stringToLocalDateTime(event.getCreatedAt()));
        deposit.setEventOccuredAt(TypeUtil.stringToLocalDateTime(event.getPayload().getOccuredAt()));
        deposit.setDepositId(event.getSource());
        deposit.setDepositTransferStatus(DepositTransferStatus.created);

        deposit.setFee(CashFlowUtil.getFistfulFee(postings));
        deposit.setProviderFee(CashFlowUtil.getFistfulProviderFee(postings));

        depositDao.updateNotCurrent(event.getSource());
        long id = depositDao.save(deposit);

        List<FistfulCashFlow> fistfulCashFlows = CashFlowUtil.convertFistfulCashFlows(postings, id, FistfulCashFlowChangeType.deposit);
        fistfulCashFlowDao.save(fistfulCashFlows);
        log.info("Deposit transfer have been saved, eventId={}, depositId={}, transferChange={}", event.getId(), event.getSource(), change.getTransfer());
    }

    @Override
    public Filter<Change> getFilter() {
        return filter;
    }
}
