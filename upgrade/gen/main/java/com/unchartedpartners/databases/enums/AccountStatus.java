/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.enums;


import com.unchartedpartners.databases.Intest;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum AccountStatus implements EnumType {

    ACTIVE("ACTIVE"),

    DISABLED("DISABLED");

    private final String literal;

    private AccountStatus(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
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
    public String getName() {
        return "account_status";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
