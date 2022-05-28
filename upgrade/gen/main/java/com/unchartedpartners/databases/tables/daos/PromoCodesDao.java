/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.PromoCodes;
import com.unchartedpartners.databases.tables.records.PromoCodesRecord;

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
@Repository(value="basePromoCodesDao")
@ConditionalOnMissingBean(name="promoCodesDao")
public class PromoCodesDao extends BaseDaoImpl<PromoCodesRecord, com.unchartedpartners.databases.tables.pojos.PromoCodes, Long> {

    /**
     * Create a new PromoCodesDao without any configuration
     */
    public PromoCodesDao() {
        super(PromoCodes.PROMO_CODES, com.unchartedpartners.databases.tables.pojos.PromoCodes.class);
    }

    /**
     * Create a new PromoCodesDao with an attached configuration
     */
    public PromoCodesDao(Configuration configuration) {
        super(PromoCodes.PROMO_CODES, com.unchartedpartners.databases.tables.pojos.PromoCodes.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.PromoCodes object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchById(Long... values) {
        return fetch(PromoCodes.PROMO_CODES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.PromoCodes fetchOneById(Long value) {
        return fetchOne(PromoCodes.PROMO_CODES.ID, value);
    }

    /**
     * Fetch records that have <code>promo_code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchByPromoCode(String... values) {
        return fetch(PromoCodes.PROMO_CODES.PROMO_CODE, values);
    }

    /**
     * Fetch records that have <code>discount IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchByDiscount(Double... values) {
        return fetch(PromoCodes.PROMO_CODES.DISCOUNT, values);
    }

    /**
     * Fetch records that have <code>start_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchByStartDate(Timestamp... values) {
        return fetch(PromoCodes.PROMO_CODES.START_DATE, values);
    }

    /**
     * Fetch records that have <code>expiry_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchByExpiryDate(Timestamp... values) {
        return fetch(PromoCodes.PROMO_CODES.EXPIRY_DATE, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchByDeleted(Boolean... values) {
        return fetch(PromoCodes.PROMO_CODES.DELETED, values);
    }

    /**
     * Fetch records that have <code>channel IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchByChannel(String... values) {
        return fetch(PromoCodes.PROMO_CODES.CHANNEL, values);
    }

    /**
     * Fetch records that have <code>max_uses IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchByMaxUses(Integer... values) {
        return fetch(PromoCodes.PROMO_CODES.MAX_USES, values);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchByProductId(Long... values) {
        return fetch(PromoCodes.PROMO_CODES.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>product_code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchByProductCode(String... values) {
        return fetch(PromoCodes.PROMO_CODES.PRODUCT_CODE, values);
    }

    /**
     * Fetch records that have <code>product_version IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.PromoCodes> fetchByProductVersion(Long... values) {
        return fetch(PromoCodes.PROMO_CODES.PRODUCT_VERSION, values);
    }
}