/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


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
public class HdfSubmission implements Serializable {

    private static final long serialVersionUID = 218582490;

    private Long      id;
    private String    idNo;
    private String    policyNo;
    private Long      productId;
    private Map       hdfData;
    private Timestamp submittedDate;
    private Long      createdBy;
    private Timestamp created;
    private Long      updatedBy;
    private Timestamp updated;

    public HdfSubmission() {}

    public HdfSubmission(HdfSubmission value) {
        this.id = value.id;
        this.idNo = value.idNo;
        this.policyNo = value.policyNo;
        this.productId = value.productId;
        this.hdfData = value.hdfData;
        this.submittedDate = value.submittedDate;
        this.createdBy = value.createdBy;
        this.created = value.created;
        this.updatedBy = value.updatedBy;
        this.updated = value.updated;
    }

    public HdfSubmission(
        Long      id,
        String    idNo,
        String    policyNo,
        Long      productId,
        Map       hdfData,
        Timestamp submittedDate,
        Long      createdBy,
        Timestamp created,
        Long      updatedBy,
        Timestamp updated
    ) {
        this.id = id;
        this.idNo = idNo;
        this.policyNo = policyNo;
        this.productId = productId;
        this.hdfData = hdfData;
        this.submittedDate = submittedDate;
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

    public String getIdNo() {
        return this.idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getPolicyNo() {
        return this.policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Map getHdfData() {
        return this.hdfData;
    }

    public void setHdfData(Map hdfData) {
        this.hdfData = hdfData;
    }

    public Timestamp getSubmittedDate() {
        return this.submittedDate;
    }

    public void setSubmittedDate(Timestamp submittedDate) {
        this.submittedDate = submittedDate;
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
        StringBuilder sb = new StringBuilder("HdfSubmission (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("idNo :" );
        sb.append(idNo);
        sb.append(",").append("policyNo :" );
        sb.append(policyNo);
        sb.append(",").append("productId :" );
        sb.append(productId);
        sb.append(",").append("hdfData :" );
        sb.append(hdfData);
        sb.append(",").append("submittedDate :" );
        sb.append(submittedDate);
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