/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.CloudGaGphdpfRecord;

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
public class CloudGaGphdpf extends TableImpl<CloudGaGphdpfRecord> {

    private static final long serialVersionUID = -1556074972;

    /**
     * The reference instance of <code>intest.cloud_ga_gphdpf</code>
     */
    public static final CloudGaGphdpf CLOUD_GA_GPHDPF = new CloudGaGphdpf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CloudGaGphdpfRecord> getRecordType() {
        return CloudGaGphdpfRecord.class;
    }

    /**
     * The column <code>intest.cloud_ga_gphdpf.id</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.cloud_ga_gphdpf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.chdrcoy</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> CHDRCOY = createField("chdrcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.chdrnum</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> CHDRNUM = createField("chdrnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.prodtyp</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> PRODTYP = createField("prodtyp", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.dteatt</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Integer> DTEATT = createField("dteatt", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.contype</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> CONTYPE = createField("contype", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.agrindem</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> AGRINDEM = createField("agrindem", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.dteidm</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Integer> DTEIDM = createField("dteidm", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.medevd</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> MEDEVD = createField("medevd", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.dtetrm</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Integer> DTETRM = createField("dtetrm", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.reasontrm</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> REASONTRM = createField("reasontrm", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.termid</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> TERMID = createField("termid", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.user</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Integer> USER = createField("user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.transaction_date</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Integer> TRANSACTION_DATE = createField("transaction_date", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.transaction_time</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Integer> TRANSACTION_TIME = createField("transaction_time", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.tranno</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Integer> TRANNO = createField("tranno", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.prvcond</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> PRVCOND = createField("prvcond", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.prvamts</code>.
     */
    public final TableField<CloudGaGphdpfRecord, BigDecimal> PRVAMTS = createField("prvamts", org.jooq.impl.SQLDataType.NUMERIC(15, 2), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.prvamtm</code>.
     */
    public final TableField<CloudGaGphdpfRecord, BigDecimal> PRVAMTM = createField("prvamtm", org.jooq.impl.SQLDataType.NUMERIC(15, 2), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.preexibef</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Short> PREEXIBEF = createField("preexibef", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.preexiaft</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Short> PREEXIAFT = createField("preexiaft", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.gsttype</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> GSTTYPE = createField("gsttype", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.pm06key</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> PM06KEY = createField("pm06key", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.ectbrule</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> ECTBRULE = createField("ectbrule", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.invfmix</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> INVFMIX = createField("invfmix", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.bftdsn</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> BFTDSN = createField("bftdsn", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.paymmode</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> PAYMMODE = createField("paymmode", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.invslvl</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> INVSLVL = createField("invslvl", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.acblrule</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> ACBLRULE = createField("acblrule", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.prmpyopt</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> PRMPYOPT = createField("prmpyopt", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.prtebflg</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> PRTEBFLG = createField("prtebflg", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.trustee</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> TRUSTEE = createField("trustee", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.glbfeesc</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> GLBFEESC = createField("glbfeesc", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.actexflg</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> ACTEXFLG = createField("actexflg", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.mbrfee</code>.
     */
    public final TableField<CloudGaGphdpfRecord, BigDecimal> MBRFEE = createField("mbrfee", org.jooq.impl.SQLDataType.NUMERIC(11, 2), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.frfund</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> FRFUND = createField("frfund", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.evntfee</code>.
     */
    public final TableField<CloudGaGphdpfRecord, BigDecimal> EVNTFEE = createField("evntfee", org.jooq.impl.SQLDataType.NUMERIC(11, 2), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.timefee</code>.
     */
    public final TableField<CloudGaGphdpfRecord, BigDecimal> TIMEFEE = createField("timefee", org.jooq.impl.SQLDataType.NUMERIC(11, 2), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.feebtdte</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Integer> FEEBTDTE = createField("feebtdte", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.user_profile</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.job_name</code>.
     */
    public final TableField<CloudGaGphdpfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.datime</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.cloud_ga_gphdpf.eb_timestamp</code>.
     */
    public final TableField<CloudGaGphdpfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.cloud_ga_gphdpf</code> table reference
     */
    public CloudGaGphdpf() {
        this(DSL.name("cloud_ga_gphdpf"), null);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_gphdpf</code> table reference
     */
    public CloudGaGphdpf(String alias) {
        this(DSL.name(alias), CLOUD_GA_GPHDPF);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_gphdpf</code> table reference
     */
    public CloudGaGphdpf(Name alias) {
        this(alias, CLOUD_GA_GPHDPF);
    }

    private CloudGaGphdpf(Name alias, Table<CloudGaGphdpfRecord> aliased) {
        this(alias, aliased, null);
    }

    private CloudGaGphdpf(Name alias, Table<CloudGaGphdpfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CLOUD_GA_GPHDPF_IND, Indexes.CLOUD_GA_GPHDPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CloudGaGphdpfRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLOUD_GA_GPHDPF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CloudGaGphdpfRecord> getPrimaryKey() {
        return Keys.CLOUD_GA_GPHDPF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CloudGaGphdpfRecord>> getKeys() {
        return Arrays.<UniqueKey<CloudGaGphdpfRecord>>asList(Keys.CLOUD_GA_GPHDPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaGphdpf as(String alias) {
        return new CloudGaGphdpf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaGphdpf as(Name alias) {
        return new CloudGaGphdpf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaGphdpf rename(String name) {
        return new CloudGaGphdpf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaGphdpf rename(Name name) {
        return new CloudGaGphdpf(name, null);
    }
}
