/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.pojos;


import com.rbkmoney.newway.domain.enums.DestinationStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Destination implements Serializable {

    private static final long serialVersionUID = -1394786923;

    private Long              id;
    private Long              eventId;
    private LocalDateTime     eventCreatedAt;
    private LocalDateTime     eventOccuredAt;
    private Integer           sequenceId;
    private String            destinationId;
    private String            destinationName;
    private DestinationStatus destinationStatus;
    private String            resourceBankCardToken;
    private String            resourceBankCardPaymentSystem;
    private String            resourceBankCardBin;
    private String            resourceBankCardMaskedPan;
    private String            accountId;
    private String            identityId;
    private String            partyId;
    private Long              accounterAccountId;
    private String            currencyCode;
    private LocalDateTime     wtime;
    private Boolean           current;

    public Destination() {}

    public Destination(Destination value) {
        this.id = value.id;
        this.eventId = value.eventId;
        this.eventCreatedAt = value.eventCreatedAt;
        this.eventOccuredAt = value.eventOccuredAt;
        this.sequenceId = value.sequenceId;
        this.destinationId = value.destinationId;
        this.destinationName = value.destinationName;
        this.destinationStatus = value.destinationStatus;
        this.resourceBankCardToken = value.resourceBankCardToken;
        this.resourceBankCardPaymentSystem = value.resourceBankCardPaymentSystem;
        this.resourceBankCardBin = value.resourceBankCardBin;
        this.resourceBankCardMaskedPan = value.resourceBankCardMaskedPan;
        this.accountId = value.accountId;
        this.identityId = value.identityId;
        this.partyId = value.partyId;
        this.accounterAccountId = value.accounterAccountId;
        this.currencyCode = value.currencyCode;
        this.wtime = value.wtime;
        this.current = value.current;
    }

    public Destination(
        Long              id,
        Long              eventId,
        LocalDateTime     eventCreatedAt,
        LocalDateTime     eventOccuredAt,
        Integer           sequenceId,
        String            destinationId,
        String            destinationName,
        DestinationStatus destinationStatus,
        String            resourceBankCardToken,
        String            resourceBankCardPaymentSystem,
        String            resourceBankCardBin,
        String            resourceBankCardMaskedPan,
        String            accountId,
        String            identityId,
        String            partyId,
        Long              accounterAccountId,
        String            currencyCode,
        LocalDateTime     wtime,
        Boolean           current
    ) {
        this.id = id;
        this.eventId = eventId;
        this.eventCreatedAt = eventCreatedAt;
        this.eventOccuredAt = eventOccuredAt;
        this.sequenceId = sequenceId;
        this.destinationId = destinationId;
        this.destinationName = destinationName;
        this.destinationStatus = destinationStatus;
        this.resourceBankCardToken = resourceBankCardToken;
        this.resourceBankCardPaymentSystem = resourceBankCardPaymentSystem;
        this.resourceBankCardBin = resourceBankCardBin;
        this.resourceBankCardMaskedPan = resourceBankCardMaskedPan;
        this.accountId = accountId;
        this.identityId = identityId;
        this.partyId = partyId;
        this.accounterAccountId = accounterAccountId;
        this.currencyCode = currencyCode;
        this.wtime = wtime;
        this.current = current;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return this.eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public LocalDateTime getEventCreatedAt() {
        return this.eventCreatedAt;
    }

    public void setEventCreatedAt(LocalDateTime eventCreatedAt) {
        this.eventCreatedAt = eventCreatedAt;
    }

    public LocalDateTime getEventOccuredAt() {
        return this.eventOccuredAt;
    }

    public void setEventOccuredAt(LocalDateTime eventOccuredAt) {
        this.eventOccuredAt = eventOccuredAt;
    }

    public Integer getSequenceId() {
        return this.sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getDestinationId() {
        return this.destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getDestinationName() {
        return this.destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public DestinationStatus getDestinationStatus() {
        return this.destinationStatus;
    }

    public void setDestinationStatus(DestinationStatus destinationStatus) {
        this.destinationStatus = destinationStatus;
    }

    public String getResourceBankCardToken() {
        return this.resourceBankCardToken;
    }

    public void setResourceBankCardToken(String resourceBankCardToken) {
        this.resourceBankCardToken = resourceBankCardToken;
    }

    public String getResourceBankCardPaymentSystem() {
        return this.resourceBankCardPaymentSystem;
    }

    public void setResourceBankCardPaymentSystem(String resourceBankCardPaymentSystem) {
        this.resourceBankCardPaymentSystem = resourceBankCardPaymentSystem;
    }

    public String getResourceBankCardBin() {
        return this.resourceBankCardBin;
    }

    public void setResourceBankCardBin(String resourceBankCardBin) {
        this.resourceBankCardBin = resourceBankCardBin;
    }

    public String getResourceBankCardMaskedPan() {
        return this.resourceBankCardMaskedPan;
    }

    public void setResourceBankCardMaskedPan(String resourceBankCardMaskedPan) {
        this.resourceBankCardMaskedPan = resourceBankCardMaskedPan;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getPartyId() {
        return this.partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public Long getAccounterAccountId() {
        return this.accounterAccountId;
    }

    public void setAccounterAccountId(Long accounterAccountId) {
        this.accounterAccountId = accounterAccountId;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public LocalDateTime getWtime() {
        return this.wtime;
    }

    public void setWtime(LocalDateTime wtime) {
        this.wtime = wtime;
    }

    public Boolean getCurrent() {
        return this.current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Destination other = (Destination) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (eventId == null) {
            if (other.eventId != null)
                return false;
        }
        else if (!eventId.equals(other.eventId))
            return false;
        if (eventCreatedAt == null) {
            if (other.eventCreatedAt != null)
                return false;
        }
        else if (!eventCreatedAt.equals(other.eventCreatedAt))
            return false;
        if (eventOccuredAt == null) {
            if (other.eventOccuredAt != null)
                return false;
        }
        else if (!eventOccuredAt.equals(other.eventOccuredAt))
            return false;
        if (sequenceId == null) {
            if (other.sequenceId != null)
                return false;
        }
        else if (!sequenceId.equals(other.sequenceId))
            return false;
        if (destinationId == null) {
            if (other.destinationId != null)
                return false;
        }
        else if (!destinationId.equals(other.destinationId))
            return false;
        if (destinationName == null) {
            if (other.destinationName != null)
                return false;
        }
        else if (!destinationName.equals(other.destinationName))
            return false;
        if (destinationStatus == null) {
            if (other.destinationStatus != null)
                return false;
        }
        else if (!destinationStatus.equals(other.destinationStatus))
            return false;
        if (resourceBankCardToken == null) {
            if (other.resourceBankCardToken != null)
                return false;
        }
        else if (!resourceBankCardToken.equals(other.resourceBankCardToken))
            return false;
        if (resourceBankCardPaymentSystem == null) {
            if (other.resourceBankCardPaymentSystem != null)
                return false;
        }
        else if (!resourceBankCardPaymentSystem.equals(other.resourceBankCardPaymentSystem))
            return false;
        if (resourceBankCardBin == null) {
            if (other.resourceBankCardBin != null)
                return false;
        }
        else if (!resourceBankCardBin.equals(other.resourceBankCardBin))
            return false;
        if (resourceBankCardMaskedPan == null) {
            if (other.resourceBankCardMaskedPan != null)
                return false;
        }
        else if (!resourceBankCardMaskedPan.equals(other.resourceBankCardMaskedPan))
            return false;
        if (accountId == null) {
            if (other.accountId != null)
                return false;
        }
        else if (!accountId.equals(other.accountId))
            return false;
        if (identityId == null) {
            if (other.identityId != null)
                return false;
        }
        else if (!identityId.equals(other.identityId))
            return false;
        if (partyId == null) {
            if (other.partyId != null)
                return false;
        }
        else if (!partyId.equals(other.partyId))
            return false;
        if (accounterAccountId == null) {
            if (other.accounterAccountId != null)
                return false;
        }
        else if (!accounterAccountId.equals(other.accounterAccountId))
            return false;
        if (currencyCode == null) {
            if (other.currencyCode != null)
                return false;
        }
        else if (!currencyCode.equals(other.currencyCode))
            return false;
        if (wtime == null) {
            if (other.wtime != null)
                return false;
        }
        else if (!wtime.equals(other.wtime))
            return false;
        if (current == null) {
            if (other.current != null)
                return false;
        }
        else if (!current.equals(other.current))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.eventId == null) ? 0 : this.eventId.hashCode());
        result = prime * result + ((this.eventCreatedAt == null) ? 0 : this.eventCreatedAt.hashCode());
        result = prime * result + ((this.eventOccuredAt == null) ? 0 : this.eventOccuredAt.hashCode());
        result = prime * result + ((this.sequenceId == null) ? 0 : this.sequenceId.hashCode());
        result = prime * result + ((this.destinationId == null) ? 0 : this.destinationId.hashCode());
        result = prime * result + ((this.destinationName == null) ? 0 : this.destinationName.hashCode());
        result = prime * result + ((this.destinationStatus == null) ? 0 : this.destinationStatus.hashCode());
        result = prime * result + ((this.resourceBankCardToken == null) ? 0 : this.resourceBankCardToken.hashCode());
        result = prime * result + ((this.resourceBankCardPaymentSystem == null) ? 0 : this.resourceBankCardPaymentSystem.hashCode());
        result = prime * result + ((this.resourceBankCardBin == null) ? 0 : this.resourceBankCardBin.hashCode());
        result = prime * result + ((this.resourceBankCardMaskedPan == null) ? 0 : this.resourceBankCardMaskedPan.hashCode());
        result = prime * result + ((this.accountId == null) ? 0 : this.accountId.hashCode());
        result = prime * result + ((this.identityId == null) ? 0 : this.identityId.hashCode());
        result = prime * result + ((this.partyId == null) ? 0 : this.partyId.hashCode());
        result = prime * result + ((this.accounterAccountId == null) ? 0 : this.accounterAccountId.hashCode());
        result = prime * result + ((this.currencyCode == null) ? 0 : this.currencyCode.hashCode());
        result = prime * result + ((this.wtime == null) ? 0 : this.wtime.hashCode());
        result = prime * result + ((this.current == null) ? 0 : this.current.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Destination (");

        sb.append(id);
        sb.append(", ").append(eventId);
        sb.append(", ").append(eventCreatedAt);
        sb.append(", ").append(eventOccuredAt);
        sb.append(", ").append(sequenceId);
        sb.append(", ").append(destinationId);
        sb.append(", ").append(destinationName);
        sb.append(", ").append(destinationStatus);
        sb.append(", ").append(resourceBankCardToken);
        sb.append(", ").append(resourceBankCardPaymentSystem);
        sb.append(", ").append(resourceBankCardBin);
        sb.append(", ").append(resourceBankCardMaskedPan);
        sb.append(", ").append(accountId);
        sb.append(", ").append(identityId);
        sb.append(", ").append(partyId);
        sb.append(", ").append(accounterAccountId);
        sb.append(", ").append(currencyCode);
        sb.append(", ").append(wtime);
        sb.append(", ").append(current);

        sb.append(")");
        return sb.toString();
    }
}
