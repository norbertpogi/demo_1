/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.GaDescpf;
import com.unchartedpartners.databases.tables.records.GaDescpfRecord;

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
@Repository(value="baseGaDescpfDao")
@ConditionalOnMissingBean(name="gaDescpfDao")
public class GaDescpfDao extends BaseDaoImpl<GaDescpfRecord, com.unchartedpartners.databases.tables.pojos.GaDescpf, Long> {

    /**
     * Create a new GaDescpfDao without any configuration
     */
    public GaDescpfDao() {
        super(GaDescpf.GA_DESCPF, com.unchartedpartners.databases.tables.pojos.GaDescpf.class);
    }

    /**
     * Create a new GaDescpfDao with an attached configuration
     */
    public GaDescpfDao(Configuration configuration) {
        super(GaDescpf.GA_DESCPF, com.unchartedpartners.databases.tables.pojos.GaDescpf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.GaDescpf object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>descpfx IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByDescpfx(String... values) {
        return fetch(GaDescpf.GA_DESCPF.DESCPFX, values);
    }

    /**
     * Fetch records that have <code>desccoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByDesccoy(String... values) {
        return fetch(GaDescpf.GA_DESCPF.DESCCOY, values);
    }

    /**
     * Fetch records that have <code>desctabl IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByDesctabl(String... values) {
        return fetch(GaDescpf.GA_DESCPF.DESCTABL, values);
    }

    /**
     * Fetch records that have <code>descitem IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByDescitem(String... values) {
        return fetch(GaDescpf.GA_DESCPF.DESCITEM, values);
    }

    /**
     * Fetch records that have <code>itemseq IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByItemseq(String... values) {
        return fetch(GaDescpf.GA_DESCPF.ITEMSEQ, values);
    }

    /**
     * Fetch records that have <code>language IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByLanguage(String... values) {
        return fetch(GaDescpf.GA_DESCPF.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>tranid IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByTranid(String... values) {
        return fetch(GaDescpf.GA_DESCPF.TRANID, values);
    }

    /**
     * Fetch records that have <code>shortdesc IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByShortdesc(String... values) {
        return fetch(GaDescpf.GA_DESCPF.SHORTDESC, values);
    }

    /**
     * Fetch records that have <code>longdesc IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByLongdesc(String... values) {
        return fetch(GaDescpf.GA_DESCPF.LONGDESC, values);
    }

    /**
     * Fetch records that have <code>user_profile IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByUserProfile(String... values) {
        return fetch(GaDescpf.GA_DESCPF.USER_PROFILE, values);
    }

    /**
     * Fetch records that have <code>job_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByJobName(String... values) {
        return fetch(GaDescpf.GA_DESCPF.JOB_NAME, values);
    }

    /**
     * Fetch records that have <code>datime IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByDatime(Timestamp... values) {
        return fetch(GaDescpf.GA_DESCPF.DATIME, values);
    }

    /**
     * Fetch records that have <code>eb_timestamp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchByEbTimestamp(Timestamp... values) {
        return fetch(GaDescpf.GA_DESCPF.EB_TIMESTAMP, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaDescpf> fetchById(Long... values) {
        return fetch(GaDescpf.GA_DESCPF.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.GaDescpf fetchOneById(Long value) {
        return fetchOne(GaDescpf.GA_DESCPF.ID, value);
    }
}
