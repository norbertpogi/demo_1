/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.enums.AccountStatus;
import com.unchartedpartners.databases.enums.AccountType;
import com.unchartedpartners.databases.enums.CompanyStatus;
import com.unchartedpartners.databases.tables.Company;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CompanyRecord extends UpdatableRecordImpl<CompanyRecord> {

    private static final long serialVersionUID = 294948347;

    /**
     * Setter for <code>intest.company.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.company.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.company.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.company.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>intest.company.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.company.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.company.type</code>.
     */
    public void setType(AccountType value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.company.type</code>.
     */
    public AccountType getType() {
        return (AccountType) get(3);
    }

    /**
     * Setter for <code>intest.company.status</code>.
     */
    public void setStatus(AccountStatus value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.company.status</code>.
     */
    public AccountStatus getStatus() {
        return (AccountStatus) get(4);
    }

    /**
     * Setter for <code>intest.company.path</code>.
     */
    public void setPath(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.company.path</code>.
     */
    public String getPath() {
        return (String) get(5);
    }

    /**
     * Setter for <code>intest.company.company_tag</code>.
     */
    public void setCompanyTag(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.company.company_tag</code>.
     */
    public String getCompanyTag() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.company.ip_whitelist</code>.
     */
    public void setIpWhitelist(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.company.ip_whitelist</code>.
     */
    public Integer getIpWhitelist() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>intest.company.version</code>.
     */
    public void setVersion(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.company.version</code>.
     */
    public Long getVersion() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>intest.company.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.company.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>intest.company.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.company.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>intest.company.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.company.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>intest.company.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.company.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>intest.company.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.company.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>intest.company.tx_id</code>.
     */
    public void setTxId(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>intest.company.tx_id</code>.
     */
    public String getTxId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>intest.company.audit_id</code>.
     */
    public void setAuditId(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>intest.company.audit_id</code>.
     */
    public Long getAuditId() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>intest.company.company_id</code>.
     */
    public void setCompanyId(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>intest.company.company_id</code>.
     */
    public Long getCompanyId() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>intest.company.notes</code>.
     */
    public void setNotes(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>intest.company.notes</code>.
     */
    public String getNotes() {
        return (String) get(17);
    }

    /**
     * Setter for <code>intest.company.nature_of_business</code>.
     */
    public void setNatureOfBusiness(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>intest.company.nature_of_business</code>.
     */
    public String getNatureOfBusiness() {
        return (String) get(18);
    }

    /**
     * Setter for <code>intest.company.uen_no</code>.
     */
    public void setUenNo(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>intest.company.uen_no</code>.
     */
    public String getUenNo() {
        return (String) get(19);
    }

    /**
     * Setter for <code>intest.company.company_status</code>.
     */
    public void setCompanyStatus(CompanyStatus value) {
        set(20, value);
    }

    /**
     * Getter for <code>intest.company.company_status</code>.
     */
    public CompanyStatus getCompanyStatus() {
        return (CompanyStatus) get(20);
    }

    /**
     * Setter for <code>intest.company.address</code>.
     */
    public void setAddress(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>intest.company.address</code>.
     */
    public String getAddress() {
        return (String) get(21);
    }

    /**
     * Setter for <code>intest.company.postal_code</code>.
     */
    public void setPostalCode(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>intest.company.postal_code</code>.
     */
    public String getPostalCode() {
        return (String) get(22);
    }

    /**
     * Setter for <code>intest.company.encrypted_password</code>.
     */
    public void setEncryptedPassword(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>intest.company.encrypted_password</code>.
     */
    public String getEncryptedPassword() {
        return (String) get(23);
    }

    /**
     * Setter for <code>intest.company.braintree_customer_id</code>.
     */
    public void setBraintreeCustomerId(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>intest.company.braintree_customer_id</code>.
     */
    public String getBraintreeCustomerId() {
        return (String) get(24);
    }

    /**
     * Setter for <code>intest.company.braintree_token</code>.
     */
    public void setBraintreeToken(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>intest.company.braintree_token</code>.
     */
    public String getBraintreeToken() {
        return (String) get(25);
    }

    /**
     * Setter for <code>intest.company.card_holder_name</code>.
     */
    public void setCardHolderName(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>intest.company.card_holder_name</code>.
     */
    public String getCardHolderName() {
        return (String) get(26);
    }

    /**
     * Setter for <code>intest.company.code</code>.
     */
    public void setCode(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>intest.company.code</code>.
     */
    public String getCode() {
        return (String) get(27);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompanyRecord
     */
    public CompanyRecord() {
        super(Company.COMPANY);
    }

    /**
     * Create a detached, initialised CompanyRecord
     */
    public CompanyRecord(Long id, Long parentId, String name, AccountType type, AccountStatus status, String path, String companyTag, Integer ipWhitelist, Long version, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated, String txId, Long auditId, Long companyId, String notes, String natureOfBusiness, String uenNo, CompanyStatus companyStatus, String address, String postalCode, String encryptedPassword, String braintreeCustomerId, String braintreeToken, String cardHolderName, String code) {
        super(Company.COMPANY);

        set(0, id);
        set(1, parentId);
        set(2, name);
        set(3, type);
        set(4, status);
        set(5, path);
        set(6, companyTag);
        set(7, ipWhitelist);
        set(8, version);
        set(9, deleted);
        set(10, createdBy);
        set(11, created);
        set(12, updatedBy);
        set(13, updated);
        set(14, txId);
        set(15, auditId);
        set(16, companyId);
        set(17, notes);
        set(18, natureOfBusiness);
        set(19, uenNo);
        set(20, companyStatus);
        set(21, address);
        set(22, postalCode);
        set(23, encryptedPassword);
        set(24, braintreeCustomerId);
        set(25, braintreeToken);
        set(26, cardHolderName);
        set(27, code);
    }
}