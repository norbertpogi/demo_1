/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.tables.ChangeFormAppFile;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class ChangeFormAppFileRecord extends UpdatableRecordImpl<ChangeFormAppFileRecord> implements Record9<Long, Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long> {

    private static final long serialVersionUID = 2083328003;

    /**
     * Setter for <code>intest.change_form_app_file.change_form_app_id</code>.
     */
    public void setChangeFormAppId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.change_form_app_file.change_form_app_id</code>.
     */
    public Long getChangeFormAppId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.change_form_app_file.data_file_id</code>.
     */
    public void setDataFileId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.change_form_app_file.data_file_id</code>.
     */
    public Long getDataFileId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>intest.change_form_app_file.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.change_form_app_file.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>intest.change_form_app_file.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.change_form_app_file.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>intest.change_form_app_file.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.change_form_app_file.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>intest.change_form_app_file.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.change_form_app_file.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>intest.change_form_app_file.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.change_form_app_file.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>intest.change_form_app_file.tx_id</code>.
     */
    public void setTxId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.change_form_app_file.tx_id</code>.
     */
    public String getTxId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>intest.change_form_app_file.audit_id</code>.
     */
    public void setAuditId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.change_form_app_file.audit_id</code>.
     */
    public Long getAuditId() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, Boolean, Long, Timestamp, Long, Timestamp, String, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ChangeFormAppFile.CHANGE_FORM_APP_FILE.CHANGE_FORM_APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ChangeFormAppFile.CHANGE_FORM_APP_FILE.DATA_FILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return ChangeFormAppFile.CHANGE_FORM_APP_FILE.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return ChangeFormAppFile.CHANGE_FORM_APP_FILE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ChangeFormAppFile.CHANGE_FORM_APP_FILE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return ChangeFormAppFile.CHANGE_FORM_APP_FILE.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ChangeFormAppFile.CHANGE_FORM_APP_FILE.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ChangeFormAppFile.CHANGE_FORM_APP_FILE.TX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return ChangeFormAppFile.CHANGE_FORM_APP_FILE.AUDIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getChangeFormAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getDataFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getTxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getAuditId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getChangeFormAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getDataFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getAuditId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeFormAppFileRecord value1(Long value) {
        setChangeFormAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeFormAppFileRecord value2(Long value) {
        setDataFileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeFormAppFileRecord value3(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeFormAppFileRecord value4(Long value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeFormAppFileRecord value5(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeFormAppFileRecord value6(Long value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeFormAppFileRecord value7(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeFormAppFileRecord value8(String value) {
        setTxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeFormAppFileRecord value9(Long value) {
        setAuditId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeFormAppFileRecord values(Long value1, Long value2, Boolean value3, Long value4, Timestamp value5, Long value6, Timestamp value7, String value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChangeFormAppFileRecord
     */
    public ChangeFormAppFileRecord() {
        super(ChangeFormAppFile.CHANGE_FORM_APP_FILE);
    }

    /**
     * Create a detached, initialised ChangeFormAppFileRecord
     */
    public ChangeFormAppFileRecord(Long changeFormAppId, Long dataFileId, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated, String txId, Long auditId) {
        super(ChangeFormAppFile.CHANGE_FORM_APP_FILE);

        set(0, changeFormAppId);
        set(1, dataFileId);
        set(2, deleted);
        set(3, createdBy);
        set(4, created);
        set(5, updatedBy);
        set(6, updated);
        set(7, txId);
        set(8, auditId);
    }
}
