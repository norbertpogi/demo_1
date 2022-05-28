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
public class GaGphdpf implements Serializable {

    private static final long serialVersionUID = -427672046;

    private Long       id;
    private String     chdrcoy;
    private String     chdrnum;
    private String     prodtyp;
    private Integer    dteatt;
    private String     contype;
    private String     agrindem;
    private Integer    dteidm;
    private String     medevd;
    private Integer    dtetrm;
    private String     reasontrm;
    private String     termid;
    private Integer    user;
    private Integer    transactionDate;
    private Integer    transactionTime;
    private Integer    tranno;
    private String     prvcond;
    private BigDecimal prvamts;
    private BigDecimal prvamtm;
    private Short      preexibef;
    private Short      preexiaft;
    private String     gsttype;
    private String     pm06key;
    private String     ectbrule;
    private String     invfmix;
    private String     bftdsn;
    private String     paymmode;
    private String     invslvl;
    private String     acblrule;
    private String     prmpyopt;
    private String     prtebflg;
    private String     trustee;
    private String     glbfeesc;
    private String     actexflg;
    private BigDecimal mbrfee;
    private String     frfund;
    private BigDecimal evntfee;
    private BigDecimal timefee;
    private Integer    feebtdte;
    private String     userProfile;
    private String     jobName;
    private Timestamp  datime;
    private Timestamp  ebTimestamp;

    public GaGphdpf() {}

    public GaGphdpf(GaGphdpf value) {
        this.id = value.id;
        this.chdrcoy = value.chdrcoy;
        this.chdrnum = value.chdrnum;
        this.prodtyp = value.prodtyp;
        this.dteatt = value.dteatt;
        this.contype = value.contype;
        this.agrindem = value.agrindem;
        this.dteidm = value.dteidm;
        this.medevd = value.medevd;
        this.dtetrm = value.dtetrm;
        this.reasontrm = value.reasontrm;
        this.termid = value.termid;
        this.user = value.user;
        this.transactionDate = value.transactionDate;
        this.transactionTime = value.transactionTime;
        this.tranno = value.tranno;
        this.prvcond = value.prvcond;
        this.prvamts = value.prvamts;
        this.prvamtm = value.prvamtm;
        this.preexibef = value.preexibef;
        this.preexiaft = value.preexiaft;
        this.gsttype = value.gsttype;
        this.pm06key = value.pm06key;
        this.ectbrule = value.ectbrule;
        this.invfmix = value.invfmix;
        this.bftdsn = value.bftdsn;
        this.paymmode = value.paymmode;
        this.invslvl = value.invslvl;
        this.acblrule = value.acblrule;
        this.prmpyopt = value.prmpyopt;
        this.prtebflg = value.prtebflg;
        this.trustee = value.trustee;
        this.glbfeesc = value.glbfeesc;
        this.actexflg = value.actexflg;
        this.mbrfee = value.mbrfee;
        this.frfund = value.frfund;
        this.evntfee = value.evntfee;
        this.timefee = value.timefee;
        this.feebtdte = value.feebtdte;
        this.userProfile = value.userProfile;
        this.jobName = value.jobName;
        this.datime = value.datime;
        this.ebTimestamp = value.ebTimestamp;
    }

