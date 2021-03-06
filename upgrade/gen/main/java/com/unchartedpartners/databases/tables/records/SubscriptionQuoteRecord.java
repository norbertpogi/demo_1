/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.enums.PaymentFrequency;
import com.unchartedpartners.databases.enums.SubscriptionQuoteStatus;
import com.unchartedpartners.databases.tables.SubscriptionQuote;

import java.sql.Timestamp;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
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
public class SubscriptionQuoteRecord extends UpdatableRecordImpl<SubscriptionQuoteRecord> implements Record22<Long, String, String, String, String, Long, Long, String, Long, String, Map, Map, SubscriptionQuoteStatus, PaymentFrequency, Boolean, Timestamp, Boolean, Long, Timestamp, Long, Timestamp, String> {

    private static final long serialVersionUID = -1957026639;

    /**
     * Setter for <code>intest.subscription_quote.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.subscription_quote.quotation_no</code>.
     */
    public void setQuotationNo(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.quotation_no</code>.
     */
    public String getQuotationNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.subscription_quote.contract_code</code>.
     */
    public void setContractCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.contract_code</code>.
     */
    public String getContractCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.subscription_quote.contract_ref_no</code>.
     */
    public void setContractRefNo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.contract_ref_no</code>.
     */
    public String getContractRefNo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>intest.subscription_quote.name</code>.
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>intest.subscription_quote.account_id</code>.
     */
    public void setAccountId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.account_id</code>.
     */
    public Long getAccountId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>intest.subscription_quote.product_id</code>.
     */
    public void setProductId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.product_id</code>.
     */
    public Long getProductId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>intest.subscription_quote.product_code</code>.
     */
    public void setProductCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.product_code</code>.
     */
    public String getProductCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>intest.subscription_quote.product_version</code>.
     */
    public void setProductVersion(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.product_version</code>.
     */
    public Long getProductVersion() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>intest.subscription_quote.plan_no</code>.
     */
    public void setPlanNo(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.plan_no</code>.
     */
    public String getPlanNo() {
        return (String) get(9);
    }

    /**
     * Setter for <code>intest.subscription_quote.customer_data</code>.
     */
    public void setCustomerData(Map value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.customer_data</code>.
     */
    public Map getCustomerData() {
        return (Map) get(10);
    }

    /**
     * Setter for <code>intest.subscription_quote.quote_data</code>.
     */
    public void setQuoteData(Map value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.quote_data</code>.
     */
    public Map getQuoteData() {
        return (Map) get(11);
    }

    /**
     * Setter for <code>intest.subscription_quote.status</code>.
     */
    public void setStatus(SubscriptionQuoteStatus value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.status</code>.
     */
    public SubscriptionQuoteStatus getStatus() {
        return (SubscriptionQuoteStatus) get(12);
    }

    /**
     * Setter for <code>intest.subscription_quote.payment_frequency</code>.
     */
    public void setPaymentFrequency(PaymentFrequency value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.payment_frequency</code>.
     */
    public PaymentFrequency getPaymentFrequency() {
        return (PaymentFrequency) get(13);
    }

    /**
     * Setter for <code>intest.subscription_quote.consent</code>.
     */
    public void setConsent(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.consent</code>.
     */
    public Boolean getConsent() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>intest.subscription_quote.subscription_date</code>.
     */
    public void setSubscriptionDate(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.subscription_date</code>.
     */
    public Timestamp getSubscriptionDate() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>intest.subscription_quote.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>intest.subscription_quote.created_by</code>.
     */
    public void setCreatedBy(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>intest.subscription_quote.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>intest.subscription_quote.updated_by</code>.
     */
    public void setUpdatedBy(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.updated_by</code>.
     */
    public Long getUpdatedBy() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>intest.subscription_quote.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>intest.subscription_quote.customer_no</code>.
     */
    public void setCustomerNo(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>intest.subscription_quote.customer_no</code>.
     */
    public String getCustomerNo() {
        return (String) get(21);
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
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Long, String, String, String, String, Long, Long, String, Long, String, Map, Map, SubscriptionQuoteStatus, PaymentFrequency, Boolean, Timestamp, Boolean, Long, Timestamp, Long, Timestamp, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Long, String, String, String, String, Long, Long, String, Long, String, Map, Map, SubscriptionQuoteStatus, PaymentFrequency, Boolean, Timestamp, Boolean, Long, Timestamp, Long, Timestamp, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.QUOTATION_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.CONTRACT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.CONTRACT_REF_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.PRODUCT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.PRODUCT_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.PLAN_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map> field11() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.CUSTOMER_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map> field12() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.QUOTE_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SubscriptionQuoteStatus> field13() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<PaymentFrequency> field14() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.PAYMENT_FREQUENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.CONSENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.SUBSCRIPTION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field18() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field20() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field21() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field22() {
        return SubscriptionQuote.SUBSCRIPTION_QUOTE.CUSTOMER_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getQuotationNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getContractCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getContractRefNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getProductCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getProductVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getPlanNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map component11() {
        return getCustomerData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map component12() {
        return getQuoteData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteStatus component13() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentFrequency component14() {
        return getPaymentFrequency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component15() {
        return getConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getSubscriptionDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component17() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component18() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component20() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component21() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component22() {
        return getCustomerNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getQuotationNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getContractCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getContractRefNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProductCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getProductVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPlanNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map value11() {
        return getCustomerData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map value12() {
        return getQuoteData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteStatus value13() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentFrequency value14() {
        return getPaymentFrequency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getSubscriptionDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value18() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value20() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value21() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value22() {
        return getCustomerNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value2(String value) {
        setQuotationNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value3(String value) {
        setContractCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value4(String value) {
        setContractRefNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value5(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value6(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value7(Long value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value8(String value) {
        setProductCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value9(Long value) {
        setProductVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value10(String value) {
        setPlanNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value11(Map value) {
        setCustomerData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value12(Map value) {
        setQuoteData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value13(SubscriptionQuoteStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value14(PaymentFrequency value) {
        setPaymentFrequency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value15(Boolean value) {
        setConsent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value16(Timestamp value) {
        setSubscriptionDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value17(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value18(Long value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value19(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value20(Long value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value21(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord value22(String value) {
        setCustomerNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubscriptionQuoteRecord values(Long value1, String value2, String value3, String value4, String value5, Long value6, Long value7, String value8, Long value9, String value10, Map value11, Map value12, SubscriptionQuoteStatus value13, PaymentFrequency value14, Boolean value15, Timestamp value16, Boolean value17, Long value18, Timestamp value19, Long value20, Timestamp value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SubscriptionQuoteRecord
     */
    public SubscriptionQuoteRecord() {
        super(SubscriptionQuote.SUBSCRIPTION_QUOTE);
    }

    /**
     * Create a detached, initialised SubscriptionQuoteRecord
     */
    public SubscriptionQuoteRecord(Long id, String quotationNo, String contractCode, String contractRefNo, String name, Long accountId, Long productId, String productCode, Long productVersion, String planNo, Map customerData, Map quoteData, SubscriptionQuoteStatus status, PaymentFrequency paymentFrequency, Boolean consent, Timestamp subscriptionDate, Boolean deleted, Long createdBy, Timestamp created, Long updatedBy, Timestamp updated, String customerNo) {
        super(SubscriptionQuote.SUBSCRIPTION_QUOTE);

        set(0, id);
        set(1, quotationNo);
        set(2, contractCode);
        set(3, contractRefNo);
        set(4, name);
        set(5, accountId);
        set(6, productId);
        set(7, productCode);
        set(8, productVersion);
        set(9, planNo);
        set(10, customerData);
        set(11, quoteData);
        set(12, status);
        set(13, paymentFrequency);
        set(14, consent);
        set(15, subscriptionDate);
        set(16, deleted);
        set(17, createdBy);
        set(18, created);
        set(19, updatedBy);
        set(20, updated);
        set(21, customerNo);
    }
}
