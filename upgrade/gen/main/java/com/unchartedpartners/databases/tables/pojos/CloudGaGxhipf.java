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
public class CloudGaGxhipf implements Serializable {

    private static final long serialVersionUID = 1915554849;

    private Long       id;
    private String     chdrcoy;
    private String     chdrnum;
    private String     mbrno;
    private String     prodtyp;
    private String     planno;
    private Integer    effdate;
    private String     fmlycde;
    private Integer    dteatt;
    private Integer    dtetrm;
    private String     reasontrm;
    private Long       xcesssi;
    private Integer    aprvdate;
    private Integer    accptdte;
    private String     spectrm;
    private BigDecimal extrprm;
    private BigDecimal suminsu;
    private String     decflg;
    private String     termid;
    private Integer    user;
    private Integer    transactionDate;
    private Integer    transactionTime;
    private Integer    tranno;
    private String     headno;
    private String     dpntno;
    private Short      emload;
    private BigDecimal oaload;
    private String     billactn;
    private String     impaircd01;
    private String     impaircd02;
    private String     impaircd03;
    private Short      riemload;
    private BigDecimal rioaload;
    private Long       usersi;
    private String     userProfile;
    private String     jobName;
    private Timestamp  datime;
    private Timestamp  ebTimestamp;

    public CloudGaGxhipf() {}

    public CloudGaGxhipf(CloudGaGxhipf value) {
        this.id = value.id;
        this.chdrcoy = value.chdrcoy;
        this.chdrnum = value.chdrnum;
        this.mbrno = value.mbrno;
        this.prodtyp = value.prodtyp;
        this.planno = value.planno;
        this.effdate = value.effdate;
        this.fmlycde = value.fmlycde;
        this.dteatt = value.dteatt;
        this.dtetrm = value.dtetrm;
        this.reasontrm = value.reasontrm;
        this.xcesssi = value.xcesssi;
        this.aprvdate = value.aprvdate;
        this.accptdte = value.accptdte;
        this.spectrm = value.spectrm;
        this.extrprm = value.extrprm;
        this.suminsu = value.suminsu;
        this.decflg = value.decflg;
        this.termid = value.termid;
        this.user = value.user;
        this.transactionDate = value.transactionDate;
        this.transactionTime = value.transactionTime;
        this.tranno = value.tranno;
        this.headno = value.headno;
        this.dpntno = value.dpntno;
        this.emload = value.emload;
        this.oaload = value.oaload;
        this.billactn = value.billactn;
        this.impaircd01 = value.impaircd01;
        this.impaircd02 = value.impaircd02;
        this.impaircd03 = value.impaircd03;
        this.riemload = value.riemload;
        this.rioaload = value.rioaload;
        this.usersi = value.usersi;
        this.userProfile = value.userProfile;
        this.jobName = value.jobName;
        this.datime = value.datime;
        this.ebTimestamp = value.ebTimestamp;
    }

