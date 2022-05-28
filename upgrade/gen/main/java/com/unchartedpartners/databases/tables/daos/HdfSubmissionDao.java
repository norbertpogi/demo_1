/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.HdfSubmission;
import com.unchartedpartners.databases.tables.records.HdfSubmissionRecord;

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
@Repository(value="baseHdfSubmissionDao")
@ConditionalOnMissingBean(name="hdfSubmissionDao")
public class HdfSubmissionDao extends BaseDaoImpl<HdfSubmissionRecord, com.unchartedpartners.databases.tables.pojos.HdfSubmission, Long> {

    /**
     * Create a new HdfSubmissionDao without any configuration
     */
    public HdfSubmissionDao() {
        super(HdfSubmission.HDF_SUBMISSION, com.unchartedpartners.databases.tables.pojos.HdfSubmission.class);
    }

    /**
     * Create a new HdfSubmissionDao with an attached configuration
     */
    public HdfSubmissionDao(Configuration configuration) {
        super(HdfSubmission.HDF_SUBMISSION, com.unchartedpartners.databases.tables.pojos.HdfSubmission.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.HdfSubmission object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.HdfSubmission> fetchById(Long... values) {
        return fetch(HdfSubmission.HDF_SUBMISSION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.HdfSubmission fetchOneById(Long value) {
        return fetchOne(HdfSubmission.HDF_SUBMISSION.ID, value);
    }

    /**
     * Fetch records that have <code>id_no IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.HdfSubmission> fetchByIdNo(String... values) {
        return fetch(HdfSubmission.HDF_SUBMISSION.ID_NO, values);
    }

    /**
     * Fetch records that have <code>policy_no IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.HdfSubmission> fetchByPolicyNo(String... values) {
        return fetch(HdfSubmission.HDF_SUBMISSION.POLICY_NO, values);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.HdfSubmission> fetchByProductId(Long... values) {
        return fetch(HdfSubmission.HDF_SUBMISSION.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>hdf_data IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.HdfSubmission> fetchByHdfData(Map... values) {
        return fetch(HdfSubmission.HDF_SUBMISSION.HDF_DATA, values);
    }

    /**
     * Fetch records that have <code>submitted_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.HdfSubmission> fetchBySubmittedDate(Timestamp... values) {
        return fetch(HdfSubmission.HDF_SUBMISSION.SUBMITTED_DATE, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.HdfSubmission> fetchByCreatedBy(Long... values) {
        return fetch(HdfSubmission.HDF_SUBMISSION.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.HdfSubmission> fetchByCreated(Timestamp... values) {
        return fetch(HdfSubmission.HDF_SUBMISSION.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.HdfSubmission> fetchByUpdatedBy(Long... values) {
        return fetch(HdfSubmission.HDF_SUBMISSION.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.HdfSubmission> fetchByUpdated(Timestamp... values) {
        return fetch(HdfSubmission.HDF_SUBMISSION.UPDATED, values);
    }
}
