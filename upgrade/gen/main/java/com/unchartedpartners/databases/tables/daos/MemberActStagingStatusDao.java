/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.enums.StagingStatus;
import com.unchartedpartners.databases.tables.MemberActStagingStatus;
import com.unchartedpartners.databases.tables.records.MemberActStagingStatusRecord;

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
@Repository(value="baseMemberActStagingStatusDao")
@ConditionalOnMissingBean(name="memberActStagingStatusDao")
public class MemberActStagingStatusDao extends BaseDaoImpl<MemberActStagingStatusRecord, com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus, Long> {

    /**
     * Create a new MemberActStagingStatusDao without any configuration
     */
    public MemberActStagingStatusDao() {
        super(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS, com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus.class);
    }

    /**
     * Create a new MemberActStagingStatusDao with an attached configuration
     */
    public MemberActStagingStatusDao(Configuration configuration) {
        super(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS, com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus> fetchById(Long... values) {
        return fetch(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus fetchOneById(Long value) {
        return fetchOne(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS.ID, value);
    }

    /**
     * Fetch records that have <code>member_act_staging_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus> fetchByMemberActStagingId(Long... values) {
        return fetch(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS.MEMBER_ACT_STAGING_ID, values);
    }

    /**
     * Fetch records that have <code>staging_status IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus> fetchByStagingStatus(StagingStatus... values) {
        return fetch(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS.STAGING_STATUS, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus> fetchByDeleted(Boolean... values) {
        return fetch(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus> fetchByCreatedBy(Long... values) {
        return fetch(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus> fetchByCreated(Timestamp... values) {
        return fetch(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus> fetchByUpdatedBy(Long... values) {
        return fetch(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus> fetchByUpdated(Timestamp... values) {
        return fetch(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS.UPDATED, values);
    }

    /**
     * Fetch records that have <code>fail_process IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActStagingStatus> fetchByFailProcess(Map... values) {
        return fetch(MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS.FAIL_PROCESS, values);
    }
}
