/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.enums.GaClaimStatus;
import com.unchartedpartners.databases.tables.PulseClaimStatusNotificationHistory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class PulseClaimStatusNotificationHistoryRecord extends UpdatableRecordImpl<PulseClaimStatusNotificationHistoryRecord> implements Record14<Long, String, String, String, String, String, GaClaimStatus, Timestamp, Boolean, Long, Timestamp, Long, Timestamp, String> {

    private static final long serialVersionUID = 2020332615;

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.cust_name</code>.
     */
    public void setCustName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.cust_name</code>.
     */
    public String getCustName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.cust_id</code>.
     */
    public void setCustId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.cust_id</code>.
     */
    public String getCustId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.email_id</code>.
     */
    public void setEmailId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.email_id</code>.
     */
    public String getEmailId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.pulse_claim_ref_no</code>.
     */
    public void setPulseClaimRefNo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.pulse_claim_ref_no</code>.
     */
    public String getPulseClaimRefNo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.ga_claim_no</code>.
     */
    public void setGaClaimNo(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.ga_claim_no</code>.
     */
    public String getGaClaimNo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.claim_status</code>.
     */
    public void setClaimStatus(GaClaimStatus value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.claim_status</code>.
     */
    public GaClaimStatus getClaimStatus() {
        return (GaClaimStatus) get(6);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.notification_time</code>.
     */
    public void setNotificationTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.notification_time</code>.
     */
    public Timestamp getNotificationTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>intest.pulse_claim_status_notification_history.ga_occur_no</code>.
     */
    public void setGaOccurNo(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.pulse_claim_status_notification_history.ga_occur_no</code>.
     */
    public String getGaOccurNo() {
        return (String) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, String, String, String, String, String, GaClaimStatus, Timestamp, Boolean, Long, Timestamp, Long, Timestamp, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, String, String, String, String, String, GaClaimStatus, Timestamp, Boolean, Long, Timestamp, Long, Timestamp, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.CUST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.CUST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.EMAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.PULSE_CLAIM_REF_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.GA_CLAIM_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<GaClaimStatus> field7() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.CLAIM_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.NOTIFICATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.GA_OCCUR_NO;
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
    public String component2() {
        return getCustName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCustId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEmailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPulseClaimRefNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGaClaimNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaClaimStatus component7() {
        return getClaimStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getNotificationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getGaOccurNo();
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
    public String value2() {
        return getCustName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCustId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPulseClaimRefNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGaClaimNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaClaimStatus value7() {
        return getClaimStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getNotificationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getGaOccurNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value2(String value) {
        setCustName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value3(String value) {
        setCustId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value4(String value) {
        setEmailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value5(String value) {
        setPulseClaimRefNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value6(String value) {
        setGaClaimNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value7(GaClaimStatus value) {
        setClaimStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value8(Timestamp value) {
        setNotificationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value9(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value10(Long value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value11(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value12(Long value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value13(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord value14(String value) {
        setGaOccurNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PulseClaimStatusNotificationHistoryRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, GaClaimStatus value7, Timestamp value8, Boolean value9, Long value10, Timestamp value11, Long value12, Timestamp value13, String value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PulseClaimStatusNotificationHistoryRecord
     */
    public PulseClaimStatusNotificationHistoryRecord() {
        super(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY);
    }

    /**
     * Create a detached, initialised PulseClaimStatusNotificationHistoryRecord
     */
    public PulseClaimStatusNotificationHistoryRecord(Long id, String custName, String custId, String emailId, String pulseClaimRefNo, String gaClaimNo, GaClaimStatus claimStatus, Timestamp notificationTime, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated, String gaOccurNo) {
        super(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY);

        set(0, id);
        set(1, custName);
        set(2, custId);
        set(3, emailId);
        set(4, pulseClaimRefNo);
        set(5, gaClaimNo);
        set(6, claimStatus);
        set(7, notificationTime);
        set(8, deleted);
        set(9, createdBy);
        set(10, created);
        set(11, updatedBy);
        set(12, updated);
        set(13, gaOccurNo);
    }
}
