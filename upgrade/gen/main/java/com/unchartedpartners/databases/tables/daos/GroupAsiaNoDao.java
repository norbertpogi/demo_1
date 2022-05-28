/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.enums.GaNoSubType;
import com.unchartedpartners.databases.enums.GaNoType;
import com.unchartedpartners.databases.tables.GroupAsiaNo;
import com.unchartedpartners.databases.tables.records.GroupAsiaNoRecord;

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
@Repository(value="baseGroupAsiaNoDao")
@ConditionalOnMissingBean(name="groupAsiaNoDao")
public class GroupAsiaNoDao extends BaseDaoImpl<GroupAsiaNoRecord, com.unchartedpartners.databases.tables.pojos.GroupAsiaNo, Long> {

    /**
     * Create a new GroupAsiaNoDao without any configuration
     */
    public GroupAsiaNoDao() {
        super(GroupAsiaNo.GROUP_ASIA_NO, com.unchartedpartners.databases.tables.pojos.GroupAsiaNo.class);
    }

    /**
     * Create a new GroupAsiaNoDao with an attached configuration
     */
    public GroupAsiaNoDao(Configuration configuration) {
        super(GroupAsiaNo.GROUP_ASIA_NO, com.unchartedpartners.databases.tables.pojos.GroupAsiaNo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.GroupAsiaNo object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchById(Long... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.GroupAsiaNo fetchOneById(Long value) {
        return fetchOne(GroupAsiaNo.GROUP_ASIA_NO.ID, value);
    }

    /**
     * Fetch records that have <code>ga_no_type IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByGaNoType(GaNoType... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.GA_NO_TYPE, values);
    }

    /**
     * Fetch records that have <code>ga_no_sub_type IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByGaNoSubType(GaNoSubType... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.GA_NO_SUB_TYPE, values);
    }

    /**
     * Fetch records that have <code>ga_no IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByGaNo(String... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.GA_NO, values);
    }

    /**
     * Fetch records that have <code>platform_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByPlatformId(Long... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.PLATFORM_ID, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByDeleted(Boolean... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByCreatedBy(Long... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByCreated(Timestamp... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByUpdatedBy(Long... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByUpdated(Timestamp... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.UPDATED, values);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByTxId(String... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.TX_ID, values);
    }

    /**
     * Fetch records that have <code>audit_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GroupAsiaNo> fetchByAuditId(Long... values) {
        return fetch(GroupAsiaNo.GROUP_ASIA_NO.AUDIT_ID, values);
    }
}
