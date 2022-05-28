/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import com.unchartedpartners.databases.enums.StagingStatus;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CloudGroupAsiaStaging implements Serializable {

    private static final long serialVersionUID = 1397278650;

    private Long          id;
    private Map           data;
    private StagingStatus stagingStatus;
    private Boolean       deleted;
    private Long          createdBy;
    private Timestamp     created;
    private Long          updatedBy;
    private Timestamp     updated;
    private String        txId;
    private Long          auditId;
    private Map           failPolicies;

    public CloudGroupAsiaStaging() {}

    public CloudGroupAsiaStaging(CloudGroupAsiaStaging value) {
        this.id = value.id;
        this.data = value.data;
        this.stagingStatus = value.stagingStatus;
        this.deleted = value.deleted;
        this.createdBy = value.createdBy;
        this.created = value.created;
        this.updatedBy = value.updatedBy;
        this.updated = value.updated;
        this.txId = value.txId;
        this.auditId = value.auditId;
        this.failPolicies = value.failPolicies;
    }

    public CloudGroupAsiaStaging(
        Long          id,
        Map           data,
        StagingStatus stagingStatus,
        Boolean       deleted,
        Long          createdBy,
        Timestamp     created,
        Long          updatedBy,
        Timestamp     updated,
        String        txId,
        Long          auditId,
        Map           failPolicies
    ) {
        this.id = id;
        this.data = data;
        this.stagingStatus = stagingStatus;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.created = created;
        this.updatedBy = updatedBy;
        this.updated = updated;
        this.txId = txId;
        this.auditId = auditId;
        this.failPolicies = failPolicies;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map getData() {
        return this.data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    public StagingStatus getStagingStatus() {
        return this.stagingStatus;
    }

    public void setStagingStatus(StagingStatus stagingStatus) {
        this.stagingStatus = stagingStatus;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdated() {
        return this.updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public String getTxId() {
        return this.txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public Long getAuditId() {
        return this.auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public Map getFailPolicies() {
        return this.failPolicies;
    }

    public void setFailPolicies(Map failPolicies) {
        this.failPolicies = failPolicies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CloudGroupAsiaStaging (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("data :" );
        sb.append(data);
        sb.append(",").append("stagingStatus :" );
        sb.append(stagingStatus);
        sb.append(",").append("deleted :" );
        sb.append(deleted);
        sb.append(",").append("createdBy :" );
        sb.append(createdBy);
        sb.append(",").append("created :" );
        sb.append(created);
        sb.append(",").append("updatedBy :" );
        sb.append(updatedBy);
        sb.append(",").append("updated :" );
        sb.append(updated);
        sb.append(",").append("txId :" );
        sb.append(txId);
        sb.append(",").append("auditId :" );
        sb.append(auditId);
        sb.append(",").append("failPolicies :" );
        sb.append(failPolicies);

        sb.append(")");
        return sb.toString();
    }
}
