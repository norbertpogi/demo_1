/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.enums.GaClaimStatus;
import com.unchartedpartners.databases.tables.PulseClaimStatusNotificationHistory;
import com.unchartedpartners.databases.tables.records.PulseClaimStatusNotificationHistoryRecord;

import java.sql.Timestamp;
import java.util.List;

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
@Repository(value="basePulseClaimStatusNotificationHistoryDao")
@ConditionalOnMissingBean(name="pulseClaimStatusNotificationHistoryDao")
public class PulseClaimStatusNotificationHistoryDao extends BaseDaoImpl<PulseClaimStatusNotificationHistoryRecord, com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory, Long> {

    /**
     * Create a new PulseClaimStatusNotificationHistoryDao without any configuration
     */
    public PulseClaimStatusNotificationHistoryDao() {
        super(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY, com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory.class);
    }

    /**
     * Create a new PulseClaimStatusNotificationHistoryDao with an attached configuration
     */
    public PulseClaimStatusNotificationHistoryDao(Configuration configuration) {
        super(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY, com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchById(Long... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory fetchOneById(Long value) {
        return fetchOne(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.ID, value);
    }

    /**
     * Fetch records that have <code>cust_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByCustName(String... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.CUST_NAME, values);
    }

    /**
     * Fetch records that have <code>cust_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByCustId(String... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.CUST_ID, values);
    }

    /**
     * Fetch records that have <code>email_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByEmailId(String... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.EMAIL_ID, values);
    }

    /**
     * Fetch records that have <code>pulse_claim_ref_no IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByPulseClaimRefNo(String... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.PULSE_CLAIM_REF_NO, values);
    }

    /**
     * Fetch records that have <code>ga_claim_no IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByGaClaimNo(String... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.GA_CLAIM_NO, values);
    }

    /**
     * Fetch records that have <code>claim_status IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByClaimStatus(GaClaimStatus... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.CLAIM_STATUS, values);
    }

    /**
     * Fetch records that have <code>notification_time IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByNotificationTime(Timestamp... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.NOTIFICATION_TIME, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByDeleted(Boolean... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByCreatedBy(Long... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByCreated(Timestamp... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByUpdatedBy(Long... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByUpdated(Timestamp... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.UPDATED, values);
    }

    /**
     * Fetch records that have <code>ga_occur_no IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PulseClaimStatusNotificationHistory> fetchByGaOccurNo(String... values) {
        return fetch(PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY.GA_OCCUR_NO, values);
    }
}
