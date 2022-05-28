/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class CloudGaAgntpf implements Serializable {

    private static final long serialVersionUID = 1193868612;

    private Long      id;
    private String    agntpfx;
    private String    agntcoy;
    private String    agntnum;
    private String    tranid;
    private String    validflag;
    private String    clntpfx;
    private String    clntcoy;
    private String    clntnum;
    private String    agntrel;
    private String    agtype;
    private String    agntbr;
    private Byte      replvl;
    private String    repagent01;
    private String    repagent02;
    private String    repagent03;
    private String    repagent04;
    private String    repagent05;
    private String    repagent06;
    private String    reportag01;
    private String    reportag02;
    private String    reportag03;
    private String    reportag04;
    private String    reportag05;
    private String    reportag06;
    private String    fgagnt;
    private String    fgcommtabl;
    private String    lifagnt;
    private String    chdrstcda;
    private String    chdrstcdb;
    private String    chdrstcdc;
    private String    chdrstcdd;
    private String    chdrstcde;
    private Integer   startDate;
    private Integer   dateend;
    private String    contpers;
    private String    takoagnt;
    private String    accountReconciliation;
    private String    statementReqd;
    private String    crterm;
    private Integer   crlimit;
    private String    stlbasis;
    private String    expiryNotice;
    private String    licence;
    private String    ridesc;
    private String    rlrpfx;
    private String    rlrcoy;
    private String    rlracc;
    private String    msagnt;
    private String    reportto;
    private Short     credittrm;
    private String    zbkind;
    private String    zdistrict;
    private String    zfgcmtbn;
    private String    zstaffcd;
    private String    bankcode01;
    private String    bankcode02;
    private String    bankcode03;
    private String    bankcode04;
    private String    bankcode05;
    private String    userProfile;
    private String    jobName;
    private Timestamp datime;
    private Timestamp ebTimestamp;

    public CloudGaAgntpf() {}

    public CloudGaAgntpf(CloudGaAgntpf value) {
        this.id = value.id;
        this.agntpfx = value.agntpfx;
        this.agntcoy = value.agntcoy;
        this.agntnum = value.agntnum;
        this.tranid = value.tranid;
        this.validflag = value.validflag;
        this.clntpfx = value.clntpfx;
        this.clntcoy = value.clntcoy;
        this.clntnum = value.clntnum;
        this.agntrel = value.agntrel;
        this.agtype = value.agtype;
        this.agntbr = value.agntbr;
        this.replvl = value.replvl;
        this.repagent01 = value.repagent01;
        this.repagent02 = value.repagent02;
        this.repagent03 = value.repagent03;
        this.repagent04 = value.repagent04;
        this.repagent05 = value.repagent05;
        this.repagent06 = value.repagent06;
        this.reportag01 = value.reportag01;
        this.reportag02 = value.reportag02;
        this.reportag03 = value.reportag03;
        this.reportag04 = value.reportag04;
        this.reportag05 = value.reportag05;
        this.reportag06 = value.reportag06;
        this.fgagnt = value.fgagnt;
        this.fgcommtabl = value.fgcommtabl;
        this.lifagnt = value.lifagnt;
        this.chdrstcda = value.chdrstcda;
        this.chdrstcdb = value.chdrstcdb;
        this.chdrstcdc = value.chdrstcdc;
        this.chdrstcdd = value.chdrstcdd;
        this.chdrstcde = value.chdrstcde;
        this.startDate = value.startDate;
        this.dateend = value.dateend;
        this.contpers = value.contpers;
        this.takoagnt = value.takoagnt;
        this.accountReconciliation = value.accountReconciliation;
        this.statementReqd = value.statementReqd;
        this.crterm = value.crterm;
        this.crlimit = value.crlimit;
        this.stlbasis = value.stlbasis;
        this.expiryNotice = value.expiryNotice;
        this.licence = value.licence;
        this.ridesc = value.ridesc;
        this.rlrpfx = value.rlrpfx;
        this.rlrcoy = value.rlrcoy;
        this.rlracc = value.rlracc;
        this.msagnt = value.msagnt;
        this.reportto = value.reportto;
        this.credittrm = value.credittrm;
        this.zbkind = value.zbkind;
        this.zdistrict = value.zdistrict;
        this.zfgcmtbn = value.zfgcmtbn;
        this.zstaffcd = value.zstaffcd;
        this.bankcode01 = value.bankcode01;
        this.bankcode02 = value.bankcode02;
        this.bankcode03 = value.bankcode03;
        this.bankcode04 = value.bankcode04;
        this.bankcode05 = value.bankcode05;
        this.userProfile = value.userProfile;
        this.jobName = value.jobName;
        this.datime = value.datime;
        this.ebTimestamp = value.ebTimestamp;
    }

    public CloudGaAgntpf(
        Long      id,
        String    agntpfx,
        String    agntcoy,
        String    agntnum,
        String    tranid,
        String    validflag,
        String    clntpfx,
        String    clntcoy,
        String    clntnum,
        String    agntrel,
        String    agtype,
        String    agntbr,
        Byte      replvl,
        String    repagent01,
        String    repagent02,
        String    repagent03,
        String    repagent04,
        String    repagent05,
        String    repagent06,
        String    reportag01,
        String    reportag02,
        String    reportag03,
        String    reportag04,
        String    reportag05,
        String    reportag06,
        String    fgagnt,
        String    fgcommtabl,
        String    lifagnt,
        String    chdrstcda,
        String    chdrstcdb,
        String    chdrstcdc,
        String    chdrstcdd,
        String    chdrstcde,
        Integer   startDate,
        Integer   dateend,
        String    contpers,
        String    takoagnt,
        String    accountReconciliation,
        String    statementReqd,
        String    crterm,
        Integer   crlimit,
        String    stlbasis,
        String    expiryNotice,
        String    licence,
        String    ridesc,
        String    rlrpfx,
        String    rlrcoy,
        String    rlracc,
        String    msagnt,
        String    reportto,
        Short     credittrm,
        String    zbkind,
        String    zdistrict,
        String    zfgcmtbn,
        String    zstaffcd,
        String    bankcode01,
        String    bankcode02,
        String    bankcode03,
        String    bankcode04,
        String    bankcode05,
        String    userProfile,
        String    jobName,
        Timestamp datime,
        Timestamp ebTimestamp
    ) {
        this.id = id;
        this.agntpfx = agntpfx;
        this.agntcoy = agntcoy;
        this.agntnum = agntnum;
        this.tranid = tranid;
        this.validflag = validflag;
        this.clntpfx = clntpfx;
        this.clntcoy = clntcoy;
        this.clntnum = clntnum;
        this.agntrel = agntrel;
        this.agtype = agtype;
        this.agntbr = agntbr;
        this.replvl = replvl;
        this.repagent01 = repagent01;
        this.repagent02 = repagent02;
        this.repagent03 = repagent03;
        this.repagent04 = repagent04;
        this.repagent05 = repagent05;
        this.repagent06 = repagent06;
        this.reportag01 = reportag01;
        this.reportag02 = reportag02;
        this.reportag03 = reportag03;
        this.reportag04 = reportag04;
        this.reportag05 = reportag05;
        this.reportag06 = reportag06;
        this.fgagnt = fgagnt;
        this.fgcommtabl = fgcommtabl;
        this.lifagnt = lifagnt;
        this.chdrstcda = chdrstcda;
        this.chdrstcdb = chdrstcdb;
        this.chdrstcdc = chdrstcdc;
        this.chdrstcdd = chdrstcdd;
        this.chdrstcde = chdrstcde;
        this.startDate = startDate;
        this.dateend = dateend;
        this.contpers = contpers;
        this.takoagnt = takoagnt;
        this.accountReconciliation = accountReconciliation;
        this.statementReqd = statementReqd;
        this.crterm = crterm;
        this.crlimit = crlimit;
        this.stlbasis = stlbasis;
        this.expiryNotice = expiryNotice;
        this.licence = licence;
        this.ridesc = ridesc;
        this.rlrpfx = rlrpfx;
        this.rlrcoy = rlrcoy;
        this.rlracc = rlracc;
        this.msagnt = msagnt;
        this.reportto = reportto;
        this.credittrm = credittrm;
        this.zbkind = zbkind;
        this.zdistrict = zdistrict;
        this.zfgcmtbn = zfgcmtbn;
        this.zstaffcd = zstaffcd;
        this.bankcode01 = bankcode01;
        this.bankcode02 = bankcode02;
        this.bankcode03 = bankcode03;
        this.bankcode04 = bankcode04;
        this.bankcode05 = bankcode05;
        this.userProfile = userProfile;
        this.jobName = jobName;
        this.datime = datime;
        this.ebTimestamp = ebTimestamp;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgntpfx() {
        return this.agntpfx;
    }

    public void setAgntpfx(String agntpfx) {
        this.agntpfx = agntpfx;
    }

    public String getAgntcoy() {
        return this.agntcoy;
    }

    public void setAgntcoy(String agntcoy) {
        this.agntcoy = agntcoy;
    }

    public String getAgntnum() {
        return this.agntnum;
    }

    public void setAgntnum(String agntnum) {
        this.agntnum = agntnum;
    }

    public String getTranid() {
        return this.tranid;
    }

    public void setTranid(String tranid) {
        this.tranid = tranid;
    }

    public String getValidflag() {
        return this.validflag;
    }

    public void setValidflag(String validflag) {
        this.validflag = validflag;
    }

    public String getClntpfx() {
        return this.clntpfx;
    }

    public void setClntpfx(String clntpfx) {
        this.clntpfx = clntpfx;
    }

    public String getClntcoy() {
        return this.clntcoy;
    }

    public void setClntcoy(String clntcoy) {
        this.clntcoy = clntcoy;
    }

    public String getClntnum() {
        return this.clntnum;
    }

    public void setClntnum(String clntnum) {
        this.clntnum = clntnum;
    }

    public String getAgntrel() {
        return this.agntrel;
    }

    public void setAgntrel(String agntrel) {
        this.agntrel = agntrel;
    }

    public String getAgtype() {
        return this.agtype;
    }

    public void setAgtype(String agtype) {
        this.agtype = agtype;
    }

    public String getAgntbr() {
        return this.agntbr;
    }

    public void setAgntbr(String agntbr) {
        this.agntbr = agntbr;
    }

    public Byte getReplvl() {
        return this.replvl;
    }

    public void setReplvl(Byte replvl) {
        this.replvl = replvl;
    }

    public String getRepagent01() {
        return this.repagent01;
    }

    public void setRepagent01(String repagent01) {
        this.repagent01 = repagent01;
    }

    public String getRepagent02() {
        return this.repagent02;
    }

    public void setRepagent02(String repagent02) {
        this.repagent02 = repagent02;
    }

    public String getRepagent03() {
        return this.repagent03;
    }

    public void setRepagent03(String repagent03) {
        this.repagent03 = repagent03;
    }

    public String getRepagent04() {
        return this.repagent04;
    }

    public void setRepagent04(String repagent04) {
        this.repagent04 = repagent04;
    }

    public String getRepagent05() {
        return this.repagent05;
    }

    public void setRepagent05(String repagent05) {
        this.repagent05 = repagent05;
    }

    public String getRepagent06() {
        return this.repagent06;
    }

    public void setRepagent06(String repagent06) {
        this.repagent06 = repagent06;
    }

    public String getReportag01() {
        return this.reportag01;
    }

    public void setReportag01(String reportag01) {
        this.reportag01 = reportag01;
    }

    public String getReportag02() {
        return this.reportag02;
    }

    public void setReportag02(String reportag02) {
        this.reportag02 = reportag02;
    }

    public String getReportag03() {
        return this.reportag03;
    }

    public void setReportag03(String reportag03) {
        this.reportag03 = reportag03;
    }

    public String getReportag04() {
        return this.reportag04;
    }

    public void setReportag04(String reportag04) {
        this.reportag04 = reportag04;
    }

    public String getReportag05() {
        return this.reportag05;
    }

    public void setReportag05(String reportag05) {
        this.reportag05 = reportag05;
    }

    public String getReportag06() {
        return this.reportag06;
    }

    public void setReportag06(String reportag06) {
        this.reportag06 = reportag06;
    }

    public String getFgagnt() {
        return this.fgagnt;
    }

    public void setFgagnt(String fgagnt) {
        this.fgagnt = fgagnt;
    }

    public String getFgcommtabl() {
        return this.fgcommtabl;
    }

    public void setFgcommtabl(String fgcommtabl) {
        this.fgcommtabl = fgcommtabl;
    }

    public String getLifagnt() {
        return this.lifagnt;
    }

    public void setLifagnt(String lifagnt) {
        this.lifagnt = lifagnt;
    }

    public String getChdrstcda() {
        return this.chdrstcda;
    }

    public void setChdrstcda(String chdrstcda) {
        this.chdrstcda = chdrstcda;
    }

    public String getChdrstcdb() {
        return this.chdrstcdb;
    }

    public void setChdrstcdb(String chdrstcdb) {
        this.chdrstcdb = chdrstcdb;
    }

    public String getChdrstcdc() {
        return this.chdrstcdc;
    }

    public void setChdrstcdc(String chdrstcdc) {
        this.chdrstcdc = chdrstcdc;
    }

    public String getChdrstcdd() {
        return this.chdrstcdd;
    }

    public void setChdrstcdd(String chdrstcdd) {
        this.chdrstcdd = chdrstcdd;
    }

    public String getChdrstcde() {
        return this.chdrstcde;
    }

    public void setChdrstcde(String chdrstcde) {
        this.chdrstcde = chdrstcde;
    }

    public Integer getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getDateend() {
        return this.dateend;
    }

    public void setDateend(Integer dateend) {
        this.dateend = dateend;
    }

    public String getContpers() {
        return this.contpers;
    }

    public void setContpers(String contpers) {
        this.contpers = contpers;
    }

    public String getTakoagnt() {
        return this.takoagnt;
    }

    public void setTakoagnt(String takoagnt) {
        this.takoagnt = takoagnt;
    }

    public String getAccountReconciliation() {
        return this.accountReconciliation;
    }

    public void setAccountReconciliation(String accountReconciliation) {
        this.accountReconciliation = accountReconciliation;
    }

    public String getStatementReqd() {
        return this.statementReqd;
    }

    public void setStatementReqd(String statementReqd) {
        this.statementReqd = statementReqd;
    }

    public String getCrterm() {
        return this.crterm;
    }

    public void setCrterm(String crterm) {
        this.crterm = crterm;
    }

    public Integer getCrlimit() {
        return this.crlimit;
    }

    public void setCrlimit(Integer crlimit) {
        this.crlimit = crlimit;
    }

    public String getStlbasis() {
        return this.stlbasis;
    }

    public void setStlbasis(String stlbasis) {
        this.stlbasis = stlbasis;
    }

    public String getExpiryNotice() {
        return this.expiryNotice;
    }

    public void setExpiryNotice(String expiryNotice) {
        this.expiryNotice = expiryNotice;
    }

    public String getLicence() {
        return this.licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getRidesc() {
        return this.ridesc;
    }

    public void setRidesc(String ridesc) {
        this.ridesc = ridesc;
    }

    public String getRlrpfx() {
        return this.rlrpfx;
    }

    public void setRlrpfx(String rlrpfx) {
        this.rlrpfx = rlrpfx;
    }

    public String getRlrcoy() {
        return this.rlrcoy;
    }

    public void setRlrcoy(String rlrcoy) {
        this.rlrcoy = rlrcoy;
    }

    public String getRlracc() {
        return this.rlracc;
    }

    public void setRlracc(String rlracc) {
        this.rlracc = rlracc;
    }

    public String getMsagnt() {
        return this.msagnt;
    }

    public void setMsagnt(String msagnt) {
        this.msagnt = msagnt;
    }

    public String getReportto() {
        return this.reportto;
    }

    public void setReportto(String reportto) {
        this.reportto = reportto;
    }

    public Short getCredittrm() {
        return this.credittrm;
    }

    public void setCredittrm(Short credittrm) {
        this.credittrm = credittrm;
    }

    public String getZbkind() {
        return this.zbkind;
    }

    public void setZbkind(String zbkind) {
        this.zbkind = zbkind;
    }

    public String getZdistrict() {
        return this.zdistrict;
    }

    public void setZdistrict(String zdistrict) {
        this.zdistrict = zdistrict;
    }

    public String getZfgcmtbn() {
        return this.zfgcmtbn;
    }

    public void setZfgcmtbn(String zfgcmtbn) {
        this.zfgcmtbn = zfgcmtbn;
    }

    public String getZstaffcd() {
        return this.zstaffcd;
    }

    public void setZstaffcd(String zstaffcd) {
        this.zstaffcd = zstaffcd;
    }

    public String getBankcode01() {
        return this.bankcode01;
    }

    public void setBankcode01(String bankcode01) {
        this.bankcode01 = bankcode01;
    }

    public String getBankcode02() {
        return this.bankcode02;
    }

    public void setBankcode02(String bankcode02) {
        this.bankcode02 = bankcode02;
    }

    public String getBankcode03() {
        return this.bankcode03;
    }

    public void setBankcode03(String bankcode03) {
        this.bankcode03 = bankcode03;
    }

    public String getBankcode04() {
        return this.bankcode04;
    }

    public void setBankcode04(String bankcode04) {
        this.bankcode04 = bankcode04;
    }

    public String getBankcode05() {
        return this.bankcode05;
    }

    public void setBankcode05(String bankcode05) {
        this.bankcode05 = bankcode05;
    }

    public String getUserProfile() {
        return this.userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public String getJobName() {
        return this.jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Timestamp getDatime() {
        return this.datime;
    }

    public void setDatime(Timestamp datime) {
        this.datime = datime;
    }

    public Timestamp getEbTimestamp() {
        return this.ebTimestamp;
    }

    public void setEbTimestamp(Timestamp ebTimestamp) {
        this.ebTimestamp = ebTimestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CloudGaAgntpf (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("agntpfx :" );
        sb.append(agntpfx);
        sb.append(",").append("agntcoy :" );
        sb.append(agntcoy);
        sb.append(",").append("agntnum :" );
        sb.append(agntnum);
        sb.append(",").append("tranid :" );
        sb.append(tranid);
        sb.append(",").append("validflag :" );
        sb.append(validflag);
        sb.append(",").append("clntpfx :" );
        sb.append(clntpfx);
        sb.append(",").append("clntcoy :" );
        sb.append(clntcoy);
        sb.append(",").append("clntnum :" );
        sb.append(clntnum);
        sb.append(",").append("agntrel :" );
        sb.append(agntrel);
        sb.append(",").append("agtype :" );
        sb.append(agtype);
        sb.append(",").append("agntbr :" );
        sb.append(agntbr);
        sb.append(",").append("replvl :" );
        sb.append(replvl);
        sb.append(",").append("repagent01 :" );
        sb.append(repagent01);
        sb.append(",").append("repagent02 :" );
        sb.append(repagent02);
        sb.append(",").append("repagent03 :" );
        sb.append(repagent03);
        sb.append(",").append("repagent04 :" );
        sb.append(repagent04);
        sb.append(",").append("repagent05 :" );
        sb.append(repagent05);
        sb.append(",").append("repagent06 :" );
        sb.append(repagent06);
        sb.append(",").append("reportag01 :" );
        sb.append(reportag01);
        sb.append(",").append("reportag02 :" );
        sb.append(reportag02);
        sb.append(",").append("reportag03 :" );
        sb.append(reportag03);
        sb.append(",").append("reportag04 :" );
        sb.append(reportag04);
        sb.append(",").append("reportag05 :" );
        sb.append(reportag05);
        sb.append(",").append("reportag06 :" );
        sb.append(reportag06);
        sb.append(",").append("fgagnt :" );
        sb.append(fgagnt);
        sb.append(",").append("fgcommtabl :" );
        sb.append(fgcommtabl);
        sb.append(",").append("lifagnt :" );
        sb.append(lifagnt);
        sb.append(",").append("chdrstcda :" );
        sb.append(chdrstcda);
        sb.append(",").append("chdrstcdb :" );
        sb.append(chdrstcdb);
        sb.append(",").append("chdrstcdc :" );
        sb.append(chdrstcdc);
        sb.append(",").append("chdrstcdd :" );
        sb.append(chdrstcdd);
        sb.append(",").append("chdrstcde :" );
        sb.append(chdrstcde);
        sb.append(",").append("startDate :" );
        sb.append(startDate);
        sb.append(",").append("dateend :" );
        sb.append(dateend);
        sb.append(",").append("contpers :" );
        sb.append(contpers);
        sb.append(",").append("takoagnt :" );
        sb.append(takoagnt);
        sb.append(",").append("accountReconciliation :" );
        sb.append(accountReconciliation);
        sb.append(",").append("statementReqd :" );
        sb.append(statementReqd);
        sb.append(",").append("crterm :" );
        sb.append(crterm);
        sb.append(",").append("crlimit :" );
        sb.append(crlimit);
        sb.append(",").append("stlbasis :" );
        sb.append(stlbasis);
        sb.append(",").append("expiryNotice :" );
        sb.append(expiryNotice);
        sb.append(",").append("licence :" );
        sb.append(licence);
        sb.append(",").append("ridesc :" );
        sb.append(ridesc);
        sb.append(",").append("rlrpfx :" );
        sb.append(rlrpfx);
        sb.append(",").append("rlrcoy :" );
        sb.append(rlrcoy);
        sb.append(",").append("rlracc :" );
        sb.append(rlracc);
        sb.append(",").append("msagnt :" );
        sb.append(msagnt);
        sb.append(",").append("reportto :" );
        sb.append(reportto);
        sb.append(",").append("credittrm :" );
        sb.append(credittrm);
        sb.append(",").append("zbkind :" );
        sb.append(zbkind);
        sb.append(",").append("zdistrict :" );
        sb.append(zdistrict);
        sb.append(",").append("zfgcmtbn :" );
        sb.append(zfgcmtbn);
        sb.append(",").append("zstaffcd :" );
        sb.append(zstaffcd);
        sb.append(",").append("bankcode01 :" );
        sb.append(bankcode01);
        sb.append(",").append("bankcode02 :" );
        sb.append(bankcode02);
        sb.append(",").append("bankcode03 :" );
        sb.append(bankcode03);
        sb.append(",").append("bankcode04 :" );
        sb.append(bankcode04);
        sb.append(",").append("bankcode05 :" );
        sb.append(bankcode05);
        sb.append(",").append("userProfile :" );
        sb.append(userProfile);
        sb.append(",").append("jobName :" );
        sb.append(jobName);
        sb.append(",").append("datime :" );
        sb.append(datime);
        sb.append(",").append("ebTimestamp :" );
        sb.append(ebTimestamp);

        sb.append(")");
        return sb.toString();
    }
}
