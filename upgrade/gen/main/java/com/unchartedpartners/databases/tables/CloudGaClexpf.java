/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.CloudGaClexpfRecord;

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
public class CloudGaClexpf extends TableImpl<CloudGaClexpfRecord> {

    private static final long serialVersionUID = 263617045;

    /**
     * The reference instance of <code>intest.cloud_ga_clexpf</code>
     */
    public static final CloudGaClexpf CLOUD_GA_CLEXPF = new CloudGaClexpf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CloudGaClexpfRecord> getRecordType() {
        return CloudGaClexpfRecord.class;
    }

    /**
     * The column <code>intest.cloud_ga_clexpf.id</code>.
     */
    public final TableField<CloudGaClexpfRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.cloud_ga_clexpf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.clntpfx</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> CLNTPFX = createField("clntpfx", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.clntcoy</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> CLNTCOY = createField("clntcoy", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.clntnum</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> CLNTNUM = createField("clntnum", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.rdidtelno</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> RDIDTELNO = createField("rdidtelno", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.rmblphone</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> RMBLPHONE = createField("rmblphone", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.rpager</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> RPAGER = createField("rpager", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.faxno</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> FAXNO = createField("faxno", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.rinternet</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> RINTERNET = createField("rinternet", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.rtaxidnum</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> RTAXIDNUM = createField("rtaxidnum", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.rstaflag</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> RSTAFLAG = createField("rstaflag", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.splindic</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> SPLINDIC = createField("splindic", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.zspecind</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> ZSPECIND = createField("zspecind", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.oldidno</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> OLDIDNO = createField("oldidno", org.jooq.impl.SQLDataType.VARCHAR(24), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.user_profile</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> USER_PROFILE = createField("user_profile", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.job_name</code>.
     */
    public final TableField<CloudGaClexpfRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.datime</code>.
     */
    public final TableField<CloudGaClexpfRecord, Timestamp> DATIME = createField("datime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.cloud_ga_clexpf.eb_timestamp</code>.
     */
    public final TableField<CloudGaClexpfRecord, Timestamp> EB_TIMESTAMP = createField("eb_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.cloud_ga_clexpf</code> table reference
     */
    public CloudGaClexpf() {
        this(DSL.name("cloud_ga_clexpf"), null);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_clexpf</code> table reference
     */
    public CloudGaClexpf(String alias) {
        this(DSL.name(alias), CLOUD_GA_CLEXPF);
    }

    /**
     * Create an aliased <code>intest.cloud_ga_clexpf</code> table reference
     */
    public CloudGaClexpf(Name alias) {
        this(alias, CLOUD_GA_CLEXPF);
    }

    private CloudGaClexpf(Name alias, Table<CloudGaClexpfRecord> aliased) {
        this(alias, aliased, null);
    }

    private CloudGaClexpf(Name alias, Table<CloudGaClexpfRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CLOUD_GA_CLEXPF_IND, Indexes.CLOUD_GA_CLEXPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CloudGaClexpfRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLOUD_GA_CLEXPF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CloudGaClexpfRecord> getPrimaryKey() {
        return Keys.CLOUD_GA_CLEXPF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CloudGaClexpfRecord>> getKeys() {
        return Arrays.<UniqueKey<CloudGaClexpfRecord>>asList(Keys.CLOUD_GA_CLEXPF_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaClexpf as(String alias) {
        return new CloudGaClexpf(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudGaClexpf as(Name alias) {
        return new CloudGaClexpf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaClexpf rename(String name) {
        return new CloudGaClexpf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudGaClexpf rename(Name name) {
        return new CloudGaClexpf(name, null);
    }
}
