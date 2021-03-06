/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.enums.PaymentStatus;
import com.unchartedpartners.databases.enums.QuoteBusinessType;
import com.unchartedpartners.databases.enums.QuotePaymentMethod;
import com.unchartedpartners.databases.enums.Stages;
import com.unchartedpartners.databases.tables.Quote;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

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
public class QuoteRecord extends UpdatableRecordImpl<QuoteRecord> {

    private static final long serialVersionUID = 1264642207;

    /**
     * Setter for <code>intest.quote.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.quote.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.quote.quotation_no</code>.
     */
    public void setQuotationNo(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.quote.quotation_no</code>.
     */
    public String getQuotationNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.quote.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.quote.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.quote.account_id</code>.
     */
    public void setAccountId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.quote.account_id</code>.
     */
    public Long getAccountId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>intest.quote.product_id</code>.
     */
    public void setProductId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.quote.product_id</code>.
     */
    public Long getProductId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>intest.quote.product_code</code>.
     */
    public void setProductCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.quote.product_code</code>.
     */
    public String getProductCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>intest.quote.product_version</code>.
     */
    public void setProductVersion(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.quote.product_version</code>.
     */
    public Long getProductVersion() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>intest.quote.stages</code>.
     */
    public void setStages(Stages value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.quote.stages</code>.
     */
    public Stages getStages() {
        return (Stages) get(7);
    }

    /**
     * Setter for <code>intest.quote.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.quote.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>intest.quote.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.quote.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>intest.quote.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.quote.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>intest.quote.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.quote.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>intest.quote.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.quote.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>intest.quote.tx_id</code>.
     */
    public void setTxId(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.quote.tx_id</code>.
     */
    public String getTxId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>intest.quote.audit_id</code>.
     */
    public void setAuditId(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>intest.quote.audit_id</code>.
     */
    public Long getAuditId() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>intest.quote.data</code>.
     */
    public void setData(Map value) {
        set(15, value);
    }

    /**
     * Getter for <code>intest.quote.data</code>.
     */
    public Map getData() {
        return (Map) get(15);
    }

    /**
     * Setter for <code>intest.quote.policy_no</code>.
     */
    public void setPolicyNo(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>intest.quote.policy_no</code>.
     */
    public String getPolicyNo() {
        return (String) get(16);
    }

    /**
     * Setter for <code>intest.quote.req_effective_date</code>.
     */
    public void setReqEffectiveDate(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>intest.quote.req_effective_date</code>.
     */
    public Timestamp getReqEffectiveDate() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>intest.quote.policy_effective_date</code>.
     */
    public void setPolicyEffectiveDate(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>intest.quote.policy_effective_date</code>.
     */
    public Timestamp getPolicyEffectiveDate() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>intest.quote.pdpa_consent</code>.
     */
    public void setPdpaConsent(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>intest.quote.pdpa_consent</code>.
     */
    public Boolean getPdpaConsent() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>intest.quote.waiting_period</code>.
     */
    public void setWaitingPeriod(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>intest.quote.waiting_period</code>.
     */
    public Integer getWaitingPeriod() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>intest.quote.payment_status</code>.
     */
    public void setPaymentStatus(PaymentStatus value) {
        set(21, value);
    }

    /**
     * Getter for <code>intest.quote.payment_status</code>.
     */
    public PaymentStatus getPaymentStatus() {
        return (PaymentStatus) get(21);
    }

    /**
     * Setter for <code>intest.quote.payment_method</code>.
     */
    public void setPaymentMethod(QuotePaymentMethod value) {
        set(22, value);
    }

    /**
     * Getter for <code>intest.quote.payment_method</code>.
     */
    public QuotePaymentMethod getPaymentMethod() {
        return (QuotePaymentMethod) get(22);
    }

    /**
     * Setter for <code>intest.quote.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>intest.quote.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>intest.quote.paid_time</code>.
     */
    public void setPaidTime(Timestamp value) {
        set(24, value);
    }

    /**
     * Getter for <code>intest.quote.paid_time</code>.
     */
    public Timestamp getPaidTime() {
        return (Timestamp) get(24);
    }

    /**
     * Setter for <code>intest.quote.braintree_transaction_id</code>.
     */
    public void setBraintreeTransactionId(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>intest.quote.braintree_transaction_id</code>.
     */
    public String getBraintreeTransactionId() {
        return (String) get(25);
    }

    /**
     * Setter for <code>intest.quote.payment_consent</code>.
     */
    public void setPaymentConsent(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for <code>intest.quote.payment_consent</code>.
     */
    public Boolean getPaymentConsent() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>intest.quote.estimate_amount</code>.
     */
    public void setEstimateAmount(BigDecimal value) {
        set(27, value);
    }

    /**
     * Getter for <code>intest.quote.estimate_amount</code>.
     */
    public BigDecimal getEstimateAmount() {
        return (BigDecimal) get(27);
    }

    /**
     * Setter for <code>intest.quote.proposed_amount</code>.
     */
    public void setProposedAmount(BigDecimal value) {
        set(28, value);
    }

    /**
     * Getter for <code>intest.quote.proposed_amount</code>.
     */
    public BigDecimal getProposedAmount() {
        return (BigDecimal) get(28);
    }

    /**
     * Setter for <code>intest.quote.submission_date</code>.
     */
    public void setSubmissionDate(Timestamp value) {
        set(29, value);
    }

    /**
     * Getter for <code>intest.quote.submission_date</code>.
     */
    public Timestamp getSubmissionDate() {
        return (Timestamp) get(29);
    }

    /**
     * Setter for <code>intest.quote.inforce_date</code>.
     */
    public void setInforceDate(Timestamp value) {
        set(30, value);
    }

    /**
     * Getter for <code>intest.quote.inforce_date</code>.
     */
    public Timestamp getInforceDate() {
        return (Timestamp) get(30);
    }

    /**
     * Setter for <code>intest.quote.ext_trans_type</code>.
     */
    public void setExtTransType(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>intest.quote.ext_trans_type</code>.
     */
    public String getExtTransType() {
        return (String) get(31);
    }

    /**
     * Setter for <code>intest.quote.ext_trans_id</code>.
     */
    public void setExtTransId(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>intest.quote.ext_trans_id</code>.
     */
    public String getExtTransId() {
        return (String) get(32);
    }

    /**
     * Setter for <code>intest.quote.scid</code>.
     */
    public void setScid(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>intest.quote.scid</code>.
     */
    public String getScid() {
        return (String) get(33);
    }

    /**
     * Setter for <code>intest.quote.business_type</code>.
     */
    public void setBusinessType(QuoteBusinessType value) {
        set(34, value);
    }

    /**
     * Getter for <code>intest.quote.business_type</code>.
     */
    public QuoteBusinessType getBusinessType() {
        return (QuoteBusinessType) get(34);
    }

    /**
     * Setter for <code>intest.quote.existing_policy_no</code>.
     */
    public void setExistingPolicyNo(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>intest.quote.existing_policy_no</code>.
     */
    public String getExistingPolicyNo() {
        return (String) get(35);
    }

    /**
     * Setter for <code>intest.quote.final_amount</code>.
     */
    public void setFinalAmount(BigDecimal value) {
        set(36, value);
    }

    /**
     * Getter for <code>intest.quote.final_amount</code>.
     */
    public BigDecimal getFinalAmount() {
        return (BigDecimal) get(36);
    }

    /**
     * Setter for <code>intest.quote.promo_code</code>.
     */
    public void setPromoCode(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>intest.quote.promo_code</code>.
     */
    public String getPromoCode() {
        return (String) get(37);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuoteRecord
     */
    public QuoteRecord() {
        super(Quote.QUOTE);
    }

    /**
     * Create a detached, initialised QuoteRecord
     */
    public QuoteRecord(Long id, String quotationNo, String name, Long accountId, Long productId, String productCode, Long productVersion, Stages stages, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated, String txId, Long auditId, Map data, String policyNo, Timestamp reqEffectiveDate, Timestamp policyEffectiveDate, Boolean pdpaConsent, Integer waitingPeriod, PaymentStatus paymentStatus, QuotePaymentMethod paymentMethod, BigDecimal amount, Timestamp paidTime, String braintreeTransactionId, Boolean paymentConsent, BigDecimal estimateAmount, BigDecimal proposedAmount, Timestamp submissionDate, Timestamp inforceDate, String extTransType, String extTransId, String scid, QuoteBusinessType businessType, String existingPolicyNo, BigDecimal finalAmount, String promoCode) {
        super(Quote.QUOTE);

        set(0, id);
        set(1, quotationNo);
        set(2, name);
        set(3, accountId);
        set(4, productId);
        set(5, productCode);
        set(6, productVersion);
        set(7, stages);
        set(8, deleted);
        set(9, createdBy);
        set(10, created);
        set(11, updatedBy);
        set(12, updated);
        set(13, txId);
        set(14, auditId);
        set(15, data);
        set(16, policyNo);
        set(17, reqEffectiveDate);
        set(18, policyEffectiveDate);
        set(19, pdpaConsent);
        set(20, waitingPeriod);
        set(21, paymentStatus);
        set(22, paymentMethod);
        set(23, amount);
        set(24, paidTime);
        set(25, braintreeTransactionId);
        set(26, paymentConsent);
        set(27, estimateAmount);
        set(28, proposedAmount);
        set(29, submissionDate);
        set(30, inforceDate);
        set(31, extTransType);
        set(32, extTransId);
        set(33, scid);
        set(34, businessType);
        set(35, existingPolicyNo);
        set(36, finalAmount);
        set(37, promoCode);
    }
}
