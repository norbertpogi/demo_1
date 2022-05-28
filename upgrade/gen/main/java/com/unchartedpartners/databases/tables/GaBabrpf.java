/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.GaBabrpfRecord;

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
public class GaBabrpf extends TableImpl<GaBabrpfRecord> {

    private static final long serialVersionUID = -728992891;

    /**
     * The reference instance of <code>intest.ga_babrpf</code>
     */
    public static final GaBabrpf GA_BABRPF = new GaBabrpf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GaBabrpfRecord> getRecordType() {
        return GaBabrpfRecord.class;
    }

    /**
     * The column <code>intest.ga_babrpf.id</code>.
     */
    public final TableField<GaBabrpfRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.ga_babrpf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.ga_babrpf.bankkey</code>.
     */
    public final TableField<GaBabrpfRecord, String> BANKKEY = createField("bankkey", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_babrpf.bankdesc</code>.
     */
    public final TableField<GaBabrpfRecord, String> BANKDESC = createField("bankdesc", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>intest.ga_babrpf.facthous01</code>.
     */
    public final TableField<GaBabrpfRecord, String> FACTHOUS01 = createField("facthous01", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_babrpf.facthous02</code>.
     */
    public final TableField<GaBabrpfRecord, String> FACTHOUS02 = createField("facthous02", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_babrpf.facthous03</code>.
     */
    public final TableField<GaBabrpfRecord, String> FACTHOUS03 = createField("facthous03", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_babrpf.facthous04</code>.
     */
    public final TableField<GaBabrpfRecord, String> FACTHOUS04 = createField("facthous04", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_babrpf.facthous05</code>.
     */
    public final TableField<GaBabrpfRecord, String> FACTHOUS05 = createField("facthous05", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_babrpf.currcode01</code>.
     */
    public final TableField<GaBabrpfRecord, String> CURRCODE01 = createField("currcode01", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.currcode02</code>.
     */
    public final TableField<GaBabrpfRecord, String> CURRCODE02 = createField("currcode02", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.currcode03</code>.
     */
    public final TableField<GaBabrpfRecord, String> CURRCODE03 = createField("currcode03", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.currcode04</code>.
     */
    public final TableField<GaBabrpfRecord, String> CURRCODE04 = createField("currcode04", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.currcode05</code>.
     */
    public final TableField<GaBabrpfRecord, String> CURRCODE05 = createField("currcode05", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.currcode06</code>.
     */
    public final TableField<GaBabrpfRecord, String> CURRCODE06 = createField("currcode06", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.currcode07</code>.
     */
    public final TableField<GaBabrpfRecord, String> CURRCODE07 = createField("currcode07", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.currcode08</code>.
     */
    public final TableField<GaBabrpfRecord, String> CURRCODE08 = createField("currcode08", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.currcode09</code>.
     */
    public final TableField<GaBabrpfRecord, String> CURRCODE09 = createField("currcode09", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.currcode10</code>.
     */
    public final TableField<GaBabrpfRecord, String> CURRCODE10 = createField("currcode10", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.bank_addr01</code>.
     */
    public final TableField<GaBabrpfRecord, String> BANK_ADDR01 = createField("bank_addr01", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>intest.ga_babrpf.bank_addr02</code>.
     */
    public final TableField<GaBabrpfRecord, String> BANK_ADDR02 = createField("bank_addr02", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>intest.ga_babrpf.bank_addr03</code>.
     */
    public final TableField<GaBabrpfRecord, String> BANK_ADDR03 = createField("bank_addr03", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>intest.ga_babrpf.bank_addr04</code>.
     */
    public final TableField<GaBabrpfRecord, String> BANK_ADDR04 = createField("bank_addr04", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>intest.ga_babrpf.bank_addr05</code>.
     */
    public final TableField<GaBabrpfRecord, String> BANK_ADDR05 = createField("bank_addr05", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>intest.ga_babrpf.bank_postcode</code>.
     */
    public final TableField<GaBabrpfRecord, String> BANK_POSTCODE = createField("bank_postcode", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_babrpf.bank_phone</code>.
     */
    public final TableField<GaBabrpfRecord, String> BANK_PHONE = createField("bank_phone", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>intest.ga_babrpf.ctrycode</code>.
     */
    public final TableField<GaBabrpfRecord, String> CTRYCODE = createField("ctrycode", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_babrpf.zchrgcde01</code>.
     */
    public final TableField<GaBabrpfRecord, String> ZCHRGCDE01 = createField("zchrgcde01", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>intest.ga_babrpf.zchrgcde02</code>.
     */
    public final TableField<GaBabrpfRecord, String> ZCHRGCDE02 = createField("zchrgcde02", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>intest.ga_babrpf.zchrgcde03</code>.
     */
    public final TableField<GaBabrpfRecord, String> ZCHRGCDE03 = createField("zchrgcde03", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>intest.ga_babrpf.zchrgcde04</code>.
     */
    public final TableField<GaBabrpfRecord, String> ZCHRGCDE04 = createField("zchrgcde04", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>intest.ga_babrpf.zchrgcde05</code>.
     */
    public final TableField<GaBabrpfRecord, String> ZCHRGCDE05 = createField("zchrgcde05", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>intest.ga_babrpf.user_profile</code>.
     */
    public final TableField<GaBabrpfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_babrpf.job_name</code>.
     */
    public final TableField<GaBabrpfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_babrpf.datime</code>.
     */
    public final TableField<GaBabrpfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.ga_babrpf.eb_timestamp</code>.
     */
    public final TableField<GaBabrpfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.ga_babrpf</code> table reference
     */
    public GaBabrpf() {
        this(DSL.name("ga_babrpf"), null);
    }

    /**
     * Create an aliased <code>intest.ga_babrpf</code> table reference
     */
    public GaBabrpf(String alias) {
        this(DSL.name(alias), GA_BABRPF);
    }

    /**
     * Create an aliased <code>intest.ga_babrpf</code> table reference
     */
    public GaBabrpf(Name alias) {
        this(alias, GA_BABRPF);
    }

    private GaBabrpf(Name alias, Table<GaBabrpfRecord> aliased) {
        this(alias, aliased, null);
    }

    private GaBabrpf(Name alias, Table<GaBabrpfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.GA_BABRPF_IND, Indexes.GA_BABRPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GaBabrpfRecord, Long> getIdentity() {
        return Keys.IDENTITY_GA_BABRPF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GaBabrpfRecord> getPrimaryKey() {
        return Keys.GA_BABRPF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GaBabrpfRecord>> getKeys() {
        return Arrays.<UniqueKey<GaBabrpfRecord>>asList(Keys.GA_BABRPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaBabrpf as(String alias) {
        return new GaBabrpf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaBabrpf as(Name alias) {
        return new GaBabrpf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GaBabrpf rename(String name) {
        return new GaBabrpf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GaBabrpf rename(Name name) {
        return new GaBabrpf(name, null);
    }
}
