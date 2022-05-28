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
public class CloudGaCasepf implements Serializable {

    private static final long serialVersionUID = -1601788045;

    private Long      id;
    private String    prefix;
    private String    clmcoy;
    private String    clamnum;
    private String    gcoccno;
    private Byte      seqnocase;
    private String    casenote;
    private String    userProfile;
    private String    jobName;
    private Timestamp datime;
    private Timestamp ebTimestamp;

    public CloudGaCasepf() {}

    public CloudGaCasepf(CloudGaCasepf value) {
        this.id = value.id;
        this.prefix = value.prefix;
        this.clmcoy = value.clmcoy;
        this.clamnum = value.clamnum;
        this.gcoccno = value.gcoccno;
        this.seqnocase = value.seqnocase;
        this.casenote = value.casenote;
        this.userProfile = value.userProfile;
        this.jobName = value.jobName;
        this.datime = value.datime;
        this.ebTimestamp = value.ebTimestamp;
    }

    public CloudGaCasepf(
        Long      id,
        String    prefix,
        String    clmcoy,
        String    clamnum,
        String    gcoccno,
        Byte      seqnocase,
        String    casenote,
        String    userProfile,
        String    jobName,
        Timestamp datime,
        Timestamp ebTimestamp
    ) {
        this.id = id;
        this.prefix = prefix;
        this.clmcoy = clmcoy;
        this.clamnum = clamnum;
        this.gcoccno = gcoccno;
        this.seqnocase = seqnocase;
        this.casenote = casenote;
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

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
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

    public Byte getSeqnocase() {
        return this.seqnocase;
    }

    public void setSeqnocase(Byte seqnocase) {
        this.seqnocase = seqnocase;
    }

    public String getCasenote() {
        return this.casenote;
    }

    public void setCasenote(String casenote) {
        this.casenote = casenote;
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
        StringBuilder sb = new StringBuilder("CloudGaCasepf (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("prefix :" );
        sb.append(prefix);
        sb.append(",").append("clmcoy :" );
        sb.append(clmcoy);
        sb.append(",").append("clamnum :" );
        sb.append(clamnum);
        sb.append(",").append("gcoccno :" );
        sb.append(gcoccno);
        sb.append(",").append("seqnocase :" );
        sb.append(seqnocase);
        sb.append(",").append("casenote :" );
        sb.append(casenote);
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
