package com.sql.entity;

import java.util.Date;

/*
    @Author zl
    @Date:2020/5/4
  */
public class userInfo {
    /*
    数据eid
    */
    private String eid;
    /*
    数据ename
    */
    private String ename;
    /*
    数据esex
    */
    private String esex;
    /*
    数据ebirthday
    */
    private Date ebirthday;
    /*
    数据eaddress
    */
    private String eaddress;
    /*
    数据edate
    */
    private Date edate;


    @Override
    public String toString() {
        return "userInfo{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", esex='" + esex + '\'' +
                ", ebirthday=" + ebirthday +
                ", eaddress='" + eaddress + '\'' +
                ", edate=" + edate +
                '}';
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public Date getEbirthday() {
        return ebirthday;
    }

    public void setEbirthday(Date ebirthday) {
        this.ebirthday = ebirthday;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

}
