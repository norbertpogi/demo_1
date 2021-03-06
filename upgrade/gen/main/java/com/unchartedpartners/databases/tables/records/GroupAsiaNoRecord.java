/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.enums.GaNoSubType;
import com.unchartedpartners.databases.enums.GaNoType;
import com.unchartedpartners.databases.tables.GroupAsiaNo;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class GroupAsiaNoRecord extends UpdatableRecordImpl<GroupAsiaNoRecord> implements Record12<Long, GaNoType, GaNoSubType, String, Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long> {

    private static final long serialVersionUID = 390492476;

    /**
     * Setter for <code>intest.group_asia_no.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.group_asia_no.ga_no_type</code>.
     */
    public void setGaNoType(GaNoType value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.ga_no_type</code>.
     */
    public GaNoType getGaNoType() {
        return (GaNoType) get(1);
    }

    /**
     * Setter for <code>intest.group_asia_no.ga_no_sub_type</code>.
     */
    public void setGaNoSubType(GaNoSubType value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.ga_no_sub_type</code>.
     */
    public GaNoSubType getGaNoSubType() {
        return (GaNoSubType) get(2);
    }

    /**
     * Setter for <code>intest.group_asia_no.ga_no</code>.
     */
    public void setGaNo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.ga_no</code>.
     */
    public String getGaNo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>intest.group_asia_no.platform_id</code>.
     */
    public void setPlatformId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.platform_id</code>.
     */
    public Long getPlatformId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>intest.group_asia_no.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>intest.group_asia_no.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>intest.group_asia_no.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>intest.group_asia_no.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>intest.group_asia_no.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>intest.group_asia_no.tx_id</code>.
     */
    public void setTxId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.tx_id</code>.
     */
    public String getTxId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>intest.group_asia_no.audit_id</code>.
     */
    public void setAuditId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.group_asia_no.audit_id</code>.
     */
    public Long getAuditId() {
        return (Long) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, GaNoType, GaNoSubType, String, Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, GaNoType, GaNoSubType, String, Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return GroupAsiaNo.GROUP_ASIA_NO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<GaNoType> field2() {
        return GroupAsiaNo.GROUP_ASIA_NO.GA_NO_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<GaNoSubType> field3() {
        return GroupAsiaNo.GROUP_ASIA_NO.GA_NO_SUB_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GroupAsiaNo.GROUP_ASIA_NO.GA_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return GroupAsiaNo.GROUP_ASIA_NO.PLATFORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return GroupAsiaNo.GROUP_ASIA_NO.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return GroupAsiaNo.GROUP_ASIA_NO.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return GroupAsiaNo.GROUP_ASIA_NO.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return GroupAsiaNo.GROUP_ASIA_NO.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return GroupAsiaNo.GROUP_ASIA_NO.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return GroupAsiaNo.GROUP_ASIA_NO.TX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return GroupAsiaNo.GROUP_ASIA_NO.AUDIT_ID;
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
    public GaNoType component2() {
        return getGaNoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNoSubType component3() {
        return getGaNoSubType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getGaNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getPlatformId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getTxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getAuditId();
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
    public GaNoType value2() {
        return getGaNoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNoSubType value3() {
        return getGaNoSubType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGaNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getPlatformId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getAuditId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value2(GaNoType value) {
        setGaNoType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value3(GaNoSubType value) {
        setGaNoSubType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value4(String value) {
        setGaNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value5(Long value) {
        setPlatformId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value6(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value7(Long value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value8(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value9(Long value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value10(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value11(String value) {
        setTxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord value12(Long value) {
        setAuditId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNoRecord values(Long value1, GaNoType value2, GaNoSubType value3, String value4, Long value5, Boolean value6, Long value7, Timestamp value8, Long value9, Timestamp value10, String value11, Long value12) {
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
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GroupAsiaNoRecord
     */
    public GroupAsiaNoRecord() {
        super(GroupAsiaNo.GROUP_ASIA_NO);
    }

    /**
     * Create a detached, initialised GroupAsiaNoRecord
     */
    public GroupAsiaNoRecord(Long id, GaNoType gaNoType, GaNoSubType gaNoSubType, String gaNo, Long platformId, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated, String txId, Long auditId) {
        super(GroupAsiaNo.GROUP_ASIA_NO);

        set(0, id);
        set(1, gaNoType);
        set(2, gaNoSubType);
        set(3, gaNo);
        set(4, platformId);
        set(5, deleted);
        set(6, createdBy);
        set(7, created);
        set(8, updatedBy);
        set(9, updated);
        set(10, txId);
        set(11, auditId);
    }
}
