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
public class CloudGaGclhpf implements Serializable {

    private static final long serialVersionUID = 541886812;

    private Long       id;
    private String     clmcoy;
    private String     clamnum;
    private String     gcoccno;
    private String     chdrnum;
    private String     mbrno;
    private String     dpntno;
    private String     clntcoy;
    private String     clntnum;
    private String     gcsts;
    private String     claimcur;
    private BigDecimal crate;
    private String     prodtyp;
    private String     grskcls;
    private Integer    dtevisit;
    private Integer    dtedchrg;
    private String     gcdiagcd;
    private String     planno;
    private String     preautno;
    private String     provorg;
    private String     areacde;
    private String     referrer;
    private String     clamtype;
    private Byte       timehh;
    private Byte       timemm;
    private String     clientClaimRef;
    private String     gcdthclm;
    private BigDecimal apaidamt;
    private String     reqntype;
    private String     crdtcard;
    private String     whopaid;
    private Integer    dteknown;
    private Integer    gcfrpdte;
    private Integer    recvdDate;
    private Integer    mcfrom;
    private Integer    mcto;
    private Long       gdeduct;
    private Short      copay;
    private String     mbrtype;
    private String     provnet;
    private Long       aad;
    private String     thirdrcvy;
    private String     thirdparty;
    private BigDecimal tlmbrshr;
    private BigDecimal tlhmoshr;
    private Integer    dateauth;
    private String     gcauthby;
    private String     gcoprscd;
    private String     revlink;
    private String     reversalInd;
    private String     tprcvpnd;
    private String     pendfrom;
    private String     mmprod;
    private BigDecimal hmoshrmm;
    private String     takeup;
    private String     dataconv;
    private BigDecimal clrate;
    private String     refno;
    private String     updateInd;
    private String     userProfile;
    private String     jobName;
    private Timestamp  datime;
    private Timestamp  ebTimestamp;

    public CloudGaGclhpf() {}

    public CloudGaGclhpf(CloudGaGclhpf value) {
        this.id = value.id;
        this.clmcoy = value.clmcoy;
        this.clamnum = value.clamnum;
        this.gcoccno = value.gcoccno;
        this.chdrnum = value.chdrnum;
        this.mbrno = value.mbrno;
        this.dpntno = value.dpntno;
        this.clntcoy = value.clntcoy;
        this.clntnum = value.clntnum;
        this.gcsts = value.gcsts;
        this.claimcur = value.claimcur;
        this.crate = value.crate;
        this.prodtyp = value.prodtyp;
        this.grskcls = value.grskcls;
        this.dtevisit = value.dtevisit;
        this.dtedchrg = value.dtedchrg;
        this.gcdiagcd = value.gcdiagcd;
        this.planno = value.planno;
        this.preautno = value.preautno;
        this.provorg = value.provorg;
        this.areacde = value.areacde;
        this.referrer = value.referrer;
        this.clamtype = value.clamtype;
        this.timehh = value.timehh;
        this.timemm = value.timemm;
        this.clientClaimRef = value.clientClaimRef;
        this.gcdthclm = value.gcdthclm;
        this.apaidamt = value.apaidamt;
        this.reqntype = value.reqntype;
        this.crdtcard = value.crdtcard;
        this.whopaid = value.whopaid;
        this.dteknown = value.dteknown;
        this.gcfrpdte = value.gcfrpdte;
        this.recvdDate = value.recvdDate;
        this.mcfrom = value.mcfrom;
        this.mcto = value.mcto;
        this.gdeduct = value.gdeduct;
        this.copay = value.copay;
        this.mbrtype = value.mbrtype;
        this.provnet = value.provnet;
        this.aad = value.aad;
        this.thirdrcvy = value.thirdrcvy;
        this.thirdparty = value.thirdparty;
        this.tlmbrshr = value.tlmbrshr;
        this.tlhmoshr = value.tlhmoshr;
        this.dateauth = value.dateauth;
        this.gcauthby = value.gcauthby;
        this.gcoprscd = value.gcoprscd;
        this.revlink = value.revlink;
        this.reversalInd = value.reversalInd;
        this.tprcvpnd = value.tprcvpnd;
        this.pendfrom = value.pendfrom;
        this.mmprod = value.mmprod;
        this.hmoshrmm = value.hmoshrmm;
        this.takeup = value.takeup;
        this.dataconv = value.dataconv;
        this.clrate = value.clrate;
        this.refno = value.refno;
        this.updateInd = value.updateInd;
        this.userProfile = value.userProfile;
        this.jobName = value.jobName;
        this.datime = value.datime;
        this.ebTimestamp = value.ebTimestamp;
    }

