/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.tables.GaZatrpf;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class GaZatrpfRecord extends UpdatableRecordImpl<GaZatrpfRecord> implements Record16<Long, String, String, String, Integer, String, String, String, Integer, Integer, Integer, String, String, Timestamp, Long, Timestamp> {

    private static final long serialVersionUID = 715694872;

    /**
     * Setter for <code>intest.ga_zatrpf.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.agntcoy</code>.
     */
    public void setAgntcoy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.agntcoy</code>.
     */
    public String getAgntcoy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.agntnum</code>.
     */
    public void setAgntnum(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.agntnum</code>.
     */
    public String getAgntnum() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.zagedcd</code>.
     */
    public void setZagedcd(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.zagedcd</code>.
     */
    public String getZagedcd() {
        return (String) get(3);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.zageddt</code>.
     */
    public void setZageddt(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.zageddt</code>.
     */
    public Integer getZageddt() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.zagedsf</code>.
     */
    public void setZagedsf(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.zagedsf</code>.
     */
    public String getZagedsf() {
        return (String) get(5);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.zagedrs</code>.
     */
    public void setZagedrs(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.zagedrs</code>.
     */
    public String getZagedrs() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.termid</code>.
     */
    public void setTermid(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.termid</code>.
     */
    public String getTermid() {
        return (String) get(7);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.user</code>.
     */
    public void setUser(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.user</code>.
     */
    public Integer getUser() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.transaction_date</code>.
     */
    public void setTransactionDate(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.transaction_date</code>.
     */
    public Integer getTransactionDate() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.transaction_time</code>.
     */
    public void setTransactionTime(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.transaction_time</code>.
     */
    public Integer getTransactionTime() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.user_profile</code>.
     */
    public void setUserProfile(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.user_profile</code>.
     */
    public String getUserProfile() {
        return (String) get(11);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.job_name</code>.
     */
    public void setJobName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.job_name</code>.
     */
    public String getJobName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.datime</code>.
     */
    public void setDatime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.datime</code>.
     */
    public Timestamp getDatime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.rrn</code>.
     */
    public void setRrn(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.rrn</code>.
     */
    public Long getRrn() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>intest.ga_zatrpf.eb_timestamp</code>.
     */
    public void setEbTimestamp(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>intest.ga_zatrpf.eb_timestamp</code>.
     */
    public Timestamp getEbTimestamp() {
        return (Timestamp) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, Integer, String, String, String, Integer, Integer, Integer, String, String, Timestamp, Long, Timestamp> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, Integer, String, String, String, Integer, Integer, Integer, String, String, Timestamp, Long, Timestamp> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return GaZatrpf.GA_ZATRPF.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GaZatrpf.GA_ZATRPF.AGNTCOY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GaZatrpf.GA_ZATRPF.AGNTNUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GaZatrpf.GA_ZATRPF.ZAGEDCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return GaZatrpf.GA_ZATRPF.ZAGEDDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GaZatrpf.GA_ZATRPF.ZAGEDSF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GaZatrpf.GA_ZATRPF.ZAGEDRS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return GaZatrpf.GA_ZATRPF.TERMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return GaZatrpf.GA_ZATRPF.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return GaZatrpf.GA_ZATRPF.TRANSACTION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return GaZatrpf.GA_ZATRPF.TRANSACTION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return GaZatrpf.GA_ZATRPF.USER_PROFILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return GaZatrpf.GA_ZATRPF.JOB_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return GaZatrpf.GA_ZATRPF.DATIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return GaZatrpf.GA_ZATRPF.RRN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return GaZatrpf.GA_ZATRPF.EB_TIMESTAMP;
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
        return getAgntcoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAgntnum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getZagedcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getZageddt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getZagedsf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getZagedrs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getTermid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getTransactionDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getTransactionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getUserProfile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getDatime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component15() {
        return getRrn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getEbTimestamp();
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
        return getAgntcoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAgntnum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getZagedcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getZageddt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getZagedsf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getZagedrs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTermid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getTransactionDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getTransactionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getUserProfile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getDatime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getRrn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getEbTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value2(String value) {
        setAgntcoy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value3(String value) {
        setAgntnum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value4(String value) {
        setZagedcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value5(Integer value) {
        setZageddt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value6(String value) {
        setZagedsf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value7(String value) {
        setZagedrs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value8(String value) {
        setTermid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value9(Integer value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value10(Integer value) {
        setTransactionDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value11(Integer value) {
        setTransactionTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value12(String value) {
        setUserProfile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value13(String value) {
        setJobName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value14(Timestamp value) {
        setDatime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value15(Long value) {
        setRrn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord value16(Timestamp value) {
        setEbTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaZatrpfRecord values(Long value1, String value2, String value3, String value4, Integer value5, String value6, String value7, String value8, Integer value9, Integer value10, Integer value11, String value12, String value13, Timestamp value14, Long value15, Timestamp value16) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GaZatrpfRecord
     */
    public GaZatrpfRecord() {
        super(GaZatrpf.GA_ZATRPF);
    }

    /**
     * Create a detached, initialised GaZatrpfRecord
     */
    public GaZatrpfRecord(Long id, String agntcoy, String agntnum, String zagedcd, Integer zageddt, String zagedsf, String zagedrs, String termid, Integer user, Integer transactionDate, Integer transactionTime, String userProfile, String jobName, Timestamp datime, Long rrn, Timestamp ebTimestamp) {
        super(GaZatrpf.GA_ZATRPF);

        set(0, id);
        set(1, agntcoy);
        set(2, agntnum);
        set(3, zagedcd);
        set(4, zageddt);
        set(5, zagedsf);
        set(6, zagedrs);
        set(7, termid);
        set(8, user);
        set(9, transactionDate);
        set(10, transactionTime);
        set(11, userProfile);
        set(12, jobName);
        set(13, datime);
        set(14, rrn);
        set(15, ebTimestamp);
    }
}
