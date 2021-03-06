/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import com.unchartedpartners.databases.enums.PaymentFrequency;
import com.unchartedpartners.databases.enums.SubscriptionQuoteStatus;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

import javax.annotation.Generated;


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
public class SubscriptionQuote implements Serializable {

    private static final long serialVersionUID = -1952431383;

    private Long                    id;
    private String                  quotationNo;
    private String                  contractCode;
    private String                  contractRefNo;
    private String                  name;
    private Long                    accountId;
    private Long                    productId;
    private String                  productCode;
    private Long                    productVersion;
    private String                  planNo;
    private Map                     customerData;
    private Map                     quoteData;
    private SubscriptionQuoteStatus status;
    private PaymentFrequency        paymentFrequency;
    private Boolean                 consent;
    private Timestamp               subscriptionDate;
    private Boolean                 deleted;
    private Long                    createdBy;
    private Timestamp               created;
    private Long                    updatedBy;
    private Timestamp               updated;
    private String                  customerNo;

    public SubscriptionQuote() {}

    public SubscriptionQuote(SubscriptionQuote value) {
        this.id = value.id;
        this.quotationNo = value.quotationNo;
        this.contractCode = value.contractCode;
        this.contractRefNo = value.contractRefNo;
        this.name = value.name;
        this.accountId = value.accountId;
        this.productId = value.productId;
        this.productCode = value.productCode;
        this.productVersion = value.productVersion;
        this.planNo = value.planNo;
        this.customerData = value.customerData;
        this.quoteData = value.quoteData;
        this.status = value.status;
        this.paymentFrequency = value.paymentFrequency;
        this.consent = value.consent;
        this.subscriptionDate = value.subscriptionDate;
        this.deleted = value.deleted;
        this.createdBy = value.createdBy;
        this.created = value.created;
        this.updatedBy = value.updatedBy;
        this.updated = value.updated;
        this.customerNo = value.customerNo;
    }

    public SubscriptionQuote(
        Long                    id,
        String                  quotationNo,
        String                  contractCode,
        String                  contractRefNo,
        String                  name,
        Long                    accountId,
        Long                    productId,
        String                  productCode,
        Long                    productVersion,
        String                  planNo,
        Map                     customerData,
        Map                     quoteData,
        SubscriptionQuoteStatus status,
        PaymentFrequency        paymentFrequency,
        Boolean                 consent,
        Timestamp               subscriptionDate,
        Boolean                 deleted,
        Long                    createdBy,
        Timestamp               created,
        Long                    updatedBy,
        Timestamp               updated,
        String                  customerNo
    ) {
        this.id = id;
        this.quotationNo = quotationNo;
        this.contractCode = contractCode;
        this.contractRefNo = contractRefNo;
        this.name = name;
        this.accountId = accountId;
        this.productId = productId;
        this.productCode = productCode;
        this.productVersion = productVersion;
        this.planNo = planNo;
        this.customerData = customerData;
        this.quoteData = quoteData;
        this.status = status;
        this.paymentFrequency = paymentFrequency;
        this.consent = consent;
        this.subscriptionDate = subscriptionDate;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.created = created;
        this.updatedBy = updatedBy;
        this.updated = updated;
        this.customerNo = customerNo;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuotationNo() {
        return this.quotationNo;
    }

    public void setQuotationNo(String quotationNo) {
        this.quotationNo = quotationNo;
    }

    public String getContractCode() {
        return this.contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getContractRefNo() {
        return this.contractRefNo;
    }

    public void setContractRefNo(String contractRefNo) {
        this.contractRefNo = contractRefNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getProductVersion() {
        return this.productVersion;
    }

    public void setProductVersion(Long productVersion) {
        this.productVersion = productVersion;
    }

    public String getPlanNo() {
        return this.planNo;
    }

    public void setPlanNo(String planNo) {
        this.planNo = planNo;
    }

    public Map getCustomerData() {
        return this.customerData;
    }

    public void setCustomerData(Map customerData) {
        this.customerData = customerData;
    }

    public Map getQuoteData() {
        return this.quoteData;
    }

    public void setQuoteData(Map quoteData) {
        this.quoteData = quoteData;
    }

    public SubscriptionQuoteStatus getStatus() {
        return this.status;
    }

    public void setStatus(SubscriptionQuoteStatus status) {
        this.status = status;
    }

    public PaymentFrequency getPaymentFrequency() {
        return this.paymentFrequency;
    }

    public void setPaymentFrequency(PaymentFrequency paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    public Boolean getConsent() {
        return this.consent;
    }

    public void setConsent(Boolean consent) {
        this.consent = consent;
    }

    public Timestamp getSubscriptionDate() {
        return this.subscriptionDate;
    }

    public void setSubscriptionDate(Timestamp subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdated() {
        return this.updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public String getCustomerNo() {
        return this.customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionQuote (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("quotationNo :" );
        sb.append(quotationNo);
        sb.append(",").append("contractCode :" );
        sb.append(contractCode);
        sb.append(",").append("contractRefNo :" );
        sb.append(contractRefNo);
        sb.append(",").append("name :" );
        sb.append(name);
        sb.append(",").append("accountId :" );
        sb.append(accountId);
        sb.append(",").append("productId :" );
        sb.append(productId);
        sb.append(",").append("productCode :" );
        sb.append(productCode);
        sb.append(",").append("productVersion :" );
        sb.append(productVersion);
        sb.append(",").append("planNo :" );
        sb.append(planNo);
        sb.append(",").append("customerData :" );
        sb.append(customerData);
        sb.append(",").append("quoteData :" );
        sb.append(quoteData);
        sb.append(",").append("status :" );
        sb.append(status);
        sb.append(",").append("paymentFrequency :" );
        sb.append(paymentFrequency);
        sb.append(",").append("consent :" );
        sb.append(consent);
        sb.append(",").append("subscriptionDate :" );
        sb.append(subscriptionDate);
        sb.append(",").append("deleted :" );
        sb.append(deleted);
        sb.append(",").append("createdBy :" );
        sb.append(createdBy);
        sb.append(",").append("created :" );
        sb.append(created);
        sb.append(",").append("updatedBy :" );
        sb.append(updatedBy);
        sb.append(",").append("updated :" );
        sb.append(updated);
        sb.append(",").append("customerNo :" );
        sb.append(customerNo);

        sb.append(")");
        return sb.toString();
    }
}
