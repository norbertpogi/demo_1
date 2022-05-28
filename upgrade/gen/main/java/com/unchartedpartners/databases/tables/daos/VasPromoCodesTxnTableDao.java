/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.VasPromoCodesTxnTable;
import com.unchartedpartners.databases.tables.records.VasPromoCodesTxnTableRecord;

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
@Repository(value="baseVasPromoCodesTxnTableDao")
@ConditionalOnMissingBean(name="vasPromoCodesTxnTableDao")
public class VasPromoCodesTxnTableDao extends BaseDaoImpl<VasPromoCodesTxnTableRecord, com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable, Long> {

    /**
     * Create a new VasPromoCodesTxnTableDao without any configuration
     */
    public VasPromoCodesTxnTableDao() {
        super(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE, com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable.class);
    }

    /**
     * Create a new VasPromoCodesTxnTableDao with an attached configuration
     */
    public VasPromoCodesTxnTableDao(Configuration configuration) {
        super(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE, com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable> fetchById(Long... values) {
        return fetch(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable fetchOneById(Long value) {
        return fetchOne(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.ID, value);
    }

    /**
     * Fetch records that have <code>merchant_code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable> fetchByMerchantCode(String... values) {
        return fetch(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.MERCHANT_CODE, values);
    }

    /**
     * Fetch records that have <code>promo_code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable> fetchByPromoCode(String... values) {
        return fetch(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.PROMO_CODE, values);
    }

    /**
     * Fetch records that have <code>person_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable> fetchByPersonId(Long... values) {
        return fetch(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.PERSON_ID, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable> fetchByCompanyId(Long... values) {
        return fetch(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable> fetchByDeleted(Boolean... values) {
        return fetch(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable> fetchByCreatedBy(Long... values) {
        return fetch(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable> fetchByCreated(Timestamp... values) {
        return fetch(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable> fetchByUpdatedBy(Long... values) {
        return fetch(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.VasPromoCodesTxnTable> fetchByUpdated(Timestamp... values) {
        return fetch(VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE.UPDATED, values);
    }
}
