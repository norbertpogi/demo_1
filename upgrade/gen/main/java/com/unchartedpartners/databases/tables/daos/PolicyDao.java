/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.enums.PolicyStatus;
import com.unchartedpartners.databases.tables.Policy;
import com.unchartedpartners.databases.tables.records.PolicyRecord;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Repository;


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
@Repository(value="basePolicyDao")
@ConditionalOnMissingBean(name="policyDao")
public class PolicyDao extends BaseDaoImpl<PolicyRecord, com.unchartedpartners.databases.tables.pojos.Policy, Long> {

    /**
     * Create a new PolicyDao without any configuration
     */
    public PolicyDao() {
        super(Policy.POLICY, com.unchartedpartners.databases.tables.pojos.Policy.class);
    }

    /**
     * Create a new PolicyDao with an attached configuration
     */
    public PolicyDao(Configuration configuration) {
        super(Policy.POLICY, com.unchartedpartners.databases.tables.pojos.Policy.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.Policy object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchById(Long... values) {
        return fetch(Policy.POLICY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.Policy fetchOneById(Long value) {
        return fetchOne(Policy.POLICY.ID, value);
    }

    /**
     * Fetch records that have <code>quote_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByQuoteId(Long... values) {
        return fetch(Policy.POLICY.QUOTE_ID, values);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByProductId(Long... values) {
        return fetch(Policy.POLICY.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>product_code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByProductCode(String... values) {
        return fetch(Policy.POLICY.PRODUCT_CODE, values);
    }

    /**
     * Fetch records that have <code>product_version IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByProductVersion(Long... values) {
        return fetch(Policy.POLICY.PRODUCT_VERSION, values);
    }

    /**
     * Fetch records that have <code>policy_no IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByPolicyNo(String... values) {
        return fetch(Policy.POLICY.POLICY_NO, values);
    }

    /**
     * Fetch records that have <code>activation_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByActivationDate(Timestamp... values) {
        return fetch(Policy.POLICY.ACTIVATION_DATE, values);
    }

    /**
     * Fetch records that have <code>end_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByEndDate(Timestamp... values) {
        return fetch(Policy.POLICY.END_DATE, values);
    }

    /**
     * Fetch records that have <code>account_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByAccountId(Long... values) {
        return fetch(Policy.POLICY.ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>data IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByData(Map... values) {
        return fetch(Policy.POLICY.DATA, values);
    }

    /**
     * Fetch records that have <code>policy_status IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByPolicyStatus(PolicyStatus... values) {
        return fetch(Policy.POLICY.POLICY_STATUS, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByDeleted(Boolean... values) {
        return fetch(Policy.POLICY.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByCreatedBy(Long... values) {
        return fetch(Policy.POLICY.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByCreated(Timestamp... values) {
        return fetch(Policy.POLICY.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByUpdatedBy(Long... values) {
        return fetch(Policy.POLICY.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByUpdated(Timestamp... values) {
        return fetch(Policy.POLICY.UPDATED, values);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByTxId(String... values) {
        return fetch(Policy.POLICY.TX_ID, values);
    }

    /**
     * Fetch records that have <code>audit_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByAuditId(Long... values) {
        return fetch(Policy.POLICY.AUDIT_ID, values);
    }

    /**
     * Fetch records that have <code>waiting_period IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByWaitingPeriod(Integer... values) {
        return fetch(Policy.POLICY.WAITING_PERIOD, values);
    }

    /**
     * Fetch records that have <code>activation_email_sent IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByActivationEmailSent(Boolean... values) {
        return fetch(Policy.POLICY.ACTIVATION_EMAIL_SENT, values);
    }

    /**
     * Fetch records that have <code>hr_claim_opt_in IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Policy> fetchByHrClaimOptIn(Boolean... values) {
        return fetch(Policy.POLICY.HR_CLAIM_OPT_IN, values);
    }
}
