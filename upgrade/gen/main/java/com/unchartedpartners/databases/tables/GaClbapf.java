/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.GaClbapfRecord;

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
public class GaClbapf extends TableImpl<GaClbapfRecord> {

    private static final long serialVersionUID = -1893885605;

    /**
     * The reference instance of <code>intest.ga_clbapf</code>
     */
    public static final GaClbapf GA_CLBAPF = new GaClbapf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GaClbapfRecord> getRecordType() {
        return GaClbapfRecord.class;
    }

    /**
     * The column <code>intest.ga_clbapf.clntpfx</code>.
     */
    public final TableField<GaClbapfRecord, String> CLNTPFX = createField("clntpfx", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_clbapf.clntcoy</code>.
     */
    public final TableField<GaClbapfRecord, String> CLNTCOY = createField("clntcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.ga_clbapf.clntnum</code>.
     */
    public final TableField<GaClbapfRecord, String> CLNTNUM = createField("clntnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.ga_clbapf.currfrom</code>.
     */
    public final TableField<GaClbapfRecord, Integer> CURRFROM = createField("currfrom", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_clbapf.currto</code>.
     */
    public final TableField<GaClbapfRecord, Integer> CURRTO = createField("currto", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_clbapf.clntrel</code>.
     */
    public final TableField<GaClbapfRecord, String> CLNTREL = createField("clntrel", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_clbapf.validflag</code>.
     */
    public final TableField<GaClbapfRecord, String> VALIDFLAG = createField("validflag", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.ga_clbapf.billdate01</code>.
     */
    public final TableField<GaClbapfRecord, Integer> BILLDATE01 = createField("billdate01", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_clbapf.billdate02</code>.
     */
    public final TableField<GaClbapfRecord, Integer> BILLDATE02 = createField("billdate02", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_clbapf.billdate03</code>.
     */
    public final TableField<GaClbapfRecord, Integer> BILLDATE03 = createField("billdate03", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_clbapf.billdate04</code>.
     */
    public final TableField<GaClbapfRecord, Integer> BILLDATE04 = createField("billdate04", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_clbapf.billamt01</code>.
     */
    public final TableField<GaClbapfRecord, BigDecimal> BILLAMT01 = createField("billamt01", org.jooq.impl.SQLDataType.NUMERIC(17, 2), this, "");

    /**
     * The column <code>intest.ga_clbapf.billamt02</code>.
     */
    public final TableField<GaClbapfRecord, BigDecimal> BILLAMT02 = createField("billamt02", org.jooq.impl.SQLDataType.NUMERIC(17, 2), this, "");

    /**
     * The column <code>intest.ga_clbapf.billamt03</code>.
     */
    public final TableField<GaClbapfRecord, BigDecimal> BILLAMT03 = createField("billamt03", org.jooq.impl.SQLDataType.NUMERIC(17, 2), this, "");

    /**
     * The column <code>intest.ga_clbapf.billamt04</code>.
     */
    public final TableField<GaClbapfRecord, BigDecimal> BILLAMT04 = createField("billamt04", org.jooq.impl.SQLDataType.NUMERIC(17, 2), this, "");

    /**
     * The column <code>intest.ga_clbapf.remittype</code>.
     */
    public final TableField<GaClbapfRecord, String> REMITTYPE = createField("remittype", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.ga_clbapf.newrqst</code>.
     */
    public final TableField<GaClbapfRecord, String> NEWRQST = createField("newrqst", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.ga_clbapf.facthous</code>.
     */
    public final TableField<GaClbapfRecord, String> FACTHOUS = createField("facthous", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_clbapf.bankkey</code>.
     */
    public final TableField<GaClbapfRecord, String> BANKKEY = createField("bankkey", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_clbapf.bankacckey</code>.
     */
    public final TableField<GaClbapfRecord, String> BANKACCKEY = createField("bankacckey", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.ga_clbapf.bankaccdsc</code>.
     */
    public final TableField<GaClbapfRecord, String> BANKACCDSC = createField("bankaccdsc", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>intest.ga_clbapf.bnkactyp</code>.
     */
    public final TableField<GaClbapfRecord, String> BNKACTYP = createField("bnkactyp", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.ga_clbapf.currcode</code>.
     */
    public final TableField<GaClbapfRecord, String> CURRCODE = createField("currcode", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_clbapf.dd_tran_code</code>.
     */
    public final TableField<GaClbapfRecord, String> DD_TRAN_CODE = createField("dd_tran_code", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_clbapf.sctycde</code>.
     */
    public final TableField<GaClbapfRecord, String> SCTYCDE = createField("sctycde", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_clbapf.user_profile</code>.
     */
    public final TableField<GaClbapfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_clbapf.job_name</code>.
     */
    public final TableField<GaClbapfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_clbapf.datime</code>.
     */
    public final TableField<GaClbapfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.ga_clbapf.eb_timestamp</code>.
     */
    public final TableField<GaClbapfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.ga_clbapf.id</code>.
     */
    public final TableField<GaClbapfRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.ga_clbapf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>intest.ga_clbapf</code> table reference
     */
    public GaClbapf() {
        this(DSL.name("ga_clbapf"), null);
    }

    /**
     * Create an aliased <code>intest.ga_clbapf</code> table reference
     */
    public GaClbapf(String alias) {
        this(DSL.name(alias), GA_CLBAPF);
    }

    /**
     * Create an aliased <code>intest.ga_clbapf</code> table reference
     */
    public GaClbapf(Name alias) {
        this(alias, GA_CLBAPF);
    }

    private GaClbapf(Name alias, Table<GaClbapfRecord> aliased) {
        this(alias, aliased, null);
    }

    private GaClbapf(Name alias, Table<GaClbapfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.GA_CLBAPF_IND, Indexes.GA_CLBAPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GaClbapfRecord, Long> getIdentity() {
        return Keys.IDENTITY_GA_CLBAPF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GaClbapfRecord> getPrimaryKey() {
        return Keys.GA_CLBAPF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GaClbapfRecord>> getKeys() {
        return Arrays.<UniqueKey<GaClbapfRecord>>asList(Keys.GA_CLBAPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaClbapf as(String alias) {
        return new GaClbapf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaClbapf as(Name alias) {
        return new GaClbapf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GaClbapf rename(String name) {
        return new GaClbapf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GaClbapf rename(Name name) {
        return new GaClbapf(name, null);
    }
}