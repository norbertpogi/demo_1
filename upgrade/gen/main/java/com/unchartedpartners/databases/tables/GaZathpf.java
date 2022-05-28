/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.GaZathpfRecord;

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
public class GaZathpf extends TableImpl<GaZathpfRecord> {

    private static final long serialVersionUID = 1034647252;

    /**
     * The reference instance of <code>intest.ga_zathpf</code>
     */
    public static final GaZathpf GA_ZATHPF = new GaZathpf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GaZathpfRecord> getRecordType() {
        return GaZathpfRecord.class;
    }

    /**
     * The column <code>intest.ga_zathpf.id</code>.
     */
    public final TableField<GaZathpfRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.ga_zathpf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.ga_zathpf.agntcoy</code>.
     */
    public final TableField<GaZathpfRecord, String> AGNTCOY = createField("agntcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.ga_zathpf.agntnum</code>.
     */
    public final TableField<GaZathpfRecord, String> AGNTNUM = createField("agntnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.ga_zathpf.zagedcd</code>.
     */
    public final TableField<GaZathpfRecord, String> ZAGEDCD = createField("zagedcd", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>intest.ga_zathpf.zageddt</code>.
     */
    public final TableField<GaZathpfRecord, Integer> ZAGEDDT = createField("zageddt", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_zathpf.zagedsf</code>.
     */
    public final TableField<GaZathpfRecord, String> ZAGEDSF = createField("zagedsf", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.ga_zathpf.zagedrs</code>.
     */
    public final TableField<GaZathpfRecord, String> ZAGEDRS = createField("zagedrs", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_zathpf.user_profile</code>.
     */
    public final TableField<GaZathpfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_zathpf.job_name</code>.
     */
    public final TableField<GaZathpfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_zathpf.datime</code>.
     */
    public final TableField<GaZathpfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.ga_zathpf.rrn</code>.
     */
    public final TableField<GaZathpfRecord, Long> RRN = createField("rrn", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>intest.ga_zathpf.eb_timestamp</code>.
     */
    public final TableField<GaZathpfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.ga_zathpf</code> table reference
     */
    public GaZathpf() {
        this(DSL.name("ga_zathpf"), null);
    }

    /**
     * Create an aliased <code>intest.ga_zathpf</code> table reference
     */
    public GaZathpf(String alias) {
        this(DSL.name(alias), GA_ZATHPF);
    }

    /**
     * Create an aliased <code>intest.ga_zathpf</code> table reference
     */
    public GaZathpf(Name alias) {
        this(alias, GA_ZATHPF);
    }

    private GaZathpf(Name alias, Table<GaZathpfRecord> aliased) {
        this(alias, aliased, null);
    }

    private GaZathpf(Name alias, Table<GaZathpfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.GA_ZATHPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GaZathpfRecord, Long> getIdentity() {
        return Keys.IDENTITY_GA_ZATHPF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GaZathpfRecord> getPrimaryKey() {
        return Keys.GA_ZATHPF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GaZathpfRecord>> getKeys() {
        return Arrays.<UniqueKey<GaZathpfRecord>>asList(Keys.GA_ZATHPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZathpf as(String alias) {
        return new GaZathpf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZathpf as(Name alias) {
        return new GaZathpf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GaZathpf rename(String name) {
        return new GaZathpf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GaZathpf rename(Name name) {
        return new GaZathpf(name, null);
    }
}