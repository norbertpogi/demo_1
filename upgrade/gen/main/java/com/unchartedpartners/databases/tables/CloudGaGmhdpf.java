/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.CloudGaGmhdpfRecord;

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
public class CloudGaGmhdpf extends TableImpl<CloudGaGmhdpfRecord> {

    private static final long serialVersionUID = -1944957594;

    /**
     * The reference instance of <code>intest.cloud_ga_gmhdpf</code>
     */
    public static final CloudGaGmhdpf CLOUD_GA_GMHDPF = new CloudGaGmhdpf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CloudGaGmhdpfRecord> getRecordType() {
        return CloudGaGmhdpfRecord.class;
    }

    /**
     * The column <code>intest.cloud_ga_gmhdpf.id</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.cloud_ga_gmhdpf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.chdrcoy</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> CHDRCOY = createField("chdrcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.chdrnum</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> CHDRNUM = createField("chdrnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.mbrno</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> MBRNO = createField("mbrno", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.dpntno</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> DPNTNO = createField("dpntno", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.dtetrm</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Integer> DTETRM = createField("dtetrm", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.reasontrm</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> REASONTRM = createField("reasontrm", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.clntpfx</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> CLNTPFX = createField("clntpfx", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.fsuco</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> FSUCO = createField("fsuco", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.clntnum</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> CLNTNUM = createField("clntnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.headcnt</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> HEADCNT = createField("headcnt", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.dteatt</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Integer> DTEATT = createField("dteatt", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.medevd</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> MEDEVD = createField("medevd", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.reln</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> RELN = createField("reln", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.fauwdt</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Integer> FAUWDT = createField("fauwdt", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.ldpntno</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Byte> LDPNTNO = createField("ldpntno", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.termid</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> TERMID = createField("termid", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.user</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Integer> USER = createField("user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.transaction_date</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Integer> TRANSACTION_DATE = createField("transaction_date", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.transaction_time</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Integer> TRANSACTION_TIME = createField("transaction_time", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.tranno</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Integer> TRANNO = createField("tranno", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.pndate</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Integer> PNDATE = createField("pndate", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.client</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> CLIENT = createField("client", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.termrsncd</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> TERMRSNCD = createField("termrsncd", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.refind</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> REFIND = createField("refind", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.empno</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> EMPNO = createField("empno", org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.smokeind</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> SMOKEIND = createField("smokeind", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.occpclas</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> OCCPCLAS = createField("occpclas", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.ethorg</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> ETHORG = createField("ethorg", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.gheight</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Short> GHEIGHT = createField("gheight", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.gweight</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Short> GWEIGHT = createField("gweight", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.payment_method</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> PAYMENT_METHOD = createField("payment_method", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.defclmpye</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> DEFCLMPYE = createField("defclmpye", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.term</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Short> TERM = createField("term", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.gintrate</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, BigDecimal> GINTRATE = createField("gintrate", org.jooq.impl.SQLDataType.NUMERIC(4, 2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.prvpoldt</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Integer> PRVPOLDT = createField("prvpoldt", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.dept</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> DEPT = createField("dept", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.newoldcl</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> NEWOLDCL = createField("newoldcl", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.age</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Short> AGE = createField("age", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.ordob</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Byte> ORDOB = createField("ordob", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.statcode</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> STATCODE = createField("statcode", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.bankacckey</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> BANKACCKEY = createField("bankacckey", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.applicno</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> APPLICNO = createField("applicno", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.certno</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> CERTNO = createField("certno", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.zaaindic</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> ZAAINDIC = createField("zaaindic", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.ztsaflag</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> ZTSAFLAG = createField("ztsaflag", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.user_profile</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.job_name</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.datime</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.cloud_ga_gmhdpf.eb_timestamp</code>.
     */
    public final TableField<CloudGaGmhdpfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.cloud_ga_gmhdpf</code> table reference
     */
    public CloudGaGmhdpf() {
        this(DSL.name("cloud_ga_gmhdpf"), null);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_gmhdpf</code> table reference
     */
    public CloudGaGmhdpf(String alias) {
        this(DSL.name(alias), CLOUD_GA_GMHDPF);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_gmhdpf</code> table reference
     */
    public CloudGaGmhdpf(Name alias) {
        this(alias, CLOUD_GA_GMHDPF);
    }

    private CloudGaGmhdpf(Name alias, Table<CloudGaGmhdpfRecord> aliased) {
        this(alias, aliased, null);
    }

    private CloudGaGmhdpf(Name alias, Table<CloudGaGmhdpfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CLOUD_GA_GMHDPF_IND, Indexes.CLOUD_GA_GMHDPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CloudGaGmhdpfRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLOUD_GA_GMHDPF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CloudGaGmhdpfRecord> getPrimaryKey() {
        return Keys.CLOUD_GA_GMHDPF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CloudGaGmhdpfRecord>> getKeys() {
        return Arrays.<UniqueKey<CloudGaGmhdpfRecord>>asList(Keys.CLOUD_GA_GMHDPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaGmhdpf as(String alias) {
        return new CloudGaGmhdpf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaGmhdpf as(Name alias) {
        return new CloudGaGmhdpf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaGmhdpf rename(String name) {
        return new CloudGaGmhdpf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaGmhdpf rename(Name name) {
        return new CloudGaGmhdpf(name, null);
    }
}
