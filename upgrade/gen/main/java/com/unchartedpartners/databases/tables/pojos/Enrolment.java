/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import com.unchartedpartners.databases.enums.EnrolmentStatus;

import java.io.Serializable;
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
public class Enrolment implements Serializable {

    private static final long serialVersionUID = -1174519428;

    private Long            id;
    private Long            clientPolicyId;
    private String          employeeNo;
    private EnrolmentStatus status;
    private Boolean         consent;
    private Boolean         deleted;
    private Long            createdBy;
    private Timestamp       created;
    private Long            updatedBy;
    private Timestamp       updated;
    private String          category;
    private String          subsidiaryName;
    private String          contactNumber;
    private String          contactAddress;
    private String          paymentMethod;
    private String          totalPremium;
    private Boolean         hdfConsent;
    private Boolean         paymentConsent;

    public Enrolment() {}

    public Enrolment(Enrolment value) {
        this.id = value.id;
        this.clientPolicyId = value.clientPolicyId;
        this.employeeNo = value.employeeNo;
        this.status = value.status;
        this.consent = value.consent;
        this.deleted = value.deleted;
        this.createdBy = value.createdBy;
        this.created = value.created;
        this.updatedBy = value.updatedBy;
        this.updated = value.updated;
        this.category = value.category;
        this.subsidiaryName = value.subsidiaryName;
        this.contactNumber = value.contactNumber;
        this.contactAddress = value.contactAddress;
        this.paymentMethod = value.paymentMethod;
        this.totalPremium = value.totalPremium;
        this.hdfConsent = value.hdfConsent;
        this.paymentConsent = value.paymentConsent;
    }

    public Enrolment(
        Long            id,
        Long            clientPolicyId,
        String          employeeNo,
        EnrolmentStatus status,
        Boolean         consent,
        Boolean         deleted,
        Long            createdBy,
        Timestamp       created,
        Long            updatedBy,
        Timestamp       updated,
        String          category,
        String          subsidiaryName,
        String          contactNumber,
        String          contactAddress,
        String          paymentMethod,
        String          totalPremium,
        Boolean         hdfConsent,
        Boolean         paymentConsent
    ) {
        this.id = id;
        this.clientPolicyId = clientPolicyId;
        this.employeeNo = employeeNo;
        this.status = status;
        this.consent = consent;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.created = created;
        this.updatedBy = updatedBy;
        this.updated = updated;
        this.category = category;
        this.subsidiaryName = subsidiaryName;
        this.contactNumber = contactNumber;
        this.contactAddress = contactAddress;
        this.paymentMethod = paymentMethod;
        this.totalPremium = totalPremium;
        this.hdfConsent = hdfConsent;
        this.paymentConsent = paymentConsent;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientPolicyId() {
        return this.clientPolicyId;
    }

    public void setClientPolicyId(Long clientPolicyId) {
        this.clientPolicyId = clientPolicyId;
    }

    public String getEmployeeNo() {
        return this.employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public EnrolmentStatus getStatus() {
        return this.status;
    }

    public void setStatus(EnrolmentStatus status) {
        this.status = status;
    }

    public Boolean getConsent() {
        return this.consent;
    }

    public void setConsent(Boolean consent) {
        this.consent = consent;
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

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubsidiaryName() {
        return this.subsidiaryName;
    }

    public void setSubsidiaryName(String subsidiaryName) {
        this.subsidiaryName = subsidiaryName;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactAddress() {
        return this.contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTotalPremium() {
        return this.totalPremium;
    }

    public void setTotalPremium(String totalPremium) {
        this.totalPremium = totalPremium;
    }

    public Boolean getHdfConsent() {
        return this.hdfConsent;
    }

    public void setHdfConsent(Boolean hdfConsent) {
        this.hdfConsent = hdfConsent;
    }

    public Boolean getPaymentConsent() {
        return this.paymentConsent;
    }

    public void setPaymentConsent(Boolean paymentConsent) {
        this.paymentConsent = paymentConsent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Enrolment (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("clientPolicyId :" );
        sb.append(clientPolicyId);
        sb.append(",").append("employeeNo :" );
        sb.append(employeeNo);
        sb.append(",").append("status :" );
        sb.append(status);
        sb.append(",").append("consent :" );
        sb.append(consent);
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
        sb.append(",").append("category :" );
        sb.append(category);
        sb.append(",").append("subsidiaryName :" );
        sb.append(subsidiaryName);
        sb.append(",").append("contactNumber :" );
        sb.append(contactNumber);
        sb.append(",").append("contactAddress :" );
        sb.append(contactAddress);
        sb.append(",").append("paymentMethod :" );
        sb.append(paymentMethod);
        sb.append(",").append("totalPremium :" );
        sb.append(totalPremium);
        sb.append(",").append("hdfConsent :" );
        sb.append(hdfConsent);
        sb.append(",").append("paymentConsent :" );
        sb.append(paymentConsent);

        sb.append(")");
        return sb.toString();
    }
}
