/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.CloudGaAgntpf;
import com.unchartedpartners.databases.tables.records.CloudGaAgntpfRecord;

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
@Repository(value="baseCloudGaAgntpfDao")
@ConditionalOnMissingBean(name="cloudGaAgntpfDao")
public class CloudGaAgntpfDao extends BaseDaoImpl<CloudGaAgntpfRecord, com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf, Long> {

    /**
     * Create a new CloudGaAgntpfDao without any configuration
     */
    public CloudGaAgntpfDao() {
        super(CloudGaAgntpf.CLOUD_GA_AGNTPF, com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf.class);
    }

    /**
     * Create a new CloudGaAgntpfDao with an attached configuration
     */
    public CloudGaAgntpfDao(Configuration configuration) {
        super(CloudGaAgntpf.CLOUD_GA_AGNTPF, com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchById(Long... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf fetchOneById(Long value) {
        return fetchOne(CloudGaAgntpf.CLOUD_GA_AGNTPF.ID, value);
    }

    /**
     * Fetch records that have <code>agntpfx IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByAgntpfx(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.AGNTPFX, values);
    }

    /**
     * Fetch records that have <code>agntcoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByAgntcoy(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.AGNTCOY, values);
    }

    /**
     * Fetch records that have <code>agntnum IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByAgntnum(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.AGNTNUM, values);
    }

    /**
     * Fetch records that have <code>tranid IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByTranid(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.TRANID, values);
    }

    /**
     * Fetch records that have <code>validflag IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByValidflag(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.VALIDFLAG, values);
    }

    /**
     * Fetch records that have <code>clntpfx IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByClntpfx(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CLNTPFX, values);
    }

    /**
     * Fetch records that have <code>clntcoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByClntcoy(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CLNTCOY, values);
    }

    /**
     * Fetch records that have <code>clntnum IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByClntnum(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CLNTNUM, values);
    }

    /**
     * Fetch records that have <code>agntrel IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByAgntrel(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.AGNTREL, values);
    }

    /**
     * Fetch records that have <code>agtype IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByAgtype(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.AGTYPE, values);
    }

    /**
     * Fetch records that have <code>agntbr IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByAgntbr(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.AGNTBR, values);
    }

    /**
     * Fetch records that have <code>replvl IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByReplvl(Byte... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPLVL, values);
    }

    /**
     * Fetch records that have <code>repagent01 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByRepagent01(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPAGENT01, values);
    }

    /**
     * Fetch records that have <code>repagent02 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByRepagent02(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPAGENT02, values);
    }

    /**
     * Fetch records that have <code>repagent03 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByRepagent03(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPAGENT03, values);
    }

    /**
     * Fetch records that have <code>repagent04 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByRepagent04(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPAGENT04, values);
    }

    /**
     * Fetch records that have <code>repagent05 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByRepagent05(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPAGENT05, values);
    }

    /**
     * Fetch records that have <code>repagent06 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByRepagent06(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPAGENT06, values);
    }

    /**
     * Fetch records that have <code>reportag01 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByReportag01(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPORTAG01, values);
    }

    /**
     * Fetch records that have <code>reportag02 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByReportag02(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPORTAG02, values);
    }

    /**
     * Fetch records that have <code>reportag03 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByReportag03(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPORTAG03, values);
    }

    /**
     * Fetch records that have <code>reportag04 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByReportag04(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPORTAG04, values);
    }

    /**
     * Fetch records that have <code>reportag05 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByReportag05(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPORTAG05, values);
    }

    /**
     * Fetch records that have <code>reportag06 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByReportag06(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPORTAG06, values);
    }

    /**
     * Fetch records that have <code>fgagnt IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByFgagnt(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.FGAGNT, values);
    }

    /**
     * Fetch records that have <code>fgcommtabl IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByFgcommtabl(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.FGCOMMTABL, values);
    }

    /**
     * Fetch records that have <code>lifagnt IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByLifagnt(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.LIFAGNT, values);
    }

    /**
     * Fetch records that have <code>chdrstcda IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByChdrstcda(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CHDRSTCDA, values);
    }

    /**
     * Fetch records that have <code>chdrstcdb IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByChdrstcdb(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CHDRSTCDB, values);
    }

    /**
     * Fetch records that have <code>chdrstcdc IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByChdrstcdc(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CHDRSTCDC, values);
    }

    /**
     * Fetch records that have <code>chdrstcdd IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByChdrstcdd(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CHDRSTCDD, values);
    }

    /**
     * Fetch records that have <code>chdrstcde IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByChdrstcde(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CHDRSTCDE, values);
    }

    /**
     * Fetch records that have <code>start_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByStartDate(Integer... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.START_DATE, values);
    }

    /**
     * Fetch records that have <code>dateend IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByDateend(Integer... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.DATEEND, values);
    }

    /**
     * Fetch records that have <code>contpers IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByContpers(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CONTPERS, values);
    }

    /**
     * Fetch records that have <code>takoagnt IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByTakoagnt(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.TAKOAGNT, values);
    }

    /**
     * Fetch records that have <code>account_reconciliation IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByAccountReconciliation(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.ACCOUNT_RECONCILIATION, values);
    }

    /**
     * Fetch records that have <code>statement_reqd IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByStatementReqd(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.STATEMENT_REQD, values);
    }

    /**
     * Fetch records that have <code>crterm IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByCrterm(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CRTERM, values);
    }

    /**
     * Fetch records that have <code>crlimit IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByCrlimit(Integer... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CRLIMIT, values);
    }

    /**
     * Fetch records that have <code>stlbasis IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByStlbasis(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.STLBASIS, values);
    }

    /**
     * Fetch records that have <code>expiry_notice IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByExpiryNotice(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.EXPIRY_NOTICE, values);
    }

    /**
     * Fetch records that have <code>licence IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByLicence(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.LICENCE, values);
    }

    /**
     * Fetch records that have <code>ridesc IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByRidesc(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.RIDESC, values);
    }

    /**
     * Fetch records that have <code>rlrpfx IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByRlrpfx(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.RLRPFX, values);
    }

    /**
     * Fetch records that have <code>rlrcoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByRlrcoy(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.RLRCOY, values);
    }

    /**
     * Fetch records that have <code>rlracc IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByRlracc(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.RLRACC, values);
    }

    /**
     * Fetch records that have <code>msagnt IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByMsagnt(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.MSAGNT, values);
    }

    /**
     * Fetch records that have <code>reportto IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByReportto(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.REPORTTO, values);
    }

    /**
     * Fetch records that have <code>credittrm IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByCredittrm(Short... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.CREDITTRM, values);
    }

    /**
     * Fetch records that have <code>zbkind IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByZbkind(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.ZBKIND, values);
    }

    /**
     * Fetch records that have <code>zdistrict IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByZdistrict(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.ZDISTRICT, values);
    }

    /**
     * Fetch records that have <code>zfgcmtbn IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByZfgcmtbn(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.ZFGCMTBN, values);
    }

    /**
     * Fetch records that have <code>zstaffcd IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByZstaffcd(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.ZSTAFFCD, values);
    }

    /**
     * Fetch records that have <code>bankcode01 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByBankcode01(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.BANKCODE01, values);
    }

    /**
     * Fetch records that have <code>bankcode02 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByBankcode02(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.BANKCODE02, values);
    }

    /**
     * Fetch records that have <code>bankcode03 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByBankcode03(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.BANKCODE03, values);
    }

    /**
     * Fetch records that have <code>bankcode04 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByBankcode04(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.BANKCODE04, values);
    }

    /**
     * Fetch records that have <code>bankcode05 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByBankcode05(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.BANKCODE05, values);
    }

    /**
     * Fetch records that have <code>user_profile IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByUserProfile(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.USER_PROFILE, values);
    }

    /**
     * Fetch records that have <code>job_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByJobName(String... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.JOB_NAME, values);
    }

    /**
     * Fetch records that have <code>datime IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByDatime(Timestamp... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.DATIME, values);
    }

    /**
     * Fetch records that have <code>eb_timestamp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaAgntpf> fetchByEbTimestamp(Timestamp... values) {
        return fetch(CloudGaAgntpf.CLOUD_GA_AGNTPF.EB_TIMESTAMP, values);
    }
}