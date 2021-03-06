/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.QuoteFileRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class QuoteFile extends TableImpl<QuoteFileRecord> {

    private static final long serialVersionUID = 983860590;

    /**
     * The reference instance of <code>intest.quote_file</code>
     */
    public static final QuoteFile QUOTE_FILE = new QuoteFile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QuoteFileRecord> getRecordType() {
        return QuoteFileRecord.class;
    }

    /**
     * The column <code>intest.quote_file.quote_id</code>.
     */
    public final TableField<QuoteFileRecord, Long> QUOTE_ID = createField("quote_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.quote_file.data_file_id</code>.
     */
    public final TableField<QuoteFileRecord, Long> DATA_FILE_ID = createField("data_file_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.quote_file.deleted</code>.
     */
    public final TableField<QuoteFileRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.quote_file.created_by</code>.
     */
    public final TableField<QuoteFileRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.quote_file.created</code>.
     */
    public final TableField<QuoteFileRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.quote_file.updated_by</code>.
     */
    public final TableField<QuoteFileRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.quote_file.updated</code>.
     */
    public final TableField<QuoteFileRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.quote_file.tx_id</code>.
     */
    public final TableField<QuoteFileRecord, String> TX_ID = createField("tx_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.quote_file.audit_id</code>.
     */
    public final TableField<QuoteFileRecord, Long> AUDIT_ID = createField("audit_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>intest.quote_file</code> table reference
     */
    public QuoteFile() {
        this(DSL.name("quote_file"), null);
    }

    /**
     * Create an aliased <code>intest.quote_file</code> table reference
     */
    public QuoteFile(String alias) {
        this(DSL.name(alias), QUOTE_FILE);
    }

    /**
     * Create an aliased <code>intest.quote_file</code> table reference
     */
    public QuoteFile(Name alias) {
        this(alias, QUOTE_FILE);
    }

    private QuoteFile(Name alias, Table<QuoteFileRecord> aliased) {
        this(alias, aliased, null);
    }

    private QuoteFile(Name alias, Table<QuoteFileRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.QUOTE_FILE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<QuoteFileRecord> getPrimaryKey() {
        return Keys.QUOTE_FILE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<QuoteFileRecord>> getKeys() {
        return Arrays.<UniqueKey<QuoteFileRecord>>asList(Keys.QUOTE_FILE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<QuoteFileRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<QuoteFileRecord, ?>>asList(Keys.QUOTE_FILE__QUOTE_FILE_QUOTE_ID_FKEY, Keys.QUOTE_FILE__QUOTE_FILE_DATA_FILE_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteFile as(String alias) {
        return new QuoteFile(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuoteFile as(Name alias) {
        return new QuoteFile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public QuoteFile rename(String name) {
        return new QuoteFile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public QuoteFile rename(Name name) {
        return new QuoteFile(name, null);
    }
}
