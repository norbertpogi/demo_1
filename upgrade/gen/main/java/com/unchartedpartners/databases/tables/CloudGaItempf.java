/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.CloudGaItempfRecord;

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
public class CloudGaItempf extends TableImpl<CloudGaItempfRecord> {

    private static final long serialVersionUID = 1427640229;

    /**
     * The reference instance of <code>intest.cloud_ga_itempf</code>
     */
    public static final CloudGaItempf CLOUD_GA_ITEMPF = new CloudGaItempf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CloudGaItempfRecord> getRecordType() {
        return CloudGaItempfRecord.class;
    }

    /**
     * The column <code>intest.cloud_ga_itempf.id</code>.
     */
    public final TableField<CloudGaItempfRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.cloud_ga_itempf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.itempfx</code>.
     */
    public final TableField<CloudGaItempfRecord, String> ITEMPFX = createField("itempfx", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.itemcoy</code>.
     */
    public final TableField<CloudGaItempfRecord, String> ITEMCOY = createField("itemcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.itemtabl</code>.
     */
    public final TableField<CloudGaItempfRecord, String> ITEMTABL = createField("itemtabl", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.itemitem</code>.
     */
    public final TableField<CloudGaItempfRecord, String> ITEMITEM = createField("itemitem", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.itemseq</code>.
     */
    public final TableField<CloudGaItempfRecord, String> ITEMSEQ = createField("itemseq", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.tableprog</code>.
     */
    public final TableField<CloudGaItempfRecord, String> TABLEPROG = createField("tableprog", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.validflag</code>.
     */
    public final TableField<CloudGaItempfRecord, String> VALIDFLAG = createField("validflag", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.itmfrm</code>.
     */
    public final TableField<CloudGaItempfRecord, Integer> ITMFRM = createField("itmfrm", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.itmto</code>.
     */
    public final TableField<CloudGaItempfRecord, Integer> ITMTO = createField("itmto", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.genarea</code>.
     */
    public final TableField<CloudGaItempfRecord, String> GENAREA = createField("genarea", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.user_profile</code>.
     */
    public final TableField<CloudGaItempfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.job_name</code>.
     */
    public final TableField<CloudGaItempfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.datime</code>.
     */
    public final TableField<CloudGaItempfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.rrn</code>.
     */
    public final TableField<CloudGaItempfRecord, Long> RRN = createField("rrn", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>intest.cloud_ga_itempf.eb_timestamp</code>.
     */
    public final TableField<CloudGaItempfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.cloud_ga_itempf</code> table reference
     */
    public CloudGaItempf() {
        this(DSL.name("cloud_ga_itempf"), null);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_itempf</code> table reference
     */
    public CloudGaItempf(String alias) {
        this(DSL.name(alias), CLOUD_GA_ITEMPF);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_itempf</code> table reference
     */
    public CloudGaItempf(Name alias) {
        this(alias, CLOUD_GA_ITEMPF);
    }

    private CloudGaItempf(Name alias, Table<CloudGaItempfRecord> aliased) {
        this(alias, aliased, null);
    }

    private CloudGaItempf(Name alias, Table<CloudGaItempfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CLOUD_GA_ITEMPF_IND, Indexes.CLOUD_GA_ITEMPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CloudGaItempfRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLOUD_GA_ITEMPF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CloudGaItempfRecord> getPrimaryKey() {
        return Keys.CLOUD_GA_ITEMPF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CloudGaItempfRecord>> getKeys() {
        return Arrays.<UniqueKey<CloudGaItempfRecord>>asList(Keys.CLOUD_GA_ITEMPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaItempf as(String alias) {
        return new CloudGaItempf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaItempf as(Name alias) {
        return new CloudGaItempf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaItempf rename(String name) {
        return new CloudGaItempf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaItempf rename(Name name) {
        return new CloudGaItempf(name, null);
    }
}
