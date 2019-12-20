package com.jk.model;

import java.io.Serializable;

public class Houseinfo implements Serializable {

    private static final long serialVersionUID = -5694228521841473728L;

    private Integer hoseid;

    private String  houseadderss;

    private Integer housetypeid;

    private Integer leasetype;

    private Integer roomnum;

    private Integer hallnum;

    private Integer verandanum;

    private Integer toiletnum;

    private Integer kitchennum;

    private String  housearea;

    private Integer toilettypeid;

    private Integer bedtypeid;

    private double  bedlength;

    private double  bedwidth;

    private Integer bednum;

    private Integer suitablenum;

    private Integer commensalismtype;

    private Integer similarproperties;

    private String  bedtypename;

    private String  housenam;

    private String  housetypes;

    private Integer dayprice;

    private String  houseshow;

    private String  username;

    private String  leasetypes;

    public String getBedtypename() {
        return bedtypename;
    }

    public void setBedtypename(String bedtypename) {
        this.bedtypename = bedtypename;
    }

    public String getHousenam() {
        return housenam;
    }

    public void setHousenam(String housenam) {
        this.housenam = housenam;
    }

    public String getHousetypes() {
        return housetypes;
    }

    public void setHousetypes(String housetypes) {
        this.housetypes = housetypes;
    }

    public Integer getDayprice() {
        return dayprice;
    }

    public void setDayprice(Integer dayprice) {
        this.dayprice = dayprice;
    }

    public String getHouseshow() {
        return houseshow;
    }

    public void setHouseshow(String houseshow) {
        this.houseshow = houseshow;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLeasetypes() {
        return leasetypes;
    }

    public void setLeasetypes(String leasetypes) {
        this.leasetypes = leasetypes;
    }

    public Integer getHoseid() {
        return hoseid;
    }

    public void setHoseid(Integer hoseid) {
        this.hoseid = hoseid;
    }

    public String getHouseadderss() {
        return houseadderss;
    }

    public void setHouseadderss(String houseadderss) {
        this.houseadderss = houseadderss;
    }

    public Integer getHousetypeid() {
        return housetypeid;
    }

    public void setHousetypeid(Integer housetypeid) {
        this.housetypeid = housetypeid;
    }

    public Integer getLeasetype() {
        return leasetype;
    }

    public void setLeasetype(Integer leasetype) {
        this.leasetype = leasetype;
    }

    public Integer getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(Integer roomnum) {
        this.roomnum = roomnum;
    }

    public Integer getHallnum() {
        return hallnum;
    }

    public void setHallnum(Integer hallnum) {
        this.hallnum = hallnum;
    }

    public Integer getVerandanum() {
        return verandanum;
    }

    public void setVerandanum(Integer verandanum) {
        this.verandanum = verandanum;
    }

    public Integer getToiletnum() {
        return toiletnum;
    }

    public void setToiletnum(Integer toiletnum) {
        this.toiletnum = toiletnum;
    }

    public Integer getKitchennum() {
        return kitchennum;
    }

    public void setKitchennum(Integer kitchennum) {
        this.kitchennum = kitchennum;
    }

    public String getHousearea() {
        return housearea;
    }

    public void setHousearea(String housearea) {
        this.housearea = housearea;
    }

    public Integer getToilettypeid() {
        return toilettypeid;
    }

    public void setToilettypeid(Integer toilettypeid) {
        this.toilettypeid = toilettypeid;
    }

    public Integer getBedtypeid() {
        return bedtypeid;
    }

    public void setBedtypeid(Integer bedtypeid) {
        this.bedtypeid = bedtypeid;
    }

    public double getBedlength() {
        return bedlength;
    }

    public void setBedlength(double bedlength) {
        this.bedlength = bedlength;
    }

    public double getBedwidth() {
        return bedwidth;
    }

    public void setBedwidth(double bedwidth) {
        this.bedwidth = bedwidth;
    }

    public Integer getBednum() {
        return bednum;
    }

    public void setBednum(Integer bednum) {
        this.bednum = bednum;
    }

    public Integer getSuitablenum() {
        return suitablenum;
    }

    public void setSuitablenum(Integer suitablenum) {
        this.suitablenum = suitablenum;
    }

    public Integer getCommensalismtype() {
        return commensalismtype;
    }

    public void setCommensalismtype(Integer commensalismtype) {
        this.commensalismtype = commensalismtype;
    }

    public Integer getSimilarproperties() {
        return similarproperties;
    }

    public void setSimilarproperties(Integer similarproperties) {
        this.similarproperties = similarproperties;
    }

    @Override
    public String toString() {
        return "Houseinfo{" +
                "hoseid=" + hoseid +
                ", houseadderss='" + houseadderss + '\'' +
                ", housetypeid=" + housetypeid +
                ", leasetype=" + leasetype +
                ", roomnum=" + roomnum +
                ", hallnum=" + hallnum +
                ", verandanum=" + verandanum +
                ", toiletnum=" + toiletnum +
                ", kitchennum=" + kitchennum +
                ", housearea='" + housearea + '\'' +
                ", toilettypeid=" + toilettypeid +
                ", bedtypeid=" + bedtypeid +
                ", bedlength=" + bedlength +
                ", bedwidth=" + bedwidth +
                ", bednum=" + bednum +
                ", suitablenum=" + suitablenum +
                ", commensalismtype=" + commensalismtype +
                ", similarproperties=" + similarproperties +
                '}';
    }
}
