/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.enums.AccountStatus;
import com.unchartedpartners.databases.enums.AccountType;
import com.unchartedpartners.databases.enums.CompanyStatus;
import com.unchartedpartners.databases.tables.Company;
import com.unchartedpartners.databases.tables.records.CompanyRecord;

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
@Repository(value="baseCompanyDao")
@ConditionalOnMissingBean(name="companyDao")
public class CompanyDao extends BaseDaoImpl<CompanyRecord, com.unchartedpartners.databases.tables.pojos.Company, Long> {

    /**
     * Create a new CompanyDao without any configuration
     */
    public CompanyDao() {
        super(Company.COMPANY, com.unchartedpartners.databases.tables.pojos.Company.class);
    }

    /**
     * Create a new CompanyDao with an attached configuration
     */
    public CompanyDao(Configuration configuration) {
        super(Company.COMPANY, com.unchartedpartners.databases.tables.pojos.Company.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.Company object) {
        return object.getCompanyId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchById(Long... values) {
        return fetch(Company.COMPANY.ID, values);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByParentId(Long... values) {
        return fetch(Company.COMPANY.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByName(String... values) {
        return fetch(Company.COMPANY.NAME, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByType(AccountType... values) {
        return fetch(Company.COMPANY.TYPE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByStatus(AccountStatus... values) {
        return fetch(Company.COMPANY.STATUS, values);
    }

    /**
     * Fetch records that have <code>path IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByPath(String... values) {
        return fetch(Company.COMPANY.PATH, values);
    }

    /**
     * Fetch records that have <code>company_tag IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByCompanyTag(String... values) {
        return fetch(Company.COMPANY.COMPANY_TAG, values);
    }

    /**
     * Fetch records that have <code>ip_whitelist IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByIpWhitelist(Integer... values) {
        return fetch(Company.COMPANY.IP_WHITELIST, values);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByVersion(Long... values) {
        return fetch(Company.COMPANY.VERSION, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByDeleted(Boolean... values) {
        return fetch(Company.COMPANY.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByCreatedBy(Long... values) {
        return fetch(Company.COMPANY.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByCreated(Timestamp... values) {
        return fetch(Company.COMPANY.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByUpdatedBy(Long... values) {
        return fetch(Company.COMPANY.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByUpdated(Timestamp... values) {
        return fetch(Company.COMPANY.UPDATED, values);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByTxId(String... values) {
        return fetch(Company.COMPANY.TX_ID, values);
    }

    /**
     * Fetch records that have <code>audit_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByAuditId(Long... values) {
        return fetch(Company.COMPANY.AUDIT_ID, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByCompanyId(Long... values) {
        return fetch(Company.COMPANY.COMPANY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>company_id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.Company fetchOneByCompanyId(Long value) {
        return fetchOne(Company.COMPANY.COMPANY_ID, value);
    }

    /**
     * Fetch records that have <code>notes IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByNotes(String... values) {
        return fetch(Company.COMPANY.NOTES, values);
    }

    /**
     * Fetch records that have <code>nature_of_business IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByNatureOfBusiness(String... values) {
        return fetch(Company.COMPANY.NATURE_OF_BUSINESS, values);
    }

    /**
     * Fetch records that have <code>uen_no IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByUenNo(String... values) {
        return fetch(Company.COMPANY.UEN_NO, values);
    }

    /**
     * Fetch records that have <code>company_status IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByCompanyStatus(CompanyStatus... values) {
        return fetch(Company.COMPANY.COMPANY_STATUS, values);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByAddress(String... values) {
        return fetch(Company.COMPANY.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>postal_code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByPostalCode(String... values) {
        return fetch(Company.COMPANY.POSTAL_CODE, values);
    }

    /**
     * Fetch records that have <code>encrypted_password IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByEncryptedPassword(String... values) {
        return fetch(Company.COMPANY.ENCRYPTED_PASSWORD, values);
    }

    /**
     * Fetch records that have <code>braintree_customer_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByBraintreeCustomerId(String... values) {
        return fetch(Company.COMPANY.BRAINTREE_CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>braintree_token IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByBraintreeToken(String... values) {
        return fetch(Company.COMPANY.BRAINTREE_TOKEN, values);
    }

    /**
     * Fetch records that have <code>card_holder_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByCardHolderName(String... values) {
        return fetch(Company.COMPANY.CARD_HOLDER_NAME, values);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Company> fetchByCode(String... values) {
        return fetch(Company.COMPANY.CODE, values);
    }
}