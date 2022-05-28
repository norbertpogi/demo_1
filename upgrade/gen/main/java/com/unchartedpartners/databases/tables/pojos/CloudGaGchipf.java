/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
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
public class CloudGaGchipf implements Serializable {

    private static final long serialVersionUID = -1677034821;

    private Long       id;
    private String     chdrcoy;
    private String     chdrnum;
    private Integer    effdate;
    private Integer    ccdate;
    private Integer    crdate;
    private String     prvbilflg;
    private String     billfreq;
    private String     gadjfreq;
    private String     payrpfx;
    private String     payrcoy;
    private String     payrnum;
    private String     agntpfx;
    private String     agntcoy;
    private String     agntnum;
    private String     cntbranch;
    private String     chdrstcda;
    private String     chdrstcdb;
    private String     chdrstcdc;
    private String     chdrstcdd;
    private String     chdrstcde;
    private Integer    btdatenr;
    private Integer    nrisdate;
    private String     termid;
    private Integer    user;
    private Integer    transactionDate;
    private Integer    transactionTime;
    private Integer    tranno;
    private BigDecimal crate;
    private Byte       ternmprm;
    private String     surgschmv;
    private String     areacdemv;
    private String     medprvdr;
    private String     spsmbr;
    private String     childmbr;
    private String     spsmed;
    private String     childmed;
    private String     bankcode;
    private String     billchnl;
    private String     mandref;
    private String     rimthvcd;
    private Integer    prmrvwdt;
    private String     appltyp;
    private String     riind;
    private String     zaainsic;
    private String     userProfile;
    private String     jobName;
    private Timestamp  datime;
    private Long       rrn;
    private Timestamp  ebTimestamp;

    public CloudGaGchipf() {}

    public CloudGaGchipf(CloudGaGchipf value) {
        this.id = value.id;
        this.chdrcoy = value.chdrcoy;
        this.chdrnum = value.chdrnum;
        this.effdate = value.effdate;
        this.ccdate = value.ccdate;
        this.crdate = value.crdate;
        this.prvbilflg = value.prvbilflg;
        this.billfreq = value.billfreq;
        this.gadjfreq = value.gadjfreq;
        this.payrpfx = value.payrpfx;
        this.payrcoy = value.payrcoy;
        this.payrnum = value.payrnum;
        this.agntpfx = value.agntpfx;
        this.agntcoy = value.agntcoy;
        this.agntnum = value.agntnum;
        this.cntbranch = value.cntbranch;
        this.chdrstcda = value.chdrstcda;
        this.chdrstcdb = value.chdrstcdb;
        this.chdrstcdc = value.chdrstcdc;
        this.chdrstcdd = value.chdrstcdd;
        this.chdrstcde = value.chdrstcde;
        this.btdatenr = value.btdatenr;
        this.nrisdate = value.nrisdate;
        this.termid = value.termid;
        this.user = value.user;
        this.transactionDate = value.transactionDate;
        this.transactionTime = value.transactionTime;
        this.tranno = value.tranno;
        this.crate = value.crate;
        this.ternmprm = value.ternmprm;
        this.surgschmv = value.surgschmv;
        this.areacdemv = value.areacdemv;
        this.medprvdr = value.medprvdr;
        this.spsmbr = value.spsmbr;
        this.childmbr = value.childmbr;
        this.spsmed = value.spsmed;
        this.childmed = value.childmed;
        this.bankcode = value.bankcode;
        this.billchnl = value.billchnl;
        this.mandref = value.mandref;
        this.rimthvcd = value.rimthvcd;
        this.prmrvwdt = value.prmrvwdt;
        this.appltyp = value.appltyp;
        this.riind = value.riind;
        this.zaainsic = value.zaainsic;
        this.userProfile = value.userProfile;
        this.jobName = value.jobName;
        this.datime = value.datime;
        this.rrn = value.rrn;
        this.ebTimestamp = value.ebTimestamp;
    }

