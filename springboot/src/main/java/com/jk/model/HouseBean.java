package com.jk.model;

import java.io.Serializable;

public class HouseBean implements Serializable {

    private static final long serialVersionUID = -5694232121841473728L;

    private Integer houseid;

    private String  housenam;

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getHousenam() {
        return housenam;
    }

    @Override
    public String toString() {
        return "HouseBean{" +
                "houseid=" + houseid +
                ", housenam='" + housenam + '\'' +
                '}';
    }

    public void setHousenam(String housenam) {
        this.housenam = housenam;
    }
}
