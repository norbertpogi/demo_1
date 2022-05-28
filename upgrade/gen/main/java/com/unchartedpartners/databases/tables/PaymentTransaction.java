/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.enums.PaymentReqType;
import com.unchartedpartners.databases.tables.records.PaymentTransactionRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class PaymentTransaction extends TableImpl<PaymentTransactionRecord> {

    private static final long serialVersionUID = 912622331;

    /**
     * The reference instance of <code>intest.payment_transaction</code>
     */
    public static final PaymentTransaction PAYMENT_TRANSACTION = new PaymentTransaction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentTransactionRecord> getRecordType() {
        return PaymentTransactionRecord.class;
    }

    /**
     * The column <code>intest.payment_transaction.tx_id</code>.
     */
    public final TableField<PaymentTransactionRecord, String> TX_ID = createField("tx_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.payment_transaction.quote_id</code>.
     */
    public final TableField<PaymentTransactionRecord, Long> QUOTE_ID = createField("quote_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.payment_transaction.merchant_id</code>.
     */
    public final TableField<PaymentTransactionRecord, String> MERCHANT_ID = createField("merchant_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>intest.payment_transaction.amount</code>.
     */
    public final TableField<PaymentTransactionRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>intest.payment_transaction.currency</code>.
     */
    public final TableField<PaymentTransactionRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>intest.payment_transaction.is_on_us</code>.
     */
    public final TableField<PaymentTransactionRecord, Boolean> IS_ON_US = createField("is_on_us", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>intest.payment_transaction.ext_system_id</code>.
     */
    public final TableField<PaymentTransactionRecord, String> EXT_SYSTEM_ID = createField("ext_system_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.payment_transaction.ext_trans_type</code>.
     */
    public final TableField<PaymentTransactionRecord, String> EXT_TRANS_TYPE = createField("ext_trans_type", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.payment_transaction.ext_trans_id</code>.
     */
    public final TableField<PaymentTransactionRecord, String> EXT_TRANS_ID = createField("ext_trans_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>intest.payment_transaction.ext_bill_ref_no</code>.
     */
    public final TableField<PaymentTransactionRecord, String> EXT_BILL_REF_NO = createField("ext_bill_ref_no", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>intest.payment_transaction.ext_auth_ref_no</code>.
     */
    public final TableField<PaymentTransactionRecord, String> EXT_AUTH_REF_NO = createField("ext_auth_ref_no", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>intest.payment_transaction.ext_response_code</code>.
     */
    public final TableField<PaymentTransactionRecord, String> EXT_RESPONSE_CODE = createField("ext_response_code", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>intest.payment_transaction.ext_response_message</code>.
     */
    public final TableField<PaymentTransactionRecord, String> EXT_RESPONSE_MESSAGE = createField("ext_response_message", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>intest.payment_transaction.ext_response_payload</code>.
     */
    public final TableField<PaymentTransactionRecord, String> EXT_RESPONSE_PAYLOAD = createField("ext_response_payload", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>intest.payment_transaction.ext_request_payload</code>.
     */
    public final TableField<PaymentTransactionRecord, String> EXT_REQUEST_PAYLOAD = createField("ext_request_payload", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>intest.payment_transaction.token</code>.
     */
    public final TableField<PaymentTransactionRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>intest.payment_transaction.req_type</code>.
     */
    public final TableField<PaymentTransactionRecord, PaymentReqType> REQ_TYPE = createField("req_type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.PaymentReqType.class), this, "");

    /**
     * The column <code>intest.payment_transaction.custom_1</code>.
     */
    public final TableField<PaymentTransactionRecord, String> CUSTOM_1 = createField("custom_1", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>intest.payment_transaction.custom_2</code>.
     */
    public final TableField<PaymentTransactionRecord, String> CUSTOM_2 = createField("custom_2", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>intest.payment_transaction.created_by</code>.
     */
    public final TableField<PaymentTransactionRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.payment_transaction.created</code>.
     */
    public final TableField<PaymentTransactionRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.payment_transaction.updated_by</code>.
     */
    public final TableField<PaymentTransactionRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.payment_transaction.updated</code>.
     */
    public final TableField<PaymentTransactionRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>intest.payment_transaction</code> table reference
     */
    public PaymentTransaction() {
        this(DSL.name("payment_transaction"), null);
    }

    /**
     * Create an aliased <code>intest.payment_transaction</code> table reference
     */
    public PaymentTransaction(String alias) {
        this(DSL.name(alias), PAYMENT_TRANSACTION);
    }

    /**
     * Create an aliased <code>intest.payment_transaction</code> table reference
     */
    public PaymentTransaction(Name alias) {
        this(alias, PAYMENT_TRANSACTION);
    }

    private PaymentTransaction(Name alias, Table<PaymentTransactionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PaymentTransaction(Name alias, Table<PaymentTransactionRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PAYMENT_TRANSACTION_EXT_TRANS_ID_IDX, Indexes.PAYMENT_TRANSACTION_PKEY, Indexes.PAYMENT_TRANSACTION_QUOTE_ID_EXT_TRANS_ID_TYPE_IDX, Indexes.PAYMENT_TRANSACTION_QUOTE_ID_IDX, Indexes.PAYMENT_TRANSACTION_TOKEN_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PaymentTransactionRecord> getPrimaryKey() {
        return Keys.PAYMENT_TRANSACTION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PaymentTransactionRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentTransactionRecord>>asList(Keys.PAYMENT_TRANSACTION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentTransaction as(String alias) {
        return new PaymentTransaction(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentTransaction as(Name alias) {
        return new PaymentTransaction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentTransaction rename(String name) {
        return new PaymentTransaction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentTransaction rename(Name name) {
        return new PaymentTransaction(name, null);
    }
}