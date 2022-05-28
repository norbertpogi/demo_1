/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import com.unchartedpartners.databases.enums.MemberType;

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
public class HealthDeclaration implements Serializable {

    private static final long serialVersionUID = -224962216;

    private Long       id;
    private String     quotationNo;
    private String     customerNo;
    private MemberType memberType;
    private Map        data;
    private Boolean    consent;
    private Timestamp  submittedDate;
    private Boolean    deleted;
    private Long       createdBy;
    private Timestamp  created;
    private Long       updatedBy;
    private Timestamp  updated;

    public HealthDeclaration() {}

    public HealthDeclaration(HealthDeclaration value) {
        this.id = value.id;
        this.quotationNo = value.quotationNo;
        this.customerNo = value.customerNo;
        this.memberType = value.memberType;
        this.data = value.data;
        this.consent = value.consent;
        this.submittedDate = value.submittedDate;
        this.deleted = value.deleted;
        this.createdBy = value.createdBy;
        this.created = value.created;
        this.updatedBy = value.updatedBy;
        this.updated = value.updated;
    }

    public HealthDeclaration(
        Long       id,
        String     quotationNo,
        String     customerNo,
        MemberType memberType,
        Map        data,
        Boolean    consent,
        Timestamp  submittedDate,
        Boolean    deleted,
        Long       createdBy,
        Timestamp  created,
        Long       updatedBy,
        Timestamp  updated
    ) {
        this.id = id;
        this.quotationNo = quotationNo;
        this.customerNo = customerNo;
        this.memberType = memberType;
        this.data = data;
        this.consent = consent;
        this.submittedDate = submittedDate;
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

    public String getQuotationNo() {
        return this.quotationNo;
    }

    public void setQuotationNo(String quotationNo) {
        this.quotationNo = quotationNo;
    }

    public String getCustomerNo() {
        return this.customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public MemberType getMemberType() {
        return this.memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }

    public Map getData() {
        return this.data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    public Boolean getConsent() {
        return this.consent;
    }

    public void setConsent(Boolean consent) {
        this.consent = consent;
    }

    public Timestamp getSubmittedDate() {
        return this.submittedDate;
    }

    public void setSubmittedDate(Timestamp submittedDate) {
        this.submittedDate = submittedDate;
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
        StringBuilder sb = new StringBuilder("HealthDeclaration (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("quotationNo :" );
        sb.append(quotationNo);
        sb.append(",").append("customerNo :" );
        sb.append(customerNo);
        sb.append(",").append("memberType :" );
        sb.append(memberType);
        sb.append(",").append("data :" );
        sb.append(data);
        sb.append(",").append("consent :" );
        sb.append(consent);
        sb.append(",").append("submittedDate :" );
        sb.append(submittedDate);
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
