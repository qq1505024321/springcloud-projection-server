package com.jk.model;

import java.io.Serializable;

public class housePricerule implements Serializable {

    private static final long serialVersionUID = -5694228784751473728L;

    private Integer hourseid;

    private Integer dayprice;

    private Integer promotionstatus;

    private Integer cashpledge;

    private Integer cleanfee;

    private Integer otherprice;

    public Integer getHourseid() {
        return hourseid;
    }

    public void setHourseid(Integer hourseid) {
        this.hourseid = hourseid;
    }

    public Integer getDayprice() {
        return dayprice;
    }

    public void setDayprice(Integer dayprice) {
        this.dayprice = dayprice;
    }

    public Integer getPromotionstatus() {
        return promotionstatus;
    }

    public void setPromotionstatus(Integer promotionstatus) {
        this.promotionstatus = promotionstatus;
    }

    public Integer getCashpledge() {
        return cashpledge;
    }

    public void setCashpledge(Integer cashpledge) {
        this.cashpledge = cashpledge;
    }

    public Integer getCleanfee() {
        return cleanfee;
    }

    public void setCleanfee(Integer cleanfee) {
        this.cleanfee = cleanfee;
    }

    public Integer getOtherprice() {
        return otherprice;
    }

    public void setOtherprice(Integer otherprice) {
        this.otherprice = otherprice;
    }

    @Override
    public String toString() {
        return "housePricerule{" +
                "hourseid=" + hourseid +
                ", dayprice=" + dayprice +
                ", promotionstatus=" + promotionstatus +
                ", cashpledge=" + cashpledge +
                ", cleanfee=" + cleanfee +
                ", otherprice=" + otherprice +
                '}';
    }
}
