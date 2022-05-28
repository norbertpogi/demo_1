/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.CloudGaGmhipfRecord;

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
public class CloudGaGmhipf extends TableImpl<CloudGaGmhipfRecord> {

    private static final long serialVersionUID = 1359578686;

    /**
     * The reference instance of <code>intest.cloud_ga_gmhipf</code>
     */
    public static final CloudGaGmhipf CLOUD_GA_GMHIPF = new CloudGaGmhipf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CloudGaGmhipfRecord> getRecordType() {
        return CloudGaGmhipfRecord.class;
    }

    /**
     * The column <code>intest.cloud_ga_gmhipf.id</code>.
     */
    public final TableField<CloudGaGmhipfRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.cloud_ga_gmhipf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.chdrcoy</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> CHDRCOY = createField("chdrcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.chdrnum</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> CHDRNUM = createField("chdrnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.mbrno</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> MBRNO = createField("mbrno", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.effdate</code>.
     */
    public final TableField<CloudGaGmhipfRecord, Integer> EFFDATE = createField("effdate", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.dtetrm</code>.
     */
    public final TableField<CloudGaGmhipfRecord, Integer> DTETRM = createField("dtetrm", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.subscoy</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> SUBSCOY = createField("subscoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.subsnum</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> SUBSNUM = createField("subsnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.occpcode</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> OCCPCODE = createField("occpcode", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.salary</code>.
     */
    public final TableField<CloudGaGmhipfRecord, BigDecimal> SALARY = createField("salary", org.jooq.impl.SQLDataType.NUMERIC(11, 2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.dteapp</code>.
     */
    public final TableField<CloudGaGmhipfRecord, Integer> DTEAPP = createField("dteapp", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.sbstdl</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> SBSTDL = createField("sbstdl", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.termid</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> TERMID = createField("termid", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.user</code>.
     */
    public final TableField<CloudGaGmhipfRecord, Integer> USER = createField("user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.transaction_date</code>.
     */
    public final TableField<CloudGaGmhipfRecord, Integer> TRANSACTION_DATE = createField("transaction_date", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.transaction_time</code>.
     */
    public final TableField<CloudGaGmhipfRecord, Integer> TRANSACTION_TIME = createField("transaction_time", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.tranno</code>.
     */
    public final TableField<CloudGaGmhipfRecord, Integer> TRANNO = createField("tranno", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.fupflg</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> FUPFLG = createField("fupflg", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.dpntno</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> DPNTNO = createField("dpntno", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.client</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> CLIENT = createField("client", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.personcov</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> PERSONCOV = createField("personcov", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.mlvlplan</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> MLVLPLAN = createField("mlvlplan", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.clntcoy</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> CLNTCOY = createField("clntcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.pccclnt</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> PCCCLNT = createField("pccclnt", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.apccclnt</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> APCCCLNT = createField("apccclnt", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.earning</code>.
     */
    public final TableField<CloudGaGmhipfRecord, BigDecimal> EARNING = createField("earning", org.jooq.impl.SQLDataType.NUMERIC(11, 2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.ctbprcnt</code>.
     */
    public final TableField<CloudGaGmhipfRecord, BigDecimal> CTBPRCNT = createField("ctbprcnt", org.jooq.impl.SQLDataType.NUMERIC(5, 2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.ctbamt</code>.
     */
    public final TableField<CloudGaGmhipfRecord, BigDecimal> CTBAMT = createField("ctbamt", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.user_profile</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.job_name</code>.
     */
    public final TableField<CloudGaGmhipfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.datime</code>.
     */
    public final TableField<CloudGaGmhipfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhipf.eb_timestamp</code>.
     */
    public final TableField<CloudGaGmhipfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.cloud_ga_gmhipf</code> table reference
     */
    public CloudGaGmhipf() {
        this(DSL.name("cloud_ga_gmhipf"), null);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_gmhipf</code> table reference
     */
    public CloudGaGmhipf(String alias) {
        this(DSL.name(alias), CLOUD_GA_GMHIPF);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_gmhipf</code> table reference
     */
    public CloudGaGmhipf(Name alias) {
        this(alias, CLOUD_GA_GMHIPF);
    }

    private CloudGaGmhipf(Name alias, Table<CloudGaGmhipfRecord> aliased) {
        this(alias, aliased, null);
    }

    private CloudGaGmhipf(Name alias, Table<CloudGaGmhipfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CLOUD_GA_GMHIPF_IND, Indexes.CLOUD_GA_GMHIPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CloudGaGmhipfRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLOUD_GA_GMHIPF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CloudGaGmhipfRecord> getPrimaryKey() {
        return Keys.CLOUD_GA_GMHIPF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CloudGaGmhipfRecord>> getKeys() {
        return Arrays.<UniqueKey<CloudGaGmhipfRecord>>asList(Keys.CLOUD_GA_GMHIPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaGmhipf as(String alias) {
        return new CloudGaGmhipf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaGmhipf as(Name alias) {
        return new CloudGaGmhipf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaGmhipf rename(String name) {
        return new CloudGaGmhipf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaGmhipf rename(Name name) {
        return new CloudGaGmhipf(name, null);
    }
}