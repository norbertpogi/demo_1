/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.enums.StagingStatus;
import com.unchartedpartners.databases.tables.records.MemberActStagingStatusRecord;
import com.unchartedpartners.jooq.PostgresJsonMapBinder;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class MemberActStagingStatus extends TableImpl<MemberActStagingStatusRecord> {

    private static final long serialVersionUID = -1310337932;

    /**
     * The reference instance of <code>intest.member_act_staging_status</code>
     */
    public static final MemberActStagingStatus MEMBER_ACT_STAGING_STATUS = new MemberActStagingStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberActStagingStatusRecord> getRecordType() {
        return MemberActStagingStatusRecord.class;
    }

    /**
     * The column <code>intest.member_act_staging_status.id</code>.
     */
    public final TableField<MemberActStagingStatusRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.member_act_staging_status_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.member_act_staging_status.member_act_staging_id</code>.
     */
    public final TableField<MemberActStagingStatusRecord, Long> MEMBER_ACT_STAGING_ID = createField("member_act_staging_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_staging_status.staging_status</code>.
     */
    public final TableField<MemberActStagingStatusRecord, StagingStatus> STAGING_STATUS = createField("staging_status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.StagingStatus.class), this, "");

    /**
     * The column <code>intest.member_act_staging_status.deleted</code>.
     */
    public final TableField<MemberActStagingStatusRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_staging_status.created_by</code>.
     */
    public final TableField<MemberActStagingStatusRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_staging_status.created</code>.
     */
    public final TableField<MemberActStagingStatusRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_staging_status.updated_by</code>.
     */
    public final TableField<MemberActStagingStatusRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_staging_status.updated</code>.
     */
    public final TableField<MemberActStagingStatusRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_staging_status.fail_process</code>.
     */
    public final TableField<MemberActStagingStatusRecord, Map> FAIL_PROCESS = createField("fail_process", org.jooq.impl.SQLDataType.OTHER, this, "", new PostgresJsonMapBinder());

    /**
     * Create a <code>intest.member_act_staging_status</code> table reference
     */
    public MemberActStagingStatus() {
        this(DSL.name("member_act_staging_status"), null);
    }

    /**
     * Create an aliased <code>intest.member_act_staging_status</code> table reference
     */
    public MemberActStagingStatus(String alias) {
        this(DSL.name(alias), MEMBER_ACT_STAGING_STATUS);
    }

    /**
     * Create an aliased <code>intest.member_act_staging_status</code> table reference
     */
    public MemberActStagingStatus(Name alias) {
        this(alias, MEMBER_ACT_STAGING_STATUS);
    }

    private MemberActStagingStatus(Name alias, Table<MemberActStagingStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberActStagingStatus(Name alias, Table<MemberActStagingStatusRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.MEMBER_ACT_STAGING_STATUS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MemberActStagingStatusRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEMBER_ACT_STAGING_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberActStagingStatusRecord> getPrimaryKey() {
        return Keys.MEMBER_ACT_STAGING_STATUS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberActStagingStatusRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberActStagingStatusRecord>>asList(Keys.MEMBER_ACT_STAGING_STATUS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MemberActStagingStatusRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MemberActStagingStatusRecord, ?>>asList(Keys.MEMBER_ACT_STAGING_STATUS__MEMBER_ACT_STAGING_STATUS_MEMBER_ACT_STAGING_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberActStagingStatus as(String alias) {
        return new MemberActStagingStatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberActStagingStatus as(Name alias) {
        return new MemberActStagingStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberActStagingStatus rename(String name) {
        return new MemberActStagingStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberActStagingStatus rename(Name name) {
        return new MemberActStagingStatus(name, null);
    }
}
