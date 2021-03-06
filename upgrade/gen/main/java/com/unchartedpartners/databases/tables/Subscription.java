/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.enums.SubscriptionStatus;
import com.unchartedpartners.databases.tables.records.SubscriptionRecord;
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
public class Subscription extends TableImpl<SubscriptionRecord> {

    private static final long serialVersionUID = -1339974801;

    /**
     * The reference instance of <code>intest.subscription</code>
     */
    public static final Subscription SUBSCRIPTION = new Subscription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubscriptionRecord> getRecordType() {
        return SubscriptionRecord.class;
    }

    /**
     * The column <code>intest.subscription.id</code>.
     */
    public final TableField<SubscriptionRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.subscription_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.subscription.quotation_no</code>.
     */
    public final TableField<SubscriptionRecord, String> QUOTATION_NO = createField("quotation_no", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.subscription.contract_code</code>.
     */
    public final TableField<SubscriptionRecord, String> CONTRACT_CODE = createField("contract_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.subscription.contract_ref_no</code>.
     */
    public final TableField<SubscriptionRecord, String> CONTRACT_REF_NO = createField("contract_ref_no", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>intest.subscription.certificate_no</code>.
     */
    public final TableField<SubscriptionRecord, String> CERTIFICATE_NO = createField("certificate_no", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>intest.subscription.customer_no</code>.
     */
    public final TableField<SubscriptionRecord, String> CUSTOMER_NO = createField("customer_no", org.jooq.impl.SQLDataType.VARCHAR(24).nullable(false), this, "");

    /**
     * The column <code>intest.subscription.status</code>.
     */
    public final TableField<SubscriptionRecord, SubscriptionStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.SubscriptionStatus.class), this, "");

    /**
     * The column <code>intest.subscription.issued_date</code>.
     */
    public final TableField<SubscriptionRecord, Timestamp> ISSUED_DATE = createField("issued_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.subscription.cancellation_date</code>.
     */
    public final TableField<SubscriptionRecord, Timestamp> CANCELLATION_DATE = createField("cancellation_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.subscription.deleted</code>.
     */
    public final TableField<SubscriptionRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.subscription.created_by</code>.
     */
    public final TableField<SubscriptionRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.subscription.created</code>.
     */
    public final TableField<SubscriptionRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.subscription.updated_by</code>.
     */
    public final TableField<SubscriptionRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.subscription.updated</code>.
     */
    public final TableField<SubscriptionRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.subscription.subscription_data</code>.
     */
    public final TableField<SubscriptionRecord, Map> SUBSCRIPTION_DATA = createField("subscription_data", org.jooq.impl.SQLDataType.OTHER, this, "", new PostgresJsonMapBinder());

    /**
     * The column <code>intest.subscription.member_no</code>.
     */
    public final TableField<SubscriptionRecord, String> MEMBER_NO = createField("member_no", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * Create a <code>intest.subscription</code> table reference
     */
    public Subscription() {
        this(DSL.name("subscription"), null);
    }

    /**
     * Create an aliased <code>intest.subscription</code> table reference
     */
    public Subscription(String alias) {
        this(DSL.name(alias), SUBSCRIPTION);
    }

    /**
     * Create an aliased <code>intest.subscription</code> table reference
     */
    public Subscription(Name alias) {
        this(alias, SUBSCRIPTION);
    }

    private Subscription(Name alias, Table<SubscriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Subscription(Name alias, Table<SubscriptionRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SUBSCRIPTION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SubscriptionRecord, Long> getIdentity() {
        return Keys.IDENTITY_SUBSCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SubscriptionRecord> getPrimaryKey() {
        return Keys.SUBSCRIPTION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SubscriptionRecord>> getKeys() {
        return Arrays.<UniqueKey<SubscriptionRecord>>asList(Keys.SUBSCRIPTION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Subscription as(String alias) {
        return new Subscription(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Subscription as(Name alias) {
        return new Subscription(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Subscription rename(String name) {
        return new Subscription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Subscription rename(Name name) {
        return new Subscription(name, null);
    }
}
