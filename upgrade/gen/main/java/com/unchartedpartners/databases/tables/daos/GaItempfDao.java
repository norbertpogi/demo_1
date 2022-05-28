/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.GaItempf;
import com.unchartedpartners.databases.tables.records.GaItempfRecord;

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
@Repository(value="baseGaItempfDao")
@ConditionalOnMissingBean(name="gaItempfDao")
public class GaItempfDao extends BaseDaoImpl<GaItempfRecord, com.unchartedpartners.databases.tables.pojos.GaItempf, Long> {

    /**
     * Create a new GaItempfDao without any configuration
     */
    public GaItempfDao() {
        super(GaItempf.GA_ITEMPF, com.unchartedpartners.databases.tables.pojos.GaItempf.class);
    }

    /**
     * Create a new GaItempfDao with an attached configuration
     */
    public GaItempfDao(Configuration configuration) {
        super(GaItempf.GA_ITEMPF, com.unchartedpartners.databases.tables.pojos.GaItempf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.GaItempf object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchById(Long... values) {
        return fetch(GaItempf.GA_ITEMPF.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.GaItempf fetchOneById(Long value) {
        return fetchOne(GaItempf.GA_ITEMPF.ID, value);
    }

    /**
     * Fetch records that have <code>itempfx IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByItempfx(String... values) {
        return fetch(GaItempf.GA_ITEMPF.ITEMPFX, values);
    }

    /**
     * Fetch records that have <code>itemcoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByItemcoy(String... values) {
        return fetch(GaItempf.GA_ITEMPF.ITEMCOY, values);
    }

    /**
     * Fetch records that have <code>itemtabl IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByItemtabl(String... values) {
        return fetch(GaItempf.GA_ITEMPF.ITEMTABL, values);
    }

    /**
     * Fetch records that have <code>itemitem IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByItemitem(String... values) {
        return fetch(GaItempf.GA_ITEMPF.ITEMITEM, values);
    }

    /**
     * Fetch records that have <code>itemseq IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByItemseq(String... values) {
        return fetch(GaItempf.GA_ITEMPF.ITEMSEQ, values);
    }

    /**
     * Fetch records that have <code>tableprog IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByTableprog(String... values) {
        return fetch(GaItempf.GA_ITEMPF.TABLEPROG, values);
    }

    /**
     * Fetch records that have <code>validflag IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByValidflag(String... values) {
        return fetch(GaItempf.GA_ITEMPF.VALIDFLAG, values);
    }

    /**
     * Fetch records that have <code>itmfrm IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByItmfrm(Integer... values) {
        return fetch(GaItempf.GA_ITEMPF.ITMFRM, values);
    }

    /**
     * Fetch records that have <code>itmto IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByItmto(Integer... values) {
        return fetch(GaItempf.GA_ITEMPF.ITMTO, values);
    }

    /**
     * Fetch records that have <code>genarea IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByGenarea(String... values) {
        return fetch(GaItempf.GA_ITEMPF.GENAREA, values);
    }

    /**
     * Fetch records that have <code>user_profile IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByUserProfile(String... values) {
        return fetch(GaItempf.GA_ITEMPF.USER_PROFILE, values);
    }

    /**
     * Fetch records that have <code>job_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByJobName(String... values) {
        return fetch(GaItempf.GA_ITEMPF.JOB_NAME, values);
    }

    /**
     * Fetch records that have <code>datime IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByDatime(Timestamp... values) {
        return fetch(GaItempf.GA_ITEMPF.DATIME, values);
    }

    /**
     * Fetch records that have <code>rrn IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByRrn(Long... values) {
        return fetch(GaItempf.GA_ITEMPF.RRN, values);
    }

    /**
     * Fetch records that have <code>eb_timestamp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.GaItempf> fetchByEbTimestamp(Timestamp... values) {
        return fetch(GaItempf.GA_ITEMPF.EB_TIMESTAMP, values);
    }
}
