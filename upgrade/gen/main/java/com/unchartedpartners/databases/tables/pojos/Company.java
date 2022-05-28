/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import com.unchartedpartners.databases.enums.AccountStatus;
import com.unchartedpartners.databases.enums.AccountType;
import com.unchartedpartners.databases.enums.CompanyStatus;

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
public class Company implements Serializable {

    private static final long serialVersionUID = 716547353;

    private Long          id;
    private Long          parentId;
    private String        name;
    private AccountType   type;
    private AccountStatus status;
    private String        path;
    private String        companyTag;
    private Integer       ipWhitelist;
    private Long          version;
    private Boolean       deleted;
    private Long          createdBy;
    private Timestamp     created;
    private Long          updatedBy;
    private Timestamp     updated;
    private String        txId;
    private Long          auditId;
    private Long          companyId;
    private String        notes;
    private String        natureOfBusiness;
    private String        uenNo;
    private CompanyStatus companyStatus;
    private String        address;
    private String        postalCode;
    private String        encryptedPassword;
    private String        braintreeCustomerId;
    private String        braintreeToken;
    private String        cardHolderName;
    private String        code;

    public Company() {}

    public Company(Company value) {
        this.id = value.id;
        this.parentId = value.parentId;
        this.name = value.name;
        this.type = value.type;
        this.status = value.status;
        this.path = value.path;
        this.companyTag = value.companyTag;
        this.ipWhitelist = value.ipWhitelist;
        this.version = value.version;
        this.deleted = value.deleted;
        this.createdBy = value.createdBy;
        this.created = value.created;
        this.updatedBy = value.updatedBy;
        this.updated = value.updated;
        this.txId = value.txId;
        this.auditId = value.auditId;
        this.companyId = value.companyId;
        this.notes = value.notes;
        this.natureOfBusiness = value.natureOfBusiness;
        this.uenNo = value.uenNo;
        this.companyStatus = value.companyStatus;
        this.address = value.address;
        this.postalCode = value.postalCode;
        this.encryptedPassword = value.encryptedPassword;
        this.braintreeCustomerId = value.braintreeCustomerId;
        this.braintreeToken = value.braintreeToken;
        this.cardHolderName = value.cardHolderName;
        this.code = value.code;
    }

    public Company(
        Long          id,
        Long          parentId,
        String        name,
        AccountType   type,
        AccountStatus status,
        String        path,
        String        companyTag,
        Integer       ipWhitelist,
        Long          version,
        Boolean       deleted,
        Long          createdBy,
        Timestamp     created,
        Long          updatedBy,
        Timestamp     updated,
        String        txId,
        Long          auditId,
        Long          companyId,
        String        notes,
        String        natureOfBusiness,
        String        uenNo,
        CompanyStatus companyStatus,
        String        address,
        String        postalCode,
        String        encryptedPassword,
        String        braintreeCustomerId,
        String        braintreeToken,
        String        cardHolderName,
        String        code
    ) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.type = type;
        this.status = status;
        this.path = path;
        this.companyTag = companyTag;
        this.ipWhitelist = ipWhitelist;
        this.version = version;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.created = created;
        this.updatedBy = updatedBy;
        this.updated = updated;
        this.txId = txId;
        this.auditId = auditId;
        this.companyId = companyId;
        this.notes = notes;
        this.natureOfBusiness = natureOfBusiness;
        this.uenNo = uenNo;
        this.companyStatus = companyStatus;
        this.address = address;
        this.postalCode = postalCode;
        this.encryptedPassword = encryptedPassword;
        this.braintreeCustomerId = braintreeCustomerId;
        this.braintreeToken = braintreeToken;
        this.cardHolderName = cardHolderName;
        this.code = code;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getType() {
        return this.type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountStatus getStatus() {
        return this.status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCompanyTag() {
        return this.companyTag;
    }

    public void setCompanyTag(String companyTag) {
        this.companyTag = companyTag;
    }

    public Integer getIpWhitelist() {
        return this.ipWhitelist;
    }

    public void setIpWhitelist(Integer ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
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

    public Long getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNatureOfBusiness() {
        return this.natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getUenNo() {
        return this.uenNo;
    }

    public void setUenNo(String uenNo) {
        this.uenNo = uenNo;
    }

    public CompanyStatus getCompanyStatus() {
        return this.companyStatus;
    }

    public void setCompanyStatus(CompanyStatus companyStatus) {
        this.companyStatus = companyStatus;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getBraintreeCustomerId() {
        return this.braintreeCustomerId;
    }

    public void setBraintreeCustomerId(String braintreeCustomerId) {
        this.braintreeCustomerId = braintreeCustomerId;
    }

    public String getBraintreeToken() {
        return this.braintreeToken;
    }

    public void setBraintreeToken(String braintreeToken) {
        this.braintreeToken = braintreeToken;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Company (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("parentId :" );
        sb.append(parentId);
        sb.append(",").append("name :" );
        sb.append(com.unchartedpartners.util.PiiMaskUtil.mask(name));
        sb.append(",").append("type :" );
        sb.append(type);
        sb.append(",").append("status :" );
        sb.append(status);
        sb.append(",").append("path :" );
        sb.append(path);
        sb.append(",").append("companyTag :" );
        sb.append(companyTag);
        sb.append(",").append("ipWhitelist :" );
        sb.append(ipWhitelist);
        sb.append(",").append("version :" );
        sb.append(version);
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
        sb.append(",").append("companyId :" );
        sb.append(companyId);
        sb.append(",").append("notes :" );
        sb.append(notes);
        sb.append(",").append("natureOfBusiness :" );
        sb.append(natureOfBusiness);
        sb.append(",").append("uenNo :" );
        sb.append(uenNo);
        sb.append(",").append("companyStatus :" );
        sb.append(companyStatus);
        sb.append(",").append("address :" );
        sb.append(com.unchartedpartners.util.PiiMaskUtil.mask(address));
        sb.append(",").append("postalCode :" );
        sb.append(com.unchartedpartners.util.PiiMaskUtil.mask(postalCode));
        sb.append(",").append("encryptedPassword :" );
        sb.append(encryptedPassword);
        sb.append(",").append("braintreeCustomerId :" );
        sb.append(braintreeCustomerId);
        sb.append(",").append("braintreeToken :" );
        sb.append(braintreeToken);
        sb.append(",").append("cardHolderName :" );
        sb.append(com.unchartedpartners.util.PiiMaskUtil.mask(cardHolderName));
        sb.append(",").append("code :" );
        sb.append(code);

        sb.append(")");
        return sb.toString();
    }
}
