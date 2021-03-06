/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.enums.BatchTaskStatus;
import com.unchartedpartners.databases.enums.BatchTaskType;
import com.unchartedpartners.databases.tables.BatchTask;

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
public class BatchTaskRecord extends UpdatableRecordImpl<BatchTaskRecord> implements Record12<Long, BatchTaskType, BatchTaskStatus, String, String, Boolean, Long, Timestamp, Long, Timestamp, String, Long> {

    private static final long serialVersionUID = -1237401445;

    /**
     * Setter for <code>intest.batch_task.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.batch_task.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.batch_task.type</code>.
     */
    public void setType(BatchTaskType value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.batch_task.type</code>.
     */
    public BatchTaskType getType() {
        return (BatchTaskType) get(1);
    }

    /**
     * Setter for <code>intest.batch_task.status</code>.
     */
    public void setStatus(BatchTaskStatus value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.batch_task.status</code>.
     */
    public BatchTaskStatus getStatus() {
        return (BatchTaskStatus) get(2);
    }

    /**
     * Setter for <code>intest.batch_task.ref_no</code>.
     */
    public void setRefNo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.batch_task.ref_no</code>.
     */
    public String getRefNo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>intest.batch_task.executor_reference</code>.
     */
    public void setExecutorReference(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.batch_task.executor_reference</code>.
     */
    public String getExecutorReference() {
        return (String) get(4);
    }

    /**
     * Setter for <code>intest.batch_task.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.batch_task.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>intest.batch_task.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.batch_task.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>intest.batch_task.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.batch_task.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>intest.batch_task.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.batch_task.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>intest.batch_task.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.batch_task.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>intest.batch_task.tx_id</code>.
     */
    public void setTxId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.batch_task.tx_id</code>.
     */
    public String getTxId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>intest.batch_task.audit_id</code>.
     */
    public void setAuditId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.batch_task.audit_id</code>.
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
    public Row12<Long, BatchTaskType, BatchTaskStatus, String, String, Boolean, Long, Timestamp, Long, Timestamp, String, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, BatchTaskType, BatchTaskStatus, String, String, Boolean, Long, Timestamp, Long, Timestamp, String, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BatchTask.BATCH_TASK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BatchTaskType> field2() {
        return BatchTask.BATCH_TASK.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BatchTaskStatus> field3() {
        return BatchTask.BATCH_TASK.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BatchTask.BATCH_TASK.REF_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return BatchTask.BATCH_TASK.EXECUTOR_REFERENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return BatchTask.BATCH_TASK.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return BatchTask.BATCH_TASK.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return BatchTask.BATCH_TASK.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return BatchTask.BATCH_TASK.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return BatchTask.BATCH_TASK.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return BatchTask.BATCH_TASK.TX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return BatchTask.BATCH_TASK.AUDIT_ID;
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
    public BatchTaskType component2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskStatus component3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRefNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getExecutorReference();
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
    public BatchTaskType value2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskStatus value3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRefNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getExecutorReference();
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
    public BatchTaskRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value2(BatchTaskType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value3(BatchTaskStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value4(String value) {
        setRefNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value5(String value) {
        setExecutorReference(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value6(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value7(Long value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value8(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value9(Long value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value10(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value11(String value) {
        setTxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord value12(Long value) {
        setAuditId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchTaskRecord values(Long value1, BatchTaskType value2, BatchTaskStatus value3, String value4, String value5, Boolean value6, Long value7, Timestamp value8, Long value9, Timestamp value10, String value11, Long value12) {
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
     * Create a detached BatchTaskRecord
     */
    public BatchTaskRecord() {
        super(BatchTask.BATCH_TASK);
    }

    /**
     * Create a detached, initialised BatchTaskRecord
     */
    public BatchTaskRecord(Long id, BatchTaskType type, BatchTaskStatus status, String refNo, String executorReference, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated, String txId, Long auditId) {
        super(BatchTask.BATCH_TASK);

        set(0, id);
        set(1, type);
        set(2, status);
        set(3, refNo);
        set(4, executorReference);
        set(5, deleted);
        set(6, createdBy);
        set(7, created);
        set(8, updatedBy);
        set(9, updated);
        set(10, txId);
        set(11, auditId);
    }
}
