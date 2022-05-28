/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.ContractHeaderRecord;
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
public class ContractHeader extends TableImpl<ContractHeaderRecord> {

    private static final long serialVersionUID = -1703170843;

    /**
     * The reference instance of <code>intest.contract_header</code>
     */
    public static final ContractHeader CONTRACT_HEADER = new ContractHeader();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractHeaderRecord> getRecordType() {
        return ContractHeaderRecord.class;
    }

    /**
     * The column <code>intest.contract_header.id</code>.
     */
    public final TableField<ContractHeaderRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.contract_header_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.contract_header.contract_code</code>.
     */
    public final TableField<ContractHeaderRecord, String> CONTRACT_CODE = createField("contract_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.contract_header.contract_name</code>.
     */
    public final TableField<ContractHeaderRecord, String> CONTRACT_NAME = createField("contract_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.contract_header.contract_version</code>.
     */
    public final TableField<ContractHeaderRecord, Long> CONTRACT_VERSION = createField("contract_version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.contract_header.contract_ref_no</code>.
     */
    public final TableField<ContractHeaderRecord, String> CONTRACT_REF_NO = createField("contract_ref_no", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>intest.contract_header.client_code</code>.
     */
    public final TableField<ContractHeaderRecord, String> CLIENT_CODE = createField("client_code", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>intest.contract_header.contract_start_date</code>.
     */
    public final TableField<ContractHeaderRecord, Timestamp> CONTRACT_START_DATE = createField("contract_start_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.contract_header.contract_end_date</code>.
     */
    public final TableField<ContractHeaderRecord, Timestamp> CONTRACT_END_DATE = createField("contract_end_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.contract_header.system_config</code>.
     */
    public final TableField<ContractHeaderRecord, Map> SYSTEM_CONFIG = createField("system_config", org.jooq.impl.SQLDataType.OTHER, this, "", new PostgresJsonMapBinder());

    /**
     * The column <code>intest.contract_header.report_config</code>.
     */
    public final TableField<ContractHeaderRecord, Map> REPORT_CONFIG = createField("report_config", org.jooq.impl.SQLDataType.OTHER, this, "", new PostgresJsonMapBinder());

    /**
     * The column <code>intest.contract_header.deleted</code>.
     */
    public final TableField<ContractHeaderRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.contract_header.created_by</code>.
     */
    public final TableField<ContractHeaderRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.contract_header.created</code>.
     */
    public final TableField<ContractHeaderRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.contract_header.updated_by</code>.
     */
    public final TableField<ContractHeaderRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.contract_header.updated</code>.
     */
    public final TableField<ContractHeaderRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.contract_header.subsidiary_no</code>.
     */
    public final TableField<ContractHeaderRecord, String> SUBSIDIARY_NO = createField("subsidiary_no", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * Create a <code>intest.contract_header</code> table reference
     */
    public ContractHeader() {
        this(DSL.name("contract_header"), null);
    }

    /**
     * Create an aliased <code>intest.contract_header</code> table reference
     */
    public ContractHeader(String alias) {
        this(DSL.name(alias), CONTRACT_HEADER);
    }

    /**
     * Create an aliased <code>intest.contract_header</code> table reference
     */
    public ContractHeader(Name alias) {
        this(alias, CONTRACT_HEADER);
    }

    private ContractHeader(Name alias, Table<ContractHeaderRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractHeader(Name alias, Table<ContractHeaderRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CONTRACT_HEADER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ContractHeaderRecord, Long> getIdentity() {
        return Keys.IDENTITY_CONTRACT_HEADER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractHeaderRecord> getPrimaryKey() {
        return Keys.CONTRACT_HEADER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractHeaderRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractHeaderRecord>>asList(Keys.CONTRACT_HEADER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractHeader as(String alias) {
        return new ContractHeader(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractHeader as(Name alias) {
        return new ContractHeader(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractHeader rename(String name) {
        return new ContractHeader(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractHeader rename(Name name) {
        return new ContractHeader(name, null);
    }
}