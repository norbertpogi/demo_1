/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.tables.records.GaZrejpfRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
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
public class GaZrejpf extends TableImpl<GaZrejpfRecord> {

    private static final long serialVersionUID = -838994576;

    /**
     * The reference instance of <code>intest.ga_zrejpf</code>
     */
    public static final GaZrejpf GA_ZREJPF = new GaZrejpf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GaZrejpfRecord> getRecordType() {
        return GaZrejpfRecord.class;
    }

    /**
     * The column <code>intest.ga_zrejpf.prefix</code>.
     */
    public final TableField<GaZrejpfRecord, String> PREFIX = createField("prefix", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_zrejpf.clmcoy</code>.
     */
    public final TableField<GaZrejpfRecord, String> CLMCOY = createField("clmcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.ga_zrejpf.clamnum</code>.
     */
    public final TableField<GaZrejpfRecord, String> CLAMNUM = createField("clamnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.ga_zrejpf.gcoccno</code>.
     */
    public final TableField<GaZrejpfRecord, String> GCOCCNO = createField("gcoccno", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_zrejpf.zseqnorej</code>.
     */
    public final TableField<GaZrejpfRecord, Byte> ZSEQNOREJ = createField("zseqnorej", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>intest.ga_zrejpf.zrejtext</code>.
     */
    public final TableField<GaZrejpfRecord, String> ZREJTEXT = createField("zrejtext", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>intest.ga_zrejpf.user_profile</code>.
     */
    public final TableField<GaZrejpfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_zrejpf.job_name</code>.
     */
    public final TableField<GaZrejpfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_zrejpf.datime</code>.
     */
    public final TableField<GaZrejpfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.ga_zrejpf.eb_timestamp</code>.
     */
    public final TableField<GaZrejpfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.ga_zrejpf</code> table reference
     */
    public GaZrejpf() {
        this(DSL.name("ga_zrejpf"), null);
    }

    /**
     * Create an aliased <code>intest.ga_zrejpf</code> table reference
     */
    public GaZrejpf(String alias) {
        this(DSL.name(alias), GA_ZREJPF);
    }

    /**
     * Create an aliased <code>intest.ga_zrejpf</code> table reference
     */
    public GaZrejpf(Name alias) {
        this(alias, GA_ZREJPF);
    }

    private GaZrejpf(Name alias, Table<GaZrejpfRecord> aliased) {
        this(alias, aliased, null);
    }

    private GaZrejpf(Name alias, Table<GaZrejpfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ZREJPF_IND);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZrejpf as(String alias) {
        return new GaZrejpf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZrejpf as(Name alias) {
        return new GaZrejpf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GaZrejpf rename(String name) {
        return new GaZrejpf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GaZrejpf rename(Name name) {
        return new GaZrejpf(name, null);
    }
}
