/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.enums.EnrolmentStatus;
import com.unchartedpartners.databases.tables.Enrolment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class EnrolmentRecord extends UpdatableRecordImpl<EnrolmentRecord> implements Record18<Long, Long, String, EnrolmentStatus, Boolean, Boolean, Long, Timestamp, Long, Timestamp, String, String, String, String, String, String, Boolean, Boolean> {

    private static final long serialVersionUID = 2119112837;

    /**
     * Setter for <code>intest.enrolment.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.enrolment.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.enrolment.client_policy_id</code>.
     */
    public void setClientPolicyId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.enrolment.client_policy_id</code>.
     */
    public Long getClientPolicyId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>intest.enrolment.employee_no</code>.
     */
    public void setEmployeeNo(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.enrolment.employee_no</code>.
     */
    public String getEmployeeNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.enrolment.status</code>.
     */
    public void setStatus(EnrolmentStatus value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.enrolment.status</code>.
     */
    public EnrolmentStatus getStatus() {
        return (EnrolmentStatus) get(3);
    }

    /**
     * Setter for <code>intest.enrolment.consent</code>.
     */
    public void setConsent(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.enrolment.consent</code>.
     */
    public Boolean getConsent() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>intest.enrolment.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.enrolment.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>intest.enrolment.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.enrolment.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>intest.enrolment.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.enrolment.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>intest.enrolment.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.enrolment.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>intest.enrolment.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.enrolment.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>intest.enrolment.category</code>.
     */
    public void setCategory(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.enrolment.category</code>.
     */
    public String getCategory() {
        return (String) get(10);
    }

    /**
     * Setter for <code>intest.enrolment.subsidiary_name</code>.
     */
    public void setSubsidiaryName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.enrolment.subsidiary_name</code>.
     */
    public String getSubsidiaryName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>intest.enrolment.contact_number</code>.
     */
    public void setContactNumber(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.enrolment.contact_number</code>.
     */
    public String getContactNumber() {
        return (String) get(12);
    }

    /**
     * Setter for <code>intest.enrolment.contact_address</code>.
     */
    public void setContactAddress(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.enrolment.contact_address</code>.
     */
    public String getContactAddress() {
        return (String) get(13);
    }

    /**
     * Setter for <code>intest.enrolment.payment_method</code>.
     */
    public void setPaymentMethod(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>intest.enrolment.payment_method</code>.
     */
    public String getPaymentMethod() {
        return (String) get(14);
    }

    /**
     * Setter for <code>intest.enrolment.total_premium</code>.
     */
    public void setTotalPremium(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>intest.enrolment.total_premium</code>.
     */
    public String getTotalPremium() {
        return (String) get(15);
    }

    /**
     * Setter for <code>intest.enrolment.hdf_consent</code>.
     */
    public void setHdfConsent(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>intest.enrolment.hdf_consent</code>.
     */
    public Boolean getHdfConsent() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>intest.enrolment.payment_consent</code>.
     */
    public void setPaymentConsent(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>intest.enrolment.payment_consent</code>.
     */
    public Boolean getPaymentConsent() {
        return (Boolean) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, Long, String, EnrolmentStatus, Boolean, Boolean, Long, Timestamp, Long, Timestamp, String, String, String, String, String, String, Boolean, Boolean> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, Long, String, EnrolmentStatus, Boolean, Boolean, Long, Timestamp, Long, Timestamp, String, String, String, String, String, String, Boolean, Boolean> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Enrolment.ENROLMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Enrolment.ENROLMENT.CLIENT_POLICY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Enrolment.ENROLMENT.EMPLOYEE_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EnrolmentStatus> field4() {
        return Enrolment.ENROLMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Enrolment.ENROLMENT.CONSENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Enrolment.ENROLMENT.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Enrolment.ENROLMENT.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Enrolment.ENROLMENT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return Enrolment.ENROLMENT.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Enrolment.ENROLMENT.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Enrolment.ENROLMENT.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Enrolment.ENROLMENT.SUBSIDIARY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Enrolment.ENROLMENT.CONTACT_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Enrolment.ENROLMENT.CONTACT_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Enrolment.ENROLMENT.PAYMENT_METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Enrolment.ENROLMENT.TOTAL_PREMIUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return Enrolment.ENROLMENT.HDF_CONSENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field18() {
        return Enrolment.ENROLMENT.PAYMENT_CONSENT;
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
    public Long component2() {
        return getClientPolicyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEmployeeNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentStatus component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getConsent();
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
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getSubsidiaryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getContactNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getContactAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getPaymentMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getTotalPremium();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component17() {
        return getHdfConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component18() {
        return getPaymentConsent();
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
    public Long value2() {
        return getClientPolicyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmployeeNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentStatus value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getConsent();
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
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getSubsidiaryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getContactNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getContactAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getPaymentMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getTotalPremium();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getHdfConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value18() {
        return getPaymentConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value2(Long value) {
        setClientPolicyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value3(String value) {
        setEmployeeNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value4(EnrolmentStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value5(Boolean value) {
        setConsent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value6(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value7(Long value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value8(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value9(Long value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value10(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value11(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value12(String value) {
        setSubsidiaryName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value13(String value) {
        setContactNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value14(String value) {
        setContactAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value15(String value) {
        setPaymentMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value16(String value) {
        setTotalPremium(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value17(Boolean value) {
        setHdfConsent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord value18(Boolean value) {
        setPaymentConsent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentRecord values(Long value1, Long value2, String value3, EnrolmentStatus value4, Boolean value5, Boolean value6, Long value7, Timestamp value8, Long value9, Timestamp value10, String value11, String value12, String value13, String value14, String value15, String value16, Boolean value17, Boolean value18) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EnrolmentRecord
     */
    public EnrolmentRecord() {
        super(Enrolment.ENROLMENT);
    }

    /**
     * Create a detached, initialised EnrolmentRecord
     */
    public EnrolmentRecord(Long id, Long clientPolicyId, String employeeNo, EnrolmentStatus status, Boolean consent, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated, String category, String subsidiaryName, String contactNumber, String contactAddress, String paymentMethod, String totalPremium, Boolean hdfConsent, Boolean paymentConsent) {
        super(Enrolment.ENROLMENT);

        set(0, id);
        set(1, clientPolicyId);
        set(2, employeeNo);
        set(3, status);
        set(4, consent);
        set(5, deleted);
        set(6, createdBy);
        set(7, created);
        set(8, updatedBy);
        set(9, updated);
        set(10, category);
        set(11, subsidiaryName);
        set(12, contactNumber);
        set(13, contactAddress);
        set(14, paymentMethod);
        set(15, totalPremium);
        set(16, hdfConsent);
        set(17, paymentConsent);
    }
}