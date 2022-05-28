/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.enums.PaymentReqType;
import com.unchartedpartners.databases.tables.PaymentTransaction;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PaymentTransactionRecord extends UpdatableRecordImpl<PaymentTransactionRecord> {

    private static final long serialVersionUID = 850601663;

    /**
     * Setter for <code>intest.payment_transaction.tx_id</code>.
     */
    public void setTxId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.tx_id</code>.
     */
    public String getTxId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>intest.payment_transaction.quote_id</code>.
     */
    public void setQuoteId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.quote_id</code>.
     */
    public Long getQuoteId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>intest.payment_transaction.merchant_id</code>.
     */
    public void setMerchantId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.merchant_id</code>.
     */
    public String getMerchantId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.payment_transaction.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>intest.payment_transaction.currency</code>.
     */
    public void setCurrency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.currency</code>.
     */
    public String getCurrency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>intest.payment_transaction.is_on_us</code>.
     */
    public void setIsOnUs(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.is_on_us</code>.
     */
    public Boolean getIsOnUs() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>intest.payment_transaction.ext_system_id</code>.
     */
    public void setExtSystemId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.ext_system_id</code>.
     */
    public String getExtSystemId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.payment_transaction.ext_trans_type</code>.
     */
    public void setExtTransType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.ext_trans_type</code>.
     */
    public String getExtTransType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>intest.payment_transaction.ext_trans_id</code>.
     */
    public void setExtTransId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.ext_trans_id</code>.
     */
    public String getExtTransId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>intest.payment_transaction.ext_bill_ref_no</code>.
     */
    public void setExtBillRefNo(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.ext_bill_ref_no</code>.
     */
    public String getExtBillRefNo() {
        return (String) get(9);
    }

    /**
     * Setter for <code>intest.payment_transaction.ext_auth_ref_no</code>.
     */
    public void setExtAuthRefNo(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.ext_auth_ref_no</code>.
     */
    public String getExtAuthRefNo() {
        return (String) get(10);
    }

    /**
     * Setter for <code>intest.payment_transaction.ext_response_code</code>.
     */
    public void setExtResponseCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.ext_response_code</code>.
     */
    public String getExtResponseCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>intest.payment_transaction.ext_response_message</code>.
     */
    public void setExtResponseMessage(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.ext_response_message</code>.
     */
    public String getExtResponseMessage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>intest.payment_transaction.ext_response_payload</code>.
     */
    public void setExtResponsePayload(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.ext_response_payload</code>.
     */
    public String getExtResponsePayload() {
        return (String) get(13);
    }

    /**
     * Setter for <code>intest.payment_transaction.ext_request_payload</code>.
     */
    public void setExtRequestPayload(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.ext_request_payload</code>.
     */
    public String getExtRequestPayload() {
        return (String) get(14);
    }

    /**
     * Setter for <code>intest.payment_transaction.token</code>.
     */
    public void setToken(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.token</code>.
     */
    public String getToken() {
        return (String) get(15);
    }

    /**
     * Setter for <code>intest.payment_transaction.req_type</code>.
     */
    public void setReqType(PaymentReqType value) {
        set(16, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.req_type</code>.
     */
    public PaymentReqType getReqType() {
        return (PaymentReqType) get(16);
    }

    /**
     * Setter for <code>intest.payment_transaction.custom_1</code>.
     */
    public void setCustom_1(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.custom_1</code>.
     */
    public String getCustom_1() {
        return (String) get(17);
    }

    /**
     * Setter for <code>intest.payment_transaction.custom_2</code>.
     */
    public void setCustom_2(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.custom_2</code>.
     */
    public String getCustom_2() {
        return (String) get(18);
    }

    /**
     * Setter for <code>intest.payment_transaction.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>intest.payment_transaction.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>intest.payment_transaction.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>intest.payment_transaction.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>intest.payment_transaction.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(22);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentTransactionRecord
     */
    public PaymentTransactionRecord() {
        super(PaymentTransaction.PAYMENT_TRANSACTION);
    }

    /**
     * Create a detached, initialised PaymentTransactionRecord
     */
    public PaymentTransactionRecord(String txId, Long quoteId, String merchantId, BigDecimal amount, String currency, Boolean isOnUs, String extSystemId, String extTransType, String extTransId, String extBillRefNo, String extAuthRefNo, String extResponseCode, String extResponseMessage, String extResponsePayload, String extRequestPayload, String token, PaymentReqType reqType, String custom_1, String custom_2, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated) {
        super(PaymentTransaction.PAYMENT_TRANSACTION);

        set(0, txId);
        set(1, quoteId);
        set(2, merchantId);
        set(3, amount);
        set(4, currency);
        set(5, isOnUs);
        set(6, extSystemId);
        set(7, extTransType);
        set(8, extTransId);
        set(9, extBillRefNo);
        set(10, extAuthRefNo);
        set(11, extResponseCode);
        set(12, extResponseMessage);
        set(13, extResponsePayload);
        set(14, extRequestPayload);
        set(15, token);
        set(16, reqType);
        set(17, custom_1);
        set(18, custom_2);
        set(19, createdBy);
        set(20, created);
        set(21, updatedBy);
        set(22, updated);
    }
}