    public CloudGaGxhipf(
        Long       id,
        String     chdrcoy,
        String     chdrnum,
        String     mbrno,
        String     prodtyp,
        String     planno,
        Integer    effdate,
        String     fmlycde,
        Integer    dteatt,
        Integer    dtetrm,
        String     reasontrm,
        Long       xcesssi,
        Integer    aprvdate,
        Integer    accptdte,
        String     spectrm,
        BigDecimal extrprm,
        BigDecimal suminsu,
        String     decflg,
        String     termid,
        Integer    user,
        Integer    transactionDate,
        Integer    transactionTime,
        Integer    tranno,
        String     headno,
        String     dpntno,
        Short      emload,
        BigDecimal oaload,
        String     billactn,
        String     impaircd01,
        String     impaircd02,
        String     impaircd03,
        Short      riemload,
        BigDecimal rioaload,
        Long       usersi,
        String     userProfile,
        String     jobName,
        Timestamp  datime,
        Timestamp  ebTimestamp
    ) {
        this.id = id;
        this.chdrcoy = chdrcoy;
        this.chdrnum = chdrnum;
        this.mbrno = mbrno;
        this.prodtyp = prodtyp;
        this.planno = planno;
        this.effdate = effdate;
        this.fmlycde = fmlycde;
        this.dteatt = dteatt;
        this.dtetrm = dtetrm;
        this.reasontrm = reasontrm;
        this.xcesssi = xcesssi;
        this.aprvdate = aprvdate;
        this.accptdte = accptdte;
        this.spectrm = spectrm;
        this.extrprm = extrprm;
        this.suminsu = suminsu;
        this.decflg = decflg;
        this.termid = termid;
        this.user = user;
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.tranno = tranno;
        this.headno = headno;
        this.dpntno = dpntno;
        this.emload = emload;
        this.oaload = oaload;
        this.billactn = billactn;
        this.impaircd01 = impaircd01;
        this.impaircd02 = impaircd02;
        this.impaircd03 = impaircd03;
        this.riemload = riemload;
        this.rioaload = rioaload;
        this.usersi = usersi;
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

    public String getMbrno() {
        return this.mbrno;
    }

    public void setMbrno(String mbrno) {
        this.mbrno = mbrno;
    }

    public String getProdtyp() {
        return this.prodtyp;
    }

    public void setProdtyp(String prodtyp) {
        this.prodtyp = prodtyp;
    }

    public String getPlanno() {
        return this.planno;
    }

    public void setPlanno(String planno) {
        this.planno = planno;
    }

    public Integer getEffdate() {
        return this.effdate;
    }

    public void setEffdate(Integer effdate) {
        this.effdate = effdate;
    }

    public String getFmlycde() {
        return this.fmlycde;
    }

    public void setFmlycde(String fmlycde) {
        this.fmlycde = fmlycde;
    }

    public Integer getDteatt() {
        return this.dteatt;
    }

    public void setDteatt(Integer dteatt) {
        this.dteatt = dteatt;
    }

    public Integer getDtetrm() {
        return this.dtetrm;
    }

    public void setDtetrm(Integer dtetrm) {
        this.dtetrm = dtetrm;
    }

    public String getReasontrm() {
        return this.reasontrm;
    }

    public void setReasontrm(String reasontrm) {
        this.reasontrm = reasontrm;
    }

    public Long getXcesssi() {
        return this.xcesssi;
    }

    public void setXcesssi(Long xcesssi) {
        this.xcesssi = xcesssi;
    }

    public Integer getAprvdate() {
        return this.aprvdate;
    }

    public void setAprvdate(Integer aprvdate) {
        this.aprvdate = aprvdate;
    }

    public Integer getAccptdte() {
        return this.accptdte;
    }

    public void setAccptdte(Integer accptdte) {
        this.accptdte = accptdte;
    }

    public String getSpectrm() {
        return this.spectrm;
    }

    public void setSpectrm(String spectrm) {
        this.spectrm = spectrm;
    }

    public BigDecimal getExtrprm() {
        return this.extrprm;
    }

    public void setExtrprm(BigDecimal extrprm) {
        this.extrprm = extrprm;
    }

    public BigDecimal getSuminsu() {
        return this.suminsu;
    }

    public void setSuminsu(BigDecimal suminsu) {
        this.suminsu = suminsu;
    }

    public String getDecflg() {
        return this.decflg;
    }

    public void setDecflg(String decflg) {
        this.decflg = decflg;
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

    public String getHeadno() {
        return this.headno;
    }

    public void setHeadno(String headno) {
        this.headno = headno;
    }

    public String getDpntno() {
        return this.dpntno;
    }

    public void setDpntno(String dpntno) {
        this.dpntno = dpntno;
    }

    public Short getEmload() {
        return this.emload;
    }

    public void setEmload(Short emload) {
        this.emload = emload;
    }

    public BigDecimal getOaload() {
        return this.oaload;
    }

    public void setOaload(BigDecimal oaload) {
        this.oaload = oaload;
    }

    public String getBillactn() {
        return this.billactn;
    }

    public void setBillactn(String billactn) {
        this.billactn = billactn;
    }

    public String getImpaircd01() {
        return this.impaircd01;
    }

    public void setImpaircd01(String impaircd01) {
        this.impaircd01 = impaircd01;
    }

    public String getImpaircd02() {
        return this.impaircd02;
    }

    public void setImpaircd02(String impaircd02) {
        this.impaircd02 = impaircd02;
    }

    public String getImpaircd03() {
        return this.impaircd03;
    }

    public void setImpaircd03(String impaircd03) {
        this.impaircd03 = impaircd03;
    }

    public Short getRiemload() {
        return this.riemload;
    }

    public void setRiemload(Short riemload) {
        this.riemload = riemload;
    }

    public BigDecimal getRioaload() {
        return this.rioaload;
    }

    public void setRioaload(BigDecimal rioaload) {
        this.rioaload = rioaload;
    }

    public Long getUsersi() {
        return this.usersi;
    }

    public void setUsersi(Long usersi) {
        this.usersi = usersi;
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
        StringBuilder sb = new StringBuilder("CloudGaGxhipf (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("chdrcoy :" );
        sb.append(chdrcoy);
        sb.append(",").append("chdrnum :" );
        sb.append(chdrnum);
        sb.append(",").append("mbrno :" );
        sb.append(mbrno);
        sb.append(",").append("prodtyp :" );
        sb.append(prodtyp);
        sb.append(",").append("planno :" );
        sb.append(planno);
        sb.append(",").append("effdate :" );
        sb.append(effdate);
        sb.append(",").append("fmlycde :" );
        sb.append(fmlycde);
        sb.append(",").append("dteatt :" );
        sb.append(dteatt);
        sb.append(",").append("dtetrm :" );
        sb.append(dtetrm);
        sb.append(",").append("reasontrm :" );
        sb.append(reasontrm);
        sb.append(",").append("xcesssi :" );
        sb.append(xcesssi);
        sb.append(",").append("aprvdate :" );
        sb.append(aprvdate);
        sb.append(",").append("accptdte :" );
        sb.append(accptdte);
        sb.append(",").append("spectrm :" );
        sb.append(spectrm);
        sb.append(",").append("extrprm :" );
        sb.append(extrprm);
        sb.append(",").append("suminsu :" );
        sb.append(suminsu);
        sb.append(",").append("decflg :" );
        sb.append(decflg);
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
        sb.append(",").append("headno :" );
        sb.append(headno);
        sb.append(",").append("dpntno :" );
        sb.append(dpntno);
        sb.append(",").append("emload :" );
        sb.append(emload);
        sb.append(",").append("oaload :" );
        sb.append(oaload);
        sb.append(",").append("billactn :" );
        sb.append(billactn);
        sb.append(",").append("impaircd01 :" );
        sb.append(impaircd01);
        sb.append(",").append("impaircd02 :" );
        sb.append(impaircd02);
        sb.append(",").append("impaircd03 :" );
        sb.append(impaircd03);
        sb.append(",").append("riemload :" );
        sb.append(riemload);
        sb.append(",").append("rioaload :" );
        sb.append(rioaload);
        sb.append(",").append("usersi :" );
        sb.append(usersi);
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
