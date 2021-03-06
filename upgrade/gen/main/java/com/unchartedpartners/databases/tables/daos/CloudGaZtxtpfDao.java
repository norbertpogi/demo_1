/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.CloudGaZtxtpf;
import com.unchartedpartners.databases.tables.records.CloudGaZtxtpfRecord;

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
@Repository(value="baseCloudGaZtxtpfDao")
@ConditionalOnMissingBean(name="cloudGaZtxtpfDao")
public class CloudGaZtxtpfDao extends BaseDaoImpl<CloudGaZtxtpfRecord, com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf, Long> {

    /**
     * Create a new CloudGaZtxtpfDao without any configuration
     */
    public CloudGaZtxtpfDao() {
        super(CloudGaZtxtpf.CLOUD_GA_ZTXTPF, com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf.class);
    }

    /**
     * Create a new CloudGaZtxtpfDao with an attached configuration
     */
    public CloudGaZtxtpfDao(Configuration configuration) {
        super(CloudGaZtxtpf.CLOUD_GA_ZTXTPF, com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchById(Long... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf fetchOneById(Long value) {
        return fetchOne(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.ID, value);
    }

    /**
     * Fetch records that have <code>fupflg IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByFupflg(String... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.FUPFLG, values);
    }

    /**
     * Fetch records that have <code>chdrcoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByChdrcoy(String... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.CHDRCOY, values);
    }

    /**
     * Fetch records that have <code>chdrnum IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByChdrnum(String... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.CHDRNUM, values);
    }

    /**
     * Fetch records that have <code>mbrno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByMbrno(String... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.MBRNO, values);
    }

    /**
     * Fetch records that have <code>dpntno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByDpntno(String... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.DPNTNO, values);
    }

    /**
     * Fetch records that have <code>gfupcde IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByGfupcde(String... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.GFUPCDE, values);
    }

    /**
     * Fetch records that have <code>midata IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByMidata(String... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.MIDATA, values);
    }

    /**
     * Fetch records that have <code>validflag IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByValidflag(String... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.VALIDFLAG, values);
    }

    /**
     * Fetch records that have <code>user_profile IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByUserProfile(String... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.USER_PROFILE, values);
    }

    /**
     * Fetch records that have <code>job_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByJobName(String... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.JOB_NAME, values);
    }

    /**
     * Fetch records that have <code>datime IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByDatime(Timestamp... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.DATIME, values);
    }

    /**
     * Fetch records that have <code>eb_timestamp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZtxtpf> fetchByEbTimestamp(Timestamp... values) {
        return fetch(CloudGaZtxtpf.CLOUD_GA_ZTXTPF.EB_TIMESTAMP, values);
    }
}
