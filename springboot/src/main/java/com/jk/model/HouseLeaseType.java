package com.jk.model;

import java.io.Serializable;

public class HouseLeaseType implements Serializable {

    private static final long serialVersionUID = -5694228712841413698L;

    private Integer typeid;

    private String  leasetype;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getLeasetype() {
        return leasetype;
    }

    @Override
    public String toString() {
        return "HouseLeaseType{" +
                "typeid=" + typeid +
                ", leasetype='" + leasetype + '\'' +
                '}';
    }

    public void setLeasetype(String leasetype) {
        this.leasetype = leasetype;
    }
}
