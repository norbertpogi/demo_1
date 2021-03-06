/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import com.unchartedpartners.databases.enums.CredentialReqType;

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
public class CredentialReq implements Serializable {

    private static final long serialVersionUID = -728288124;

    private Long              id;
    private String            code;
    private Long              personId;
    private Timestamp         expiryTime;
    private CredentialReqType type;
    private String            otp;
    private Boolean           deleted;
    private Long              createdBy;
    private Timestamp         created;
    private Long              updatedBy;
    private Timestamp         updated;
    private String            txId;
    private Long              auditId;
    private Timestamp         otpExpiryTime;
    private Integer           times;

    public CredentialReq() {}

    public CredentialReq(CredentialReq value) {
        this.id = value.id;
        this.code = value.code;
        this.personId = value.personId;
        this.expiryTime = value.expiryTime;
        this.type = value.type;
        this.otp = value.otp;
        this.deleted = value.deleted;
        this.createdBy = value.createdBy;
        this.created = value.created;
        this.updatedBy = value.updatedBy;
        this.updated = value.updated;
        this.txId = value.txId;
        this.auditId = value.auditId;
        this.otpExpiryTime = value.otpExpiryTime;
        this.times = value.times;
    }

    public CredentialReq(
        Long              id,
        String            code,
        Long              personId,
        Timestamp         expiryTime,
        CredentialReqType type,
        String            otp,
        Boolean           deleted,
        Long              createdBy,
        Timestamp         created,
        Long              updatedBy,
        Timestamp         updated,
        String            txId,
        Long              auditId,
        Timestamp         otpExpiryTime,
        Integer           times
    ) {
        this.id = id;
        this.code = code;
        this.personId = personId;
        this.expiryTime = expiryTime;
        this.type = type;
        this.otp = otp;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.created = created;
        this.updatedBy = updatedBy;
        this.updated = updated;
        this.txId = txId;
        this.auditId = auditId;
        this.otpExpiryTime = otpExpiryTime;
        this.times = times;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getPersonId() {
        return this.personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Timestamp getExpiryTime() {
        return this.expiryTime;
    }

    public void setExpiryTime(Timestamp expiryTime) {
        this.expiryTime = expiryTime;
    }

    public CredentialReqType getType() {
        return this.type;
    }

    public void setType(CredentialReqType type) {
        this.type = type;
    }

    public String getOtp() {
        return this.otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
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

    public Timestamp getOtpExpiryTime() {
        return this.otpExpiryTime;
    }

    public void setOtpExpiryTime(Timestamp otpExpiryTime) {
        this.otpExpiryTime = otpExpiryTime;
    }

    public Integer getTimes() {
        return this.times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CredentialReq (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("code :" );
        sb.append(code);
        sb.append(",").append("personId :" );
        sb.append(personId);
        sb.append(",").append("expiryTime :" );
        sb.append(expiryTime);
        sb.append(",").append("type :" );
        sb.append(type);
        sb.append(",").append("otp :" );
        sb.append(otp);
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
        sb.append(",").append("otpExpiryTime :" );
        sb.append(otpExpiryTime);
        sb.append(",").append("times :" );
        sb.append(times);

        sb.append(")");
        return sb.toString();
    }
}
