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
public class GaZgchpf implements Serializable {

    private static final long serialVersionUID = 803034435;

    private Long      id;
    private String    chdrcoy;
    private String    chdrnum;
    private String    zvdcode;
    private Short     zpolwait;
    private String    userProfile;
    private String    jobName;
    private Timestamp datime;
    private Timestamp ebTimestamp;

    public GaZgchpf() {}

    public GaZgchpf(GaZgchpf value) {
        this.id = value.id;
        this.chdrcoy = value.chdrcoy;
        this.chdrnum = value.chdrnum;
        this.zvdcode = value.zvdcode;
        this.zpolwait = value.zpolwait;
        this.userProfile = value.userProfile;
        this.jobName = value.jobName;
        this.datime = value.datime;
        this.ebTimestamp = value.ebTimestamp;
    }

    public GaZgchpf(
        Long      id,
        String    chdrcoy,
        String    chdrnum,
        String    zvdcode,
        Short     zpolwait,
        String    userProfile,
        String    jobName,
        Timestamp datime,
        Timestamp ebTimestamp
    ) {
        this.id = id;
        this.chdrcoy = chdrcoy;
        this.chdrnum = chdrnum;
        this.zvdcode = zvdcode;
        this.zpolwait = zpolwait;
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

    public String getZvdcode() {
        return this.zvdcode;
    }

    public void setZvdcode(String zvdcode) {
        this.zvdcode = zvdcode;
    }

    public Short getZpolwait() {
        return this.zpolwait;
    }

    public void setZpolwait(Short zpolwait) {
        this.zpolwait = zpolwait;
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
        StringBuilder sb = new StringBuilder("GaZgchpf (");

        sb.append("id :" );
        sb.append(id);
        sb.append(",").append("chdrcoy :" );
        sb.append(chdrcoy);
        sb.append(",").append("chdrnum :" );
        sb.append(chdrnum);
        sb.append(",").append("zvdcode :" );
        sb.append(zvdcode);
        sb.append(",").append("zpolwait :" );
        sb.append(zpolwait);
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
