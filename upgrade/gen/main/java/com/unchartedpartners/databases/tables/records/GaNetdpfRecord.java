/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.tables.GaNetdpf;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class GaNetdpfRecord extends UpdatableRecordImpl<GaNetdpfRecord> implements Record21<String, String, String, String, Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Long, Timestamp, Long> {

    private static final long serialVersionUID = -160656642;

    /**
     * Setter for <code>intest.ga_netdpf.chdrcoy</code>.
     */
    public void setChdrcoy(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.chdrcoy</code>.
     */
    public String getChdrcoy() {
        return (String) get(0);
    }

    /**
     * Setter for <code>intest.ga_netdpf.provnet</code>.
     */
    public void setProvnet(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.provnet</code>.
     */
    public String getProvnet() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.ga_netdpf.clntcoy</code>.
     */
    public void setClntcoy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.clntcoy</code>.
     */
    public String getClntcoy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.ga_netdpf.provorg</code>.
     */
    public void setProvorg(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.provorg</code>.
     */
    public String getProvorg() {
        return (String) get(3);
    }

    /**
     * Setter for <code>intest.ga_netdpf.strtdt</code>.
     */
    public void setStrtdt(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.strtdt</code>.
     */
    public Integer getStrtdt() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>intest.ga_netdpf.enddt</code>.
     */
    public void setEnddt(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.enddt</code>.
     */
    public Integer getEnddt() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>intest.ga_netdpf.pos</code>.
     */
    public void setPos(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.pos</code>.
     */
    public String getPos() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.ga_netdpf.provcap</code>.
     */
    public void setProvcap(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.provcap</code>.
     */
    public String getProvcap() {
        return (String) get(7);
    }

    /**
     * Setter for <code>intest.ga_netdpf.clamtype</code>.
     */
    public void setClamtype(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.clamtype</code>.
     */
    public String getClamtype() {
        return (String) get(8);
    }

    /**
     * Setter for <code>intest.ga_netdpf.netlevel</code>.
     */
    public void setNetlevel(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.netlevel</code>.
     */
    public String getNetlevel() {
        return (String) get(9);
    }

    /**
     * Setter for <code>intest.ga_netdpf.feeschid</code>.
     */
    public void setFeeschid(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.feeschid</code>.
     */
    public String getFeeschid() {
        return (String) get(10);
    }

    /**
     * Setter for <code>intest.ga_netdpf.paycoy</code>.
     */
    public void setPaycoy(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.paycoy</code>.
     */
    public String getPaycoy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>intest.ga_netdpf.payclt</code>.
     */
    public void setPayclt(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.payclt</code>.
     */
    public String getPayclt() {
        return (String) get(12);
    }

    /**
     * Setter for <code>intest.ga_netdpf.reqntype</code>.
     */
    public void setReqntype(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.reqntype</code>.
     */
    public String getReqntype() {
        return (String) get(13);
    }

    /**
     * Setter for <code>intest.ga_netdpf.whrule</code>.
     */
    public void setWhrule(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.whrule</code>.
     */
    public String getWhrule() {
        return (String) get(14);
    }

    /**
     * Setter for <code>intest.ga_netdpf.user_profile</code>.
     */
    public void setUserProfile(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.user_profile</code>.
     */
    public String getUserProfile() {
        return (String) get(15);
    }

    /**
     * Setter for <code>intest.ga_netdpf.job_name</code>.
     */
    public void setJobName(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.job_name</code>.
     */
    public String getJobName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>intest.ga_netdpf.datime</code>.
     */
    public void setDatime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.datime</code>.
     */
    public Timestamp getDatime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>intest.ga_netdpf.rrn</code>.
     */
    public void setRrn(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.rrn</code>.
     */
    public Long getRrn() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>intest.ga_netdpf.eb_timestamp</code>.
     */
    public void setEbTimestamp(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.eb_timestamp</code>.
     */
    public Timestamp getEbTimestamp() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>intest.ga_netdpf.id</code>.
     */
    public void setId(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>intest.ga_netdpf.id</code>.
     */
    public Long getId() {
        return (Long) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<String, String, String, String, Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Long, Timestamp, Long> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<String, String, String, String, Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Long, Timestamp, Long> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GaNetdpf.GA_NETDPF.CHDRCOY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GaNetdpf.GA_NETDPF.PROVNET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GaNetdpf.GA_NETDPF.CLNTCOY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GaNetdpf.GA_NETDPF.PROVORG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return GaNetdpf.GA_NETDPF.STRTDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return GaNetdpf.GA_NETDPF.ENDDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GaNetdpf.GA_NETDPF.POS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return GaNetdpf.GA_NETDPF.PROVCAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return GaNetdpf.GA_NETDPF.CLAMTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return GaNetdpf.GA_NETDPF.NETLEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return GaNetdpf.GA_NETDPF.FEESCHID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return GaNetdpf.GA_NETDPF.PAYCOY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return GaNetdpf.GA_NETDPF.PAYCLT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return GaNetdpf.GA_NETDPF.REQNTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return GaNetdpf.GA_NETDPF.WHRULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return GaNetdpf.GA_NETDPF.USER_PROFILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return GaNetdpf.GA_NETDPF.JOB_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return GaNetdpf.GA_NETDPF.DATIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field19() {
        return GaNetdpf.GA_NETDPF.RRN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return GaNetdpf.GA_NETDPF.EB_TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field21() {
        return GaNetdpf.GA_NETDPF.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getChdrcoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getProvnet();
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
        return getProvorg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getStrtdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getEnddt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getProvcap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getClamtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getNetlevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getFeeschid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getPaycoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getPayclt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getReqntype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getWhrule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getUserProfile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getDatime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component19() {
        return getRrn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component20() {
        return getEbTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component21() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getChdrcoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProvnet();
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
        return getProvorg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getStrtdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getEnddt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProvcap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getClamtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getNetlevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getFeeschid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPaycoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getPayclt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getReqntype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getWhrule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getUserProfile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getDatime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value19() {
        return getRrn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getEbTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value21() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value1(String value) {
        setChdrcoy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value2(String value) {
        setProvnet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value3(String value) {
        setClntcoy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value4(String value) {
        setProvorg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value5(Integer value) {
        setStrtdt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value6(Integer value) {
        setEnddt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value7(String value) {
        setPos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value8(String value) {
        setProvcap(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value9(String value) {
        setClamtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value10(String value) {
        setNetlevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value11(String value) {
        setFeeschid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value12(String value) {
        setPaycoy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value13(String value) {
        setPayclt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value14(String value) {
        setReqntype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value15(String value) {
        setWhrule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value16(String value) {
        setUserProfile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value17(String value) {
        setJobName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value18(Timestamp value) {
        setDatime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value19(Long value) {
        setRrn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value20(Timestamp value) {
        setEbTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord value21(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GaNetdpfRecord values(String value1, String value2, String value3, String value4, Integer value5, Integer value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, Timestamp value18, Long value19, Timestamp value20, Long value21) {
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
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GaNetdpfRecord
     */
    public GaNetdpfRecord() {
        super(GaNetdpf.GA_NETDPF);
    }

    /**
     * Create a detached, initialised GaNetdpfRecord
     */
    public GaNetdpfRecord(String chdrcoy, String provnet, String clntcoy, String provorg, Integer strtdt, Integer enddt, String pos, String provcap, String clamtype, String netlevel, String feeschid, String paycoy, String payclt, String reqntype, String whrule, String userProfile, String jobName, Timestamp datime, Long rrn, Timestamp ebTimestamp, Long id) {
        super(GaNetdpf.GA_NETDPF);

        set(0, chdrcoy);
        set(1, provnet);
        set(2, clntcoy);
        set(3, provorg);
        set(4, strtdt);
        set(5, enddt);
        set(6, pos);
        set(7, provcap);
        set(8, clamtype);
        set(9, netlevel);
        set(10, feeschid);
        set(11, paycoy);
        set(12, payclt);
        set(13, reqntype);
        set(14, whrule);
        set(15, userProfile);
        set(16, jobName);
        set(17, datime);
        set(18, rrn);
        set(19, ebTimestamp);
        set(20, id);
    }
}
