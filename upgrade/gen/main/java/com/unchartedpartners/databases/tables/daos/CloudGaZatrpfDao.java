/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.CloudGaZatrpf;
import com.unchartedpartners.databases.tables.records.CloudGaZatrpfRecord;

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
@Repository(value="baseCloudGaZatrpfDao")
@ConditionalOnMissingBean(name="cloudGaZatrpfDao")
public class CloudGaZatrpfDao extends BaseDaoImpl<CloudGaZatrpfRecord, com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf, Long> {

    /**
     * Create a new CloudGaZatrpfDao without any configuration
     */
    public CloudGaZatrpfDao() {
        super(CloudGaZatrpf.CLOUD_GA_ZATRPF, com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf.class);
    }

    /**
     * Create a new CloudGaZatrpfDao with an attached configuration
     */
    public CloudGaZatrpfDao(Configuration configuration) {
        super(CloudGaZatrpf.CLOUD_GA_ZATRPF, com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchById(Long... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf fetchOneById(Long value) {
        return fetchOne(CloudGaZatrpf.CLOUD_GA_ZATRPF.ID, value);
    }

    /**
     * Fetch records that have <code>agntcoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByAgntcoy(String... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.AGNTCOY, values);
    }

    /**
     * Fetch records that have <code>agntnum IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByAgntnum(String... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.AGNTNUM, values);
    }

    /**
     * Fetch records that have <code>zagedcd IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByZagedcd(String... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.ZAGEDCD, values);
    }

    /**
     * Fetch records that have <code>zageddt IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByZageddt(Integer... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.ZAGEDDT, values);
    }

    /**
     * Fetch records that have <code>zagedsf IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByZagedsf(String... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.ZAGEDSF, values);
    }

    /**
     * Fetch records that have <code>zagedrs IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByZagedrs(String... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.ZAGEDRS, values);
    }

    /**
     * Fetch records that have <code>termid IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByTermid(String... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.TERMID, values);
    }

    /**
     * Fetch records that have <code>user IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByUser(Integer... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.USER, values);
    }

    /**
     * Fetch records that have <code>transaction_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByTransactionDate(Integer... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.TRANSACTION_DATE, values);
    }

    /**
     * Fetch records that have <code>transaction_time IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByTransactionTime(Integer... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.TRANSACTION_TIME, values);
    }

    /**
     * Fetch records that have <code>user_profile IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByUserProfile(String... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.USER_PROFILE, values);
    }

    /**
     * Fetch records that have <code>job_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByJobName(String... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.JOB_NAME, values);
    }

    /**
     * Fetch records that have <code>datime IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByDatime(Timestamp... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.DATIME, values);
    }

    /**
     * Fetch records that have <code>rrn IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByRrn(Long... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.RRN, values);
    }

    /**
     * Fetch records that have <code>eb_timestamp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaZatrpf> fetchByEbTimestamp(Timestamp... values) {
        return fetch(CloudGaZatrpf.CLOUD_GA_ZATRPF.EB_TIMESTAMP, values);
    }
}
