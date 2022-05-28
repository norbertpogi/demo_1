/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.CloudGaClntpf;
import com.unchartedpartners.databases.tables.records.CloudGaClntpfRecord;

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
@Repository(value="baseCloudGaClntpfDao")
@ConditionalOnMissingBean(name="cloudGaClntpfDao")
public class CloudGaClntpfDao extends BaseDaoImpl<CloudGaClntpfRecord, com.unchartedpartners.databases.tables.pojos.CloudGaClntpf, Long> {

    /**
     * Create a new CloudGaClntpfDao without any configuration
     */
    public CloudGaClntpfDao() {
        super(CloudGaClntpf.CLOUD_GA_CLNTPF, com.unchartedpartners.databases.tables.pojos.CloudGaClntpf.class);
    }

    /**
     * Create a new CloudGaClntpfDao with an attached configuration
     */
    public CloudGaClntpfDao(Configuration configuration) {
        super(CloudGaClntpf.CLOUD_GA_CLNTPF, com.unchartedpartners.databases.tables.pojos.CloudGaClntpf.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.CloudGaClntpf object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchById(Long... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.CloudGaClntpf fetchOneById(Long value) {
        return fetchOne(CloudGaClntpf.CLOUD_GA_CLNTPF.ID, value);
    }

    /**
     * Fetch records that have <code>clntpfx IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByClntpfx(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLNTPFX, values);
    }

    /**
     * Fetch records that have <code>clntcoy IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByClntcoy(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLNTCOY, values);
    }

    /**
     * Fetch records that have <code>clntnum IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByClntnum(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLNTNUM, values);
    }

    /**
     * Fetch records that have <code>tranid IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByTranid(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.TRANID, values);
    }

    /**
     * Fetch records that have <code>validflag IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByValidflag(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.VALIDFLAG, values);
    }

    /**
     * Fetch records that have <code>clttype IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByClttype(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTTYPE, values);
    }

    /**
     * Fetch records that have <code>secuityno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchBySecuityno(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.SECUITYNO, values);
    }

    /**
     * Fetch records that have <code>payrollno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByPayrollno(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.PAYROLLNO, values);
    }

    /**
     * Fetch records that have <code>surname IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchBySurname(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.SURNAME, values);
    }

    /**
     * Fetch records that have <code>givname IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByGivname(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.GIVNAME, values);
    }

    /**
     * Fetch records that have <code>salut IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchBySalut(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.SALUT, values);
    }

    /**
     * Fetch records that have <code>initials IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByInitials(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.INITIALS, values);
    }

    /**
     * Fetch records that have <code>cltsex IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltsex(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTSEX, values);
    }

    /**
     * Fetch records that have <code>cltaddr01 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltaddr01(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTADDR01, values);
    }

    /**
     * Fetch records that have <code>cltaddr02 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltaddr02(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTADDR02, values);
    }

    /**
     * Fetch records that have <code>cltaddr03 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltaddr03(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTADDR03, values);
    }

    /**
     * Fetch records that have <code>cltaddr04 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltaddr04(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTADDR04, values);
    }

    /**
     * Fetch records that have <code>cltaddr05 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltaddr05(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTADDR05, values);
    }

    /**
     * Fetch records that have <code>cltpcode IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltpcode(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTPCODE, values);
    }

    /**
     * Fetch records that have <code>ctrycode IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCtrycode(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CTRYCODE, values);
    }

    /**
     * Fetch records that have <code>mailing IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByMailing(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.MAILING, values);
    }

    /**
     * Fetch records that have <code>dirmail IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByDirmail(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.DIRMAIL, values);
    }

    /**
     * Fetch records that have <code>addrtype IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByAddrtype(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ADDRTYPE, values);
    }

    /**
     * Fetch records that have <code>cltphone01 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltphone01(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTPHONE01, values);
    }

    /**
     * Fetch records that have <code>cltphone02 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltphone02(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTPHONE02, values);
    }

    /**
     * Fetch records that have <code>vip IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByVip(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.VIP, values);
    }

    /**
     * Fetch records that have <code>occpcode IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByOccpcode(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.OCCPCODE, values);
    }

    /**
     * Fetch records that have <code>servbrh IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByServbrh(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.SERVBRH, values);
    }

    /**
     * Fetch records that have <code>statcode IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByStatcode(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.STATCODE, values);
    }

    /**
     * Fetch records that have <code>cltdob IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltdob(Integer... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTDOB, values);
    }

    /**
     * Fetch records that have <code>soe IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchBySoe(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.SOE, values);
    }

    /**
     * Fetch records that have <code>docno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByDocno(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.DOCNO, values);
    }

    /**
     * Fetch records that have <code>cltdod IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltdod(Integer... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTDOD, values);
    }

    /**
     * Fetch records that have <code>cltstat IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltstat(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTSTAT, values);
    }

    /**
     * Fetch records that have <code>cltmchg IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltmchg(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTMCHG, values);
    }

    /**
     * Fetch records that have <code>middl01 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByMiddl01(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.MIDDL01, values);
    }

    /**
     * Fetch records that have <code>middl02 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByMiddl02(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.MIDDL02, values);
    }

    /**
     * Fetch records that have <code>marryd IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByMarryd(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.MARRYD, values);
    }

    /**
     * Fetch records that have <code>tlxno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByTlxno(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.TLXNO, values);
    }

    /**
     * Fetch records that have <code>faxno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByFaxno(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.FAXNO, values);
    }

    /**
     * Fetch records that have <code>tgram IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByTgram(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.TGRAM, values);
    }

    /**
     * Fetch records that have <code>birthp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByBirthp(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.BIRTHP, values);
    }

    /**
     * Fetch records that have <code>salutl IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchBySalutl(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.SALUTL, values);
    }

    /**
     * Fetch records that have <code>roleflag01 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag01(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG01, values);
    }

    /**
     * Fetch records that have <code>roleflag02 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag02(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG02, values);
    }

    /**
     * Fetch records that have <code>roleflag03 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag03(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG03, values);
    }

    /**
     * Fetch records that have <code>roleflag04 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag04(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG04, values);
    }

    /**
     * Fetch records that have <code>roleflag05 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag05(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG05, values);
    }

    /**
     * Fetch records that have <code>roleflag06 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag06(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG06, values);
    }

    /**
     * Fetch records that have <code>roleflag07 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag07(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG07, values);
    }

    /**
     * Fetch records that have <code>roleflag08 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag08(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG08, values);
    }

    /**
     * Fetch records that have <code>roleflag09 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag09(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG09, values);
    }

    /**
     * Fetch records that have <code>roleflag10 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag10(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG10, values);
    }

    /**
     * Fetch records that have <code>roleflag11 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag11(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG11, values);
    }

    /**
     * Fetch records that have <code>roleflag12 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag12(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG12, values);
    }

    /**
     * Fetch records that have <code>roleflag13 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag13(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG13, values);
    }

    /**
     * Fetch records that have <code>roleflag14 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag14(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG14, values);
    }

    /**
     * Fetch records that have <code>roleflag15 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag15(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG15, values);
    }

    /**
     * Fetch records that have <code>roleflag16 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag16(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG16, values);
    }

    /**
     * Fetch records that have <code>roleflag17 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag17(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG17, values);
    }

    /**
     * Fetch records that have <code>roleflag18 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag18(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG18, values);
    }

    /**
     * Fetch records that have <code>roleflag19 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag19(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG19, values);
    }

    /**
     * Fetch records that have <code>roleflag20 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag20(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG20, values);
    }

    /**
     * Fetch records that have <code>roleflag21 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag21(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG21, values);
    }

    /**
     * Fetch records that have <code>roleflag22 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag22(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG22, values);
    }

    /**
     * Fetch records that have <code>roleflag23 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag23(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG23, values);
    }

    /**
     * Fetch records that have <code>roleflag24 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag24(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG24, values);
    }

    /**
     * Fetch records that have <code>roleflag25 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag25(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG25, values);
    }

    /**
     * Fetch records that have <code>roleflag26 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag26(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG26, values);
    }

    /**
     * Fetch records that have <code>roleflag27 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag27(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG27, values);
    }

    /**
     * Fetch records that have <code>roleflag28 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag28(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG28, values);
    }

    /**
     * Fetch records that have <code>roleflag29 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag29(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG29, values);
    }

    /**
     * Fetch records that have <code>roleflag30 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag30(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG30, values);
    }

    /**
     * Fetch records that have <code>roleflag31 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag31(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG31, values);
    }

    /**
     * Fetch records that have <code>roleflag32 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag32(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG32, values);
    }

    /**
     * Fetch records that have <code>roleflag33 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag33(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG33, values);
    }

    /**
     * Fetch records that have <code>roleflag34 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag34(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG34, values);
    }

    /**
     * Fetch records that have <code>roleflag35 IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByRoleflag35(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ROLEFLAG35, values);
    }

    /**
     * Fetch records that have <code>chdrstcda IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByChdrstcda(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CHDRSTCDA, values);
    }

    /**
     * Fetch records that have <code>chdrstcdb IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByChdrstcdb(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CHDRSTCDB, values);
    }

    /**
     * Fetch records that have <code>chdrstcdc IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByChdrstcdc(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CHDRSTCDC, values);
    }

    /**
     * Fetch records that have <code>chdrstcdd IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByChdrstcdd(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CHDRSTCDD, values);
    }

    /**
     * Fetch records that have <code>chdrstcde IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByChdrstcde(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CHDRSTCDE, values);
    }

    /**
     * Fetch records that have <code>procflag IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByProcflag(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.PROCFLAG, values);
    }

    /**
     * Fetch records that have <code>termid IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByTermid(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.TERMID, values);
    }

    /**
     * Fetch records that have <code>user IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByUser(Integer... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.USER, values);
    }

    /**
     * Fetch records that have <code>transaction_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByTransactionDate(Integer... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.TRANSACTION_DATE, values);
    }

    /**
     * Fetch records that have <code>transaction_time IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByTransactionTime(Integer... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.TRANSACTION_TIME, values);
    }

    /**
     * Fetch records that have <code>sndxcde IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchBySndxcde(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.SNDXCDE, values);
    }

    /**
     * Fetch records that have <code>natlty IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByNatlty(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.NATLTY, values);
    }

    /**
     * Fetch records that have <code>for_att_of IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByForAttOf(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.FOR_ATT_OF, values);
    }

    /**
     * Fetch records that have <code>cltind IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCltind(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CLTIND, values);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByState(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.STATE, values);
    }

    /**
     * Fetch records that have <code>language IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByLanguage(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>capital IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCapital(Long... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CAPITAL, values);
    }

    /**
     * Fetch records that have <code>ctryorig IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByCtryorig(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.CTRYORIG, values);
    }

    /**
     * Fetch records that have <code>ecact IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByEcact(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ECACT, values);
    }

    /**
     * Fetch records that have <code>ethorig IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByEthorig(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.ETHORIG, values);
    }

    /**
     * Fetch records that have <code>start_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByStartDate(Integer... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.START_DATE, values);
    }

    /**
     * Fetch records that have <code>staffno IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByStaffno(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.STAFFNO, values);
    }

    /**
     * Fetch records that have <code>lsurname IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByLsurname(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.LSURNAME, values);
    }

    /**
     * Fetch records that have <code>lgivname IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByLgivname(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.LGIVNAME, values);
    }

    /**
     * Fetch records that have <code>taxflag IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByTaxflag(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.TAXFLAG, values);
    }

    /**
     * Fetch records that have <code>user_profile IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByUserProfile(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.USER_PROFILE, values);
    }

    /**
     * Fetch records that have <code>job_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByJobName(String... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.JOB_NAME, values);
    }

    /**
     * Fetch records that have <code>datime IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByDatime(Timestamp... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.DATIME, values);
    }

    /**
     * Fetch records that have <code>eb_timestamp IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.CloudGaClntpf> fetchByEbTimestamp(Timestamp... values) {
        return fetch(CloudGaClntpf.CLOUD_GA_CLNTPF.EB_TIMESTAMP, values);
    }
}