    public CloudGaGchipf(
        Long       id,
        String     chdrcoy,
        String     chdrnum,
        Integer    effdate,
        Integer    ccdate,
        Integer    crdate,
        String     prvbilflg,
        String     billfreq,
        String     gadjfreq,
        String     payrpfx,
        String     payrcoy,
        String     payrnum,
        String     agntpfx,
        String     agntcoy,
        String     agntnum,
        String     cntbranch,
        String     chdrstcda,
        String     chdrstcdb,
        String     chdrstcdc,
        String     chdrstcdd,
        String     chdrstcde,
        Integer    btdatenr,
        Integer    nrisdate,
        String     termid,
        Integer    user,
        Integer    transactionDate,
        Integer    transactionTime,
        Integer    tranno,
        BigDecimal crate,
        Byte       ternmprm,
        String     surgschmv,
        String     areacdemv,
        String     medprvdr,
        String     spsmbr,
        String     childmbr,
        String     spsmed,
        String     childmed,
        String     bankcode,
        String     billchnl,
        String     mandref,
        String     rimthvcd,
        Integer    prmrvwdt,
        String     appltyp,
        String     riind,
        String     zaainsic,
        String     userProfile,
        String     jobName,
        Timestamp  datime,
        Long       rrn,
        Timestamp  ebTimestamp
    ) {
        this.id = id;
        this.chdrcoy = chdrcoy;
        this.chdrnum = chdrnum;
        this.effdate = effdate;
        this.ccdate = ccdate;
        this.crdate = crdate;
        this.prvbilflg = prvbilflg;
        this.billfreq = billfreq;
        this.gadjfreq = gadjfreq;
        this.payrpfx = payrpfx;
        this.payrcoy = payrcoy;
        this.payrnum = payrnum;
        this.agntpfx = agntpfx;
        this.agntcoy = agntcoy;
        this.agntnum = agntnum;
        this.cntbranch = cntbranch;
        this.chdrstcda = chdrstcda;
        this.chdrstcdb = chdrstcdb;
        this.chdrstcdc = chdrstcdc;
        this.chdrstcdd = chdrstcdd;
        this.chdrstcde = chdrstcde;
        this.btdatenr = btdatenr;
        this.nrisdate = nrisdate;
        this.termid = termid;
        this.user = user;
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.tranno = tranno;
        this.crate = crate;
        this.ternmprm = ternmprm;
        this.surgschmv = surgschmv;
        this.areacdemv = areacdemv;
        this.medprvdr = medprvdr;
        this.spsmbr = spsmbr;
        this.childmbr = childmbr;
        this.spsmed = spsmed;
        this.childmed = childmed;
        this.bankcode = bankcode;
        this.billchnl = billchnl;
        this.mandref = mandref;
        this.rimthvcd = rimthvcd;
        this.prmrvwdt = prmrvwdt;
        this.appltyp = appltyp;
        this.riind = riind;
        this.zaainsic = zaainsic;
        this.userProfile = userProfile;
        this.jobName = jobName;
        this.datime = datime;
        this.rrn = rrn;
        this.ebTimestamp = ebTimestamp;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChdrcoy() {
        return this.chdrcoy;
    }

    public void setChdrcoy(String chdrcoy) {
        this.chdrcoy = chdrcoy;
    }

    public String getChdrnum() {
        return this.chdrnum;
    }

    public void setChdrnum(String chdrnum) {
        this.chdrnum = chdrnum;
    }

    public Integer getEffdate() {
        return this.effdate;
    }

    public void setEffdate(Integer effdate) {
        this.effdate = effdate;
    }

    public Integer getCcdate() {
        return this.ccdate;
    }

    public void setCcdate(Integer ccdate) {
        this.ccdate = ccdate;
    }

    public Integer getCrdate() {
        return this.crdate;
    }

    public void setCrdate(Integer crdate) {
        this.crdate = crdate;
    }

    public String getPrvbilflg() {
        return this.prvbilflg;
    }

    public void setPrvbilflg(String prvbilflg) {
        this.prvbilflg = prvbilflg;
    }

    public String getBillfreq() {
        return this.billfreq;
    }

    public void setBillfreq(String billfreq) {
        this.billfreq = billfreq;
    }

    public String getGadjfreq() {
        return this.gadjfreq;
    }

    public void setGadjfreq(String gadjfreq) {
        this.gadjfreq = gadjfreq;
    }

    public String getPayrpfx() {
        return this.payrpfx;
    }

    public void setPayrpfx(String payrpfx) {
        this.payrpfx = payrpfx;
    }

    public String getPayrcoy() {
        return this.payrcoy;
    }

    public void setPayrcoy(String payrcoy) {
        this.payrcoy = payrcoy;
    }

    public String getPayrnum() {
        return this.payrnum;
    }

    public void setPayrnum(String payrnum) {
        this.payrnum = payrnum;
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

    public String getCntbranch() {
        return this.cntbranch;
    }

    public void setCntbranch(String cntbranch) {
        this.cntbranch = cntbranch;
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

    public Integer getBtdatenr() {
        return this.btdatenr;
    }

    public void setBtdatenr(Integer btdatenr) {
        this.btdatenr = btdatenr;
    }

    public Integer getNrisdate() {
        return this.nrisdate;
    }

    public void setNrisdate(Integer nrisdate) {
        this.nrisdate = nrisdate;
    }

    public String getTermid() {
        return this.termid;
    }

    public void setTermid(String termid) {
        this.termid = termid;
    }

    public Integer getUser() {
        return this.user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(Integer transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getTransactionTime() {
        return this.transactionTime;
    }

    public void setTransactionTime(Integer transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Integer getTranno() {
        return this.tranno;
    }

    public void setTranno(Integer tranno) {
        this.tranno = tranno;
    }

    public BigDecimal getCrate() {
        return this.crate;
    }

    public void setCrate(BigDecimal crate) {
        this.crate = crate;
    }

    public Byte getTernmprm() {
        return this.ternmprm;
    }

    public void setTernmprm(Byte ternmprm) {
        this.ternmprm = ternmprm;
    }

    public String getSurgschmv() {
        return this.surgschmv;
    }

    public void setSurgschmv(String surgschmv) {
        this.surgschmv = surgschmv;
    }

    public String getAreacdemv() {
        return this.areacdemv;
    }

    public void setAreacdemv(String areacdemv) {
        this.areacdemv = areacdemv;
    }

    public String getMedprvdr() {
        return this.medprvdr;
    }

    public void setMedprvdr(String medprvdr) {
        this.medprvdr = medprvdr;
    }

    public String getSpsmbr() {
        return this.spsmbr;
    }

    public void setSpsmbr(String spsmbr) {
        this.spsmbr = spsmbr;
    }

    public String getChildmbr() {
        return this.childmbr;
    }

    public void setChildmbr(String childmbr) {
        this.childmbr = childmbr;
    }

    public String getSpsmed() {
        return this.spsmed;
    }

    public void setSpsmed(String spsmed) {
        this.spsmed = spsmed;
    }

    public String getChildmed() {
        return this.childmed;
    }

    public void setChildmed(String childmed) {
        this.childmed = childmed;
    }

    public String getBankcode() {
        return this.bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getBillchnl() {
        return this.billchnl;
    }

    public void setBillchnl(String billchnl) {
        this.billchnl = billchnl;
    }

    public String getMandref() {
        return this.mandref;
    }

    public void setMandref(String mandref) {
        this.mandref = mandref;
    }

    public String getRimthvcd() {
        return this.rimthvcd;
    }

    public void setRimthvcd(String rimthvcd) {
        this.rimthvcd = rimthvcd;
    }

    public Integer getPrmrvwdt() {
        return this.prmrvwdt;
    }

    public void setPrmrvwdt(Integer prmrvwdt) {
        this.prmrvwdt = prmrvwdt;
    }

    public String getAppltyp() {
        return this.appltyp;
    }

    public void setAppltyp(String appltyp) {
        this.appltyp = appltyp;
    }

    public String getRiind() {
        return this.riind;
    }

    public void setRiind(String riind) {
        this.riind = riind;
    }

    public String getZaainsic() {
        return this.zaainsic;
    }

    public void setZaainsic(String zaainsic) {
        this.zaainsic = zaainsic;
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

    public Long getRrn() {
        return this.rrn;
    }

    public void setRrn(Long rrn) {
        this.rrn = rrn;
    }

    public Timestamp getEbTimestamp() {
        return this.ebTimestamp;
    }

    public void setEbTimestamp(Timestamp ebTimestamp) {
        this.ebTimestamp = ebTimestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CloudGaGchipf (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("chdrcoy :" );
        sb.append(chdrcoy);
        sb.append(",").append("chdrnum :" );
        sb.append(chdrnum);
        sb.append(",").append("effdate :" );
        sb.append(effdate);
        sb.append(",").append("ccdate :" );
        sb.append(ccdate);
        sb.append(",").append("crdate :" );
        sb.append(crdate);
        sb.append(",").append("prvbilflg :" );
        sb.append(prvbilflg);
        sb.append(",").append("billfreq :" );
        sb.append(billfreq);
        sb.append(",").append("gadjfreq :" );
        sb.append(gadjfreq);
        sb.append(",").append("payrpfx :" );
        sb.append(payrpfx);
        sb.append(",").append("payrcoy :" );
        sb.append(payrcoy);
        sb.append(",").append("payrnum :" );
        sb.append(payrnum);
        sb.append(",").append("agntpfx :" );
        sb.append(agntpfx);
        sb.append(",").append("agntcoy :" );
        sb.append(agntcoy);
        sb.append(",").append("agntnum :" );
        sb.append(agntnum);
        sb.append(",").append("cntbranch :" );
        sb.append(cntbranch);
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
        sb.append(",").append("btdatenr :" );
        sb.append(btdatenr);
        sb.append(",").append("nrisdate :" );
        sb.append(nrisdate);
        sb.append(",").append("termid :" );
        sb.append(termid);
        sb.append(",").append("user :" );
        sb.append(user);
        sb.append(",").append("transactionDate :" );
        sb.append(transactionDate);
        sb.append(",").append("transactionTime :" );
        sb.append(transactionTime);
        sb.append(",").append("tranno :" );
        sb.append(tranno);
        sb.append(",").append("crate :" );
        sb.append(crate);
        sb.append(",").append("ternmprm :" );
        sb.append(ternmprm);
        sb.append(",").append("surgschmv :" );
        sb.append(surgschmv);
        sb.append(",").append("areacdemv :" );
        sb.append(areacdemv);
        sb.append(",").append("medprvdr :" );
        sb.append(medprvdr);
        sb.append(",").append("spsmbr :" );
        sb.append(spsmbr);
        sb.append(",").append("childmbr :" );
        sb.append(childmbr);
        sb.append(",").append("spsmed :" );
        sb.append(spsmed);
        sb.append(",").append("childmed :" );
        sb.append(childmed);
        sb.append(",").append("bankcode :" );
        sb.append(bankcode);
        sb.append(",").append("billchnl :" );
        sb.append(billchnl);
        sb.append(",").append("mandref :" );
        sb.append(mandref);
        sb.append(",").append("rimthvcd :" );
        sb.append(rimthvcd);
        sb.append(",").append("prmrvwdt :" );
        sb.append(prmrvwdt);
        sb.append(",").append("appltyp :" );
        sb.append(appltyp);
        sb.append(",").append("riind :" );
        sb.append(riind);
        sb.append(",").append("zaainsic :" );
        sb.append(zaainsic);
        sb.append(",").append("userProfile :" );
        sb.append(userProfile);
        sb.append(",").append("jobName :" );
        sb.append(jobName);
        sb.append(",").append("datime :" );
        sb.append(datime);
        sb.append(",").append("rrn :" );
        sb.append(rrn);
        sb.append(",").append("ebTimestamp :" );
        sb.append(ebTimestamp);

        sb.append(")");
        return sb.toString();
    }
}
