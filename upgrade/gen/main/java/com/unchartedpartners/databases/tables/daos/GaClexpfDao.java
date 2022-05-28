/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.GaClexpf;
import com.unchartedpartners.databases.tables.records.GaClexpfRecord;

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
@Repository(value="baseGaClexpfDao")
@ConditionalOnMissingBean(name="gaClexpfDao")
public class GaClexpfDao extends BaseDaoImpl<GaClexpfRecord, com.unchartedpartners.databases.tables.pojos.GaClexpf, Long> {

    /**
     * Create a new GaClexpfDao without any configuration
     */
    public GaClexpfDao() {
        super(GaClexpf.GA_CLEXPF, com.unchartedpartners.databases.tables.pojos.GaClexpf.class);
    }

    /**
     * Create a new GaClexpfDao with an attached configuration
     */
    public GaClexpfDao(Configuration configuration) {
        super(GaClexpf.GA_CLEXPF, com.unchartedpartners.databases.tables.pojos.GaClexpf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.GaClexpf object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchById(Long... values) {
        return fetch(GaClexpf.GA_CLEXPF.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.GaClexpf fetchOneById(Long value) {
        return fetchOne(GaClexpf.GA_CLEXPF.ID, value);
    }

    /**
     * Fetch records that have <code>clntpfx IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByClntpfx(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.CLNTPFX, values);
    }

    /**
     * Fetch records that have <code>clntcoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByClntcoy(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.CLNTCOY, values);
    }

    /**
     * Fetch records that have <code>clntnum IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByClntnum(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.CLNTNUM, values);
    }

    /**
     * Fetch records that have <code>rdidtelno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByRdidtelno(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.RDIDTELNO, values);
    }

    /**
     * Fetch records that have <code>rmblphone IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByRmblphone(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.RMBLPHONE, values);
    }

    /**
     * Fetch records that have <code>rpager IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByRpager(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.RPAGER, values);
    }

    /**
     * Fetch records that have <code>faxno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByFaxno(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.FAXNO, values);
    }

    /**
     * Fetch records that have <code>rinternet IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByRinternet(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.RINTERNET, values);
    }

    /**
     * Fetch records that have <code>rtaxidnum IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByRtaxidnum(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.RTAXIDNUM, values);
    }

    /**
     * Fetch records that have <code>rstaflag IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByRstaflag(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.RSTAFLAG, values);
    }

    /**
     * Fetch records that have <code>splindic IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchBySplindic(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.SPLINDIC, values);
    }

    /**
     * Fetch records that have <code>zspecind IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByZspecind(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.ZSPECIND, values);
    }

    /**
     * Fetch records that have <code>oldidno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByOldidno(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.OLDIDNO, values);
    }

    /**
     * Fetch records that have <code>user_profile IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByUserProfile(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.USER_PROFILE, values);
    }

    /**
     * Fetch records that have <code>job_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByJobName(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.JOB_NAME, values);
    }

    /**
     * Fetch records that have <code>datime IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByDatime(Timestamp... values) {
        return fetch(GaClexpf.GA_CLEXPF.DATIME, values);
    }

    /**
     * Fetch records that have <code>eb_timestamp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByEbTimestamp(Timestamp... values) {
        return fetch(GaClexpf.GA_CLEXPF.EB_TIMESTAMP, values);
    }

    /**
     * Fetch records that have <code>zforeign IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaClexpf> fetchByZforeign(String... values) {
        return fetch(GaClexpf.GA_CLEXPF.ZFOREIGN, values);
    }
}