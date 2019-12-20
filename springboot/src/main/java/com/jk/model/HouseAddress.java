package com.jk.model;

import java.io.Serializable;

public class HouseAddress implements Serializable {

    private static final long serialVersionUID = -5694232964841421858L;

    private Integer houseid;

    private String  address;

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "HouseAddress{" +
                "houseid=" + houseid +
                ", address='" + address + '\'' +
                '}';
    }
}
