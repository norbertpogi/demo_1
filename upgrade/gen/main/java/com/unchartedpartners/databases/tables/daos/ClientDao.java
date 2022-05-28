/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.Client;
import com.unchartedpartners.databases.tables.records.ClientRecord;

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
@Repository(value="baseClientDao")
@ConditionalOnMissingBean(name="clientDao")
public class ClientDao extends BaseDaoImpl<ClientRecord, com.unchartedpartners.databases.tables.pojos.Client, Long> {

    /**
     * Create a new ClientDao without any configuration
     */
    public ClientDao() {
        super(Client.CLIENT, com.unchartedpartners.databases.tables.pojos.Client.class);
    }

    /**
     * Create a new ClientDao with an attached configuration
     */
    public ClientDao(Configuration configuration) {
        super(Client.CLIENT, com.unchartedpartners.databases.tables.pojos.Client.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.Client object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchById(Long... values) {
        return fetch(Client.CLIENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.Client fetchOneById(Long value) {
        return fetchOne(Client.CLIENT.ID, value);
    }

    /**
     * Fetch records that have <code>short_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByShortName(String... values) {
        return fetch(Client.CLIENT.SHORT_NAME, values);
    }

    /**
     * Fetch records that have <code>full_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByFullName(String... values) {
        return fetch(Client.CLIENT.FULL_NAME, values);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByAddress(String... values) {
        return fetch(Client.CLIENT.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>postal_code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByPostalCode(String... values) {
        return fetch(Client.CLIENT.POSTAL_CODE, values);
    }

    /**
     * Fetch records that have <code>contact_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByContactName(String... values) {
        return fetch(Client.CLIENT.CONTACT_NAME, values);
    }

    /**
     * Fetch records that have <code>contact_email IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByContactEmail(String... values) {
        return fetch(Client.CLIENT.CONTACT_EMAIL, values);
    }

    /**
     * Fetch records that have <code>contact_number IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByContactNumber(String... values) {
        return fetch(Client.CLIENT.CONTACT_NUMBER, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByDeleted(Boolean... values) {
        return fetch(Client.CLIENT.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByCreatedBy(Long... values) {
        return fetch(Client.CLIENT.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByCreated(Timestamp... values) {
        return fetch(Client.CLIENT.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByUpdatedBy(Long... values) {
        return fetch(Client.CLIENT.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.Client> fetchByUpdated(Timestamp... values) {
        return fetch(Client.CLIENT.UPDATED, values);
    }
}