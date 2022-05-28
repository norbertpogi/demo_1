/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import com.unchartedpartners.databases.enums.AccountType;
import com.unchartedpartners.databases.enums.QuotePaymentMethod;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

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
public class ReportView implements Serializable {

    private static final long serialVersionUID = 320109468;

    private Long               quoteId;
    private String             quoteName;
    private String             productCode;
    private String             productName;
    private String             quoteStatus;
    private String             agentName;
    private String             accountCode;
    private AccountType        accountType;
    private String             accountPath;
    private BigDecimal         quoteEstimateAmount;
    private BigDecimal         quoteProposedAmount;
    private BigDecimal         quoteFinalAmount;
    private Timestamp          quoteCreatedDate;
    private Timestamp          quoteSubmissionDate;
    private Timestamp          quoteInForceDate;
    private String             policyNo;
    private String             agentCode;
    private String             agentFirstName;
    private String             agentLastName;
    private String             contactName;
    private String             contactNo;
    private String             contactEmail;
    private String             authSignatoryName;
    private String             authSignatoryDesignation;
    private String             companyAddress;
    private String             companyPostalCode;
    private String             natureOfBusiness;
    private QuotePaymentMethod paymentMethod;
    private String             sCid;
    private String             promoCode;
    private String             referralId_1;
    private String             referralId_2;
    private String             categories;

    public ReportView() {}

    public ReportView(ReportView value) {
        this.quoteId = value.quoteId;
        this.quoteName = value.quoteName;
        this.productCode = value.productCode;
        this.productName = value.productName;
        this.quoteStatus = value.quoteStatus;
        this.agentName = value.agentName;
        this.accountCode = value.accountCode;
        this.accountType = value.accountType;
        this.accountPath = value.accountPath;
        this.quoteEstimateAmount = value.quoteEstimateAmount;
        this.quoteProposedAmount = value.quoteProposedAmount;
        this.quoteFinalAmount = value.quoteFinalAmount;
        this.quoteCreatedDate = value.quoteCreatedDate;
        this.quoteSubmissionDate = value.quoteSubmissionDate;
        this.quoteInForceDate = value.quoteInForceDate;
        this.policyNo = value.policyNo;
        this.agentCode = value.agentCode;
        this.agentFirstName = value.agentFirstName;
        this.agentLastName = value.agentLastName;
        this.contactName = value.contactName;
        this.contactNo = value.contactNo;
        this.contactEmail = value.contactEmail;
        this.authSignatoryName = value.authSignatoryName;
        this.authSignatoryDesignation = value.authSignatoryDesignation;
        this.companyAddress = value.companyAddress;
        this.companyPostalCode = value.companyPostalCode;
        this.natureOfBusiness = value.natureOfBusiness;
        this.paymentMethod = value.paymentMethod;
        this.sCid = value.sCid;
        this.promoCode = value.promoCode;
        this.referralId_1 = value.referralId_1;
        this.referralId_2 = value.referralId_2;
        this.categories = value.categories;
    }

