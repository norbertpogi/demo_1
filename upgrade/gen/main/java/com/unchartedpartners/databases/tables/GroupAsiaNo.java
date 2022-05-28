/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.enums.GaNoSubType;
import com.unchartedpartners.databases.enums.GaNoType;
import com.unchartedpartners.databases.tables.records.GroupAsiaNoRecord;

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
public class GroupAsiaNo extends TableImpl<GroupAsiaNoRecord> {

    private static final long serialVersionUID = -2055561002;

    /**
     * The reference instance of <code>intest.group_asia_no</code>
     */
    public static final GroupAsiaNo GROUP_ASIA_NO = new GroupAsiaNo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupAsiaNoRecord> getRecordType() {
        return GroupAsiaNoRecord.class;
    }

    /**
     * The column <code>intest.group_asia_no.id</code>.
     */
    public final TableField<GroupAsiaNoRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.group_asia_no_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.group_asia_no.ga_no_type</code>.
     */
    public final TableField<GroupAsiaNoRecord, GaNoType> GA_NO_TYPE = createField("ga_no_type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.GaNoType.class), this, "");

    /**
     * The column <code>intest.group_asia_no.ga_no_sub_type</code>.
     */
    public final TableField<GroupAsiaNoRecord, GaNoSubType> GA_NO_SUB_TYPE = createField("ga_no_sub_type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.GaNoSubType.class), this, "");

    /**
     * The column <code>intest.group_asia_no.ga_no</code>.
     */
    public final TableField<GroupAsiaNoRecord, String> GA_NO = createField("ga_no", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.group_asia_no.platform_id</code>.
     */
    public final TableField<GroupAsiaNoRecord, Long> PLATFORM_ID = createField("platform_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>intest.group_asia_no.deleted</code>.
     */
    public final TableField<GroupAsiaNoRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.group_asia_no.created_by</code>.
     */
    public final TableField<GroupAsiaNoRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.group_asia_no.created</code>.
     */
    public final TableField<GroupAsiaNoRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.group_asia_no.updated_by</code>.
     */
    public final TableField<GroupAsiaNoRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.group_asia_no.updated</code>.
     */
    public final TableField<GroupAsiaNoRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.group_asia_no.tx_id</code>.
     */
    public final TableField<GroupAsiaNoRecord, String> TX_ID = createField("tx_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.group_asia_no.audit_id</code>.
     */
    public final TableField<GroupAsiaNoRecord, Long> AUDIT_ID = createField("audit_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>intest.group_asia_no</code> table reference
     */
    public GroupAsiaNo() {
        this(DSL.name("group_asia_no"), null);
    }

    /**
     * Create an aliased <code>intest.group_asia_no</code> table reference
     */
    public GroupAsiaNo(String alias) {
        this(DSL.name(alias), GROUP_ASIA_NO);
    }

    /**
     * Create an aliased <code>intest.group_asia_no</code> table reference
     */
    public GroupAsiaNo(Name alias) {
        this(alias, GROUP_ASIA_NO);
    }

    private GroupAsiaNo(Name alias, Table<GroupAsiaNoRecord> aliased) {
        this(alias, aliased, null);
    }

    private GroupAsiaNo(Name alias, Table<GroupAsiaNoRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.GROUP_ASIA_NO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GroupAsiaNoRecord, Long> getIdentity() {
        return Keys.IDENTITY_GROUP_ASIA_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GroupAsiaNoRecord> getPrimaryKey() {
        return Keys.GROUP_ASIA_NO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GroupAsiaNoRecord>> getKeys() {
        return Arrays.<UniqueKey<GroupAsiaNoRecord>>asList(Keys.GROUP_ASIA_NO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNo as(String alias) {
        return new GroupAsiaNo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAsiaNo as(Name alias) {
        return new GroupAsiaNo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupAsiaNo rename(String name) {
        return new GroupAsiaNo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupAsiaNo rename(Name name) {
        return new GroupAsiaNo(name, null);
    }
}