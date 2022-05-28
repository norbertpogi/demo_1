/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.CloudGaGxhipf;
import com.unchartedpartners.databases.tables.records.CloudGaGxhipfRecord;

import java.math.BigDecimal;
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
@Repository(value="baseCloudGaGxhipfDao")
@ConditionalOnMissingBean(name="cloudGaGxhipfDao")
public class CloudGaGxhipfDao extends BaseDaoImpl<CloudGaGxhipfRecord, com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf, Long> {

    /**
     * Create a new CloudGaGxhipfDao without any configuration
     */
    public CloudGaGxhipfDao() {
        super(CloudGaGxhipf.CLOUD_GA_GXHIPF, com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf.class);
    }

    /**
     * Create a new CloudGaGxhipfDao with an attached configuration
     */
    public CloudGaGxhipfDao(Configuration configuration) {
        super(CloudGaGxhipf.CLOUD_GA_GXHIPF, com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchById(Long... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf fetchOneById(Long value) {
        return fetchOne(CloudGaGxhipf.CLOUD_GA_GXHIPF.ID, value);
    }

    /**
     * Fetch records that have <code>chdrcoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByChdrcoy(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.CHDRCOY, values);
    }

    /**
     * Fetch records that have <code>chdrnum IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByChdrnum(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.CHDRNUM, values);
    }

    /**
     * Fetch records that have <code>mbrno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByMbrno(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.MBRNO, values);
    }

    /**
     * Fetch records that have <code>prodtyp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByProdtyp(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.PRODTYP, values);
    }

    /**
     * Fetch records that have <code>planno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByPlanno(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.PLANNO, values);
    }

    /**
     * Fetch records that have <code>effdate IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByEffdate(Integer... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.EFFDATE, values);
    }

    /**
     * Fetch records that have <code>fmlycde IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByFmlycde(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.FMLYCDE, values);
    }

    /**
     * Fetch records that have <code>dteatt IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByDteatt(Integer... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.DTEATT, values);
    }

    /**
     * Fetch records that have <code>dtetrm IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByDtetrm(Integer... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.DTETRM, values);
    }

    /**
     * Fetch records that have <code>reasontrm IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByReasontrm(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.REASONTRM, values);
    }

    /**
     * Fetch records that have <code>xcesssi IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByXcesssi(Long... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.XCESSSI, values);
    }

    /**
     * Fetch records that have <code>aprvdate IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByAprvdate(Integer... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.APRVDATE, values);
    }

    /**
     * Fetch records that have <code>accptdte IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByAccptdte(Integer... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.ACCPTDTE, values);
    }

    /**
     * Fetch records that have <code>spectrm IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchBySpectrm(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.SPECTRM, values);
    }

    /**
     * Fetch records that have <code>extrprm IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByExtrprm(BigDecimal... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.EXTRPRM, values);
    }

    /**
     * Fetch records that have <code>suminsu IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchBySuminsu(BigDecimal... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.SUMINSU, values);
    }

    /**
     * Fetch records that have <code>decflg IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByDecflg(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.DECFLG, values);
    }

    /**
     * Fetch records that have <code>termid IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByTermid(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.TERMID, values);
    }

    /**
     * Fetch records that have <code>user IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByUser(Integer... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.USER, values);
    }

    /**
     * Fetch records that have <code>transaction_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByTransactionDate(Integer... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.TRANSACTION_DATE, values);
    }

    /**
     * Fetch records that have <code>transaction_time IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByTransactionTime(Integer... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.TRANSACTION_TIME, values);
    }

    /**
     * Fetch records that have <code>tranno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByTranno(Integer... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.TRANNO, values);
    }

    /**
     * Fetch records that have <code>headno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByHeadno(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.HEADNO, values);
    }

    /**
     * Fetch records that have <code>dpntno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByDpntno(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.DPNTNO, values);
    }

    /**
     * Fetch records that have <code>emload IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByEmload(Short... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.EMLOAD, values);
    }

    /**
     * Fetch records that have <code>oaload IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByOaload(BigDecimal... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.OALOAD, values);
    }

    /**
     * Fetch records that have <code>billactn IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByBillactn(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.BILLACTN, values);
    }

    /**
     * Fetch records that have <code>impaircd01 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByImpaircd01(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.IMPAIRCD01, values);
    }

    /**
     * Fetch records that have <code>impaircd02 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByImpaircd02(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.IMPAIRCD02, values);
    }

    /**
     * Fetch records that have <code>impaircd03 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByImpaircd03(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.IMPAIRCD03, values);
    }

    /**
     * Fetch records that have <code>riemload IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByRiemload(Short... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.RIEMLOAD, values);
    }

    /**
     * Fetch records that have <code>rioaload IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByRioaload(BigDecimal... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.RIOALOAD, values);
    }

    /**
     * Fetch records that have <code>usersi IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByUsersi(Long... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.USERSI, values);
    }

    /**
     * Fetch records that have <code>user_profile IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByUserProfile(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.USER_PROFILE, values);
    }

    /**
     * Fetch records that have <code>job_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByJobName(String... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.JOB_NAME, values);
    }

    /**
     * Fetch records that have <code>datime IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByDatime(Timestamp... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.DATIME, values);
    }

    /**
     * Fetch records that have <code>eb_timestamp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaGxhipf> fetchByEbTimestamp(Timestamp... values) {
        return fetch(CloudGaGxhipf.CLOUD_GA_GXHIPF.EB_TIMESTAMP, values);
    }
}
