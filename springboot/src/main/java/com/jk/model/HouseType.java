package com.jk.model;

import java.io.Serializable;

public class HouseType implements Serializable {

    private static final long serialVersionUID = -5694228712841473728L;

    private Integer housetypeid;

    private String  housetype;

    public Integer getHousetypeid() {
        return housetypeid;
    }

    public void setHousetypeid(Integer housetypeid) {
        this.housetypeid = housetypeid;
    }

    public String getHousetype() {
        return housetype;
    }

    @Override
    public String toString() {
        return "HouseType{" +
                "housetypeid=" + housetypeid +
                ", housetype='" + housetype + '\'' +
                '}';
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }
}
