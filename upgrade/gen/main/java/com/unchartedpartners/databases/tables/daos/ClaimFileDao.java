/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.ClaimFile;
import com.unchartedpartners.databases.tables.records.ClaimFileRecord;

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
@Repository(value="baseClaimFileDao")
@ConditionalOnMissingBean(name="claimFileDao")
public class ClaimFileDao extends BaseDaoImpl<ClaimFileRecord, com.unchartedpartners.databases.tables.pojos.ClaimFile, Record2<Long, Long>> {

    /**
     * Create a new ClaimFileDao without any configuration
     */
    public ClaimFileDao() {
        super(ClaimFile.CLAIM_FILE, com.unchartedpartners.databases.tables.pojos.ClaimFile.class);
    }

    /**
     * Create a new ClaimFileDao with an attached configuration
     */
    public ClaimFileDao(Configuration configuration) {
        super(ClaimFile.CLAIM_FILE, com.unchartedpartners.databases.tables.pojos.ClaimFile.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Long, Long> getId(com.unchartedpartners.databases.tables.pojos.ClaimFile object) {
        return compositeKeyRecord(object.getClaimId(), object.getDataFileId());
    }

    /**
     * Fetch records that have <code>claim_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ClaimFile> fetchByClaimId(Long... values) {
        return fetch(ClaimFile.CLAIM_FILE.CLAIM_ID, values);
    }

    /**
     * Fetch records that have <code>data_file_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ClaimFile> fetchByDataFileId(Long... values) {
        return fetch(ClaimFile.CLAIM_FILE.DATA_FILE_ID, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ClaimFile> fetchByDeleted(Boolean... values) {
        return fetch(ClaimFile.CLAIM_FILE.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ClaimFile> fetchByCreatedBy(Long... values) {
        return fetch(ClaimFile.CLAIM_FILE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ClaimFile> fetchByCreated(Timestamp... values) {
        return fetch(ClaimFile.CLAIM_FILE.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ClaimFile> fetchByUpdatedBy(Long... values) {
        return fetch(ClaimFile.CLAIM_FILE.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ClaimFile> fetchByUpdated(Timestamp... values) {
        return fetch(ClaimFile.CLAIM_FILE.UPDATED, values);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ClaimFile> fetchByTxId(String... values) {
        return fetch(ClaimFile.CLAIM_FILE.TX_ID, values);
    }

    /**
     * Fetch records that have <code>audit_id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ClaimFile> fetchByAuditId(Long... values) {
        return fetch(ClaimFile.CLAIM_FILE.AUDIT_ID, values);
    }
}
