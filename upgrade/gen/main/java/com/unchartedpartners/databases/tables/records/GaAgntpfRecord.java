/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.records;


import com.unchartedpartners.databases.tables.GaAgntpf;

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
public class GaAgntpfRecord extends UpdatableRecordImpl<GaAgntpfRecord> {

    private static final long serialVersionUID = -1656049587;

    /**
     * Setter for <code>intest.ga_agntpf.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>intest.ga_agntpf.agntpfx</code>.
     */
    public void setAgntpfx(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.agntpfx</code>.
     */
    public String getAgntpfx() {
        return (String) get(1);
    }

    /**
     * Setter for <code>intest.ga_agntpf.agntcoy</code>.
     */
    public void setAgntcoy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.agntcoy</code>.
     */
    public String getAgntcoy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>intest.ga_agntpf.agntnum</code>.
     */
    public void setAgntnum(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.agntnum</code>.
     */
    public String getAgntnum() {
        return (String) get(3);
    }

    /**
     * Setter for <code>intest.ga_agntpf.tranid</code>.
     */
    public void setTranid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.tranid</code>.
     */
    public String getTranid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>intest.ga_agntpf.validflag</code>.
     */
    public void setValidflag(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.validflag</code>.
     */
    public String getValidflag() {
        return (String) get(5);
    }

    /**
     * Setter for <code>intest.ga_agntpf.clntpfx</code>.
     */
    public void setClntpfx(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.clntpfx</code>.
     */
    public String getClntpfx() {
        return (String) get(6);
    }

    /**
     * Setter for <code>intest.ga_agntpf.clntcoy</code>.
     */
    public void setClntcoy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.clntcoy</code>.
     */
    public String getClntcoy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>intest.ga_agntpf.clntnum</code>.
     */
    public void setClntnum(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.clntnum</code>.
     */
    public String getClntnum() {
        return (String) get(8);
    }

    /**
     * Setter for <code>intest.ga_agntpf.agntrel</code>.
     */
    public void setAgntrel(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.agntrel</code>.
     */
    public String getAgntrel() {
        return (String) get(9);
    }

    /**
     * Setter for <code>intest.ga_agntpf.agtype</code>.
     */
    public void setAgtype(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.agtype</code>.
     */
    public String getAgtype() {
        return (String) get(10);
    }

    /**
     * Setter for <code>intest.ga_agntpf.agntbr</code>.
     */
    public void setAgntbr(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.agntbr</code>.
     */
    public String getAgntbr() {
        return (String) get(11);
    }

    /**
     * Setter for <code>intest.ga_agntpf.replvl</code>.
     */
    public void setReplvl(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.replvl</code>.
     */
    public Byte getReplvl() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>intest.ga_agntpf.repagent01</code>.
     */
    public void setRepagent01(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.repagent01</code>.
     */
    public String getRepagent01() {
        return (String) get(13);
    }

    /**
     * Setter for <code>intest.ga_agntpf.repagent02</code>.
     */
    public void setRepagent02(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.repagent02</code>.
     */
    public String getRepagent02() {
        return (String) get(14);
    }

    /**
     * Setter for <code>intest.ga_agntpf.repagent03</code>.
     */
    public void setRepagent03(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.repagent03</code>.
     */
    public String getRepagent03() {
        return (String) get(15);
    }

    /**
     * Setter for <code>intest.ga_agntpf.repagent04</code>.
     */
    public void setRepagent04(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.repagent04</code>.
     */
    public String getRepagent04() {
        return (String) get(16);
    }

    /**
     * Setter for <code>intest.ga_agntpf.repagent05</code>.
     */
    public void setRepagent05(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.repagent05</code>.
     */
    public String getRepagent05() {
        return (String) get(17);
    }

    /**
     * Setter for <code>intest.ga_agntpf.repagent06</code>.
     */
    public void setRepagent06(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.repagent06</code>.
     */
    public String getRepagent06() {
        return (String) get(18);
    }

    /**
     * Setter for <code>intest.ga_agntpf.reportag01</code>.
     */
    public void setReportag01(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.reportag01</code>.
     */
    public String getReportag01() {
        return (String) get(19);
    }

    /**
     * Setter for <code>intest.ga_agntpf.reportag02</code>.
     */
    public void setReportag02(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.reportag02</code>.
     */
    public String getReportag02() {
        return (String) get(20);
    }

    /**
     * Setter for <code>intest.ga_agntpf.reportag03</code>.
     */
    public void setReportag03(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.reportag03</code>.
     */
    public String getReportag03() {
        return (String) get(21);
    }

    /**
     * Setter for <code>intest.ga_agntpf.reportag04</code>.
     */
    public void setReportag04(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.reportag04</code>.
     */
    public String getReportag04() {
        return (String) get(22);
    }

    /**
     * Setter for <code>intest.ga_agntpf.reportag05</code>.
     */
    public void setReportag05(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.reportag05</code>.
     */
    public String getReportag05() {
        return (String) get(23);
    }

    /**
     * Setter for <code>intest.ga_agntpf.reportag06</code>.
     */
    public void setReportag06(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.reportag06</code>.
     */
    public String getReportag06() {
        return (String) get(24);
    }

    /**
     * Setter for <code>intest.ga_agntpf.fgagnt</code>.
     */
    public void setFgagnt(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.fgagnt</code>.
     */
    public String getFgagnt() {
        return (String) get(25);
    }

    /**
     * Setter for <code>intest.ga_agntpf.fgcommtabl</code>.
     */
    public void setFgcommtabl(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.fgcommtabl</code>.
     */
    public String getFgcommtabl() {
        return (String) get(26);
    }

    /**
     * Setter for <code>intest.ga_agntpf.lifagnt</code>.
     */
    public void setLifagnt(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.lifagnt</code>.
     */
    public String getLifagnt() {
        return (String) get(27);
    }

    /**
     * Setter for <code>intest.ga_agntpf.chdrstcda</code>.
     */
    public void setChdrstcda(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.chdrstcda</code>.
     */
    public String getChdrstcda() {
        return (String) get(28);
    }

    /**
     * Setter for <code>intest.ga_agntpf.chdrstcdb</code>.
     */
    public void setChdrstcdb(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.chdrstcdb</code>.
     */
    public String getChdrstcdb() {
        return (String) get(29);
    }

    /**
     * Setter for <code>intest.ga_agntpf.chdrstcdc</code>.
     */
    public void setChdrstcdc(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.chdrstcdc</code>.
     */
    public String getChdrstcdc() {
        return (String) get(30);
    }

    /**
     * Setter for <code>intest.ga_agntpf.chdrstcdd</code>.
     */
    public void setChdrstcdd(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.chdrstcdd</code>.
     */
    public String getChdrstcdd() {
        return (String) get(31);
    }

    /**
     * Setter for <code>intest.ga_agntpf.chdrstcde</code>.
     */
    public void setChdrstcde(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.chdrstcde</code>.
     */
    public String getChdrstcde() {
        return (String) get(32);
    }

    /**
     * Setter for <code>intest.ga_agntpf.start_date</code>.
     */
    public void setStartDate(Integer value) {
        set(33, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.start_date</code>.
     */
    public Integer getStartDate() {
        return (Integer) get(33);
    }

    /**
     * Setter for <code>intest.ga_agntpf.dateend</code>.
     */
    public void setDateend(Integer value) {
        set(34, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.dateend</code>.
     */
    public Integer getDateend() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>intest.ga_agntpf.contpers</code>.
     */
    public void setContpers(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.contpers</code>.
     */
    public String getContpers() {
        return (String) get(35);
    }

    /**
     * Setter for <code>intest.ga_agntpf.takoagnt</code>.
     */
    public void setTakoagnt(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.takoagnt</code>.
     */
    public String getTakoagnt() {
        return (String) get(36);
    }

    /**
     * Setter for <code>intest.ga_agntpf.account_reconciliation</code>.
     */
    public void setAccountReconciliation(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.account_reconciliation</code>.
     */
    public String getAccountReconciliation() {
        return (String) get(37);
    }

    /**
     * Setter for <code>intest.ga_agntpf.statement_reqd</code>.
     */
    public void setStatementReqd(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.statement_reqd</code>.
     */
    public String getStatementReqd() {
        return (String) get(38);
    }

    /**
     * Setter for <code>intest.ga_agntpf.crterm</code>.
     */
    public void setCrterm(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.crterm</code>.
     */
    public String getCrterm() {
        return (String) get(39);
    }

    /**
     * Setter for <code>intest.ga_agntpf.crlimit</code>.
     */
    public void setCrlimit(Integer value) {
        set(40, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.crlimit</code>.
     */
    public Integer getCrlimit() {
        return (Integer) get(40);
    }

    /**
     * Setter for <code>intest.ga_agntpf.stlbasis</code>.
     */
    public void setStlbasis(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.stlbasis</code>.
     */
    public String getStlbasis() {
        return (String) get(41);
    }

    /**
     * Setter for <code>intest.ga_agntpf.expiry_notice</code>.
     */
    public void setExpiryNotice(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.expiry_notice</code>.
     */
    public String getExpiryNotice() {
        return (String) get(42);
    }

    /**
     * Setter for <code>intest.ga_agntpf.licence</code>.
     */
    public void setLicence(String value) {
        set(43, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.licence</code>.
     */
    public String getLicence() {
        return (String) get(43);
    }

    /**
     * Setter for <code>intest.ga_agntpf.ridesc</code>.
     */
    public void setRidesc(String value) {
        set(44, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.ridesc</code>.
     */
    public String getRidesc() {
        return (String) get(44);
    }

    /**
     * Setter for <code>intest.ga_agntpf.rlrpfx</code>.
     */
    public void setRlrpfx(String value) {
        set(45, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.rlrpfx</code>.
     */
    public String getRlrpfx() {
        return (String) get(45);
    }

    /**
     * Setter for <code>intest.ga_agntpf.rlrcoy</code>.
     */
    public void setRlrcoy(String value) {
        set(46, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.rlrcoy</code>.
     */
    public String getRlrcoy() {
        return (String) get(46);
    }

    /**
     * Setter for <code>intest.ga_agntpf.rlracc</code>.
     */
    public void setRlracc(String value) {
        set(47, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.rlracc</code>.
     */
    public String getRlracc() {
        return (String) get(47);
    }

    /**
     * Setter for <code>intest.ga_agntpf.msagnt</code>.
     */
    public void setMsagnt(String value) {
        set(48, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.msagnt</code>.
     */
    public String getMsagnt() {
        return (String) get(48);
    }

    /**
     * Setter for <code>intest.ga_agntpf.reportto</code>.
     */
    public void setReportto(String value) {
        set(49, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.reportto</code>.
     */
    public String getReportto() {
        return (String) get(49);
    }

    /**
     * Setter for <code>intest.ga_agntpf.credittrm</code>.
     */
    public void setCredittrm(Short value) {
        set(50, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.credittrm</code>.
     */
    public Short getCredittrm() {
        return (Short) get(50);
    }

    /**
     * Setter for <code>intest.ga_agntpf.zbkind</code>.
     */
    public void setZbkind(String value) {
        set(51, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.zbkind</code>.
     */
    public String getZbkind() {
        return (String) get(51);
    }

    /**
     * Setter for <code>intest.ga_agntpf.zdistrict</code>.
     */
    public void setZdistrict(String value) {
        set(52, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.zdistrict</code>.
     */
    public String getZdistrict() {
        return (String) get(52);
    }

    /**
     * Setter for <code>intest.ga_agntpf.zfgcmtbn</code>.
     */
    public void setZfgcmtbn(String value) {
        set(53, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.zfgcmtbn</code>.
     */
    public String getZfgcmtbn() {
        return (String) get(53);
    }

    /**
     * Setter for <code>intest.ga_agntpf.zstaffcd</code>.
     */
    public void setZstaffcd(String value) {
        set(54, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.zstaffcd</code>.
     */
    public String getZstaffcd() {
        return (String) get(54);
    }

    /**
     * Setter for <code>intest.ga_agntpf.bankcode01</code>.
     */
    public void setBankcode01(String value) {
        set(55, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.bankcode01</code>.
     */
    public String getBankcode01() {
        return (String) get(55);
    }

    /**
     * Setter for <code>intest.ga_agntpf.bankcode02</code>.
     */
    public void setBankcode02(String value) {
        set(56, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.bankcode02</code>.
     */
    public String getBankcode02() {
        return (String) get(56);
    }

    /**
     * Setter for <code>intest.ga_agntpf.bankcode03</code>.
     */
    public void setBankcode03(String value) {
        set(57, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.bankcode03</code>.
     */
    public String getBankcode03() {
        return (String) get(57);
    }

    /**
     * Setter for <code>intest.ga_agntpf.bankcode04</code>.
     */
    public void setBankcode04(String value) {
        set(58, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.bankcode04</code>.
     */
    public String getBankcode04() {
        return (String) get(58);
    }

    /**
     * Setter for <code>intest.ga_agntpf.bankcode05</code>.
     */
    public void setBankcode05(String value) {
        set(59, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.bankcode05</code>.
     */
    public String getBankcode05() {
        return (String) get(59);
    }

    /**
     * Setter for <code>intest.ga_agntpf.user_profile</code>.
     */
    public void setUserProfile(String value) {
        set(60, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.user_profile</code>.
     */
    public String getUserProfile() {
        return (String) get(60);
    }

    /**
     * Setter for <code>intest.ga_agntpf.job_name</code>.
     */
    public void setJobName(String value) {
        set(61, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.job_name</code>.
     */
    public String getJobName() {
        return (String) get(61);
    }

    /**
     * Setter for <code>intest.ga_agntpf.datime</code>.
     */
    public void setDatime(Timestamp value) {
        set(62, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.datime</code>.
     */
    public Timestamp getDatime() {
        return (Timestamp) get(62);
    }

    /**
     * Setter for <code>intest.ga_agntpf.eb_timestamp</code>.
     */
    public void setEbTimestamp(Timestamp value) {
        set(63, value);
    }

    /**
     * Getter for <code>intest.ga_agntpf.eb_timestamp</code>.
     */
    public Timestamp getEbTimestamp() {
        return (Timestamp) get(63);
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
     * Create a detached GaAgntpfRecord
     */
    public GaAgntpfRecord() {
        super(GaAgntpf.GA_AGNTPF);
    }

    /**
     * Create a detached, initialised GaAgntpfRecord
     */
    public GaAgntpfRecord(Long id, String agntpfx, String agntcoy, String agntnum, String tranid, String validflag, String clntpfx, String clntcoy, String clntnum, String agntrel, String agtype, String agntbr, Byte replvl, String repagent01, String repagent02, String repagent03, String repagent04, String repagent05, String repagent06, String reportag01, String reportag02, String reportag03, String reportag04, String reportag05, String reportag06, String fgagnt, String fgcommtabl, String lifagnt, String chdrstcda, String chdrstcdb, String chdrstcdc, String chdrstcdd, String chdrstcde, Integer startDate, Integer dateend, String contpers, String takoagnt, String accountReconciliation, String statementReqd, String crterm, Integer crlimit, String stlbasis, String expiryNotice, String licence, String ridesc, String rlrpfx, String rlrcoy, String rlracc, String msagnt, String reportto, Short credittrm, String zbkind, String zdistrict, String zfgcmtbn, String zstaffcd, String bankcode01, String bankcode02, String bankcode03, String bankcode04, String bankcode05, String userProfile, String jobName, Timestamp datime, Timestamp ebTimestamp) {
        super(GaAgntpf.GA_AGNTPF);

        set(0, id);
        set(1, agntpfx);
        set(2, agntcoy);
        set(3, agntnum);
        set(4, tranid);
        set(5, validflag);
        set(6, clntpfx);
        set(7, clntcoy);
        set(8, clntnum);
        set(9, agntrel);
        set(10, agtype);
        set(11, agntbr);
        set(12, replvl);
        set(13, repagent01);
        set(14, repagent02);
        set(15, repagent03);
        set(16, repagent04);
        set(17, repagent05);
        set(18, repagent06);
        set(19, reportag01);
        set(20, reportag02);
        set(21, reportag03);
        set(22, reportag04);
        set(23, reportag05);
        set(24, reportag06);
        set(25, fgagnt);
        set(26, fgcommtabl);
        set(27, lifagnt);
        set(28, chdrstcda);
        set(29, chdrstcdb);
        set(30, chdrstcdc);
        set(31, chdrstcdd);
        set(32, chdrstcde);
        set(33, startDate);
        set(34, dateend);
        set(35, contpers);
        set(36, takoagnt);
        set(37, accountReconciliation);
        set(38, statementReqd);
        set(39, crterm);
        set(40, crlimit);
        set(41, stlbasis);
        set(42, expiryNotice);
        set(43, licence);
        set(44, ridesc);
        set(45, rlrpfx);
        set(46, rlrcoy);
        set(47, rlracc);
        set(48, msagnt);
        set(49, reportto);
        set(50, credittrm);
        set(51, zbkind);
        set(52, zdistrict);
        set(53, zfgcmtbn);
        set(54, zstaffcd);
        set(55, bankcode01);
        set(56, bankcode02);
        set(57, bankcode03);
        set(58, bankcode04);
        set(59, bankcode05);
        set(60, userProfile);
        set(61, jobName);
        set(62, datime);
        set(63, ebTimestamp);
    }
}