package com.maemn.worklog.model;

import java.util.Date;

public class BasePO {
    private Long id;
    private Long createdDateEpoch;
    private Long modifiedDateEpoch;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatedDateEpoch() {
        return createdDateEpoch;
    }

    public void setCreatedDateEpoch(Long createdDateEpoch) {
        this.createdDateEpoch = createdDateEpoch;
    }

    public Long getModifiedDateEpoch() {
        return modifiedDateEpoch;
    }

    public void setModifiedDateEpoch(Long modifiedDateEpoch) {
        this.modifiedDateEpoch = modifiedDateEpoch;
    }

    public Date getCreatedDate() {
        return new Date(createdDateEpoch);
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDateEpoch = createdDate.getTime();
    }

    public Date getModifiedDate() {
        return new Date(modifiedDateEpoch);
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDateEpoch = modifiedDate.getTime();
    }
}
