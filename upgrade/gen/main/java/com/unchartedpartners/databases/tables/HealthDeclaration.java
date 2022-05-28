/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.enums.MemberType;
import com.unchartedpartners.databases.tables.records.HealthDeclarationRecord;
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
public class HealthDeclaration extends TableImpl<HealthDeclarationRecord> {

    private static final long serialVersionUID = 1791892128;

    /**
     * The reference instance of <code>intest.health_declaration</code>
     */
    public static final HealthDeclaration HEALTH_DECLARATION = new HealthDeclaration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HealthDeclarationRecord> getRecordType() {
        return HealthDeclarationRecord.class;
    }

    /**
     * The column <code>intest.health_declaration.id</code>.
     */
    public final TableField<HealthDeclarationRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.health_declaration_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.health_declaration.quotation_no</code>.
     */
    public final TableField<HealthDeclarationRecord, String> QUOTATION_NO = createField("quotation_no", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>intest.health_declaration.customer_no</code>.
     */
    public final TableField<HealthDeclarationRecord, String> CUSTOMER_NO = createField("customer_no", org.jooq.impl.SQLDataType.VARCHAR(24).nullable(false), this, "");

    /**
     * The column <code>intest.health_declaration.member_type</code>.
     */
    public final TableField<HealthDeclarationRecord, MemberType> MEMBER_TYPE = createField("member_type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.MemberType.class), this, "");

    /**
     * The column <code>intest.health_declaration.data</code>.
     */
    public final TableField<HealthDeclarationRecord, Map> DATA = createField("data", org.jooq.impl.SQLDataType.OTHER, this, "", new PostgresJsonMapBinder());

    /**
     * The column <code>intest.health_declaration.consent</code>.
     */
    public final TableField<HealthDeclarationRecord, Boolean> CONSENT = createField("consent", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>intest.health_declaration.submitted_date</code>.
     */
    public final TableField<HealthDeclarationRecord, Timestamp> SUBMITTED_DATE = createField("submitted_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.health_declaration.deleted</code>.
     */
    public final TableField<HealthDeclarationRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.health_declaration.created_by</code>.
     */
    public final TableField<HealthDeclarationRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.health_declaration.created</code>.
     */
    public final TableField<HealthDeclarationRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.health_declaration.updated_by</code>.
     */
    public final TableField<HealthDeclarationRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.health_declaration.updated</code>.
     */
    public final TableField<HealthDeclarationRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>intest.health_declaration</code> table reference
     */
    public HealthDeclaration() {
        this(DSL.name("health_declaration"), null);
    }

    /**
     * Create an aliased <code>intest.health_declaration</code> table reference
     */
    public HealthDeclaration(String alias) {
        this(DSL.name(alias), HEALTH_DECLARATION);
    }

    /**
     * Create an aliased <code>intest.health_declaration</code> table reference
     */
    public HealthDeclaration(Name alias) {
        this(alias, HEALTH_DECLARATION);
    }

    private HealthDeclaration(Name alias, Table<HealthDeclarationRecord> aliased) {
        this(alias, aliased, null);
    }

    private HealthDeclaration(Name alias, Table<HealthDeclarationRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.HEALTH_DECLARATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HealthDeclarationRecord, Long> getIdentity() {
        return Keys.IDENTITY_HEALTH_DECLARATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HealthDeclarationRecord> getPrimaryKey() {
        return Keys.HEALTH_DECLARATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HealthDeclarationRecord>> getKeys() {
        return Arrays.<UniqueKey<HealthDeclarationRecord>>asList(Keys.HEALTH_DECLARATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclaration as(String alias) {
        return new HealthDeclaration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthDeclaration as(Name alias) {
        return new HealthDeclaration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HealthDeclaration rename(String name) {
        return new HealthDeclaration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HealthDeclaration rename(Name name) {
        return new HealthDeclaration(name, null);
    }
}