/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.daos;


import com.unchartedpartners.dao.BaseDaoImpl;
import com.unchartedpartners.databases.tables.ContractHeader;
import com.unchartedpartners.databases.tables.records.ContractHeaderRecord;

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
@Repository(value="baseContractHeaderDao")
@ConditionalOnMissingBean(name="contractHeaderDao")
public class ContractHeaderDao extends BaseDaoImpl<ContractHeaderRecord, com.unchartedpartners.databases.tables.pojos.ContractHeader, Long> {

    /**
     * Create a new ContractHeaderDao without any configuration
     */
    public ContractHeaderDao() {
        super(ContractHeader.CONTRACT_HEADER, com.unchartedpartners.databases.tables.pojos.ContractHeader.class);
    }

    /**
     * Create a new ContractHeaderDao with an attached configuration
     */
    public ContractHeaderDao(Configuration configuration) {
        super(ContractHeader.CONTRACT_HEADER, com.unchartedpartners.databases.tables.pojos.ContractHeader.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.unchartedpartners.databases.tables.pojos.ContractHeader object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchById(Long... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.unchartedpartners.databases.tables.pojos.ContractHeader fetchOneById(Long value) {
        return fetchOne(ContractHeader.CONTRACT_HEADER.ID, value);
    }

    /**
     * Fetch records that have <code>contract_code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByContractCode(String... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.CONTRACT_CODE, values);
    }

    /**
     * Fetch records that have <code>contract_name IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByContractName(String... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.CONTRACT_NAME, values);
    }

    /**
     * Fetch records that have <code>contract_version IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByContractVersion(Long... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.CONTRACT_VERSION, values);
    }

    /**
     * Fetch records that have <code>contract_ref_no IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByContractRefNo(String... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.CONTRACT_REF_NO, values);
    }

    /**
     * Fetch records that have <code>client_code IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByClientCode(String... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.CLIENT_CODE, values);
    }

    /**
     * Fetch records that have <code>contract_start_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByContractStartDate(Timestamp... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.CONTRACT_START_DATE, values);
    }

    /**
     * Fetch records that have <code>contract_end_date IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByContractEndDate(Timestamp... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.CONTRACT_END_DATE, values);
    }

    /**
     * Fetch records that have <code>system_config IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchBySystemConfig(Map... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.SYSTEM_CONFIG, values);
    }

    /**
     * Fetch records that have <code>report_config IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByReportConfig(Map... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.REPORT_CONFIG, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByDeleted(Boolean... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.DELETED, values);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByCreatedBy(Long... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByCreated(Timestamp... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByUpdatedBy(Long... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchByUpdated(Timestamp... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.UPDATED, values);
    }

    /**
     * Fetch records that have <code>subsidiary_no IN (values)</code>
     */
    public List<com.unchartedpartners.databases.tables.pojos.ContractHeader> fetchBySubsidiaryNo(String... values) {
        return fetch(ContractHeader.CONTRACT_HEADER.SUBSIDIARY_NO, values);
    }
}
