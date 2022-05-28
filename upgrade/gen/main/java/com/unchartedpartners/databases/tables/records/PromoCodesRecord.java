/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.tables.PromoCodes;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PromoCodesRecord extends UpdatableRecordImpl<PromoCodesRecord> implements Record11<Long, String, Double, Timestamp, Timestamp, Boolean, String, Integer, Long, String, Long> {

    private static final long serialVersionUID = -1121507127;

    /**
     * Setter for <code>intest.promo_codes.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.promo_codes.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.promo_codes.promo_code</code>.
     */
    public void setPromoCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.promo_codes.promo_code</code>.
     */
    public String getPromoCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.promo_codes.discount</code>.
     */
    public void setDiscount(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.promo_codes.discount</code>.
     */
    public Double getDiscount() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>intest.promo_codes.start_date</code>.
     */
    public void setStartDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.promo_codes.start_date</code>.
     */
    public Timestamp getStartDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>intest.promo_codes.expiry_date</code>.
     */
    public void setExpiryDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.promo_codes.expiry_date</code>.
     */
    public Timestamp getExpiryDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>intest.promo_codes.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.promo_codes.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>intest.promo_codes.channel</code>.
     */
    public void setChannel(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.promo_codes.channel</code>.
     */
    public String getChannel() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.promo_codes.max_uses</code>.
     */
    public void setMaxUses(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.promo_codes.max_uses</code>.
     */
    public Integer getMaxUses() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>intest.promo_codes.product_id</code>.
     */
    public void setProductId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.promo_codes.product_id</code>.
     */
    public Long getProductId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>intest.promo_codes.product_code</code>.
     */
    public void setProductCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.promo_codes.product_code</code>.
     */
    public String getProductCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>intest.promo_codes.product_version</code>.
     */
    public void setProductVersion(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.promo_codes.product_version</code>.
     */
    public Long getProductVersion() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, Double, Timestamp, Timestamp, Boolean, String, Integer, Long, String, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, Double, Timestamp, Timestamp, Boolean, String, Integer, Long, String, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PromoCodes.PROMO_CODES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PromoCodes.PROMO_CODES.PROMO_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return PromoCodes.PROMO_CODES.DISCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return PromoCodes.PROMO_CODES.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return PromoCodes.PROMO_CODES.EXPIRY_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return PromoCodes.PROMO_CODES.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PromoCodes.PROMO_CODES.CHANNEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return PromoCodes.PROMO_CODES.MAX_USES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return PromoCodes.PROMO_CODES.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return PromoCodes.PROMO_CODES.PRODUCT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return PromoCodes.PROMO_CODES.PRODUCT_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPromoCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getDiscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getExpiryDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getMaxUses();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getProductCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getProductVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPromoCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getDiscount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getExpiryDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getMaxUses();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getProductCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getProductVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value2(String value) {
        setPromoCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value3(Double value) {
        setDiscount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value4(Timestamp value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value5(Timestamp value) {
        setExpiryDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value6(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value7(String value) {
        setChannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value8(Integer value) {
        setMaxUses(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value9(Long value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value10(String value) {
        setProductCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord value11(Long value) {
        setProductVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromoCodesRecord values(Long value1, String value2, Double value3, Timestamp value4, Timestamp value5, Boolean value6, String value7, Integer value8, Long value9, String value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PromoCodesRecord
     */
    public PromoCodesRecord() {
        super(PromoCodes.PROMO_CODES);
    }

    /**
     * Create a detached, initialised PromoCodesRecord
     */
    public PromoCodesRecord(Long id, String promoCode, Double discount, Timestamp startDate, Timestamp expiryDate, Boolean deleted, String channel, Integer maxUses, Long productId, String productCode, Long productVersion) {
        super(PromoCodes.PROMO_CODES);

        set(0, id);
        set(1, promoCode);
        set(2, discount);
        set(3, startDate);
        set(4, expiryDate);
        set(5, deleted);
        set(6, channel);
        set(7, maxUses);
        set(8, productId);
        set(9, productCode);
        set(10, productVersion);
    }
}
