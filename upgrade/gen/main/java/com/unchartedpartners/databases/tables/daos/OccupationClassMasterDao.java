/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.OccupationClassMaster;
import com.unchartedpartners.databases.tables.records.OccupationClassMasterRecord;

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
@Repository(value="baseOccupationClassMasterDao")
@ConditionalOnMissingBean(name="occupationClassMasterDao")
public class OccupationClassMasterDao extends BaseDaoImpl<OccupationClassMasterRecord, com.unchartedpartners.databases.tables.pojos.OccupationClassMaster, Long> {

    /**
     * Create a new OccupationClassMasterDao without any configuration
     */
    public OccupationClassMasterDao() {
        super(OccupationClassMaster.OCCUPATION_CLASS_MASTER, com.unchartedpartners.databases.tables.pojos.OccupationClassMaster.class);
    }

    /**
     * Create a new OccupationClassMasterDao with an attached configuration
     */
    public OccupationClassMasterDao(Configuration configuration) {
        super(OccupationClassMaster.OCCUPATION_CLASS_MASTER, com.unchartedpartners.databases.tables.pojos.OccupationClassMaster.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.OccupationClassMaster object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.OccupationClassMaster> fetchById(Long... values) {
        return fetch(OccupationClassMaster.OCCUPATION_CLASS_MASTER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.OccupationClassMaster fetchOneById(Long value) {
        return fetchOne(OccupationClassMaster.OCCUPATION_CLASS_MASTER.ID, value);
    }

    /**
     * Fetch records that have <code>occupation IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.OccupationClassMaster> fetchByOccupation(String... values) {
        return fetch(OccupationClassMaster.OCCUPATION_CLASS_MASTER.OCCUPATION, values);
    }

    /**
     * Fetch records that have <code>occupation_class IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.OccupationClassMaster> fetchByOccupationClass(String... values) {
        return fetch(OccupationClassMaster.OCCUPATION_CLASS_MASTER.OCCUPATION_CLASS, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.OccupationClassMaster> fetchByDeleted(Boolean... values) {
        return fetch(OccupationClassMaster.OCCUPATION_CLASS_MASTER.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.OccupationClassMaster> fetchByCreatedBy(Long... values) {
        return fetch(OccupationClassMaster.OCCUPATION_CLASS_MASTER.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.OccupationClassMaster> fetchByCreated(Timestamp... values) {
        return fetch(OccupationClassMaster.OCCUPATION_CLASS_MASTER.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.OccupationClassMaster> fetchByUpdatedBy(Long... values) {
        return fetch(OccupationClassMaster.OCCUPATION_CLASS_MASTER.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.OccupationClassMaster> fetchByUpdated(Timestamp... values) {
        return fetch(OccupationClassMaster.OCCUPATION_CLASS_MASTER.UPDATED, values);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.OccupationClassMaster> fetchByTxId(String... values) {
        return fetch(OccupationClassMaster.OCCUPATION_CLASS_MASTER.TX_ID, values);
    }

    /**
     * Fetch records that have <code>audit_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.OccupationClassMaster> fetchByAuditId(Long... values) {
        return fetch(OccupationClassMaster.OCCUPATION_CLASS_MASTER.AUDIT_ID, values);
    }
}