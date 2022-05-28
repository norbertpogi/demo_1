/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.MemberActConfig;
import com.unchartedpartners.databases.tables.records.MemberActConfigRecord;

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
@Repository(value="baseMemberActConfigDao")
@ConditionalOnMissingBean(name="memberActConfigDao")
public class MemberActConfigDao extends BaseDaoImpl<MemberActConfigRecord, com.unchartedpartners.databases.tables.pojos.MemberActConfig, Long> {

    /**
     * Create a new MemberActConfigDao without any configuration
     */
    public MemberActConfigDao() {
        super(MemberActConfig.MEMBER_ACT_CONFIG, com.unchartedpartners.databases.tables.pojos.MemberActConfig.class);
    }

    /**
     * Create a new MemberActConfigDao with an attached configuration
     */
    public MemberActConfigDao(Configuration configuration) {
        super(MemberActConfig.MEMBER_ACT_CONFIG, com.unchartedpartners.databases.tables.pojos.MemberActConfig.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.MemberActConfig object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActConfig> fetchById(Long... values) {
        return fetch(MemberActConfig.MEMBER_ACT_CONFIG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.MemberActConfig fetchOneById(Long value) {
        return fetchOne(MemberActConfig.MEMBER_ACT_CONFIG.ID, value);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActConfig> fetchByDeleted(Boolean... values) {
        return fetch(MemberActConfig.MEMBER_ACT_CONFIG.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActConfig> fetchByCreatedBy(Long... values) {
        return fetch(MemberActConfig.MEMBER_ACT_CONFIG.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActConfig> fetchByCreated(Timestamp... values) {
        return fetch(MemberActConfig.MEMBER_ACT_CONFIG.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActConfig> fetchByUpdatedBy(Long... values) {
        return fetch(MemberActConfig.MEMBER_ACT_CONFIG.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActConfig> fetchByUpdated(Timestamp... values) {
        return fetch(MemberActConfig.MEMBER_ACT_CONFIG.UPDATED, values);
    }

    /**
     * Fetch records that have <code>chdrnum IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActConfig> fetchByChdrnum(String... values) {
        return fetch(MemberActConfig.MEMBER_ACT_CONFIG.CHDRNUM, values);
    }

    /**
     * Fetch records that have <code>system_config IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.MemberActConfig> fetchBySystemConfig(Map... values) {
        return fetch(MemberActConfig.MEMBER_ACT_CONFIG.SYSTEM_CONFIG, values);
    }
}