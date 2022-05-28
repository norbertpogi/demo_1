/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.enums.ClaimType;
import com.unchartedpartners.databases.tables.records.DocumentArchiveRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class DocumentArchive extends TableImpl<DocumentArchiveRecord> {

    private static final long serialVersionUID = -2040044532;

    /**
     * The reference instance of <code>intest.document_archive</code>
     */
    public static final DocumentArchive DOCUMENT_ARCHIVE = new DocumentArchive();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DocumentArchiveRecord> getRecordType() {
        return DocumentArchiveRecord.class;
    }

    /**
     * The column <code>intest.document_archive.id</code>.
     */
    public final TableField<DocumentArchiveRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.document_archive_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.document_archive.data_file_ids</code>.
     */
    public final TableField<DocumentArchiveRecord, String> DATA_FILE_IDS = createField("data_file_ids", org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>intest.document_archive.policy_no</code>.
     */
    public final TableField<DocumentArchiveRecord, String> POLICY_NO = createField("policy_no", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.document_archive.reference_no</code>.
     */
    public final TableField<DocumentArchiveRecord, String> REFERENCE_NO = createField("reference_no", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>intest.document_archive.is_resubmit</code>.
     */
    public final TableField<DocumentArchiveRecord, Boolean> IS_RESUBMIT = createField("is_resubmit", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>intest.document_archive.member_nric</code>.
     */
    public final TableField<DocumentArchiveRecord, String> MEMBER_NRIC = createField("member_nric", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.document_archive.claim_type</code>.
     */
    public final TableField<DocumentArchiveRecord, ClaimType> CLAIM_TYPE = createField("claim_type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.ClaimType.class), this, "");

    /**
     * The column <code>intest.document_archive.deleted</code>.
     */
    public final TableField<DocumentArchiveRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>intest.document_archive.created_by</code>.
     */
    public final TableField<DocumentArchiveRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>intest.document_archive.created</code>.
     */
    public final TableField<DocumentArchiveRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>intest.document_archive</code> table reference
     */
    public DocumentArchive() {
        this(DSL.name("document_archive"), null);
    }

    /**
     * Create an aliased <code>intest.document_archive</code> table reference
     */
    public DocumentArchive(String alias) {
        this(DSL.name(alias), DOCUMENT_ARCHIVE);
    }

    /**
     * Create an aliased <code>intest.document_archive</code> table reference
     */
    public DocumentArchive(Name alias) {
        this(alias, DOCUMENT_ARCHIVE);
    }

    private DocumentArchive(Name alias, Table<DocumentArchiveRecord> aliased) {
        this(alias, aliased, null);
    }

    private DocumentArchive(Name alias, Table<DocumentArchiveRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Intest.INTEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DOCUMENT_ARCHIVE_FOR_CLAIM_UINDEX, Indexes.DOCUMENT_ARCHIVE_FOR_QUOTE_OR_POLICY_UINDEX, Indexes.DOCUMENT_ARCHIVE_ID_UINDEX, Indexes.DOCUMENT_ARCHIVE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DocumentArchiveRecord, Long> getIdentity() {
        return Keys.IDENTITY_DOCUMENT_ARCHIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DocumentArchiveRecord> getPrimaryKey() {
        return Keys.DOCUMENT_ARCHIVE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DocumentArchiveRecord>> getKeys() {
        return Arrays.<UniqueKey<DocumentArchiveRecord>>asList(Keys.DOCUMENT_ARCHIVE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentArchive as(String alias) {
        return new DocumentArchive(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentArchive as(Name alias) {
        return new DocumentArchive(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DocumentArchive rename(String name) {
        return new DocumentArchive(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DocumentArchive rename(Name name) {
        return new DocumentArchive(name, null);
    }
}
