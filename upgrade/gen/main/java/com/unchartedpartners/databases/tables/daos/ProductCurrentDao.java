/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.ProductCurrent;
import com.unchartedpartners.databases.tables.records.ProductCurrentRecord;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

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
@Repository(value="baseProductCurrentDao")
@ConditionalOnMissingBean(name="productCurrentDao")
public class ProductCurrentDao extends BaseDaoImpl<ProductCurrentRecord, com.unchartedpartners.databases.tables.pojos.ProductCurrent, Long> {

    /**
     * Create a new ProductCurrentDao without any configuration
     */
    public ProductCurrentDao() {
        super(ProductCurrent.PRODUCT_CURRENT, com.unchartedpartners.databases.tables.pojos.ProductCurrent.class);
    }

    /**
     * Create a new ProductCurrentDao with an attached configuration
     */
    public ProductCurrentDao(Configuration configuration) {
        super(ProductCurrent.PRODUCT_CURRENT, com.unchartedpartners.databases.tables.pojos.ProductCurrent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.ProductCurrent object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchById(Long... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.ProductCurrent fetchOneById(Long value) {
        return fetchOne(ProductCurrent.PRODUCT_CURRENT.ID, value);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByCode(String... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.CODE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByName(String... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.NAME, values);
    }

    /**
     * Fetch records that have <code>effective_version IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByEffectiveVersion(Long... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.EFFECTIVE_VERSION, values);
    }

    /**
     * Fetch records that have <code>config IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByConfig(Map... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.CONFIG, values);
    }

    /**
     * Fetch records that have <code>effective_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByEffectiveDate(Timestamp... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.EFFECTIVE_DATE, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByDeleted(Boolean... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByCreatedBy(Long... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByCreated(Timestamp... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByUpdatedBy(Long... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByUpdated(Timestamp... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.UPDATED, values);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByTxId(String... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.TX_ID, values);
    }

    /**
     * Fetch records that have <code>audit_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ProductCurrent> fetchByAuditId(Long... values) {
        return fetch(ProductCurrent.PRODUCT_CURRENT.AUDIT_ID, values);
    }
}
