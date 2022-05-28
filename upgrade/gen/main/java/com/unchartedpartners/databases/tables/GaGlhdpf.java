/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.GaGlhdpfRecord;

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
public class GaGlhdpf extends TableImpl<GaGlhdpfRecord> {

    private static final long serialVersionUID = 573115688;

    /**
     * The reference instance of <code>intest.ga_glhdpf</code>
     */
    public static final GaGlhdpf GA_GLHDPF = new GaGlhdpf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GaGlhdpfRecord> getRecordType() {
        return GaGlhdpfRecord.class;
    }

    /**
     * The column <code>intest.ga_glhdpf.id</code>.
     */
    public final TableField<GaGlhdpfRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.ga_glhdpf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.ga_glhdpf.chdrcoy</code>.
     */
    public final TableField<GaGlhdpfRecord, String> CHDRCOY = createField("chdrcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.ga_glhdpf.chdrnum</code>.
     */
    public final TableField<GaGlhdpfRecord, String> CHDRNUM = createField("chdrnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.ga_glhdpf.prodtyp</code>.
     */
    public final TableField<GaGlhdpfRecord, String> PRODTYP = createField("prodtyp", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.ga_glhdpf.planno</code>.
     */
    public final TableField<GaGlhdpfRecord, String> PLANNO = createField("planno", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>intest.ga_glhdpf.premmthd</code>.
     */
    public final TableField<GaGlhdpfRecord, String> PREMMTHD = createField("premmthd", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_glhdpf.descn</code>.
     */
    public final TableField<GaGlhdpfRecord, String> DESCN = createField("descn", org.jooq.impl.SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>intest.ga_glhdpf.dtetrm</code>.
     */
    public final TableField<GaGlhdpfRecord, Integer> DTETRM = createField("dtetrm", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_glhdpf.reasontrm</code>.
     */
    public final TableField<GaGlhdpfRecord, String> REASONTRM = createField("reasontrm", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.ga_glhdpf.gsalfreq</code>.
     */
    public final TableField<GaGlhdpfRecord, String> GSALFREQ = createField("gsalfreq", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_glhdpf.termid</code>.
     */
    public final TableField<GaGlhdpfRecord, String> TERMID = createField("termid", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>intest.ga_glhdpf.user</code>.
     */
    public final TableField<GaGlhdpfRecord, Integer> USER = createField("user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_glhdpf.transaction_date</code>.
     */
    public final TableField<GaGlhdpfRecord, Integer> TRANSACTION_DATE = createField("transaction_date", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_glhdpf.transaction_time</code>.
     */
    public final TableField<GaGlhdpfRecord, Integer> TRANSACTION_TIME = createField("transaction_time", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_glhdpf.tranno</code>.
     */
    public final TableField<GaGlhdpfRecord, Integer> TRANNO = createField("tranno", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_glhdpf.dteatt</code>.
     */
    public final TableField<GaGlhdpfRecord, Integer> DTEATT = createField("dteatt", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.ga_glhdpf.cardtype01</code>.
     */
    public final TableField<GaGlhdpfRecord, String> CARDTYPE01 = createField("cardtype01", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_glhdpf.cardtype02</code>.
     */
    public final TableField<GaGlhdpfRecord, String> CARDTYPE02 = createField("cardtype02", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_glhdpf.bnfttmpla</code>.
     */
    public final TableField<GaGlhdpfRecord, String> BNFTTMPLA = createField("bnfttmpla", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.ga_glhdpf.bnfttmplb</code>.
     */
    public final TableField<GaGlhdpfRecord, String> BNFTTMPLB = createField("bnfttmplb", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.ga_glhdpf.bnfttmplc</code>.
     */
    public final TableField<GaGlhdpfRecord, String> BNFTTMPLC = createField("bnfttmplc", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.ga_glhdpf.gatekeep</code>.
     */
    public final TableField<GaGlhdpfRecord, String> GATEKEEP = createField("gatekeep", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_glhdpf.lmtwhom</code>.
     */
    public final TableField<GaGlhdpfRecord, String> LMTWHOM = createField("lmtwhom", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_glhdpf.provnet</code>.
     */
    public final TableField<GaGlhdpfRecord, String> PROVNET = createField("provnet", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>intest.ga_glhdpf.mbrtype</code>.
     */
    public final TableField<GaGlhdpfRecord, String> MBRTYPE = createField("mbrtype", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_glhdpf.aad</code>.
     */
    public final TableField<GaGlhdpfRecord, Long> AAD = createField("aad", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>intest.ga_glhdpf.preauth</code>.
     */
    public final TableField<GaGlhdpfRecord, String> PREAUTH = createField("preauth", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.ga_glhdpf.dftbft</code>.
     */
    public final TableField<GaGlhdpfRecord, String> DFTBFT = createField("dftbft", org.jooq.impl.SQLDataType.VARCHAR(7), this, "");

    /**
     * The column <code>intest.ga_glhdpf.volcom</code>.
     */
    public final TableField<GaGlhdpfRecord, String> VOLCOM = createField("volcom", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.ga_glhdpf.agemin01</code>.
     */
    public final TableField<GaGlhdpfRecord, Short> AGEMIN01 = createField("agemin01", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.ga_glhdpf.agemin02</code>.
     */
    public final TableField<GaGlhdpfRecord, Short> AGEMIN02 = createField("agemin02", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.ga_glhdpf.agemin03</code>.
     */
    public final TableField<GaGlhdpfRecord, Short> AGEMIN03 = createField("agemin03", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.ga_glhdpf.agemax01</code>.
     */
    public final TableField<GaGlhdpfRecord, Short> AGEMAX01 = createField("agemax01", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.ga_glhdpf.agemax02</code>.
     */
    public final TableField<GaGlhdpfRecord, Short> AGEMAX02 = createField("agemax02", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.ga_glhdpf.agemax03</code>.
     */
    public final TableField<GaGlhdpfRecord, Short> AGEMAX03 = createField("agemax03", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>intest.ga_glhdpf.zpflag</code>.
     */
    public final TableField<GaGlhdpfRecord, String> ZPFLAG = createField("zpflag", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.ga_glhdpf.user_profile</code>.
     */
    public final TableField<GaGlhdpfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_glhdpf.job_name</code>.
     */
    public final TableField<GaGlhdpfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.ga_glhdpf.datime</code>.
     */
    public final TableField<GaGlhdpfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.ga_glhdpf.eb_timestamp</code>.
     */
    public final TableField<GaGlhdpfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.ga_glhdpf</code> table reference
     */
    public GaGlhdpf() {
        this(DSL.name("ga_glhdpf"), null);
    }

    /**
     * Create an aliased <code>intest.ga_glhdpf</code> table reference
     */
    public GaGlhdpf(String alias) {
        this(DSL.name(alias), GA_GLHDPF);
    }

    /**
     * Create an aliased <code>intest.ga_glhdpf</code> table reference
     */
    public GaGlhdpf(Name alias) {
        this(alias, GA_GLHDPF);
    }

    private GaGlhdpf(Name alias, Table<GaGlhdpfRecord> aliased) {
        this(alias, aliased, null);
    }

    private GaGlhdpf(Name alias, Table<GaGlhdpfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.GA_GLHDPF_IND, Indexes.GA_GLHDPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GaGlhdpfRecord, Long> getIdentity() {
        return Keys.IDENTITY_GA_GLHDPF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GaGlhdpfRecord> getPrimaryKey() {
        return Keys.GA_GLHDPF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GaGlhdpfRecord>> getKeys() {
        return Arrays.<UniqueKey<GaGlhdpfRecord>>asList(Keys.GA_GLHDPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaGlhdpf as(String alias) {
        return new GaGlhdpf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaGlhdpf as(Name alias) {
        return new GaGlhdpf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GaGlhdpf rename(String name) {
        return new GaGlhdpf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GaGlhdpf rename(Name name) {
        return new GaGlhdpf(name, null);
    }
}
