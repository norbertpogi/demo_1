/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.enums.MemberType;
import com.unchartedpartners.databases.tables.HealthDeclaration;

import java.sql.Timestamp;
import java.util.Map;

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
public class HealthDeclarationRecord extends UpdatableRecordImpl<HealthDeclarationRecord> implements Record12<Long, String, String, MemberType, Map, Boolean, Timestamp, Boolean, Long, Timestamp, Long, Timestamp> {

    private static final long serialVersionUID = 1524809329;

    /**
     * Setter for <code>intest.health_declaration.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.health_declaration.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.health_declaration.quotation_no</code>.
     */
    public void setQuotationNo(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.health_declaration.quotation_no</code>.
     */
    public String getQuotationNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.health_declaration.customer_no</code>.
     */
    public void setCustomerNo(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.health_declaration.customer_no</code>.
     */
    public String getCustomerNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.health_declaration.member_type</code>.
     */
    public void setMemberType(MemberType value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.health_declaration.member_type</code>.
     */
    public MemberType getMemberType() {
        return (MemberType) get(3);
    }

    /**
     * Setter for <code>intest.health_declaration.data</code>.
     */
    public void setData(Map value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.health_declaration.data</code>.
     */
    public Map getData() {
        return (Map) get(4);
    }

    /**
     * Setter for <code>intest.health_declaration.consent</code>.
     */
    public void setConsent(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.health_declaration.consent</code>.
     */
    public Boolean getConsent() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>intest.health_declaration.submitted_date</code>.
     */
    public void setSubmittedDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.health_declaration.submitted_date</code>.
     */
    public Timestamp getSubmittedDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>intest.health_declaration.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.health_declaration.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>intest.health_declaration.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.health_declaration.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>intest.health_declaration.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.health_declaration.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>intest.health_declaration.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.health_declaration.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>intest.health_declaration.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.health_declaration.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(11);
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
    public Row12<Long, String, String, MemberType, Map, Boolean, Timestamp, Boolean, Long, Timestamp, Long, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, MemberType, Map, Boolean, Timestamp, Boolean, Long, Timestamp, Long, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return HealthDeclaration.HEALTH_DECLARATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return HealthDeclaration.HEALTH_DECLARATION.QUOTATION_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HealthDeclaration.HEALTH_DECLARATION.CUSTOMER_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MemberType> field4() {
        return HealthDeclaration.HEALTH_DECLARATION.MEMBER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map> field5() {
        return HealthDeclaration.HEALTH_DECLARATION.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return HealthDeclaration.HEALTH_DECLARATION.CONSENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return HealthDeclaration.HEALTH_DECLARATION.SUBMITTED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return HealthDeclaration.HEALTH_DECLARATION.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return HealthDeclaration.HEALTH_DECLARATION.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return HealthDeclaration.HEALTH_DECLARATION.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return HealthDeclaration.HEALTH_DECLARATION.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return HealthDeclaration.HEALTH_DECLARATION.UPDATED;
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
        return getQuotationNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCustomerNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberType component4() {
        return getMemberType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map component5() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getSubmittedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdated();
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
        return getQuotationNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCustomerNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberType value4() {
        return getMemberType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map value5() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getSubmittedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value2(String value) {
        setQuotationNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value3(String value) {
        setCustomerNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value4(MemberType value) {
        setMemberType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value5(Map value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value6(Boolean value) {
        setConsent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value7(Timestamp value) {
        setSubmittedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value8(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value9(Long value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value10(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value11(Long value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord value12(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclarationRecord values(Long value1, String value2, String value3, MemberType value4, Map value5, Boolean value6, Timestamp value7, Boolean value8, Long value9, Timestamp value10, Long value11, Timestamp value12) {
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
     * Create a detached HealthDeclarationRecord
     */
    public HealthDeclarationRecord() {
        super(HealthDeclaration.HEALTH_DECLARATION);
    }

    /**
     * Create a detached, initialised HealthDeclarationRecord
     */
    public HealthDeclarationRecord(Long id, String quotationNo, String customerNo, MemberType memberType, Map data, Boolean consent, Timestamp submittedDate, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated) {
        super(HealthDeclaration.HEALTH_DECLARATION);

        set(0, id);
        set(1, quotationNo);
        set(2, customerNo);
        set(3, memberType);
        set(4, data);
        set(5, consent);
        set(6, submittedDate);
        set(7, deleted);
        set(8, createdBy);
        set(9, created);
        set(10, updatedBy);
        set(11, updated);
    }
}