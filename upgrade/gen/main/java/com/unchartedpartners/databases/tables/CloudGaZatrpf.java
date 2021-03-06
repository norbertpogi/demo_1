/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.CloudGaZatrpfRecord;

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
public class CloudGaZatrpf extends TableImpl<CloudGaZatrpfRecord> {

    private static final long serialVersionUID = -2052476122;

    /**
     * The reference instance of <code>intest.cloud_ga_zatrpf</code>
     */
    public static final CloudGaZatrpf CLOUD_GA_ZATRPF = new CloudGaZatrpf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CloudGaZatrpfRecord> getRecordType() {
        return CloudGaZatrpfRecord.class;
    }

    /**
     * The column <code>intest.cloud_ga_zatrpf.id</code>.
     */
    public final TableField<CloudGaZatrpfRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.cloud_ga_zatrpf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.agntcoy</code>.
     */
    public final TableField<CloudGaZatrpfRecord, String> AGNTCOY = createField("agntcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.agntnum</code>.
     */
    public final TableField<CloudGaZatrpfRecord, String> AGNTNUM = createField("agntnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.zagedcd</code>.
     */
    public final TableField<CloudGaZatrpfRecord, String> ZAGEDCD = createField("zagedcd", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.zageddt</code>.
     */
    public final TableField<CloudGaZatrpfRecord, Integer> ZAGEDDT = createField("zageddt", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.zagedsf</code>.
     */
    public final TableField<CloudGaZatrpfRecord, String> ZAGEDSF = createField("zagedsf", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.zagedrs</code>.
     */
    public final TableField<CloudGaZatrpfRecord, String> ZAGEDRS = createField("zagedrs", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.termid</code>.
     */
    public final TableField<CloudGaZatrpfRecord, String> TERMID = createField("termid", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.user</code>.
     */
    public final TableField<CloudGaZatrpfRecord, Integer> USER = createField("user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.transaction_date</code>.
     */
    public final TableField<CloudGaZatrpfRecord, Integer> TRANSACTION_DATE = createField("transaction_date", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.transaction_time</code>.
     */
    public final TableField<CloudGaZatrpfRecord, Integer> TRANSACTION_TIME = createField("transaction_time", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.user_profile</code>.
     */
    public final TableField<CloudGaZatrpfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.job_name</code>.
     */
    public final TableField<CloudGaZatrpfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.datime</code>.
     */
    public final TableField<CloudGaZatrpfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.rrn</code>.
     */
    public final TableField<CloudGaZatrpfRecord, Long> RRN = createField("rrn", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>intest.cloud_ga_zatrpf.eb_timestamp</code>.
     */
    public final TableField<CloudGaZatrpfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.cloud_ga_zatrpf</code> table reference
     */
    public CloudGaZatrpf() {
        this(DSL.name("cloud_ga_zatrpf"), null);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_zatrpf</code> table reference
     */
    public CloudGaZatrpf(String alias) {
        this(DSL.name(alias), CLOUD_GA_ZATRPF);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_zatrpf</code> table reference
     */
    public CloudGaZatrpf(Name alias) {
        this(alias, CLOUD_GA_ZATRPF);
    }

    private CloudGaZatrpf(Name alias, Table<CloudGaZatrpfRecord> aliased) {
        this(alias, aliased, null);
    }

    private CloudGaZatrpf(Name alias, Table<CloudGaZatrpfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CLOUD_GA_ZATRPF_IND, Indexes.CLOUD_GA_ZATRPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CloudGaZatrpfRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLOUD_GA_ZATRPF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CloudGaZatrpfRecord> getPrimaryKey() {
        return Keys.CLOUD_GA_ZATRPF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CloudGaZatrpfRecord>> getKeys() {
        return Arrays.<UniqueKey<CloudGaZatrpfRecord>>asList(Keys.CLOUD_GA_ZATRPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaZatrpf as(String alias) {
        return new CloudGaZatrpf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaZatrpf as(Name alias) {
        return new CloudGaZatrpf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaZatrpf rename(String name) {
        return new CloudGaZatrpf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaZatrpf rename(Name name) {
        return new CloudGaZatrpf(name, null);
    }
}
