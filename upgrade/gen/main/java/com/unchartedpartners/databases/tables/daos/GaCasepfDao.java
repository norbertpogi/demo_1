/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.GaCasepf;
import com.unchartedpartners.databases.tables.records.GaCasepfRecord;

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
@Repository(value="baseGaCasepfDao")
@ConditionalOnMissingBean(name="gaCasepfDao")
public class GaCasepfDao extends BaseDaoImpl<GaCasepfRecord, com.unchartedpartners.databases.tables.pojos.GaCasepf, Long> {

    /**
     * Create a new GaCasepfDao without any configuration
     */
    public GaCasepfDao() {
        super(GaCasepf.GA_CASEPF, com.unchartedpartners.databases.tables.pojos.GaCasepf.class);
    }

    /**
     * Create a new GaCasepfDao with an attached configuration
     */
    public GaCasepfDao(Configuration configuration) {
        super(GaCasepf.GA_CASEPF, com.unchartedpartners.databases.tables.pojos.GaCasepf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.GaCasepf object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchById(Long... values) {
        return fetch(GaCasepf.GA_CASEPF.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.GaCasepf fetchOneById(Long value) {
        return fetchOne(GaCasepf.GA_CASEPF.ID, value);
    }

    /**
     * Fetch records that have <code>prefix IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchByPrefix(String... values) {
        return fetch(GaCasepf.GA_CASEPF.PREFIX, values);
    }

    /**
     * Fetch records that have <code>clmcoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchByClmcoy(String... values) {
        return fetch(GaCasepf.GA_CASEPF.CLMCOY, values);
    }

    /**
     * Fetch records that have <code>clamnum IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchByClamnum(String... values) {
        return fetch(GaCasepf.GA_CASEPF.CLAMNUM, values);
    }

    /**
     * Fetch records that have <code>gcoccno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchByGcoccno(String... values) {
        return fetch(GaCasepf.GA_CASEPF.GCOCCNO, values);
    }

    /**
     * Fetch records that have <code>seqnocase IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchBySeqnocase(Byte... values) {
        return fetch(GaCasepf.GA_CASEPF.SEQNOCASE, values);
    }

    /**
     * Fetch records that have <code>casenote IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchByCasenote(String... values) {
        return fetch(GaCasepf.GA_CASEPF.CASENOTE, values);
    }

    /**
     * Fetch records that have <code>user_profile IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchByUserProfile(String... values) {
        return fetch(GaCasepf.GA_CASEPF.USER_PROFILE, values);
    }

    /**
     * Fetch records that have <code>job_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchByJobName(String... values) {
        return fetch(GaCasepf.GA_CASEPF.JOB_NAME, values);
    }

    /**
     * Fetch records that have <code>datime IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchByDatime(Timestamp... values) {
        return fetch(GaCasepf.GA_CASEPF.DATIME, values);
    }

    /**
     * Fetch records that have <code>eb_timestamp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaCasepf> fetchByEbTimestamp(Timestamp... values) {
        return fetch(GaCasepf.GA_CASEPF.EB_TIMESTAMP, values);
    }
}