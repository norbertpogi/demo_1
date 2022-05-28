/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.enums.EnrolmentStatus;
import com.unchartedpartners.databases.enums.Gender;
import com.unchartedpartners.databases.enums.PersonType;
import com.unchartedpartners.databases.enums.UnderwritingStatus;
import com.unchartedpartners.databases.tables.records.EnrolmentReportViewRecord;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class EnrolmentReportView extends TableImpl<EnrolmentReportViewRecord> {

    private static final long serialVersionUID = 1075612115;

    /**
     * The reference instance of <code>intest.enrolment_report_view</code>
     */
    public static final EnrolmentReportView ENROLMENT_REPORT_VIEW = new EnrolmentReportView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnrolmentReportViewRecord> getRecordType() {
        return EnrolmentReportViewRecord.class;
    }

    /**
     * The column <code>intest.enrolment_report_view.POLICY_NO</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> POLICY_NO = createField("POLICY_NO", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.enrolment_report_view.SUBSIDIARY_NAME</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> SUBSIDIARY_NAME = createField("SUBSIDIARY_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.enrolment_report_view.EMPLOYEE_NO</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> EMPLOYEE_NO = createField("EMPLOYEE_NO", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.enrolment_report_view.CONTACT_ADDRESS</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> CONTACT_ADDRESS = createField("CONTACT_ADDRESS", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.enrolment_report_view.CONTACT_NUMBER</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> CONTACT_NUMBER = createField("CONTACT_NUMBER", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>intest.enrolment_report_view.MEMBER_TYPE</code>.
     */
    public final TableField<EnrolmentReportViewRecord, PersonType> MEMBER_TYPE = createField("MEMBER_TYPE", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.PersonType.class), this, "");

    /**
     * The column <code>intest.enrolment_report_view.MEMBER_NAME</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> MEMBER_NAME = createField("MEMBER_NAME", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>intest.enrolment_report_view.MEMBER_ID_NO</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> MEMBER_ID_NO = createField("MEMBER_ID_NO", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.enrolment_report_view.EMAIL_ADDRESS</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> EMAIL_ADDRESS = createField("EMAIL_ADDRESS", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.enrolment_report_view.MEMBER_GENDER</code>.
     */
    public final TableField<EnrolmentReportViewRecord, Gender> MEMBER_GENDER = createField("MEMBER_GENDER", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.Gender.class), this, "");

    /**
     * The column <code>intest.enrolment_report_view.MEMBER_DOB</code>.
     */
    public final TableField<EnrolmentReportViewRecord, Date> MEMBER_DOB = createField("MEMBER_DOB", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>intest.enrolment_report_view.MARITAL_STATUS</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> MARITAL_STATUS = createField("MARITAL_STATUS", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.enrolment_report_view.NATIONALITY</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> NATIONALITY = createField("NATIONALITY", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.enrolment_report_view.COUNTRY_OF_RESIDENCE</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> COUNTRY_OF_RESIDENCE = createField("COUNTRY_OF_RESIDENCE", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.enrolment_report_view.ID_NO</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> ID_NO = createField("ID_NO", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.enrolment_report_view.WEIGHT</code>.
     */
    public final TableField<EnrolmentReportViewRecord, BigDecimal> WEIGHT = createField("WEIGHT", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>intest.enrolment_report_view.HEIGHT</code>.
     */
    public final TableField<EnrolmentReportViewRecord, BigDecimal> HEIGHT = createField("HEIGHT", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>intest.enrolment_report_view.BMI</code>.
     */
    public final TableField<EnrolmentReportViewRecord, BigDecimal> BMI = createField("BMI", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>intest.enrolment_report_view.OCCUPATION</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> OCCUPATION = createField("OCCUPATION", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>intest.enrolment_report_view.OCCUPATION_CLASS</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> OCCUPATION_CLASS = createField("OCCUPATION_CLASS", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.enrolment_report_view.PAYMENT_MODE</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> PAYMENT_MODE = createField("PAYMENT_MODE", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.enrolment_report_view.UNDERWRITING_STATUS</code>.
     */
    public final TableField<EnrolmentReportViewRecord, UnderwritingStatus> UNDERWRITING_STATUS = createField("UNDERWRITING_STATUS", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.UnderwritingStatus.class), this, "");

    /**
     * The column <code>intest.enrolment_report_view.ENROLMENT_STATUS</code>.
     */
    public final TableField<EnrolmentReportViewRecord, EnrolmentStatus> ENROLMENT_STATUS = createField("ENROLMENT_STATUS", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.EnrolmentStatus.class), this, "");

    /**
     * The column <code>intest.enrolment_report_view.UPDATED</code>.
     */
    public final TableField<EnrolmentReportViewRecord, Timestamp> UPDATED = createField("UPDATED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.enrolment_report_view.DELETED</code>.
     */
    public final TableField<EnrolmentReportViewRecord, Boolean> DELETED = createField("DELETED", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>intest.enrolment_report_view.COVERAGE</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> COVERAGE = createField("COVERAGE", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>intest.enrolment_report_view.HDF_DATA</code>.
     */
    public final TableField<EnrolmentReportViewRecord, String> HDF_DATA = createField("HDF_DATA", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>intest.enrolment_report_view</code> table reference
     */
    public EnrolmentReportView() {
        this(DSL.name("enrolment_report_view"), null);
    }

    /**
     * Create an aliased <code>intest.enrolment_report_view</code> table reference
     */
    public EnrolmentReportView(String alias) {
        this(DSL.name(alias), ENROLMENT_REPORT_VIEW);
    }

    /**
     * Create an aliased <code>intest.enrolment_report_view</code> table reference
     */
    public EnrolmentReportView(Name alias) {
        this(alias, ENROLMENT_REPORT_VIEW);
    }

    private EnrolmentReportView(Name alias, Table<EnrolmentReportViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnrolmentReportView(Name alias, Table<EnrolmentReportViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Intest.INTEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentReportView as(String alias) {
        return new EnrolmentReportView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnrolmentReportView as(Name alias) {
        return new EnrolmentReportView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnrolmentReportView rename(String name) {
        return new EnrolmentReportView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnrolmentReportView rename(Name name) {
        return new EnrolmentReportView(name, null);
    }
}