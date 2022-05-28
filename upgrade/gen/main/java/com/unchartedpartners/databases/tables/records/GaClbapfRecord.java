/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.tables.GaClbapf;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class GaClbapfRecord extends UpdatableRecordImpl<GaClbapfRecord> {

    private static final long serialVersionUID = -227824887;

    /**
     * Setter for <code>intest.ga_clbapf.clntpfx</code>.
     */
    public void setClntpfx(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.clntpfx</code>.
     */
    public String getClntpfx() {
        return (String) get(0);
    }

    /**
     * Setter for <code>intest.ga_clbapf.clntcoy</code>.
     */
    public void setClntcoy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.clntcoy</code>.
     */
    public String getClntcoy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.ga_clbapf.clntnum</code>.
     */
    public void setClntnum(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.clntnum</code>.
     */
    public String getClntnum() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.ga_clbapf.currfrom</code>.
     */
    public void setCurrfrom(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.currfrom</code>.
     */
    public Integer getCurrfrom() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>intest.ga_clbapf.currto</code>.
     */
    public void setCurrto(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.currto</code>.
     */
    public Integer getCurrto() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>intest.ga_clbapf.clntrel</code>.
     */
    public void setClntrel(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.clntrel</code>.
     */
    public String getClntrel() {
        return (String) get(5);
    }

    /**
     * Setter for <code>intest.ga_clbapf.validflag</code>.
     */
    public void setValidflag(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.validflag</code>.
     */
    public String getValidflag() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.ga_clbapf.billdate01</code>.
     */
    public void setBilldate01(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.billdate01</code>.
     */
    public Integer getBilldate01() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>intest.ga_clbapf.billdate02</code>.
     */
    public void setBilldate02(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.billdate02</code>.
     */
    public Integer getBilldate02() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>intest.ga_clbapf.billdate03</code>.
     */
    public void setBilldate03(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.billdate03</code>.
     */
    public Integer getBilldate03() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>intest.ga_clbapf.billdate04</code>.
     */
    public void setBilldate04(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.billdate04</code>.
     */
    public Integer getBilldate04() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>intest.ga_clbapf.billamt01</code>.
     */
    public void setBillamt01(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.billamt01</code>.
     */
    public BigDecimal getBillamt01() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>intest.ga_clbapf.billamt02</code>.
     */
    public void setBillamt02(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.billamt02</code>.
     */
    public BigDecimal getBillamt02() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>intest.ga_clbapf.billamt03</code>.
     */
    public void setBillamt03(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.billamt03</code>.
     */
    public BigDecimal getBillamt03() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>intest.ga_clbapf.billamt04</code>.
     */
    public void setBillamt04(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.billamt04</code>.
     */
    public BigDecimal getBillamt04() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>intest.ga_clbapf.remittype</code>.
     */
    public void setRemittype(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.remittype</code>.
     */
    public String getRemittype() {
        return (String) get(15);
    }

    /**
     * Setter for <code>intest.ga_clbapf.newrqst</code>.
     */
    public void setNewrqst(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.newrqst</code>.
     */
    public String getNewrqst() {
        return (String) get(16);
    }

    /**
     * Setter for <code>intest.ga_clbapf.facthous</code>.
     */
    public void setFacthous(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.facthous</code>.
     */
    public String getFacthous() {
        return (String) get(17);
    }

    /**
     * Setter for <code>intest.ga_clbapf.bankkey</code>.
     */
    public void setBankkey(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.bankkey</code>.
     */
    public String getBankkey() {
        return (String) get(18);
    }

    /**
     * Setter for <code>intest.ga_clbapf.bankacckey</code>.
     */
    public void setBankacckey(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.bankacckey</code>.
     */
    public String getBankacckey() {
        return (String) get(19);
    }

    /**
     * Setter for <code>intest.ga_clbapf.bankaccdsc</code>.
     */
    public void setBankaccdsc(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.bankaccdsc</code>.
     */
    public String getBankaccdsc() {
        return (String) get(20);
    }

    /**
     * Setter for <code>intest.ga_clbapf.bnkactyp</code>.
     */
    public void setBnkactyp(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.bnkactyp</code>.
     */
    public String getBnkactyp() {
        return (String) get(21);
    }

    /**
     * Setter for <code>intest.ga_clbapf.currcode</code>.
     */
    public void setCurrcode(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.currcode</code>.
     */
    public String getCurrcode() {
        return (String) get(22);
    }

    /**
     * Setter for <code>intest.ga_clbapf.dd_tran_code</code>.
     */
    public void setDdTranCode(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.dd_tran_code</code>.
     */
    public String getDdTranCode() {
        return (String) get(23);
    }

    /**
     * Setter for <code>intest.ga_clbapf.sctycde</code>.
     */
    public void setSctycde(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.sctycde</code>.
     */
    public String getSctycde() {
        return (String) get(24);
    }

    /**
     * Setter for <code>intest.ga_clbapf.user_profile</code>.
     */
    public void setUserProfile(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.user_profile</code>.
     */
    public String getUserProfile() {
        return (String) get(25);
    }

    /**
     * Setter for <code>intest.ga_clbapf.job_name</code>.
     */
    public void setJobName(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.job_name</code>.
     */
    public String getJobName() {
        return (String) get(26);
    }

    /**
     * Setter for <code>intest.ga_clbapf.datime</code>.
     */
    public void setDatime(Timestamp value) {
        set(27, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.datime</code>.
     */
    public Timestamp getDatime() {
        return (Timestamp) get(27);
    }

    /**
     * Setter for <code>intest.ga_clbapf.eb_timestamp</code>.
     */
    public void setEbTimestamp(Timestamp value) {
        set(28, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.eb_timestamp</code>.
     */
    public Timestamp getEbTimestamp() {
        return (Timestamp) get(28);
    }

    /**
     * Setter for <code>intest.ga_clbapf.id</code>.
     */
    public void setId(Long value) {
        set(29, value);
    }

    /**
     * Getter for <code>intest.ga_clbapf.id</code>.
     */
    public Long getId() {
        return (Long) get(29);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GaClbapfRecord
     */
    public GaClbapfRecord() {
        super(GaClbapf.GA_CLBAPF);
    }

    /**
     * Create a detached, initialised GaClbapfRecord
     */
    public GaClbapfRecord(String clntpfx, String clntcoy, String clntnum, Integer currfrom, Integer currto, String clntrel, String validflag, Integer billdate01, Integer billdate02, Integer billdate03, Integer billdate04, BigDecimal billamt01, BigDecimal billamt02, BigDecimal billamt03, BigDecimal billamt04, String remittype, String newrqst, String facthous, String bankkey, String bankacckey, String bankaccdsc, String bnkactyp, String currcode, String ddTranCode, String sctycde, String userProfile, String jobName, Timestamp datime, Timestamp ebTimestamp, Long id) {
        super(GaClbapf.GA_CLBAPF);

        set(0, clntpfx);
        set(1, clntcoy);
        set(2, clntnum);
        set(3, currfrom);
        set(4, currto);
        set(5, clntrel);
        set(6, validflag);
        set(7, billdate01);
        set(8, billdate02);
        set(9, billdate03);
        set(10, billdate04);
        set(11, billamt01);
        set(12, billamt02);
        set(13, billamt03);
        set(14, billamt04);
        set(15, remittype);
        set(16, newrqst);
        set(17, facthous);
        set(18, bankkey);
        set(19, bankacckey);
        set(20, bankaccdsc);
        set(21, bnkactyp);
        set(22, currcode);
        set(23, ddTranCode);
        set(24, sctycde);
        set(25, userProfile);
        set(26, jobName);
        set(27, datime);
        set(28, ebTimestamp);
        set(29, id);
    }
}