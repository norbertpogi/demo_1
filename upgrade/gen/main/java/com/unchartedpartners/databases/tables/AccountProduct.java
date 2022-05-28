/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables;


import com.unchartedpartners.databases.Indexes;
import com.unchartedpartners.databases.Intest;
import com.unchartedpartners.databases.Keys;
import com.unchartedpartners.databases.enums.AccountProductStatus;
import com.unchartedpartners.databases.tables.records.AccountProductRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class AccountProduct extends TableImpl<AccountProductRecord> {

    private static final long serialVersionUID = 1606124484;

    /**
     * The reference instance of <code>intest.account_product</code>
     */
    public static final AccountProduct ACCOUNT_PRODUCT = new AccountProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountProductRecord> getRecordType() {
        return AccountProductRecord.class;
    }

    /**
     * The column <code>intest.account_product.id</code>.
     */
    public final TableField<AccountProductRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('intest.account_product_id_seq1'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>intest.account_product.account_id</code>.
     */
    public final TableField<AccountProductRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.account_product.product_code</code>.
     */
    public final TableField<AccountProductRecord, String> PRODUCT_CODE = createField("product_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>intest.account_product.status</code>.
     */
    public final TableField<AccountProductRecord, AccountProductStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.unchartedpartners.databases.enums.AccountProductStatus.class), this, "");

    /**
     * The column <code>intest.account_product.deleted</code>.
     */
    public final TableField<AccountProductRecord, Boolean> DELETED = createField("deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>intest.account_product.created_by</code>.
     */
    public final TableField<AccountProductRecord, Long> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.account_product.created</code>.
     */
    public final TableField<AccountProductRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.account_product.updated_by</code>.
     */
    public final TableField<AccountProductRecord, Long> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>intest.account_product.updated</code>.
     */
    public final TableField<AccountProductRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>intest.account_product.tx_id</code>.
     */
    public final TableField<AccountProductRecord, String> TX_ID = createField("tx_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>intest.account_product.audit_id</code>.
     */
    public final TableField<AccountProductRecord, Long> AUDIT_ID = createField("audit_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>intest.account_product</code> table reference
     */
    public AccountProduct() {
        this(DSL.name("account_product"), null);
    }

    /**
     * Create an aliased <code>intest.account_product</code> table reference
     */
    public AccountProduct(String alias) {
        this(DSL.name(alias), ACCOUNT_PRODUCT);
    }

    /**
     * Create an aliased <code>intest.account_product</code> table reference
     */
    public AccountProduct(Name alias) {
        this(alias, ACCOUNT_PRODUCT);
    }

    private AccountProduct(Name alias, Table<AccountProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private AccountProduct(Name alias, Table<AccountProductRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACCOUNT_PRODUCT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AccountProductRecord, Long> getIdentity() {
        return Keys.IDENTITY_ACCOUNT_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccountProductRecord> getPrimaryKey() {
        return Keys.ACCOUNT_PRODUCT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccountProductRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountProductRecord>>asList(Keys.ACCOUNT_PRODUCT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AccountProductRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AccountProductRecord, ?>>asList(Keys.ACCOUNT_PRODUCT__ACCOUNT_PRODUCT_ACCOUNT_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountProduct as(String alias) {
        return new AccountProduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountProduct as(Name alias) {
        return new AccountProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountProduct rename(String name) {
        return new AccountProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountProduct rename(Name name) {
        return new AccountProduct(name, null);
    }
}
