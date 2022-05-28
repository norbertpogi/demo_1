/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.ChangeFormAppFile;
import com.unchartedpartners.databases.tables.records.ChangeFormAppFileRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
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
@Repository(value="baseChangeFormAppFileDao")
@ConditionalOnMissingBean(name="changeFormAppFileDao")
public class ChangeFormAppFileDao extends BaseDaoImpl<ChangeFormAppFileRecord, com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile, Record2<Long, Long>> {

    /**
     * Create a new ChangeFormAppFileDao without any configuration
     */
    public ChangeFormAppFileDao() {
        super(ChangeFormAppFile.CHANGE_FORM_APP_FILE, com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile.class);
    }

    /**
     * Create a new ChangeFormAppFileDao with an attached configuration
     */
    public ChangeFormAppFileDao(Configuration configuration) {
        super(ChangeFormAppFile.CHANGE_FORM_APP_FILE, com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Long, Long> getId(com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile object) {
        return compositeKeyRecord(object.getChangeFormAppId(), object.getDataFileId());
    }

    /**
     * Fetch records that have <code>change_form_app_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile> fetchByChangeFormAppId(Long... values) {
        return fetch(ChangeFormAppFile.CHANGE_FORM_APP_FILE.CHANGE_FORM_APP_ID, values);
    }

    /**
     * Fetch records that have <code>data_file_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile> fetchByDataFileId(Long... values) {
        return fetch(ChangeFormAppFile.CHANGE_FORM_APP_FILE.DATA_FILE_ID, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile> fetchByDeleted(Boolean... values) {
        return fetch(ChangeFormAppFile.CHANGE_FORM_APP_FILE.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile> fetchByCreatedBy(Long... values) {
        return fetch(ChangeFormAppFile.CHANGE_FORM_APP_FILE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile> fetchByCreated(Timestamp... values) {
        return fetch(ChangeFormAppFile.CHANGE_FORM_APP_FILE.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile> fetchByUpdatedBy(Long... values) {
        return fetch(ChangeFormAppFile.CHANGE_FORM_APP_FILE.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile> fetchByUpdated(Timestamp... values) {
        return fetch(ChangeFormAppFile.CHANGE_FORM_APP_FILE.UPDATED, values);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile> fetchByTxId(String... values) {
        return fetch(ChangeFormAppFile.CHANGE_FORM_APP_FILE.TX_ID, values);
    }

    /**
     * Fetch records that have <code>audit_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ChangeFormAppFile> fetchByAuditId(Long... values) {
        return fetch(ChangeFormAppFile.CHANGE_FORM_APP_FILE.AUDIT_ID, values);
    }
}
