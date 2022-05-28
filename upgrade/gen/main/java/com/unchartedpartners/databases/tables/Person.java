/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.enums.Dependent;
import com.unchartedpartners.databases.enums.Gender;
import com.unchartedpartners.databases.enums.OccupationClass;
import com.unchartedpartners.databases.enums.PersonStatus;
import com.unchartedpartners.databases.tables.records.PersonRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class Person extends TableImpl<PersonRecord> {

    private static final long serialVersionUID = 1294783935;

    /**
     * The reference instance of <code>intest.person</code>
     */
    public static final Person PERSON = new Person();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersonRecord> getRecordType() {
        return PersonRecord.class;
    }

    /**
     * The column <code>intest.person.id</code>.
     */
    public final TableField<PersonRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.employee_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.person.id_no</code>.
     */
    public final TableField<PersonRecord, String> ID_NO = createField("id_no", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.person.first_name</code>.
     */
    public final TableField<PersonRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.person.last_name</code>.
     */
    public final TableField<PersonRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.person.dob</code>.
     */
    public final TableField<PersonRecord, Timestamp> DOB = createField("dob", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.person.marital_status</code>.
     */
    public final TableField<PersonRecord, String> MARITAL_STATUS = createField("marital_status", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.person.nationality</code>.
     */
    public final TableField<PersonRecord, String> NATIONALITY = createField("nationality", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.person.country_of_residence</code>.
     */
    public final TableField<PersonRecord, String> COUNTRY_OF_RESIDENCE = createField("country_of_residence", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.person.date_of_employment</code>.
     */
    public final TableField<PersonRecord, Timestamp> DATE_OF_EMPLOYMENT = createField("date_of_employment", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.person.email</code>.
     */
    public final TableField<PersonRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.person.deleted</code>.
     */
    public final TableField<PersonRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.person.created_by</code>.
     */
    public final TableField<PersonRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.person.created</code>.
     */
    public final TableField<PersonRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.person.updated_by</code>.
     */
    public final TableField<PersonRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.person.updated</code>.
     */
    public final TableField<PersonRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.person.tx_id</code>.
     */
    public final TableField<PersonRecord, String> TX_ID = createField("tx_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.person.audit_id</code>.
     */
    public final TableField<PersonRecord, Long> AUDIT_ID = createField("audit_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.person.gender</code>.
     */
    public final TableField<PersonRecord, Gender> GENDER = createField("gender", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.Gender.class), this, "");

    /**
     * The column <code>intest.person.dependent</code>.
     */
    public final TableField<PersonRecord, Dependent> DEPENDENT = createField("dependent", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.Dependent.class), this, "");

    /**
     * The column <code>intest.person.occupation_class</code>.
     */
    public final TableField<PersonRecord, OccupationClass> OCCUPATION_CLASS = createField("occupation_class", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.OccupationClass.class), this, "");

    /**
     * The column <code>intest.person.username</code>.
     */
    public final TableField<PersonRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.person.password</code>.
     */
    public final TableField<PersonRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.person.status</code>.
     */
    public final TableField<PersonRecord, PersonStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.PersonStatus.class), this, "");

    /**
     * The column <code>intest.person.last_login_time</code>.
     */
    public final TableField<PersonRecord, Timestamp> LAST_LOGIN_TIME = createField("last_login_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>intest.person.foreign_worker</code>.
     */
    public final TableField<PersonRecord, Boolean> FOREIGN_WORKER = createField("foreign_worker", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>intest.person.contact_no</code>.
     */
    public final TableField<PersonRecord, String> CONTACT_NO = createField("contact_no", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.person.otp</code>.
     */
    public final TableField<PersonRecord, String> OTP = createField("otp", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>intest.person.otp_expiry_time</code>.
     */
    public final TableField<PersonRecord, Timestamp> OTP_EXPIRY_TIME = createField("otp_expiry_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.person.full_name</code>.
     */
    public final TableField<PersonRecord, String> FULL_NAME = createField("full_name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>intest.person.code</code>.
     */
    public final TableField<PersonRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.person.height</code>.
     */
    public final TableField<PersonRecord, BigDecimal> HEIGHT = createField("height", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>intest.person.weight</code>.
     */
    public final TableField<PersonRecord, BigDecimal> WEIGHT = createField("weight", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>intest.person.bmi</code>.
     */
    public final TableField<PersonRecord, BigDecimal> BMI = createField("bmi", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>intest.person.occupation</code>.
     */
    public final TableField<PersonRecord, String> OCCUPATION = createField("occupation", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>intest.person</code> table reference
     */
    public Person() {
        this(DSL.name("person"), null);
    }

    /**
     * Create an aliased <code>intest.person</code> table reference
     */
    public Person(String alias) {
        this(DSL.name(alias), PERSON);
    }

    /**
     * Create an aliased <code>intest.person</code> table reference
     */
    public Person(Name alias) {
        this(alias, PERSON);
    }

    private Person(Name alias, Table<PersonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Person(Name alias, Table<PersonRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EMPLOYEE_PKEY, Indexes.UQ_PERSON_USERNAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PersonRecord, Long> getIdentity() {
        return Keys.IDENTITY_PERSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PersonRecord> getPrimaryKey() {
        return Keys.EMPLOYEE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PersonRecord>> getKeys() {
        return Arrays.<UniqueKey<PersonRecord>>asList(Keys.EMPLOYEE_PKEY, Keys.UQ_PERSON_USERNAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person as(String alias) {
        return new Person(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person as(Name alias) {
        return new Person(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(String name) {
        return new Person(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(Name name) {
        return new Person(name, null);
    }
}