    public GaGphdpf(
        Long       id,
        String     chdrcoy,
        String     chdrnum,
        String     prodtyp,
        Integer    dteatt,
        String     contype,
        String     agrindem,
        Integer    dteidm,
        String     medevd,
        Integer    dtetrm,
        String     reasontrm,
        String     termid,
        Integer    user,
        Integer    transactionDate,
        Integer    transactionTime,
        Integer    tranno,
        String     prvcond,
        BigDecimal prvamts,
        BigDecimal prvamtm,
        Short      preexibef,
        Short      preexiaft,
        String     gsttype,
        String     pm06key,
        String     ectbrule,
        String     invfmix,
        String     bftdsn,
        String     paymmode,
        String     invslvl,
        String     acblrule,
        String     prmpyopt,
        String     prtebflg,
        String     trustee,
        String     glbfeesc,
        String     actexflg,
        BigDecimal mbrfee,
        String     frfund,
        BigDecimal evntfee,
        BigDecimal timefee,
        Integer    feebtdte,
        String     userProfile,
        String     jobName,
        Timestamp  datime,
        Timestamp  ebTimestamp
    ) {
        this.id = id;
        this.chdrcoy = chdrcoy;
        this.chdrnum = chdrnum;
        this.prodtyp = prodtyp;
        this.dteatt = dteatt;
        this.contype = contype;
        this.agrindem = agrindem;
        this.dteidm = dteidm;
        this.medevd = medevd;
        this.dtetrm = dtetrm;
        this.reasontrm = reasontrm;
        this.termid = termid;
        this.user = user;
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.tranno = tranno;
        this.prvcond = prvcond;
        this.prvamts = prvamts;
        this.prvamtm = prvamtm;
        this.preexibef = preexibef;
        this.preexiaft = preexiaft;
        this.gsttype = gsttype;
        this.pm06key = pm06key;
        this.ectbrule = ectbrule;
        this.invfmix = invfmix;
        this.bftdsn = bftdsn;
        this.paymmode = paymmode;
        this.invslvl = invslvl;
        this.acblrule = acblrule;
        this.prmpyopt = prmpyopt;
        this.prtebflg = prtebflg;
        this.trustee = trustee;
        this.glbfeesc = glbfeesc;
        this.actexflg = actexflg;
        this.mbrfee = mbrfee;
        this.frfund = frfund;
        this.evntfee = evntfee;
        this.timefee = timefee;
        this.feebtdte = feebtdte;
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

    public String getProdtyp() {
        return this.prodtyp;
    }

    public void setProdtyp(String prodtyp) {
        this.prodtyp = prodtyp;
    }

    public Integer getDteatt() {
        return this.dteatt;
    }

    public void setDteatt(Integer dteatt) {
        this.dteatt = dteatt;
    }

    public String getContype() {
        return this.contype;
    }

    public void setContype(String contype) {
        this.contype = contype;
    }

    public String getAgrindem() {
        return this.agrindem;
    }

    public void setAgrindem(String agrindem) {
        this.agrindem = agrindem;
    }

    public Integer getDteidm() {
        return this.dteidm;
    }

    public void setDteidm(Integer dteidm) {
        this.dteidm = dteidm;
    }

    public String getMedevd() {
        return this.medevd;
    }

    public void setMedevd(String medevd) {
        this.medevd = medevd;
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

    public String getPrvcond() {
        return this.prvcond;
    }

    public void setPrvcond(String prvcond) {
        this.prvcond = prvcond;
    }

    public BigDecimal getPrvamts() {
        return this.prvamts;
    }

    public void setPrvamts(BigDecimal prvamts) {
        this.prvamts = prvamts;
    }

    public BigDecimal getPrvamtm() {
        return this.prvamtm;
    }

    public void setPrvamtm(BigDecimal prvamtm) {
        this.prvamtm = prvamtm;
    }

    public Short getPreexibef() {
        return this.preexibef;
    }

    public void setPreexibef(Short preexibef) {
        this.preexibef = preexibef;
    }

    public Short getPreexiaft() {
        return this.preexiaft;
    }

    public void setPreexiaft(Short preexiaft) {
        this.preexiaft = preexiaft;
    }

    public String getGsttype() {
        return this.gsttype;
    }

    public void setGsttype(String gsttype) {
        this.gsttype = gsttype;
    }

    public String getPm06key() {
        return this.pm06key;
    }

    public void setPm06key(String pm06key) {
        this.pm06key = pm06key;
    }

    public String getEctbrule() {
        return this.ectbrule;
    }

    public void setEctbrule(String ectbrule) {
        this.ectbrule = ectbrule;
    }

    public String getInvfmix() {
        return this.invfmix;
    }

    public void setInvfmix(String invfmix) {
        this.invfmix = invfmix;
    }

    public String getBftdsn() {
        return this.bftdsn;
    }

    public void setBftdsn(String bftdsn) {
        this.bftdsn = bftdsn;
    }

    public String getPaymmode() {
        return this.paymmode;
    }

    public void setPaymmode(String paymmode) {
        this.paymmode = paymmode;
    }

    public String getInvslvl() {
        return this.invslvl;
    }

    public void setInvslvl(String invslvl) {
        this.invslvl = invslvl;
    }

    public String getAcblrule() {
        return this.acblrule;
    }

    public void setAcblrule(String acblrule) {
        this.acblrule = acblrule;
    }

    public String getPrmpyopt() {
        return this.prmpyopt;
    }

    public void setPrmpyopt(String prmpyopt) {
        this.prmpyopt = prmpyopt;
    }

    public String getPrtebflg() {
        return this.prtebflg;
    }

    public void setPrtebflg(String prtebflg) {
        this.prtebflg = prtebflg;
    }

    public String getTrustee() {
        return this.trustee;
    }

    public void setTrustee(String trustee) {
        this.trustee = trustee;
    }

    public String getGlbfeesc() {
        return this.glbfeesc;
    }

    public void setGlbfeesc(String glbfeesc) {
        this.glbfeesc = glbfeesc;
    }

    public String getActexflg() {
        return this.actexflg;
    }

    public void setActexflg(String actexflg) {
        this.actexflg = actexflg;
    }

    public BigDecimal getMbrfee() {
        return this.mbrfee;
    }

    public void setMbrfee(BigDecimal mbrfee) {
        this.mbrfee = mbrfee;
    }

    public String getFrfund() {
        return this.frfund;
    }

    public void setFrfund(String frfund) {
        this.frfund = frfund;
    }

    public BigDecimal getEvntfee() {
        return this.evntfee;
    }

    public void setEvntfee(BigDecimal evntfee) {
        this.evntfee = evntfee;
    }

    public BigDecimal getTimefee() {
        return this.timefee;
    }

    public void setTimefee(BigDecimal timefee) {
        this.timefee = timefee;
    }

    public Integer getFeebtdte() {
        return this.feebtdte;
    }

    public void setFeebtdte(Integer feebtdte) {
        this.feebtdte = feebtdte;
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
        StringBuilder sb = new StringBuilder("GaGphdpf (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("chdrcoy :" );
        sb.append(chdrcoy);
        sb.append(",").append("chdrnum :" );
        sb.append(chdrnum);
        sb.append(",").append("prodtyp :" );
        sb.append(prodtyp);
        sb.append(",").append("dteatt :" );
        sb.append(dteatt);
        sb.append(",").append("contype :" );
        sb.append(contype);
        sb.append(",").append("agrindem :" );
        sb.append(agrindem);
        sb.append(",").append("dteidm :" );
        sb.append(dteidm);
        sb.append(",").append("medevd :" );
        sb.append(medevd);
        sb.append(",").append("dtetrm :" );
        sb.append(dtetrm);
        sb.append(",").append("reasontrm :" );
        sb.append(reasontrm);
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
        sb.append(",").append("prvcond :" );
        sb.append(prvcond);
        sb.append(",").append("prvamts :" );
        sb.append(prvamts);
        sb.append(",").append("prvamtm :" );
        sb.append(prvamtm);
        sb.append(",").append("preexibef :" );
        sb.append(preexibef);
        sb.append(",").append("preexiaft :" );
        sb.append(preexiaft);
        sb.append(",").append("gsttype :" );
        sb.append(gsttype);
        sb.append(",").append("pm06key :" );
        sb.append(pm06key);
        sb.append(",").append("ectbrule :" );
        sb.append(ectbrule);
        sb.append(",").append("invfmix :" );
        sb.append(invfmix);
        sb.append(",").append("bftdsn :" );
        sb.append(bftdsn);
        sb.append(",").append("paymmode :" );
        sb.append(paymmode);
        sb.append(",").append("invslvl :" );
        sb.append(invslvl);
        sb.append(",").append("acblrule :" );
        sb.append(acblrule);
        sb.append(",").append("prmpyopt :" );
        sb.append(prmpyopt);
        sb.append(",").append("prtebflg :" );
        sb.append(prtebflg);
        sb.append(",").append("trustee :" );
        sb.append(trustee);
        sb.append(",").append("glbfeesc :" );
        sb.append(glbfeesc);
        sb.append(",").append("actexflg :" );
        sb.append(actexflg);
        sb.append(",").append("mbrfee :" );
        sb.append(mbrfee);
        sb.append(",").append("frfund :" );
        sb.append(frfund);
        sb.append(",").append("evntfee :" );
        sb.append(evntfee);
        sb.append(",").append("timefee :" );
        sb.append(timefee);
        sb.append(",").append("feebtdte :" );
        sb.append(feebtdte);
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