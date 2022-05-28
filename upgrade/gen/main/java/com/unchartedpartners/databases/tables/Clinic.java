/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.ClinicRecord;

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
public class Clinic extends TableImpl<ClinicRecord> {

    private static final long serialVersionUID = 1810163075;

    /**
     * The reference instance of <code>intest.clinic</code>
     */
    public static final Clinic CLINIC = new Clinic();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClinicRecord> getRecordType() {
        return ClinicRecord.class;
    }

    /**
     * The column <code>intest.clinic.id</code>.
     */
    public final TableField<ClinicRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.clinic_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.clinic.area</code>.
     */
    public final TableField<ClinicRecord, String> AREA = createField("area", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.clinic_code</code>.
     */
    public final TableField<ClinicRecord, String> CLINIC_CODE = createField("clinic_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.clinic_name</code>.
     */
    public final TableField<ClinicRecord, String> CLINIC_NAME = createField("clinic_name", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.address</code>.
     */
    public final TableField<ClinicRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.postal</code>.
     */
    public final TableField<ClinicRecord, String> POSTAL = createField("postal", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.tel</code>.
     */
    public final TableField<ClinicRecord, String> TEL = createField("tel", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.fax</code>.
     */
    public final TableField<ClinicRecord, String> FAX = createField("fax", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.operation_hours_mon_fri</code>.
     */
    public final TableField<ClinicRecord, String> OPERATION_HOURS_MON_FRI = createField("operation_hours_mon_fri", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.operation_hours_sat</code>.
     */
    public final TableField<ClinicRecord, String> OPERATION_HOURS_SAT = createField("operation_hours_sat", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.operation_hours_sun</code>.
     */
    public final TableField<ClinicRecord, String> OPERATION_HOURS_SUN = createField("operation_hours_sun", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.public_holiday</code>.
     */
    public final TableField<ClinicRecord, String> PUBLIC_HOLIDAY = createField("public_holiday", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>intest.clinic.remarks</code>.
     */
    public final TableField<ClinicRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>intest.clinic.start_date</code>.
     */
    public final TableField<ClinicRecord, String> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>intest.clinic.surcharge</code>.
     */
    public final TableField<ClinicRecord, String> SURCHARGE = createField("surcharge", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>intest.clinic.lat</code>.
     */
    public final TableField<ClinicRecord, String> LAT = createField("lat", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.lng</code>.
     */
    public final TableField<ClinicRecord, String> LNG = createField("lng", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.clinic.clinic_group</code>.
     */
    public final TableField<ClinicRecord, String> CLINIC_GROUP = createField("clinic_group", org.jooq.impl.SQLDataType.VARCHAR(10).defaultValue(org.jooq.impl.DSL.field("'IHP'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>intest.clinic</code> table reference
     */
    public Clinic() {
        this(DSL.name("clinic"), null);
    }

    /**
     * Create an aliased <code>intest.clinic</code> table reference
     */
    public Clinic(String alias) {
        this(DSL.name(alias), CLINIC);
    }

    /**
     * Create an aliased <code>intest.clinic</code> table reference
     */
    public Clinic(Name alias) {
        this(alias, CLINIC);
    }

    private Clinic(Name alias, Table<ClinicRecord> aliased) {
        this(alias, aliased, null);
    }

    private Clinic(Name alias, Table<ClinicRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CLINIC_ID_UINDEX, Indexes.CLINIC_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ClinicRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLINIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClinicRecord> getPrimaryKey() {
        return Keys.CLINIC_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClinicRecord>> getKeys() {
        return Arrays.<UniqueKey<ClinicRecord>>asList(Keys.CLINIC_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clinic as(String alias) {
        return new Clinic(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clinic as(Name alias) {
        return new Clinic(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Clinic rename(String name) {
        return new Clinic(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Clinic rename(Name name) {
        return new Clinic(name, null);
    }
}