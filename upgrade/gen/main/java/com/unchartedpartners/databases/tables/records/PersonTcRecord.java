/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.tables.PersonTc;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
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
public class PersonTcRecord extends UpdatableRecordImpl<PersonTcRecord> implements Record10<Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long, Long, Boolean> {

    private static final long serialVersionUID = -902245695;

    /**
     * Setter for <code>intest.person_tc.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.person_tc.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.person_tc.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.person_tc.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>intest.person_tc.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.person_tc.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>intest.person_tc.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.person_tc.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>intest.person_tc.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.person_tc.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>intest.person_tc.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.person_tc.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>intest.person_tc.tx_id</code>.
     */
    public void setTxId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.person_tc.tx_id</code>.
     */
    public String getTxId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.person_tc.audit_id</code>.
     */
    public void setAuditId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.person_tc.audit_id</code>.
     */
    public Long getAuditId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>intest.person_tc.person_id</code>.
     */
    public void setPersonId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.person_tc.person_id</code>.
     */
    public Long getPersonId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>intest.person_tc.marketing_consent</code>.
     */
    public void setMarketingConsent(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.person_tc.marketing_consent</code>.
     */
    public Boolean getMarketingConsent() {
        return (Boolean) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long, Long, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long, Long, Boolean> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PersonTc.PERSON_TC.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return PersonTc.PERSON_TC.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PersonTc.PERSON_TC.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return PersonTc.PERSON_TC.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PersonTc.PERSON_TC.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return PersonTc.PERSON_TC.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PersonTc.PERSON_TC.TX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return PersonTc.PERSON_TC.AUDIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return PersonTc.PERSON_TC.PERSON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return PersonTc.PERSON_TC.MARKETING_CONSENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component2() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getAuditId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getPersonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getMarketingConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getAuditId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getPersonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getMarketingConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord value2(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord value3(Long value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord value4(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord value5(Long value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord value6(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord value7(String value) {
        setTxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord value8(Long value) {
        setAuditId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord value9(Long value) {
        setPersonId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord value10(Boolean value) {
        setMarketingConsent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonTcRecord values(Long value1, Boolean value2, Long value3, Timestamp value4, Long value5, Timestamp value6, String value7, Long value8, Long value9, Boolean value10) {
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
     * Create a detached PersonTcRecord
     */
    public PersonTcRecord() {
        super(PersonTc.PERSON_TC);
    }

    /**
     * Create a detached, initialised PersonTcRecord
     */
    public PersonTcRecord(Long id, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated, String txId, Long auditId, Long personId, Boolean marketingConsent) {
        super(PersonTc.PERSON_TC);

        set(0, id);
        set(1, deleted);
        set(2, createdBy);
        set(3, created);
        set(4, updatedBy);
        set(5, updated);
        set(6, txId);
        set(7, auditId);
        set(8, personId);
        set(9, marketingConsent);
    }
}
