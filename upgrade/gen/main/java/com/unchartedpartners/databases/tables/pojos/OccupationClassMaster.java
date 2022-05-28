/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class OccupationClassMaster implements Serializable {

    private static final long serialVersionUID = -1467417870;

    private Long      id;
    private String    occupation;
    private String    occupationClass;
    private Boolean   deleted;
    private Long      createdBy;
    private Timestamp created;
    private Long      updatedBy;
    private Timestamp updated;
    private String    txId;
    private Long      auditId;

    public OccupationClassMaster() {}

    public OccupationClassMaster(OccupationClassMaster value) {
        this.id = value.id;
        this.occupation = value.occupation;
        this.occupationClass = value.occupationClass;
        this.deleted = value.deleted;
        this.createdBy = value.createdBy;
        this.created = value.created;
        this.updatedBy = value.updatedBy;
        this.updated = value.updated;
        this.txId = value.txId;
        this.auditId = value.auditId;
    }

    public OccupationClassMaster(
        Long      id,
        String    occupation,
        String    occupationClass,
        Boolean   deleted,
        Long      createdBy,
        Timestamp created,
        Long      updatedBy,
        Timestamp updated,
        String    txId,
        Long      auditId
    ) {
        this.id = id;
        this.occupation = occupation;
        this.occupationClass = occupationClass;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.created = created;
        this.updatedBy = updatedBy;
        this.updated = updated;
        this.txId = txId;
        this.auditId = auditId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupationClass() {
        return this.occupationClass;
    }

    public void setOccupationClass(String occupationClass) {
        this.occupationClass = occupationClass;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OccupationClassMaster (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("occupation :" );
        sb.append(occupation);
        sb.append(",").append("occupationClass :" );
        sb.append(occupationClass);
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

        sb.append(")");
        return sb.toString();
    }
}