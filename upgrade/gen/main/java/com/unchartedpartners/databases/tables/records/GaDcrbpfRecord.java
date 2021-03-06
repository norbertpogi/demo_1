/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.tables.GaDcrbpf;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class GaDcrbpfRecord extends UpdatableRecordImpl<GaDcrbpfRecord> implements Record14<Long, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1800121180;

    /**
     * Setter for <code>intest.ga_dcrbpf.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.clntpfx</code>.
     */
    public void setClntpfx(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.clntpfx</code>.
     */
    public String getClntpfx() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.clntcoy</code>.
     */
    public void setClntcoy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.clntcoy</code>.
     */
    public String getClntcoy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.clntnum</code>.
     */
    public void setClntnum(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.clntnum</code>.
     */
    public String getClntnum() {
        return (String) get(3);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.bankkey01</code>.
     */
    public void setBankkey01(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.bankkey01</code>.
     */
    public String getBankkey01() {
        return (String) get(4);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.bankkey02</code>.
     */
    public void setBankkey02(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.bankkey02</code>.
     */
    public String getBankkey02() {
        return (String) get(5);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.bankkey03</code>.
     */
    public void setBankkey03(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.bankkey03</code>.
     */
    public String getBankkey03() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.bnkackey01</code>.
     */
    public void setBnkackey01(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.bnkackey01</code>.
     */
    public String getBnkackey01() {
        return (String) get(7);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.bnkackey02</code>.
     */
    public void setBnkackey02(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.bnkackey02</code>.
     */
    public String getBnkackey02() {
        return (String) get(8);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.bnkackey03</code>.
     */
    public void setBnkackey03(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.bnkackey03</code>.
     */
    public String getBnkackey03() {
        return (String) get(9);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.user_profile</code>.
     */
    public void setUserProfile(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.user_profile</code>.
     */
    public String getUserProfile() {
        return (String) get(10);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.job_name</code>.
     */
    public void setJobName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.job_name</code>.
     */
    public String getJobName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.datime</code>.
     */
    public void setDatime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.datime</code>.
     */
    public Timestamp getDatime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>intest.ga_dcrbpf.eb_timestamp</code>.
     */
    public void setEbTimestamp(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.ga_dcrbpf.eb_timestamp</code>.
     */
    public Timestamp getEbTimestamp() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return GaDcrbpf.GA_DCRBPF.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GaDcrbpf.GA_DCRBPF.CLNTPFX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GaDcrbpf.GA_DCRBPF.CLNTCOY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GaDcrbpf.GA_DCRBPF.CLNTNUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GaDcrbpf.GA_DCRBPF.BANKKEY01;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GaDcrbpf.GA_DCRBPF.BANKKEY02;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GaDcrbpf.GA_DCRBPF.BANKKEY03;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return GaDcrbpf.GA_DCRBPF.BNKACKEY01;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return GaDcrbpf.GA_DCRBPF.BNKACKEY02;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return GaDcrbpf.GA_DCRBPF.BNKACKEY03;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return GaDcrbpf.GA_DCRBPF.USER_PROFILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return GaDcrbpf.GA_DCRBPF.JOB_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return GaDcrbpf.GA_DCRBPF.DATIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return GaDcrbpf.GA_DCRBPF.EB_TIMESTAMP;
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
        return getClntpfx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getClntcoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getClntnum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBankkey01();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getBankkey02();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBankkey03();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getBnkackey01();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBnkackey02();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getBnkackey03();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getUserProfile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getDatime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
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
        return getClntpfx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getClntcoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getClntnum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBankkey01();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBankkey02();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBankkey03();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getBnkackey01();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBnkackey02();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBnkackey03();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getUserProfile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getDatime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getEbTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value2(String value) {
        setClntpfx(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value3(String value) {
        setClntcoy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value4(String value) {
        setClntnum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value5(String value) {
        setBankkey01(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value6(String value) {
        setBankkey02(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value7(String value) {
        setBankkey03(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value8(String value) {
        setBnkackey01(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value9(String value) {
        setBnkackey02(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value10(String value) {
        setBnkackey03(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value11(String value) {
        setUserProfile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value12(String value) {
        setJobName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value13(Timestamp value) {
        setDatime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord value14(Timestamp value) {
        setEbTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDcrbpfRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Timestamp value13, Timestamp value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GaDcrbpfRecord
     */
    public GaDcrbpfRecord() {
        super(GaDcrbpf.GA_DCRBPF);
    }

    /**
     * Create a detached, initialised GaDcrbpfRecord
     */
    public GaDcrbpfRecord(Long id, String clntpfx, String clntcoy, String clntnum, String bankkey01, String bankkey02, String bankkey03, String bnkackey01, String bnkackey02, String bnkackey03, String userProfile, String jobName, Timestamp datime, Timestamp ebTimestamp) {
        super(GaDcrbpf.GA_DCRBPF);

        set(0, id);
        set(1, clntpfx);
        set(2, clntcoy);
        set(3, clntnum);
        set(4, bankkey01);
        set(5, bankkey02);
        set(6, bankkey03);
        set(7, bnkackey01);
        set(8, bnkackey02);
        set(9, bnkackey03);
        set(10, userProfile);
        set(11, jobName);
        set(12, datime);
        set(13, ebTimestamp);
    }
}
