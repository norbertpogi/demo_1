/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.OccupationClassMasterRecord;

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
public class OccupationClassMaster extends TableImpl<OccupationClassMasterRecord> {

    private static final long serialVersionUID = 1959675182;

    /**
     * The reference instance of <code>intest.occupation_class_master</code>
     */
    public static final OccupationClassMaster OCCUPATION_CLASS_MASTER = new OccupationClassMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OccupationClassMasterRecord> getRecordType() {
        return OccupationClassMasterRecord.class;
    }

    /**
     * The column <code>intest.occupation_class_master.id</code>.
     */
    public final TableField<OccupationClassMasterRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.occupation_class_master_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.occupation_class_master.occupation</code>.
     */
    public final TableField<OccupationClassMasterRecord, String> OCCUPATION = createField("occupation", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.occupation_class_master.occupation_class</code>.
     */
    public final TableField<OccupationClassMasterRecord, String> OCCUPATION_CLASS = createField("occupation_class", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.occupation_class_master.deleted</code>.
     */
    public final TableField<OccupationClassMasterRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.occupation_class_master.created_by</code>.
     */
    public final TableField<OccupationClassMasterRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.occupation_class_master.created</code>.
     */
    public final TableField<OccupationClassMasterRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.occupation_class_master.updated_by</code>.
     */
    public final TableField<OccupationClassMasterRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.occupation_class_master.updated</code>.
     */
    public final TableField<OccupationClassMasterRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.occupation_class_master.tx_id</code>.
     */
    public final TableField<OccupationClassMasterRecord, String> TX_ID = createField("tx_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.occupation_class_master.audit_id</code>.
     */
    public final TableField<OccupationClassMasterRecord, Long> AUDIT_ID = createField("audit_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>intest.occupation_class_master</code> table reference
     */
    public OccupationClassMaster() {
        this(DSL.name("occupation_class_master"), null);
    }

    /**
     * Create an aliased <code>intest.occupation_class_master</code> table reference
     */
    public OccupationClassMaster(String alias) {
        this(DSL.name(alias), OCCUPATION_CLASS_MASTER);
    }

    /**
     * Create an aliased <code>intest.occupation_class_master</code> table reference
     */
    public OccupationClassMaster(Name alias) {
        this(alias, OCCUPATION_CLASS_MASTER);
    }

    private OccupationClassMaster(Name alias, Table<OccupationClassMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private OccupationClassMaster(Name alias, Table<OccupationClassMasterRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.OCCUPATION_CLASS_MASTER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OccupationClassMasterRecord, Long> getIdentity() {
        return Keys.IDENTITY_OCCUPATION_CLASS_MASTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OccupationClassMasterRecord> getPrimaryKey() {
        return Keys.OCCUPATION_CLASS_MASTER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OccupationClassMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<OccupationClassMasterRecord>>asList(Keys.OCCUPATION_CLASS_MASTER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OccupationClassMaster as(String alias) {
        return new OccupationClassMaster(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OccupationClassMaster as(Name alias) {
        return new OccupationClassMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OccupationClassMaster rename(String name) {
        return new OccupationClassMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OccupationClassMaster rename(Name name) {
        return new OccupationClassMaster(name, null);
    }
}
