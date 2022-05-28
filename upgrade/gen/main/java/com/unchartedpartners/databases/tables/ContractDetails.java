/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.ContractDetailsRecord;
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
public class ContractDetails extends TableImpl<ContractDetailsRecord> {

    private static final long serialVersionUID = -1656482274;

    /**
     * The reference instance of <code>intest.contract_details</code>
     */
    public static final ContractDetails CONTRACT_DETAILS = new ContractDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractDetailsRecord> getRecordType() {
        return ContractDetailsRecord.class;
    }

    /**
     * The column <code>intest.contract_details.id</code>.
     */
    public final TableField<ContractDetailsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.contract_details_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.contract_details.contract_code</code>.
     */
    public final TableField<ContractDetailsRecord, String> CONTRACT_CODE = createField("contract_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.contract_details.contract_version</code>.
     */
    public final TableField<ContractDetailsRecord, Long> CONTRACT_VERSION = createField("contract_version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.contract_details.product_id</code>.
     */
    public final TableField<ContractDetailsRecord, Long> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.contract_details.product_code</code>.
     */
    public final TableField<ContractDetailsRecord, String> PRODUCT_CODE = createField("product_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.contract_details.product_version</code>.
     */
    public final TableField<ContractDetailsRecord, Long> PRODUCT_VERSION = createField("product_version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.contract_details.product_config</code>.
     */
    public final TableField<ContractDetailsRecord, Map> PRODUCT_CONFIG = createField("product_config", org.jooq.impl.SQLDataType.OTHER, this, "", new PostgresJsonMapBinder());

    /**
     * The column <code>intest.contract_details.uw_config</code>.
     */
    public final TableField<ContractDetailsRecord, Map> UW_CONFIG = createField("uw_config", org.jooq.impl.SQLDataType.OTHER, this, "", new PostgresJsonMapBinder());

    /**
     * The column <code>intest.contract_details.deleted</code>.
     */
    public final TableField<ContractDetailsRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.contract_details.created_by</code>.
     */
    public final TableField<ContractDetailsRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.contract_details.created</code>.
     */
    public final TableField<ContractDetailsRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.contract_details.updated_by</code>.
     */
    public final TableField<ContractDetailsRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.contract_details.updated</code>.
     */
    public final TableField<ContractDetailsRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>intest.contract_details</code> table reference
     */
    public ContractDetails() {
        this(DSL.name("contract_details"), null);
    }

    /**
     * Create an aliased <code>intest.contract_details</code> table reference
     */
    public ContractDetails(String alias) {
        this(DSL.name(alias), CONTRACT_DETAILS);
    }

    /**
     * Create an aliased <code>intest.contract_details</code> table reference
     */
    public ContractDetails(Name alias) {
        this(alias, CONTRACT_DETAILS);
    }

    private ContractDetails(Name alias, Table<ContractDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractDetails(Name alias, Table<ContractDetailsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CONTRACT_DETAILS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ContractDetailsRecord, Long> getIdentity() {
        return Keys.IDENTITY_CONTRACT_DETAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractDetailsRecord> getPrimaryKey() {
        return Keys.CONTRACT_DETAILS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractDetailsRecord>>asList(Keys.CONTRACT_DETAILS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ContractDetailsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContractDetailsRecord, ?>>asList(Keys.CONTRACT_DETAILS__CONTRACT_DETAILS_PRODUCT_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractDetails as(String alias) {
        return new ContractDetails(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractDetails as(Name alias) {
        return new ContractDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractDetails rename(String name) {
        return new ContractDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractDetails rename(Name name) {
        return new ContractDetails(name, null);
    }
}
