/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.enums.PolicyMemberBatchTask;
import com.unchartedpartners.databases.enums.PolicyMemberStatus;
import com.unchartedpartners.databases.enums.PolicyMemberType;
import com.unchartedpartners.databases.enums.UnderwritingStatus;
import com.unchartedpartners.databases.tables.PolicyMember;
import com.unchartedpartners.databases.tables.records.PolicyMemberRecord;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
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
@Repository(value="basePolicyMemberDao")
@ConditionalOnMissingBean(name="policyMemberDao")
public class PolicyMemberDao extends BaseDaoImpl<PolicyMemberRecord, com.unchartedpartners.databases.tables.pojos.PolicyMember, Record2<Long, Long>> {

    /**
     * Create a new PolicyMemberDao without any configuration
     */
    public PolicyMemberDao() {
        super(PolicyMember.POLICY_MEMBER, com.unchartedpartners.databases.tables.pojos.PolicyMember.class);
    }

    /**
     * Create a new PolicyMemberDao with an attached configuration
     */
    public PolicyMemberDao(Configuration configuration) {
        super(PolicyMember.POLICY_MEMBER, com.unchartedpartners.databases.tables.pojos.PolicyMember.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Long, Long> getId(com.unchartedpartners.databases.tables.pojos.PolicyMember object) {
        return compositeKeyRecord(object.getPolicyId(), object.getPersonId());
    }

    /**
     * Fetch records that have <code>policy_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByPolicyId(Long... values) {
        return fetch(PolicyMember.POLICY_MEMBER.POLICY_ID, values);
    }

    /**
     * Fetch records that have <code>person_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByPersonId(Long... values) {
        return fetch(PolicyMember.POLICY_MEMBER.PERSON_ID, values);
    }

    /**
     * Fetch records that have <code>data IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByData(Map... values) {
        return fetch(PolicyMember.POLICY_MEMBER.DATA, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByType(PolicyMemberType... values) {
        return fetch(PolicyMember.POLICY_MEMBER.TYPE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByStatus(PolicyMemberStatus... values) {
        return fetch(PolicyMember.POLICY_MEMBER.STATUS, values);
    }

    /**
     * Fetch records that have <code>task IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByTask(PolicyMemberBatchTask... values) {
        return fetch(PolicyMember.POLICY_MEMBER.TASK, values);
    }

    /**
     * Fetch records that have <code>activation_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByActivationDate(Timestamp... values) {
        return fetch(PolicyMember.POLICY_MEMBER.ACTIVATION_DATE, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByDeleted(Boolean... values) {
        return fetch(PolicyMember.POLICY_MEMBER.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByCreatedBy(Long... values) {
        return fetch(PolicyMember.POLICY_MEMBER.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByCreated(Timestamp... values) {
        return fetch(PolicyMember.POLICY_MEMBER.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByUpdatedBy(Long... values) {
        return fetch(PolicyMember.POLICY_MEMBER.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByUpdated(Timestamp... values) {
        return fetch(PolicyMember.POLICY_MEMBER.UPDATED, values);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByTxId(String... values) {
        return fetch(PolicyMember.POLICY_MEMBER.TX_ID, values);
    }

    /**
     * Fetch records that have <code>audit_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByAuditId(Long... values) {
        return fetch(PolicyMember.POLICY_MEMBER.AUDIT_ID, values);
    }

    /**
     * Fetch records that have <code>coverage_start_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByCoverageStartDate(Timestamp... values) {
        return fetch(PolicyMember.POLICY_MEMBER.COVERAGE_START_DATE, values);
    }

    /**
     * Fetch records that have <code>ga_last_update IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByGaLastUpdate(Timestamp... values) {
        return fetch(PolicyMember.POLICY_MEMBER.GA_LAST_UPDATE, values);
    }

    /**
     * Fetch records that have <code>termination_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByTerminationDate(Timestamp... values) {
        return fetch(PolicyMember.POLICY_MEMBER.TERMINATION_DATE, values);
    }

    /**
     * Fetch records that have <code>underwriting_status IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PolicyMember> fetchByUnderwritingStatus(UnderwritingStatus... values) {
        return fetch(PolicyMember.POLICY_MEMBER.UNDERWRITING_STATUS, values);
    }
}
