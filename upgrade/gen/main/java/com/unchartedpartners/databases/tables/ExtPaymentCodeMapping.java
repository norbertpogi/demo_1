/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.ExtPaymentCodeMappingRecord;

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
public class ExtPaymentCodeMapping extends TableImpl<ExtPaymentCodeMappingRecord> {

    private static final long serialVersionUID = 1555181686;

    /**
     * The reference instance of <code>intest.ext_payment_code_mapping</code>
     */
    public static final ExtPaymentCodeMapping EXT_PAYMENT_CODE_MAPPING = new ExtPaymentCodeMapping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExtPaymentCodeMappingRecord> getRecordType() {
        return ExtPaymentCodeMappingRecord.class;
    }

    /**
     * The column <code>intest.ext_payment_code_mapping.id</code>.
     */
    public final TableField<ExtPaymentCodeMappingRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.ext_payment_code_mapping_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.ext_payment_code_mapping.ext_system_id</code>.
     */
    public final TableField<ExtPaymentCodeMappingRecord, String> EXT_SYSTEM_ID = createField("ext_system_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.ext_payment_code_mapping.ext_response_code</code>.
     */
    public final TableField<ExtPaymentCodeMappingRecord, String> EXT_RESPONSE_CODE = createField("ext_response_code", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>intest.ext_payment_code_mapping.ext_response_message</code>.
     */
    public final TableField<ExtPaymentCodeMappingRecord, String> EXT_RESPONSE_MESSAGE = createField("ext_response_message", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>intest.ext_payment_code_mapping.message</code>.
     */
    public final TableField<ExtPaymentCodeMappingRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>intest.ext_payment_code_mapping.created_by</code>.
     */
    public final TableField<ExtPaymentCodeMappingRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.ext_payment_code_mapping.created</code>.
     */
    public final TableField<ExtPaymentCodeMappingRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.ext_payment_code_mapping.updated_by</code>.
     */
    public final TableField<ExtPaymentCodeMappingRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.ext_payment_code_mapping.updated</code>.
     */
    public final TableField<ExtPaymentCodeMappingRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>intest.ext_payment_code_mapping</code> table reference
     */
    public ExtPaymentCodeMapping() {
        this(DSL.name("ext_payment_code_mapping"), null);
    }

    /**
     * Create an aliased <code>intest.ext_payment_code_mapping</code> table reference
     */
    public ExtPaymentCodeMapping(String alias) {
        this(DSL.name(alias), EXT_PAYMENT_CODE_MAPPING);
    }

    /**
     * Create an aliased <code>intest.ext_payment_code_mapping</code> table reference
     */
    public ExtPaymentCodeMapping(Name alias) {
        this(alias, EXT_PAYMENT_CODE_MAPPING);
    }

    private ExtPaymentCodeMapping(Name alias, Table<ExtPaymentCodeMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExtPaymentCodeMapping(Name alias, Table<ExtPaymentCodeMappingRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.EXT_PAYMENT_CODE_MAPPING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ExtPaymentCodeMappingRecord, Long> getIdentity() {
        return Keys.IDENTITY_EXT_PAYMENT_CODE_MAPPING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExtPaymentCodeMappingRecord> getPrimaryKey() {
        return Keys.EXT_PAYMENT_CODE_MAPPING_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExtPaymentCodeMappingRecord>> getKeys() {
        return Arrays.<UniqueKey<ExtPaymentCodeMappingRecord>>asList(Keys.EXT_PAYMENT_CODE_MAPPING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtPaymentCodeMapping as(String alias) {
        return new ExtPaymentCodeMapping(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtPaymentCodeMapping as(Name alias) {
        return new ExtPaymentCodeMapping(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExtPaymentCodeMapping rename(String name) {
        return new ExtPaymentCodeMapping(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExtPaymentCodeMapping rename(Name name) {
        return new ExtPaymentCodeMapping(name, null);
    }
}