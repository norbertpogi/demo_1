/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.tables.QuoteCompanyContact;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Record3;
import org.jooq.Row10;
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
public class QuoteCompanyContactRecord extends UpdatableRecordImpl<QuoteCompanyContactRecord> implements Record10<Long, Long, Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long> {

    private static final long serialVersionUID = 242559955;

    /**
     * Setter for <code>intest.quote_company_contact.quote_id</code>.
     */
    public void setQuoteId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.quote_company_contact.quote_id</code>.
     */
    public Long getQuoteId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.quote_company_contact.company_id</code>.
     */
    public void setCompanyId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.quote_company_contact.company_id</code>.
     */
    public Long getCompanyId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>intest.quote_company_contact.company_contact_id</code>.
     */
    public void setCompanyContactId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.quote_company_contact.company_contact_id</code>.
     */
    public Long getCompanyContactId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>intest.quote_company_contact.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.quote_company_contact.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>intest.quote_company_contact.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.quote_company_contact.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>intest.quote_company_contact.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.quote_company_contact.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>intest.quote_company_contact.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.quote_company_contact.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>intest.quote_company_contact.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.quote_company_contact.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>intest.quote_company_contact.tx_id</code>.
     */
    public void setTxId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.quote_company_contact.tx_id</code>.
     */
    public String getTxId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>intest.quote_company_contact.audit_id</code>.
     */
    public void setAuditId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.quote_company_contact.audit_id</code>.
     */
    public Long getAuditId() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Long, Long, Long> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return QuoteCompanyContact.QUOTE_COMPANY_CONTACT.QUOTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return QuoteCompanyContact.QUOTE_COMPANY_CONTACT.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return QuoteCompanyContact.QUOTE_COMPANY_CONTACT.COMPANY_CONTACT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return QuoteCompanyContact.QUOTE_COMPANY_CONTACT.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return QuoteCompanyContact.QUOTE_COMPANY_CONTACT.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return QuoteCompanyContact.QUOTE_COMPANY_CONTACT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return QuoteCompanyContact.QUOTE_COMPANY_CONTACT.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return QuoteCompanyContact.QUOTE_COMPANY_CONTACT.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return QuoteCompanyContact.QUOTE_COMPANY_CONTACT.TX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return QuoteCompanyContact.QUOTE_COMPANY_CONTACT.AUDIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getQuoteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getCompanyContactId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getTxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getAuditId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getQuoteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getCompanyContactId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getAuditId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord value1(Long value) {
        setQuoteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord value2(Long value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord value3(Long value) {
        setCompanyContactId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord value4(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord value5(Long value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord value6(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord value7(Long value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord value8(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord value9(String value) {
        setTxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord value10(Long value) {
        setAuditId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteCompanyContactRecord values(Long value1, Long value2, Long value3, Boolean value4, Long value5, Timestamp value6, Long value7, Timestamp value8, String value9, Long value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuoteCompanyContactRecord
     */
    public QuoteCompanyContactRecord() {
        super(QuoteCompanyContact.QUOTE_COMPANY_CONTACT);
    }

    /**
     * Create a detached, initialised QuoteCompanyContactRecord
     */
    public QuoteCompanyContactRecord(Long quoteId, Long companyId, Long companyContactId, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated, String txId, Long auditId) {
        super(QuoteCompanyContact.QUOTE_COMPANY_CONTACT);

        set(0, quoteId);
        set(1, companyId);
        set(2, companyContactId);
        set(3, deleted);
        set(4, createdBy);
        set(5, created);
        set(6, updatedBy);
        set(7, updated);
        set(8, txId);
        set(9, auditId);
    }
}
