/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.enums.SignerStatus;
import com.unchartedpartners.databases.tables.records.KofaxDocumentSignStatusRecord;

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
public class KofaxDocumentSignStatus extends TableImpl<KofaxDocumentSignStatusRecord> {

    private static final long serialVersionUID = -1527585668;

    /**
     * The reference instance of <code>intest.kofax_document_sign_status</code>
     */
    public static final KofaxDocumentSignStatus KOFAX_DOCUMENT_SIGN_STATUS = new KofaxDocumentSignStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KofaxDocumentSignStatusRecord> getRecordType() {
        return KofaxDocumentSignStatusRecord.class;
    }

    /**
     * The column <code>intest.kofax_document_sign_status.id</code>.
     */
    public final TableField<KofaxDocumentSignStatusRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.kofax_document_sign_status_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.kofax_document_sign_status.document_id</code>.
     */
    public final TableField<KofaxDocumentSignStatusRecord, String> DOCUMENT_ID = createField("document_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.kofax_document_sign_status.package_id</code>.
     */
    public final TableField<KofaxDocumentSignStatusRecord, String> PACKAGE_ID = createField("package_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.kofax_document_sign_status.request_id</code>.
     */
    public final TableField<KofaxDocumentSignStatusRecord, String> REQUEST_ID = createField("request_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.kofax_document_sign_status.file_name</code>.
     */
    public final TableField<KofaxDocumentSignStatusRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.kofax_document_sign_status.signer_name</code>.
     */
    public final TableField<KofaxDocumentSignStatusRecord, String> SIGNER_NAME = createField("signer_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.kofax_document_sign_status.signer_id</code>.
     */
    public final TableField<KofaxDocumentSignStatusRecord, String> SIGNER_ID = createField("signer_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.kofax_document_sign_status.signer_status</code>.
     */
    public final TableField<KofaxDocumentSignStatusRecord, SignerStatus> SIGNER_STATUS = createField("signer_status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.SignerStatus.class), this, "");

    /**
     * The column <code>intest.kofax_document_sign_status.created</code>.
     */
    public final TableField<KofaxDocumentSignStatusRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.kofax_document_sign_status.updated</code>.
     */
    public final TableField<KofaxDocumentSignStatusRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>intest.kofax_document_sign_status</code> table reference
     */
    public KofaxDocumentSignStatus() {
        this(DSL.name("kofax_document_sign_status"), null);
    }

    /**
     * Create an aliased <code>intest.kofax_document_sign_status</code> table reference
     */
    public KofaxDocumentSignStatus(String alias) {
        this(DSL.name(alias), KOFAX_DOCUMENT_SIGN_STATUS);
    }

    /**
     * Create an aliased <code>intest.kofax_document_sign_status</code> table reference
     */
    public KofaxDocumentSignStatus(Name alias) {
        this(alias, KOFAX_DOCUMENT_SIGN_STATUS);
    }

    private KofaxDocumentSignStatus(Name alias, Table<KofaxDocumentSignStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private KofaxDocumentSignStatus(Name alias, Table<KofaxDocumentSignStatusRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.KOFAX_DOCUMENT_SIGN_STATUS_IND, Indexes.KOFAX_DOCUMENT_SIGN_STATUS_PACKAGE_ID_KEY, Indexes.KOFAX_DOCUMENT_SIGN_STATUS_PKEY, Indexes.KOFAX_DOCUMENT_SIGN_STATUS_REQUEST_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<KofaxDocumentSignStatusRecord, Long> getIdentity() {
        return Keys.IDENTITY_KOFAX_DOCUMENT_SIGN_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<KofaxDocumentSignStatusRecord> getPrimaryKey() {
        return Keys.KOFAX_DOCUMENT_SIGN_STATUS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<KofaxDocumentSignStatusRecord>> getKeys() {
        return Arrays.<UniqueKey<KofaxDocumentSignStatusRecord>>asList(Keys.KOFAX_DOCUMENT_SIGN_STATUS_PKEY, Keys.KOFAX_DOCUMENT_SIGN_STATUS_PACKAGE_ID_KEY, Keys.KOFAX_DOCUMENT_SIGN_STATUS_REQUEST_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KofaxDocumentSignStatus as(String alias) {
        return new KofaxDocumentSignStatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KofaxDocumentSignStatus as(Name alias) {
        return new KofaxDocumentSignStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public KofaxDocumentSignStatus rename(String name) {
        return new KofaxDocumentSignStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public KofaxDocumentSignStatus rename(Name name) {
        return new KofaxDocumentSignStatus(name, null);
    }
}
