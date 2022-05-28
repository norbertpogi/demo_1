/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.MemberActConfigRecord;
import com.unchartedpartners.jooq.PostgresJsonMapBinder;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
public class MemberActConfig extends TableImpl<MemberActConfigRecord> {

    private static final long serialVersionUID = 1928112130;

    /**
     * The reference instance of <code>intest.member_act_config</code>
     */
    public static final MemberActConfig MEMBER_ACT_CONFIG = new MemberActConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberActConfigRecord> getRecordType() {
        return MemberActConfigRecord.class;
    }

    /**
     * The column <code>intest.member_act_config.id</code>.
     */
    public final TableField<MemberActConfigRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.member_act_config_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.member_act_config.deleted</code>.
     */
    public final TableField<MemberActConfigRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_config.created_by</code>.
     */
    public final TableField<MemberActConfigRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_config.created</code>.
     */
    public final TableField<MemberActConfigRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_config.updated_by</code>.
     */
    public final TableField<MemberActConfigRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_config.updated</code>.
     */
    public final TableField<MemberActConfigRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.member_act_config.chdrnum</code>.
     */
    public final TableField<MemberActConfigRecord, String> CHDRNUM = createField("chdrnum", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.member_act_config.system_config</code>.
     */
    public final TableField<MemberActConfigRecord, Map> SYSTEM_CONFIG = createField("system_config", org.jooq.impl.SQLDataType.OTHER, this, "", new PostgresJsonMapBinder());

    /**
     * Create a <code>intest.member_act_config</code> table reference
     */
    public MemberActConfig() {
        this(DSL.name("member_act_config"), null);
    }

    /**
     * Create an aliased <code>intest.member_act_config</code> table reference
     */
    public MemberActConfig(String alias) {
        this(DSL.name(alias), MEMBER_ACT_CONFIG);
    }

    /**
     * Create an aliased <code>intest.member_act_config</code> table reference
     */
    public MemberActConfig(Name alias) {
        this(alias, MEMBER_ACT_CONFIG);
    }

    private MemberActConfig(Name alias, Table<MemberActConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberActConfig(Name alias, Table<MemberActConfigRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.MEMBER_ACT_CONFIG_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MemberActConfigRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEMBER_ACT_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberActConfigRecord> getPrimaryKey() {
        return Keys.MEMBER_ACT_CONFIG_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberActConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberActConfigRecord>>asList(Keys.MEMBER_ACT_CONFIG_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberActConfig as(String alias) {
        return new MemberActConfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberActConfig as(Name alias) {
        return new MemberActConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberActConfig rename(String name) {
        return new MemberActConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberActConfig rename(Name name) {
        return new MemberActConfig(name, null);
    }
}