    public ReportView(
        Long               quoteId,
        String             quoteName,
        String             productCode,
        String             productName,
        String             quoteStatus,
        String             agentName,
        String             accountCode,
        AccountType        accountType,
        String             accountPath,
        BigDecimal         quoteEstimateAmount,
        BigDecimal         quoteProposedAmount,
        BigDecimal         quoteFinalAmount,
        Timestamp          quoteCreatedDate,
        Timestamp          quoteSubmissionDate,
        Timestamp          quoteInForceDate,
        String             policyNo,
        String             agentCode,
        String             agentFirstName,
        String             agentLastName,
        String             contactName,
        String             contactNo,
        String             contactEmail,
        String             authSignatoryName,
        String             authSignatoryDesignation,
        String             companyAddress,
        String             companyPostalCode,
        String             natureOfBusiness,
        QuotePaymentMethod paymentMethod,
        String             sCid,
        String             promoCode,
        String             referralId_1,
        String             referralId_2,
        String             categories
    ) {
        this.quoteId = quoteId;
        this.quoteName = quoteName;
        this.productCode = productCode;
        this.productName = productName;
        this.quoteStatus = quoteStatus;
        this.agentName = agentName;
        this.accountCode = accountCode;
        this.accountType = accountType;
        this.accountPath = accountPath;
        this.quoteEstimateAmount = quoteEstimateAmount;
        this.quoteProposedAmount = quoteProposedAmount;
        this.quoteFinalAmount = quoteFinalAmount;
        this.quoteCreatedDate = quoteCreatedDate;
        this.quoteSubmissionDate = quoteSubmissionDate;
        this.quoteInForceDate = quoteInForceDate;
        this.policyNo = policyNo;
        this.agentCode = agentCode;
        this.agentFirstName = agentFirstName;
        this.agentLastName = agentLastName;
        this.contactName = contactName;
        this.contactNo = contactNo;
        this.contactEmail = contactEmail;
        this.authSignatoryName = authSignatoryName;
        this.authSignatoryDesignation = authSignatoryDesignation;
        this.companyAddress = companyAddress;
        this.companyPostalCode = companyPostalCode;
        this.natureOfBusiness = natureOfBusiness;
        this.paymentMethod = paymentMethod;
        this.sCid = sCid;
        this.promoCode = promoCode;
        this.referralId_1 = referralId_1;
        this.referralId_2 = referralId_2;
        this.categories = categories;
    }

    public Long getQuoteId() {
        return this.quoteId;
    }

    public void setQuoteId(Long quoteId) {
        this.quoteId = quoteId;
    }

