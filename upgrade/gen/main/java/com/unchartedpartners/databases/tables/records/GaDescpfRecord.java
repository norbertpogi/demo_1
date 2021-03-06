/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.tables.GaDescpf;

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
public class GaDescpfRecord extends UpdatableRecordImpl<GaDescpfRecord> implements Record14<String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Long> {

    private static final long serialVersionUID = -2030116958;

    /**
     * Setter for <code>intest.ga_descpf.descpfx</code>.
     */
    public void setDescpfx(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.descpfx</code>.
     */
    public String getDescpfx() {
        return (String) get(0);
    }

    /**
     * Setter for <code>intest.ga_descpf.desccoy</code>.
     */
    public void setDesccoy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.desccoy</code>.
     */
    public String getDesccoy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.ga_descpf.desctabl</code>.
     */
    public void setDesctabl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.desctabl</code>.
     */
    public String getDesctabl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.ga_descpf.descitem</code>.
     */
    public void setDescitem(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.descitem</code>.
     */
    public String getDescitem() {
        return (String) get(3);
    }

    /**
     * Setter for <code>intest.ga_descpf.itemseq</code>.
     */
    public void setItemseq(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.itemseq</code>.
     */
    public String getItemseq() {
        return (String) get(4);
    }

    /**
     * Setter for <code>intest.ga_descpf.language</code>.
     */
    public void setLanguage(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.language</code>.
     */
    public String getLanguage() {
        return (String) get(5);
    }

    /**
     * Setter for <code>intest.ga_descpf.tranid</code>.
     */
    public void setTranid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.tranid</code>.
     */
    public String getTranid() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.ga_descpf.shortdesc</code>.
     */
    public void setShortdesc(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.shortdesc</code>.
     */
    public String getShortdesc() {
        return (String) get(7);
    }

    /**
     * Setter for <code>intest.ga_descpf.longdesc</code>.
     */
    public void setLongdesc(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.longdesc</code>.
     */
    public String getLongdesc() {
        return (String) get(8);
    }

    /**
     * Setter for <code>intest.ga_descpf.user_profile</code>.
     */
    public void setUserProfile(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.user_profile</code>.
     */
    public String getUserProfile() {
        return (String) get(9);
    }

    /**
     * Setter for <code>intest.ga_descpf.job_name</code>.
     */
    public void setJobName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.job_name</code>.
     */
    public String getJobName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>intest.ga_descpf.datime</code>.
     */
    public void setDatime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.datime</code>.
     */
    public Timestamp getDatime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>intest.ga_descpf.eb_timestamp</code>.
     */
    public void setEbTimestamp(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.eb_timestamp</code>.
     */
    public Timestamp getEbTimestamp() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>intest.ga_descpf.id</code>.
     */
    public void setId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.ga_descpf.id</code>.
     */
    public Long getId() {
        return (Long) get(13);
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
    public Row14<String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GaDescpf.GA_DESCPF.DESCPFX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GaDescpf.GA_DESCPF.DESCCOY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GaDescpf.GA_DESCPF.DESCTABL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GaDescpf.GA_DESCPF.DESCITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GaDescpf.GA_DESCPF.ITEMSEQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GaDescpf.GA_DESCPF.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GaDescpf.GA_DESCPF.TRANID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return GaDescpf.GA_DESCPF.SHORTDESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return GaDescpf.GA_DESCPF.LONGDESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return GaDescpf.GA_DESCPF.USER_PROFILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return GaDescpf.GA_DESCPF.JOB_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return GaDescpf.GA_DESCPF.DATIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return GaDescpf.GA_DESCPF.EB_TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return GaDescpf.GA_DESCPF.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getDescpfx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDesccoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDesctabl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescitem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getItemseq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTranid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getShortdesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLongdesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getUserProfile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getDatime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getEbTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDescpfx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDesccoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDesctabl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescitem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getItemseq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTranid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getShortdesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLongdesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getUserProfile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getDatime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getEbTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value1(String value) {
        setDescpfx(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value2(String value) {
        setDesccoy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value3(String value) {
        setDesctabl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value4(String value) {
        setDescitem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value5(String value) {
        setItemseq(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value6(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value7(String value) {
        setTranid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value8(String value) {
        setShortdesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value9(String value) {
        setLongdesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value10(String value) {
        setUserProfile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value11(String value) {
        setJobName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value12(Timestamp value) {
        setDatime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value13(Timestamp value) {
        setEbTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord value14(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaDescpfRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Timestamp value12, Timestamp value13, Long value14) {
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
     * Create a detached GaDescpfRecord
     */
    public GaDescpfRecord() {
        super(GaDescpf.GA_DESCPF);
    }

    /**
     * Create a detached, initialised GaDescpfRecord
     */
    public GaDescpfRecord(String descpfx, String desccoy, String desctabl, String descitem, String itemseq, String language, String tranid, String shortdesc, String longdesc, String userProfile, String jobName, Timestamp datime, Timestamp ebTimestamp, Long id) {
        super(GaDescpf.GA_DESCPF);

        set(0, descpfx);
        set(1, desccoy);
        set(2, desctabl);
        set(3, descitem);
        set(4, itemseq);
        set(5, language);
        set(6, tranid);
        set(7, shortdesc);
        set(8, longdesc);
        set(9, userProfile);
        set(10, jobName);
        set(11, datime);
        set(12, ebTimestamp);
        set(13, id);
    }
}
