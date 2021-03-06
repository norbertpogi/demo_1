/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.enums.PolicyStatus;
import com.unchartedpartners.databases.tables.records.PolicyRecord;
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
public class Policy extends TableImpl<PolicyRecord> {

    private static final long serialVersionUID = 1658571814;

    /**
     * The reference instance of <code>intest.policy</code>
     */
    public static final Policy POLICY = new Policy();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PolicyRecord> getRecordType() {
        return PolicyRecord.class;
    }

    /**
     * The column <code>intest.policy.id</code>.
     */
    public final TableField<PolicyRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.account_product_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.policy.quote_id</code>.
     */
    public final TableField<PolicyRecord, Long> QUOTE_ID = createField("quote_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.policy.product_id</code>.
     */
    public final TableField<PolicyRecord, Long> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.policy.product_code</code>.
     */
    public final TableField<PolicyRecord, String> PRODUCT_CODE = createField("product_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.policy.product_version</code>.
     */
    public final TableField<PolicyRecord, Long> PRODUCT_VERSION = createField("product_version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.policy.policy_no</code>.
     */
    public final TableField<PolicyRecord, String> POLICY_NO = createField("policy_no", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.policy.activation_date</code>.
     */
    public final TableField<PolicyRecord, Timestamp> ACTIVATION_DATE = createField("activation_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.policy.end_date</code>.
     */
    public final TableField<PolicyRecord, Timestamp> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.policy.account_id</code>.
     */
    public final TableField<PolicyRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.policy.data</code>.
     */
    public final TableField<PolicyRecord, Map> DATA = createField("data", org.jooq.impl.SQLDataType.OTHER.nullable(false), this, "", new PostgresJsonMapBinder());

    /**
     * The column <code>intest.policy.policy_status</code>.
     */
    public final TableField<PolicyRecord, PolicyStatus> POLICY_STATUS = createField("policy_status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.PolicyStatus.class), this, "");

    /**
     * The column <code>intest.policy.deleted</code>.
     */
    public final TableField<PolicyRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.policy.created_by</code>.
     */
    public final TableField<PolicyRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.policy.created</code>.
     */
    public final TableField<PolicyRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.policy.updated_by</code>.
     */
    public final TableField<PolicyRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.policy.updated</code>.
     */
    public final TableField<PolicyRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.policy.tx_id</code>.
     */
    public final TableField<PolicyRecord, String> TX_ID = createField("tx_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.policy.audit_id</code>.
     */
    public final TableField<PolicyRecord, Long> AUDIT_ID = createField("audit_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.policy.waiting_period</code>.
     */
    public final TableField<PolicyRecord, Integer> WAITING_PERIOD = createField("waiting_period", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>intest.policy.activation_email_sent</code>.
     */
    public final TableField<PolicyRecord, Boolean> ACTIVATION_EMAIL_SENT = createField("activation_email_sent", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>intest.policy.hr_claim_opt_in</code>.
     */
    public final TableField<PolicyRecord, Boolean> HR_CLAIM_OPT_IN = createField("hr_claim_opt_in", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>intest.policy</code> table reference
     */
    public Policy() {
        this(DSL.name("policy"), null);
    }

    /**
     * Create an aliased <code>intest.policy</code> table reference
     */
    public Policy(String alias) {
        this(DSL.name(alias), POLICY);
    }

    /**
     * Create an aliased <code>intest.policy</code> table reference
     */
    public Policy(Name alias) {
        this(alias, POLICY);
    }

    private Policy(Name alias, Table<PolicyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Policy(Name alias, Table<PolicyRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.POLICY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PolicyRecord, Long> getIdentity() {
        return Keys.IDENTITY_POLICY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PolicyRecord> getPrimaryKey() {
        return Keys.POLICY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PolicyRecord>> getKeys() {
        return Arrays.<UniqueKey<PolicyRecord>>asList(Keys.POLICY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PolicyRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PolicyRecord, ?>>asList(Keys.POLICY__POLICY_QUOTE_ID_FKEY, Keys.POLICY__POLICY_PRODUCT_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Policy as(String alias) {
        return new Policy(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Policy as(Name alias) {
        return new Policy(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Policy rename(String name) {
        return new Policy(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Policy rename(Name name) {
        return new Policy(name, null);
    }
}
