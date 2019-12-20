package com.jk.model;

import java.io.Serializable;

public class BedType implements Serializable {

    private static final long serialVersionUID = -5694232964841473728L;

    private Integer bedtypeid;

    private String  bedtypename;

    public Integer getBedtypeid() {
        return bedtypeid;
    }

    public void setBedtypeid(Integer bedtypeid) {
        this.bedtypeid = bedtypeid;
    }

    public String getBedtypename() {
        return bedtypename;
    }

    @Override
    public String toString() {
        return "BedType{" +
                "bedtypeid=" + bedtypeid +
                ", bedtypename='" + bedtypename + '\'' +
                '}';
    }

    public void setBedtypename(String bedtypename) {
        this.bedtypename = bedtypename;
    }
}