    public String getQuoteName() {
        return this.quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuoteStatus() {
        return this.quoteStatus;
    }

    public void setQuoteStatus(String quoteStatus) {
        this.quoteStatus = quoteStatus;
    }

    public String getAgentName() {
        return this.agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAccountCode() {
        return this.accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getAccountPath() {
        return this.accountPath;
    }

    public void setAccountPath(String accountPath) {
        this.accountPath = accountPath;
    }

    public BigDecimal getQuoteEstimateAmount() {
        return this.quoteEstimateAmount;
    }

    public void setQuoteEstimateAmount(BigDecimal quoteEstimateAmount) {
        this.quoteEstimateAmount = quoteEstimateAmount;
    }

    public BigDecimal getQuoteProposedAmount() {
        return this.quoteProposedAmount;
    }

    public void setQuoteProposedAmount(BigDecimal quoteProposedAmount) {
        this.quoteProposedAmount = quoteProposedAmount;
    }

    public BigDecimal getQuoteFinalAmount() {
        return this.quoteFinalAmount;
    }

    public void setQuoteFinalAmount(BigDecimal quoteFinalAmount) {
        this.quoteFinalAmount = quoteFinalAmount;
    }

    public Timestamp getQuoteCreatedDate() {
        return this.quoteCreatedDate;
    }

    public void setQuoteCreatedDate(Timestamp quoteCreatedDate) {
        this.quoteCreatedDate = quoteCreatedDate;
    }

    public Timestamp getQuoteSubmissionDate() {
        return this.quoteSubmissionDate;
    }

    public void setQuoteSubmissionDate(Timestamp quoteSubmissionDate) {
        this.quoteSubmissionDate = quoteSubmissionDate;
    }

    public Timestamp getQuoteInForceDate() {
        return this.quoteInForceDate;
    }

    public void setQuoteInForceDate(Timestamp quoteInForceDate) {
        this.quoteInForceDate = quoteInForceDate;
    }

    public String getPolicyNo() {
        return this.policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getAgentCode() {
        return this.agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentFirstName() {
        return this.agentFirstName;
    }

    public void setAgentFirstName(String agentFirstName) {
        this.agentFirstName = agentFirstName;
    }

    public String getAgentLastName() {
        return this.agentLastName;
    }

    public void setAgentLastName(String agentLastName) {
        this.agentLastName = agentLastName;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNo() {
        return this.contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getAuthSignatoryName() {
        return this.authSignatoryName;
    }

    public void setAuthSignatoryName(String authSignatoryName) {
        this.authSignatoryName = authSignatoryName;
    }

    public String getAuthSignatoryDesignation() {
        return this.authSignatoryDesignation;
    }

    public void setAuthSignatoryDesignation(String authSignatoryDesignation) {
        this.authSignatoryDesignation = authSignatoryDesignation;
    }

    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPostalCode() {
        return this.companyPostalCode;
    }

    public void setCompanyPostalCode(String companyPostalCode) {
        this.companyPostalCode = companyPostalCode;
    }

    public String getNatureOfBusiness() {
        return this.natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public QuotePaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(QuotePaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSCid() {
        return this.sCid;
    }

    public void setSCid(String sCid) {
        this.sCid = sCid;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getReferralId_1() {
        return this.referralId_1;
    }

    public void setReferralId_1(String referralId_1) {
        this.referralId_1 = referralId_1;
    }

    public String getReferralId_2() {
        return this.referralId_2;
    }

    public void setReferralId_2(String referralId_2) {
        this.referralId_2 = referralId_2;
    }

    public String getCategories() {
        return this.categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ReportView (");

        sb.append("quoteId :" );
        sb.append(quoteId);
        sb.append(",").append("quoteName :" );
        sb.append(quoteName);
        sb.append(",").append("productCode :" );
        sb.append(productCode);
        sb.append(",").append("productName :" );
        sb.append(productName);
        sb.append(",").append("quoteStatus :" );
        sb.append(quoteStatus);
        sb.append(",").append("agentName :" );
        sb.append(agentName);
        sb.append(",").append("accountCode :" );
        sb.append(accountCode);
        sb.append(",").append("accountType :" );
        sb.append(accountType);
        sb.append(",").append("accountPath :" );
        sb.append(accountPath);
        sb.append(",").append("quoteEstimateAmount :" );
        sb.append(quoteEstimateAmount);
        sb.append(",").append("quoteProposedAmount :" );
        sb.append(quoteProposedAmount);
        sb.append(",").append("quoteFinalAmount :" );
        sb.append(quoteFinalAmount);
        sb.append(",").append("quoteCreatedDate :" );
        sb.append(quoteCreatedDate);
        sb.append(",").append("quoteSubmissionDate :" );
        sb.append(quoteSubmissionDate);
        sb.append(",").append("quoteInForceDate :" );
        sb.append(quoteInForceDate);
        sb.append(",").append("policyNo :" );
        sb.append(policyNo);
        sb.append(",").append("agentCode :" );
        sb.append(agentCode);
        sb.append(",").append("agentFirstName :" );
        sb.append(agentFirstName);
        sb.append(",").append("agentLastName :" );
        sb.append(agentLastName);
        sb.append(",").append("contactName :" );
        sb.append(contactName);
        sb.append(",").append("contactNo :" );
        sb.append(contactNo);
        sb.append(",").append("contactEmail :" );
        sb.append(contactEmail);
        sb.append(",").append("authSignatoryName :" );
        sb.append(authSignatoryName);
        sb.append(",").append("authSignatoryDesignation :" );
        sb.append(authSignatoryDesignation);
        sb.append(",").append("companyAddress :" );
        sb.append(companyAddress);
        sb.append(",").append("companyPostalCode :" );
        sb.append(companyPostalCode);
        sb.append(",").append("natureOfBusiness :" );
        sb.append(natureOfBusiness);
        sb.append(",").append("paymentMethod :" );
        sb.append(paymentMethod);
        sb.append(",").append("sCid :" );
        sb.append(sCid);
        sb.append(",").append("promoCode :" );
        sb.append(promoCode);
        sb.append(",").append("referralId_1 :" );
        sb.append(referralId_1);
        sb.append(",").append("referralId_2 :" );
        sb.append(referralId_2);
        sb.append(",").append("categories :" );
        sb.append(categories);

        sb.append(")");
        return sb.toString();
    }
}