    public CloudGaGclhpf(
        Long       id,
        String     clmcoy,
        String     clamnum,
        String     gcoccno,
        String     chdrnum,
        String     mbrno,
        String     dpntno,
        String     clntcoy,
        String     clntnum,
        String     gcsts,
        String     claimcur,
        BigDecimal crate,
        String     prodtyp,
        String     grskcls,
        Integer    dtevisit,
        Integer    dtedchrg,
        String     gcdiagcd,
        String     planno,
        String     preautno,
        String     provorg,
        String     areacde,
        String     referrer,
        String     clamtype,
        Byte       timehh,
        Byte       timemm,
        String     clientClaimRef,
        String     gcdthclm,
        BigDecimal apaidamt,
        String     reqntype,
        String     crdtcard,
        String     whopaid,
        Integer    dteknown,
        Integer    gcfrpdte,
        Integer    recvdDate,
        Integer    mcfrom,
        Integer    mcto,
        Long       gdeduct,
        Short      copay,
        String     mbrtype,
        String     provnet,
        Long       aad,
        String     thirdrcvy,
        String     thirdparty,
        BigDecimal tlmbrshr,
        BigDecimal tlhmoshr,
        Integer    dateauth,
        String     gcauthby,
        String     gcoprscd,
        String     revlink,
        String     reversalInd,
        String     tprcvpnd,
        String     pendfrom,
        String     mmprod,
        BigDecimal hmoshrmm,
        String     takeup,
        String     dataconv,
        BigDecimal clrate,
        String     refno,
        String     updateInd,
        String     userProfile,
        String     jobName,
        Timestamp  datime,
        Timestamp  ebTimestamp
    ) {
        this.id = id;
        this.clmcoy = clmcoy;
        this.clamnum = clamnum;
        this.gcoccno = gcoccno;
        this.chdrnum = chdrnum;
        this.mbrno = mbrno;
        this.dpntno = dpntno;
        this.clntcoy = clntcoy;
        this.clntnum = clntnum;
        this.gcsts = gcsts;
        this.claimcur = claimcur;
        this.crate = crate;
        this.prodtyp = prodtyp;
        this.grskcls = grskcls;
        this.dtevisit = dtevisit;
        this.dtedchrg = dtedchrg;
        this.gcdiagcd = gcdiagcd;
        this.planno = planno;
        this.preautno = preautno;
        this.provorg = provorg;
        this.areacde = areacde;
        this.referrer = referrer;
        this.clamtype = clamtype;
        this.timehh = timehh;
        this.timemm = timemm;
        this.clientClaimRef = clientClaimRef;
        this.gcdthclm = gcdthclm;
        this.apaidamt = apaidamt;
        this.reqntype = reqntype;
        this.crdtcard = crdtcard;
        this.whopaid = whopaid;
        this.dteknown = dteknown;
        this.gcfrpdte = gcfrpdte;
        this.recvdDate = recvdDate;
        this.mcfrom = mcfrom;
        this.mcto = mcto;
        this.gdeduct = gdeduct;
        this.copay = copay;
        this.mbrtype = mbrtype;
        this.provnet = provnet;
        this.aad = aad;
        this.thirdrcvy = thirdrcvy;
        this.thirdparty = thirdparty;
        this.tlmbrshr = tlmbrshr;
        this.tlhmoshr = tlhmoshr;
        this.dateauth = dateauth;
        this.gcauthby = gcauthby;
        this.gcoprscd = gcoprscd;
        this.revlink = revlink;
        this.reversalInd = reversalInd;
        this.tprcvpnd = tprcvpnd;
        this.pendfrom = pendfrom;
        this.mmprod = mmprod;
        this.hmoshrmm = hmoshrmm;
        this.takeup = takeup;
        this.dataconv = dataconv;
        this.clrate = clrate;
        this.refno = refno;
        this.updateInd = updateInd;
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

    public String getClmcoy() {
        return this.clmcoy;
    }

    public void setClmcoy(String clmcoy) {
        this.clmcoy = clmcoy;
    }

    public String getClamnum() {
        return this.clamnum;
    }

    public void setClamnum(String clamnum) {
        this.clamnum = clamnum;
    }

    public String getGcoccno() {
        return this.gcoccno;
    }

    public void setGcoccno(String gcoccno) {
        this.gcoccno = gcoccno;
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

    public String getDpntno() {
        return this.dpntno;
    }

    public void setDpntno(String dpntno) {
        this.dpntno = dpntno;
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

    public String getGcsts() {
        return this.gcsts;
    }

    public void setGcsts(String gcsts) {
        this.gcsts = gcsts;
    }

    public String getClaimcur() {
        return this.claimcur;
    }

    public void setClaimcur(String claimcur) {
        this.claimcur = claimcur;
    }

    public BigDecimal getCrate() {
        return this.crate;
    }

    public void setCrate(BigDecimal crate) {
        this.crate = crate;
    }

    public String getProdtyp() {
        return this.prodtyp;
    }

    public void setProdtyp(String prodtyp) {
        this.prodtyp = prodtyp;
    }

    public String getGrskcls() {
        return this.grskcls;
    }

    public void setGrskcls(String grskcls) {
        this.grskcls = grskcls;
    }

    public Integer getDtevisit() {
        return this.dtevisit;
    }

    public void setDtevisit(Integer dtevisit) {
        this.dtevisit = dtevisit;
    }

    public Integer getDtedchrg() {
        return this.dtedchrg;
    }

    public void setDtedchrg(Integer dtedchrg) {
        this.dtedchrg = dtedchrg;
    }

    public String getGcdiagcd() {
        return this.gcdiagcd;
    }

    public void setGcdiagcd(String gcdiagcd) {
        this.gcdiagcd = gcdiagcd;
    }

    public String getPlanno() {
        return this.planno;
    }

    public void setPlanno(String planno) {
        this.planno = planno;
    }

    public String getPreautno() {
        return this.preautno;
    }

    public void setPreautno(String preautno) {
        this.preautno = preautno;
    }

    public String getProvorg() {
        return this.provorg;
    }

    public void setProvorg(String provorg) {
        this.provorg = provorg;
    }

    public String getAreacde() {
        return this.areacde;
    }

    public void setAreacde(String areacde) {
        this.areacde = areacde;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getClamtype() {
        return this.clamtype;
    }

    public void setClamtype(String clamtype) {
        this.clamtype = clamtype;
    }

    public Byte getTimehh() {
        return this.timehh;
    }

    public void setTimehh(Byte timehh) {
        this.timehh = timehh;
    }

    public Byte getTimemm() {
        return this.timemm;
    }

    public void setTimemm(Byte timemm) {
        this.timemm = timemm;
    }

    public String getClientClaimRef() {
        return this.clientClaimRef;
    }

    public void setClientClaimRef(String clientClaimRef) {
        this.clientClaimRef = clientClaimRef;
    }

    public String getGcdthclm() {
        return this.gcdthclm;
    }

    public void setGcdthclm(String gcdthclm) {
        this.gcdthclm = gcdthclm;
    }

    public BigDecimal getApaidamt() {
        return this.apaidamt;
    }

    public void setApaidamt(BigDecimal apaidamt) {
        this.apaidamt = apaidamt;
    }

    public String getReqntype() {
        return this.reqntype;
    }

    public void setReqntype(String reqntype) {
        this.reqntype = reqntype;
    }

    public String getCrdtcard() {
        return this.crdtcard;
    }

    public void setCrdtcard(String crdtcard) {
        this.crdtcard = crdtcard;
    }

    public String getWhopaid() {
        return this.whopaid;
    }

    public void setWhopaid(String whopaid) {
        this.whopaid = whopaid;
    }

    public Integer getDteknown() {
        return this.dteknown;
    }

    public void setDteknown(Integer dteknown) {
        this.dteknown = dteknown;
    }

    public Integer getGcfrpdte() {
        return this.gcfrpdte;
    }

    public void setGcfrpdte(Integer gcfrpdte) {
        this.gcfrpdte = gcfrpdte;
    }

    public Integer getRecvdDate() {
        return this.recvdDate;
    }

    public void setRecvdDate(Integer recvdDate) {
        this.recvdDate = recvdDate;
    }

    public Integer getMcfrom() {
        return this.mcfrom;
    }

    public void setMcfrom(Integer mcfrom) {
        this.mcfrom = mcfrom;
    }

    public Integer getMcto() {
        return this.mcto;
    }

    public void setMcto(Integer mcto) {
        this.mcto = mcto;
    }

    public Long getGdeduct() {
        return this.gdeduct;
    }

    public void setGdeduct(Long gdeduct) {
        this.gdeduct = gdeduct;
    }

    public Short getCopay() {
        return this.copay;
    }

    public void setCopay(Short copay) {
        this.copay = copay;
    }

    public String getMbrtype() {
        return this.mbrtype;
    }

    public void setMbrtype(String mbrtype) {
        this.mbrtype = mbrtype;
    }

    public String getProvnet() {
        return this.provnet;
    }

    public void setProvnet(String provnet) {
        this.provnet = provnet;
    }

    public Long getAad() {
        return this.aad;
    }

    public void setAad(Long aad) {
        this.aad = aad;
    }

    public String getThirdrcvy() {
        return this.thirdrcvy;
    }

    public void setThirdrcvy(String thirdrcvy) {
        this.thirdrcvy = thirdrcvy;
    }

    public String getThirdparty() {
        return this.thirdparty;
    }

    public void setThirdparty(String thirdparty) {
        this.thirdparty = thirdparty;
    }

    public BigDecimal getTlmbrshr() {
        return this.tlmbrshr;
    }

    public void setTlmbrshr(BigDecimal tlmbrshr) {
        this.tlmbrshr = tlmbrshr;
    }

    public BigDecimal getTlhmoshr() {
        return this.tlhmoshr;
    }

    public void setTlhmoshr(BigDecimal tlhmoshr) {
        this.tlhmoshr = tlhmoshr;
    }

    public Integer getDateauth() {
        return this.dateauth;
    }

    public void setDateauth(Integer dateauth) {
        this.dateauth = dateauth;
    }

    public String getGcauthby() {
        return this.gcauthby;
    }

    public void setGcauthby(String gcauthby) {
        this.gcauthby = gcauthby;
    }

    public String getGcoprscd() {
        return this.gcoprscd;
    }

    public void setGcoprscd(String gcoprscd) {
        this.gcoprscd = gcoprscd;
    }

    public String getRevlink() {
        return this.revlink;
    }

    public void setRevlink(String revlink) {
        this.revlink = revlink;
    }

    public String getReversalInd() {
        return this.reversalInd;
    }

    public void setReversalInd(String reversalInd) {
        this.reversalInd = reversalInd;
    }

    public String getTprcvpnd() {
        return this.tprcvpnd;
    }

    public void setTprcvpnd(String tprcvpnd) {
        this.tprcvpnd = tprcvpnd;
    }

    public String getPendfrom() {
        return this.pendfrom;
    }

    public void setPendfrom(String pendfrom) {
        this.pendfrom = pendfrom;
    }

    public String getMmprod() {
        return this.mmprod;
    }

    public void setMmprod(String mmprod) {
        this.mmprod = mmprod;
    }

    public BigDecimal getHmoshrmm() {
        return this.hmoshrmm;
    }

    public void setHmoshrmm(BigDecimal hmoshrmm) {
        this.hmoshrmm = hmoshrmm;
    }

    public String getTakeup() {
        return this.takeup;
    }

    public void setTakeup(String takeup) {
        this.takeup = takeup;
    }

    public String getDataconv() {
        return this.dataconv;
    }

    public void setDataconv(String dataconv) {
        this.dataconv = dataconv;
    }

    public BigDecimal getClrate() {
        return this.clrate;
    }

    public void setClrate(BigDecimal clrate) {
        this.clrate = clrate;
    }

    public String getRefno() {
        return this.refno;
    }

    public void setRefno(String refno) {
        this.refno = refno;
    }

    public String getUpdateInd() {
        return this.updateInd;
    }

    public void setUpdateInd(String updateInd) {
        this.updateInd = updateInd;
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
        StringBuilder sb = new StringBuilder("CloudGaGclhpf (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("clmcoy :" );
        sb.append(clmcoy);
        sb.append(",").append("clamnum :" );
        sb.append(clamnum);
        sb.append(",").append("gcoccno :" );
        sb.append(gcoccno);
        sb.append(",").append("chdrnum :" );
        sb.append(chdrnum);
        sb.append(",").append("mbrno :" );
        sb.append(mbrno);
        sb.append(",").append("dpntno :" );
        sb.append(dpntno);
        sb.append(",").append("clntcoy :" );
        sb.append(clntcoy);
        sb.append(",").append("clntnum :" );
        sb.append(clntnum);
        sb.append(",").append("gcsts :" );
        sb.append(gcsts);
        sb.append(",").append("claimcur :" );
        sb.append(claimcur);
        sb.append(",").append("crate :" );
        sb.append(crate);
        sb.append(",").append("prodtyp :" );
        sb.append(prodtyp);
        sb.append(",").append("grskcls :" );
        sb.append(grskcls);
        sb.append(",").append("dtevisit :" );
        sb.append(dtevisit);
        sb.append(",").append("dtedchrg :" );
        sb.append(dtedchrg);
        sb.append(",").append("gcdiagcd :" );
        sb.append(gcdiagcd);
        sb.append(",").append("planno :" );
        sb.append(planno);
        sb.append(",").append("preautno :" );
        sb.append(preautno);
        sb.append(",").append("provorg :" );
        sb.append(provorg);
        sb.append(",").append("areacde :" );
        sb.append(areacde);
        sb.append(",").append("referrer :" );
        sb.append(referrer);
        sb.append(",").append("clamtype :" );
        sb.append(clamtype);
        sb.append(",").append("timehh :" );
        sb.append(timehh);
        sb.append(",").append("timemm :" );
        sb.append(timemm);
        sb.append(",").append("clientClaimRef :" );
        sb.append(clientClaimRef);
        sb.append(",").append("gcdthclm :" );
        sb.append(gcdthclm);
        sb.append(",").append("apaidamt :" );
        sb.append(apaidamt);
        sb.append(",").append("reqntype :" );
        sb.append(reqntype);
        sb.append(",").append("crdtcard :" );
        sb.append(crdtcard);
        sb.append(",").append("whopaid :" );
        sb.append(whopaid);
        sb.append(",").append("dteknown :" );
        sb.append(dteknown);
        sb.append(",").append("gcfrpdte :" );
        sb.append(gcfrpdte);
        sb.append(",").append("recvdDate :" );
        sb.append(recvdDate);
        sb.append(",").append("mcfrom :" );
        sb.append(mcfrom);
        sb.append(",").append("mcto :" );
        sb.append(mcto);
        sb.append(",").append("gdeduct :" );
        sb.append(gdeduct);
        sb.append(",").append("copay :" );
        sb.append(copay);
        sb.append(",").append("mbrtype :" );
        sb.append(mbrtype);
        sb.append(",").append("provnet :" );
        sb.append(provnet);
        sb.append(",").append("aad :" );
        sb.append(aad);
        sb.append(",").append("thirdrcvy :" );
        sb.append(thirdrcvy);
        sb.append(",").append("thirdparty :" );
        sb.append(thirdparty);
        sb.append(",").append("tlmbrshr :" );
        sb.append(tlmbrshr);
        sb.append(",").append("tlhmoshr :" );
        sb.append(tlhmoshr);
        sb.append(",").append("dateauth :" );
        sb.append(dateauth);
        sb.append(",").append("gcauthby :" );
        sb.append(gcauthby);
        sb.append(",").append("gcoprscd :" );
        sb.append(gcoprscd);
        sb.append(",").append("revlink :" );
        sb.append(revlink);
        sb.append(",").append("reversalInd :" );
        sb.append(reversalInd);
        sb.append(",").append("tprcvpnd :" );
        sb.append(tprcvpnd);
        sb.append(",").append("pendfrom :" );
        sb.append(pendfrom);
        sb.append(",").append("mmprod :" );
        sb.append(mmprod);
        sb.append(",").append("hmoshrmm :" );
        sb.append(hmoshrmm);
        sb.append(",").append("takeup :" );
        sb.append(takeup);
        sb.append(",").append("dataconv :" );
        sb.append(dataconv);
        sb.append(",").append("clrate :" );
        sb.append(clrate);
        sb.append(",").append("refno :" );
        sb.append(refno);
        sb.append(",").append("updateInd :" );
        sb.append(updateInd);
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