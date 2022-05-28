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
public class SubscriptionFile implements Serializable {

    private static final long serialVersionUID = 1981046086;

    private Long      id;
    private Long      subscriptionId;
    private Long      dataFileId;
    private Boolean   deleted;
    private Long      createdBy;
    private Timestamp created;
    private Long      updatedBy;
    private Timestamp updated;

    public SubscriptionFile() {}

    public SubscriptionFile(SubscriptionFile value) {
        this.id = value.id;
        this.subscriptionId = value.subscriptionId;
        this.dataFileId = value.dataFileId;
        this.deleted = value.deleted;
        this.createdBy = value.createdBy;
        this.created = value.created;
        this.updatedBy = value.updatedBy;
        this.updated = value.updated;
    }

    public SubscriptionFile(
        Long      id,
        Long      subscriptionId,
        Long      dataFileId,
        Boolean   deleted,
        Long      createdBy,
        Timestamp created,
        Long      updatedBy,
        Timestamp updated
    ) {
        this.id = id;
        this.subscriptionId = subscriptionId;
        this.dataFileId = dataFileId;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.created = created;
        this.updatedBy = updatedBy;
        this.updated = updated;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Long getDataFileId() {
        return this.dataFileId;
    }

    public void setDataFileId(Long dataFileId) {
        this.dataFileId = dataFileId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionFile (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("subscriptionId :" );
        sb.append(subscriptionId);
        sb.append(",").append("dataFileId :" );
        sb.append(dataFileId);
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

        sb.append(")");
        return sb.toString();
    }
}