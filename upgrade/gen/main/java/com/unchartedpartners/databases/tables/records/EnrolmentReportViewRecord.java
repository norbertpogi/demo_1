/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.enums.EnrolmentStatus;
import com.unchartedpartners.databases.enums.Gender;
import com.unchartedpartners.databases.enums.PersonType;
import com.unchartedpartners.databases.enums.UnderwritingStatus;
import com.unchartedpartners.databases.tables.EnrolmentReportView;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;


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
public class EnrolmentReportViewRecord extends TableRecordImpl<EnrolmentReportViewRecord> {

    private static final long serialVersionUID = 700172428;

    /**
     * Setter for <code>intest.enrolment_report_view.POLICY_NO</code>.
     */
    public void setPolicyNo(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.POLICY_NO</code>.
     */
    public String getPolicyNo() {
        return (String) get(0);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.SUBSIDIARY_NAME</code>.
     */
    public void setSubsidiaryName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.SUBSIDIARY_NAME</code>.
     */
    public String getSubsidiaryName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.EMPLOYEE_NO</code>.
     */
    public void setEmployeeNo(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.EMPLOYEE_NO</code>.
     */
    public String getEmployeeNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.CONTACT_ADDRESS</code>.
     */
    public void setContactAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.CONTACT_ADDRESS</code>.
     */
    public String getContactAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.CONTACT_NUMBER</code>.
     */
    public void setContactNumber(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.CONTACT_NUMBER</code>.
     */
    public String getContactNumber() {
        return (String) get(4);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.MEMBER_TYPE</code>.
     */
    public void setMemberType(PersonType value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.MEMBER_TYPE</code>.
     */
    public PersonType getMemberType() {
        return (PersonType) get(5);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.MEMBER_NAME</code>.
     */
    public void setMemberName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.MEMBER_NAME</code>.
     */
    public String getMemberName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.MEMBER_ID_NO</code>.
     */
    public void setMemberIdNo(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.MEMBER_ID_NO</code>.
     */
    public String getMemberIdNo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.EMAIL_ADDRESS</code>.
     */
    public void setEmailAddress(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.EMAIL_ADDRESS</code>.
     */
    public String getEmailAddress() {
        return (String) get(8);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.MEMBER_GENDER</code>.
     */
    public void setMemberGender(Gender value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.MEMBER_GENDER</code>.
     */
    public Gender getMemberGender() {
        return (Gender) get(9);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.MEMBER_DOB</code>.
     */
    public void setMemberDob(Date value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.MEMBER_DOB</code>.
     */
    public Date getMemberDob() {
        return (Date) get(10);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.MARITAL_STATUS</code>.
     */
    public void setMaritalStatus(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.MARITAL_STATUS</code>.
     */
    public String getMaritalStatus() {
        return (String) get(11);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.NATIONALITY</code>.
     */
    public void setNationality(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.NATIONALITY</code>.
     */
    public String getNationality() {
        return (String) get(12);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.COUNTRY_OF_RESIDENCE</code>.
     */
    public void setCountryOfResidence(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.COUNTRY_OF_RESIDENCE</code>.
     */
    public String getCountryOfResidence() {
        return (String) get(13);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.ID_NO</code>.
     */
    public void setIdNo(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.ID_NO</code>.
     */
    public String getIdNo() {
        return (String) get(14);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.WEIGHT</code>.
     */
    public void setWeight(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.WEIGHT</code>.
     */
    public BigDecimal getWeight() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.HEIGHT</code>.
     */
    public void setHeight(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.HEIGHT</code>.
     */
    public BigDecimal getHeight() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.BMI</code>.
     */
    public void setBmi(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.BMI</code>.
     */
    public BigDecimal getBmi() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.OCCUPATION</code>.
     */
    public void setOccupation(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.OCCUPATION</code>.
     */
    public String getOccupation() {
        return (String) get(18);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.OCCUPATION_CLASS</code>.
     */
    public void setOccupationClass(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.OCCUPATION_CLASS</code>.
     */
    public String getOccupationClass() {
        return (String) get(19);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.PAYMENT_MODE</code>.
     */
    public void setPaymentMode(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.PAYMENT_MODE</code>.
     */
    public String getPaymentMode() {
        return (String) get(20);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.UNDERWRITING_STATUS</code>.
     */
    public void setUnderwritingStatus(UnderwritingStatus value) {
        set(21, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.UNDERWRITING_STATUS</code>.
     */
    public UnderwritingStatus getUnderwritingStatus() {
        return (UnderwritingStatus) get(21);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.ENROLMENT_STATUS</code>.
     */
    public void setEnrolmentStatus(EnrolmentStatus value) {
        set(22, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.ENROLMENT_STATUS</code>.
     */
    public EnrolmentStatus getEnrolmentStatus() {
        return (EnrolmentStatus) get(22);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.UPDATED</code>.
     */
    public void setUpdated(Timestamp value) {
        set(23, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.UPDATED</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(23);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.DELETED</code>.
     */
    public void setDeleted(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.DELETED</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.COVERAGE</code>.
     */
    public void setCoverage(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.COVERAGE</code>.
     */
    public String getCoverage() {
        return (String) get(25);
    }

    /**
     * Setter for <code>intest.enrolment_report_view.HDF_DATA</code>.
     */
    public void setHdfData(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>intest.enrolment_report_view.HDF_DATA</code>.
     */
    public String getHdfData() {
        return (String) get(26);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EnrolmentReportViewRecord
     */
    public EnrolmentReportViewRecord() {
        super(EnrolmentReportView.ENROLMENT_REPORT_VIEW);
    }

    /**
     * Create a detached, initialised EnrolmentReportViewRecord
     */
    public EnrolmentReportViewRecord(String policyNo, String subsidiaryName, String employeeNo, String contactAddress, String contactNumber, PersonType memberType, String memberName, String memberIdNo, String emailAddress, Gender memberGender, Date memberDob, String maritalStatus, String nationality, String countryOfResidence, String idNo, BigDecimal weight, BigDecimal height, BigDecimal bmi, String occupation, String occupationClass, String paymentMode, UnderwritingStatus underwritingStatus, EnrolmentStatus enrolmentStatus, Timestamp updated, Boolean deleted, String coverage, String hdfData) {
        super(EnrolmentReportView.ENROLMENT_REPORT_VIEW);

        set(0, policyNo);
        set(1, subsidiaryName);
        set(2, employeeNo);
        set(3, contactAddress);
        set(4, contactNumber);
        set(5, memberType);
        set(6, memberName);
        set(7, memberIdNo);
        set(8, emailAddress);
        set(9, memberGender);
        set(10, memberDob);
        set(11, maritalStatus);
        set(12, nationality);
        set(13, countryOfResidence);
        set(14, idNo);
        set(15, weight);
        set(16, height);
        set(17, bmi);
        set(18, occupation);
        set(19, occupationClass);
        set(20, paymentMode);
        set(21, underwritingStatus);
        set(22, enrolmentStatus);
        set(23, updated);
        set(24, deleted);
        set(25, coverage);
        set(26, hdfData);
    }
}
