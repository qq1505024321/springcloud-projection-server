package com.jk.model;

import java.io.Serializable;

public class HouseShow implements Serializable {

    private static final long serialVersionUID = -5694228712841473728L;

    private Integer houseid;

    private String  houseshow;

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getHouseshow() {
        return houseshow;
    }

    public void setHouseshow(String houseshow) {
        this.houseshow = houseshow;
    }

    @Override
    public String toString() {
        return "HouseShow{" +
                "houseid=" + houseid +
                ", houseshow='" + houseshow + '\'' +
                '}';
    }
}
