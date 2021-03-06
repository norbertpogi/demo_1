/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.tables.records.ProductCurrentRecord;
import com.unchartedpartners.jooq.PostgresJsonMapBinder;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class ProductCurrent extends TableImpl<ProductCurrentRecord> {

    private static final long serialVersionUID = 1182284873;

    /**
     * The reference instance of <code>intest.product_current</code>
     */
    public static final ProductCurrent PRODUCT_CURRENT = new ProductCurrent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductCurrentRecord> getRecordType() {
        return ProductCurrentRecord.class;
    }

    /**
     * The column <code>intest.product_current.id</code>.
     */
    public final TableField<ProductCurrentRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>intest.product_current.code</code>.
     */
    public final TableField<ProductCurrentRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>intest.product_current.name</code>.
     */
    public final TableField<ProductCurrentRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.product_current.effective_version</code>.
     */
    public final TableField<ProductCurrentRecord, Long> EFFECTIVE_VERSION = createField("effective_version", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>intest.product_current.config</code>.
     */
    public final TableField<ProductCurrentRecord, Map> CONFIG = createField("config", org.jooq.impl.SQLDataType.OTHER, this, "", new PostgresJsonMapBinder());

    /**
     * The column <code>intest.product_current.effective_date</code>.
     */
    public final TableField<ProductCurrentRecord, Timestamp> EFFECTIVE_DATE = createField("effective_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.product_current.deleted</code>.
     */
    public final TableField<ProductCurrentRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>intest.product_current.created_by</code>.
     */
    public final TableField<ProductCurrentRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>intest.product_current.created</code>.
     */
    public final TableField<ProductCurrentRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.product_current.updated_by</code>.
     */
    public final TableField<ProductCurrentRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>intest.product_current.updated</code>.
     */
    public final TableField<ProductCurrentRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>intest.product_current.tx_id</code>.
     */
    public final TableField<ProductCurrentRecord, String> TX_ID = createField("tx_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>intest.product_current.audit_id</code>.
     */
    public final TableField<ProductCurrentRecord, Long> AUDIT_ID = createField("audit_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>intest.product_current</code> table reference
     */
    public ProductCurrent() {
        this(DSL.name("product_current"), null);
    }

    /**
     * Create an aliased <code>intest.product_current</code> table reference
     */
    public ProductCurrent(String alias) {
        this(DSL.name(alias), PRODUCT_CURRENT);
    }

    /**
     * Create an aliased <code>intest.product_current</code> table reference
     */
    public ProductCurrent(Name alias) {
        this(alias, PRODUCT_CURRENT);
    }

    private ProductCurrent(Name alias, Table<ProductCurrentRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProductCurrent(Name alias, Table<ProductCurrentRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ProductCurrentRecord> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_PRODUCT_CURRENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductCurrentRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductCurrentRecord>>asList(Keys.SYNTHETIC_PK_PRODUCT_CURRENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCurrent as(String alias) {
        return new ProductCurrent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCurrent as(Name alias) {
        return new ProductCurrent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductCurrent rename(String name) {
        return new ProductCurrent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductCurrent rename(Name name) {
        return new ProductCurrent(name, null);
    }
}
