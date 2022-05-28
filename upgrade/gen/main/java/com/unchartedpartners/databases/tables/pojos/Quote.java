/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import com.unchartedpartners.databases.enums.PaymentStatus;
import com.unchartedpartners.databases.enums.QuoteBusinessType;
import com.unchartedpartners.databases.enums.QuotePaymentMethod;
import com.unchartedpartners.databases.enums.Stages;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class Quote implements Serializable {

    private static final long serialVersionUID = 1273838605;

    private Long               id;
    private String             quotationNo;
    private String             name;
    private Long               accountId;
    private Long               productId;
    private String             productCode;
    private Long               productVersion;
    private Stages             stages;
    private Boolean            deleted;
    private Long               createdBy;
    private Timestamp          created;
    private Long               updatedBy;
    private Timestamp          updated;
    private String             txId;
    private Long               auditId;
    private Map                data;
    private String             policyNo;
    private Timestamp          reqEffectiveDate;
    private Timestamp          policyEffectiveDate;
    private Boolean            pdpaConsent;
    private Integer            waitingPeriod;
    private PaymentStatus      paymentStatus;
    private QuotePaymentMethod paymentMethod;
    private BigDecimal         amount;
    private Timestamp          paidTime;
    private String             braintreeTransactionId;
    private Boolean            paymentConsent;
    private BigDecimal         estimateAmount;
    private BigDecimal         proposedAmount;
    private Timestamp          submissionDate;
    private Timestamp          inforceDate;
    private String             extTransType;
    private String             extTransId;
    private String             scid;
    private QuoteBusinessType  businessType;
    private String             existingPolicyNo;
    private BigDecimal         finalAmount;
    private String             promoCode;

    public Quote() {}

    public Quote(Quote value) {
        this.id = value.id;
        this.quotationNo = value.quotationNo;
        this.name = value.name;
        this.accountId = value.accountId;
        this.productId = value.productId;
        this.productCode = value.productCode;
        this.productVersion = value.productVersion;
        this.stages = value.stages;
        this.deleted = value.deleted;
        this.createdBy = value.createdBy;
        this.created = value.created;
        this.updatedBy = value.updatedBy;
        this.updated = value.updated;
        this.txId = value.txId;
        this.auditId = value.auditId;
        this.data = value.data;
        this.policyNo = value.policyNo;
        this.reqEffectiveDate = value.reqEffectiveDate;
        this.policyEffectiveDate = value.policyEffectiveDate;
        this.pdpaConsent = value.pdpaConsent;
        this.waitingPeriod = value.waitingPeriod;
        this.paymentStatus = value.paymentStatus;
        this.paymentMethod = value.paymentMethod;
        this.amount = value.amount;
        this.paidTime = value.paidTime;
        this.braintreeTransactionId = value.braintreeTransactionId;
        this.paymentConsent = value.paymentConsent;
        this.estimateAmount = value.estimateAmount;
        this.proposedAmount = value.proposedAmount;
        this.submissionDate = value.submissionDate;
        this.inforceDate = value.inforceDate;
        this.extTransType = value.extTransType;
        this.extTransId = value.extTransId;
        this.scid = value.scid;
        this.businessType = value.businessType;
        this.existingPolicyNo = value.existingPolicyNo;
        this.finalAmount = value.finalAmount;
        this.promoCode = value.promoCode;
    }

    public Quote(
        Long               id,
        String             quotationNo,
        String             name,
        Long               accountId,
        Long               productId,
        String             productCode,
        Long               productVersion,
        Stages             stages,
        Boolean            deleted,
        Long               createdBy,
        Timestamp          created,
        Long               updatedBy,
        Timestamp          updated,
        String             txId,
        Long               auditId,
        Map                data,
        String             policyNo,
        Timestamp          reqEffectiveDate,
        Timestamp          policyEffectiveDate,
        Boolean            pdpaConsent,
        Integer            waitingPeriod,
        PaymentStatus      paymentStatus,
        QuotePaymentMethod paymentMethod,
        BigDecimal         amount,
        Timestamp          paidTime,
        String             braintreeTransactionId,
        Boolean            paymentConsent,
        BigDecimal         estimateAmount,
        BigDecimal         proposedAmount,
        Timestamp          submissionDate,
        Timestamp          inforceDate,
        String             extTransType,
        String             extTransId,
        String             scid,
        QuoteBusinessType  businessType,
        String             existingPolicyNo,
        BigDecimal         finalAmount,
        String             promoCode
    ) {
        this.id = id;
        this.quotationNo = quotationNo;
        this.name = name;
        this.accountId = accountId;
        this.productId = productId;
        this.productCode = productCode;
        this.productVersion = productVersion;
        this.stages = stages;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.created = created;
        this.updatedBy = updatedBy;
        this.updated = updated;
        this.txId = txId;
        this.auditId = auditId;
        this.data = data;
        this.policyNo = policyNo;
        this.reqEffectiveDate = reqEffectiveDate;
        this.policyEffectiveDate = policyEffectiveDate;
        this.pdpaConsent = pdpaConsent;
        this.waitingPeriod = waitingPeriod;
        this.paymentStatus = paymentStatus;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.paidTime = paidTime;
        this.braintreeTransactionId = braintreeTransactionId;
        this.paymentConsent = paymentConsent;
        this.estimateAmount = estimateAmount;
        this.proposedAmount = proposedAmount;
        this.submissionDate = submissionDate;
        this.inforceDate = inforceDate;
        this.extTransType = extTransType;
        this.extTransId = extTransId;
        this.scid = scid;
        this.businessType = businessType;
        this.existingPolicyNo = existingPolicyNo;
        this.finalAmount = finalAmount;
        this.promoCode = promoCode;
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

    public Stages getStages() {
        return this.stages;
    }

    public void setStages(Stages stages) {
        this.stages = stages;
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

    public String getTxId() {
        return this.txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public Long getAuditId() {
        return this.auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public Map getData() {
        return this.data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    public String getPolicyNo() {
        return this.policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public Timestamp getReqEffectiveDate() {
        return this.reqEffectiveDate;
    }

    public void setReqEffectiveDate(Timestamp reqEffectiveDate) {
        this.reqEffectiveDate = reqEffectiveDate;
    }

    public Timestamp getPolicyEffectiveDate() {
        return this.policyEffectiveDate;
    }

    public void setPolicyEffectiveDate(Timestamp policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }

    public Boolean getPdpaConsent() {
        return this.pdpaConsent;
    }

    public void setPdpaConsent(Boolean pdpaConsent) {
        this.pdpaConsent = pdpaConsent;
    }

    public Integer getWaitingPeriod() {
        return this.waitingPeriod;
    }

    public void setWaitingPeriod(Integer waitingPeriod) {
        this.waitingPeriod = waitingPeriod;
    }

    public PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public QuotePaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(QuotePaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Timestamp getPaidTime() {
        return this.paidTime;
    }

    public void setPaidTime(Timestamp paidTime) {
        this.paidTime = paidTime;
    }

    public String getBraintreeTransactionId() {
        return this.braintreeTransactionId;
    }

    public void setBraintreeTransactionId(String braintreeTransactionId) {
        this.braintreeTransactionId = braintreeTransactionId;
    }

    public Boolean getPaymentConsent() {
        return this.paymentConsent;
    }

    public void setPaymentConsent(Boolean paymentConsent) {
        this.paymentConsent = paymentConsent;
    }

    public BigDecimal getEstimateAmount() {
        return this.estimateAmount;
    }

    public void setEstimateAmount(BigDecimal estimateAmount) {
        this.estimateAmount = estimateAmount;
    }

    public BigDecimal getProposedAmount() {
        return this.proposedAmount;
    }

    public void setProposedAmount(BigDecimal proposedAmount) {
        this.proposedAmount = proposedAmount;
    }

    public Timestamp getSubmissionDate() {
        return this.submissionDate;
    }

    public void setSubmissionDate(Timestamp submissionDate) {
        this.submissionDate = submissionDate;
    }

    public Timestamp getInforceDate() {
        return this.inforceDate;
    }

    public void setInforceDate(Timestamp inforceDate) {
        this.inforceDate = inforceDate;
    }

    public String getExtTransType() {
        return this.extTransType;
    }

    public void setExtTransType(String extTransType) {
        this.extTransType = extTransType;
    }

    public String getExtTransId() {
        return this.extTransId;
    }

    public void setExtTransId(String extTransId) {
        this.extTransId = extTransId;
    }

    public String getScid() {
        return this.scid;
    }

    public void setScid(String scid) {
        this.scid = scid;
    }

    public QuoteBusinessType getBusinessType() {
        return this.businessType;
    }

    public void setBusinessType(QuoteBusinessType businessType) {
        this.businessType = businessType;
    }

    public String getExistingPolicyNo() {
        return this.existingPolicyNo;
    }

    public void setExistingPolicyNo(String existingPolicyNo) {
        this.existingPolicyNo = existingPolicyNo;
    }

    public BigDecimal getFinalAmount() {
        return this.finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Quote (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("quotationNo :" );
        sb.append(quotationNo);
        sb.append(",").append("name :" );
        sb.append(com.unchartedpartners.util.PiiMaskUtil.mask(name));
        sb.append(",").append("accountId :" );
        sb.append(accountId);
        sb.append(",").append("productId :" );
        sb.append(productId);
        sb.append(",").append("productCode :" );
        sb.append(productCode);
        sb.append(",").append("productVersion :" );
        sb.append(productVersion);
        sb.append(",").append("stages :" );
        sb.append(stages);
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
        sb.append(",").append("txId :" );
        sb.append(txId);
        sb.append(",").append("auditId :" );
        sb.append(auditId);
        sb.append(",").append("data :" );
        sb.append(com.unchartedpartners.util.PiiMaskUtil.mask(data));
        sb.append(",").append("policyNo :" );
        sb.append(policyNo);
        sb.append(",").append("reqEffectiveDate :" );
        sb.append(reqEffectiveDate);
        sb.append(",").append("policyEffectiveDate :" );
        sb.append(policyEffectiveDate);
        sb.append(",").append("pdpaConsent :" );
        sb.append(pdpaConsent);
        sb.append(",").append("waitingPeriod :" );
        sb.append(waitingPeriod);
        sb.append(",").append("paymentStatus :" );
        sb.append(paymentStatus);
        sb.append(",").append("paymentMethod :" );
        sb.append(paymentMethod);
        sb.append(",").append("amount :" );
        sb.append(amount);
        sb.append(",").append("paidTime :" );
        sb.append(paidTime);
        sb.append(",").append("braintreeTransactionId :" );
        sb.append(braintreeTransactionId);
        sb.append(",").append("paymentConsent :" );
        sb.append(paymentConsent);
        sb.append(",").append("estimateAmount :" );
        sb.append(estimateAmount);
        sb.append(",").append("proposedAmount :" );
        sb.append(proposedAmount);
        sb.append(",").append("submissionDate :" );
        sb.append(submissionDate);
        sb.append(",").append("inforceDate :" );
        sb.append(inforceDate);
        sb.append(",").append("extTransType :" );
        sb.append(extTransType);
        sb.append(",").append("extTransId :" );
        sb.append(extTransId);
        sb.append(",").append("scid :" );
        sb.append(scid);
        sb.append(",").append("businessType :" );
        sb.append(businessType);
        sb.append(",").append("existingPolicyNo :" );
        sb.append(existingPolicyNo);
        sb.append(",").append("finalAmount :" );
        sb.append(finalAmount);
        sb.append(",").append("promoCode :" );
        sb.append(promoCode);

        sb.append(")");
        return sb.toString();
    }
}