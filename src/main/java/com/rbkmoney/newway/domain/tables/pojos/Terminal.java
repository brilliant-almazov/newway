/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.pojos;


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
public class Terminal implements Serializable {

    private static final long serialVersionUID = 1659719469;

    private Long          id;
    private Long          versionId;
    private Integer       terminalRefId;
    private String        name;
    private String        description;
    private String        optionsJson;
    private Integer       riskCoverage;
    private String        termsJson;
    private LocalDateTime wtime;
    private Boolean       current;

    public Terminal() {}

    public Terminal(Terminal value) {
        this.id = value.id;
        this.versionId = value.versionId;
        this.terminalRefId = value.terminalRefId;
        this.name = value.name;
        this.description = value.description;
        this.optionsJson = value.optionsJson;
        this.riskCoverage = value.riskCoverage;
        this.termsJson = value.termsJson;
        this.wtime = value.wtime;
        this.current = value.current;
    }

    public Terminal(
        Long          id,
        Long          versionId,
        Integer       terminalRefId,
        String        name,
        String        description,
        String        optionsJson,
        Integer       riskCoverage,
        String        termsJson,
        LocalDateTime wtime,
        Boolean       current
    ) {
        this.id = id;
        this.versionId = versionId;
        this.terminalRefId = terminalRefId;
        this.name = name;
        this.description = description;
        this.optionsJson = optionsJson;
        this.riskCoverage = riskCoverage;
        this.termsJson = termsJson;
        this.wtime = wtime;
        this.current = current;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersionId() {
        return this.versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public Integer getTerminalRefId() {
        return this.terminalRefId;
    }

    public void setTerminalRefId(Integer terminalRefId) {
        this.terminalRefId = terminalRefId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOptionsJson() {
        return this.optionsJson;
    }

    public void setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
    }

    public Integer getRiskCoverage() {
        return this.riskCoverage;
    }

    public void setRiskCoverage(Integer riskCoverage) {
        this.riskCoverage = riskCoverage;
    }

    public String getTermsJson() {
        return this.termsJson;
    }

    public void setTermsJson(String termsJson) {
        this.termsJson = termsJson;
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
        final Terminal other = (Terminal) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (versionId == null) {
            if (other.versionId != null)
                return false;
        }
        else if (!versionId.equals(other.versionId))
            return false;
        if (terminalRefId == null) {
            if (other.terminalRefId != null)
                return false;
        }
        else if (!terminalRefId.equals(other.terminalRefId))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (optionsJson == null) {
            if (other.optionsJson != null)
                return false;
        }
        else if (!optionsJson.equals(other.optionsJson))
            return false;
        if (riskCoverage == null) {
            if (other.riskCoverage != null)
                return false;
        }
        else if (!riskCoverage.equals(other.riskCoverage))
            return false;
        if (termsJson == null) {
            if (other.termsJson != null)
                return false;
        }
        else if (!termsJson.equals(other.termsJson))
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
        result = prime * result + ((this.versionId == null) ? 0 : this.versionId.hashCode());
        result = prime * result + ((this.terminalRefId == null) ? 0 : this.terminalRefId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.optionsJson == null) ? 0 : this.optionsJson.hashCode());
        result = prime * result + ((this.riskCoverage == null) ? 0 : this.riskCoverage.hashCode());
        result = prime * result + ((this.termsJson == null) ? 0 : this.termsJson.hashCode());
        result = prime * result + ((this.wtime == null) ? 0 : this.wtime.hashCode());
        result = prime * result + ((this.current == null) ? 0 : this.current.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Terminal (");

        sb.append(id);
        sb.append(", ").append(versionId);
        sb.append(", ").append(terminalRefId);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(optionsJson);
        sb.append(", ").append(riskCoverage);
        sb.append(", ").append(termsJson);
        sb.append(", ").append(wtime);
        sb.append(", ").append(current);

        sb.append(")");
        return sb.toString();
    }
}
