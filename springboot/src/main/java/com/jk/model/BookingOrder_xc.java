package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class BookingOrder_xc implements Serializable {
    private static final long serialVersionUID = -3807211935700737120L;
    private Integer bookingorderid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date starttime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endtime;

    private String duepeoplename;

    private String duetopeoplephone;

    private Integer invoice;

    private Integer reneprice;

    private Integer covercharge;

    private Integer totalprices;

    private Integer livingdays;

    private String ordernum;

    private Integer houseid;

    private Integer userid;

    private Date ordertime;
    private Integer status;

    private Integer amount;
    private String mon;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Integer getBookingorderid() {
        return bookingorderid;
    }

    public void setBookingorderid(Integer bookingorderid) {
        this.bookingorderid = bookingorderid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getDuepeoplename() {
        return duepeoplename;
    }

    public void setDuepeoplename(String duepeoplename) {
        this.duepeoplename = duepeoplename == null ? null : duepeoplename.trim();
    }

    public String getDuetopeoplephone() {
        return duetopeoplephone;
    }

    public void setDuetopeoplephone(String duetopeoplephone) {
        this.duetopeoplephone = duetopeoplephone == null ? null : duetopeoplephone.trim();
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Integer getReneprice() {
        return reneprice;
    }

    public void setReneprice(Integer reneprice) {
        this.reneprice = reneprice;
    }

    public Integer getCovercharge() {
        return covercharge;
    }

    public void setCovercharge(Integer covercharge) {
        this.covercharge = covercharge;
    }

    public Integer getTotalprices() {
        return totalprices;
    }

    public void setTotalprices(Integer totalprices) {
        this.totalprices = totalprices;
    }

    public Integer getLivingdays() {
        return livingdays;
    }

    public void setLivingdays(Integer livingdays) {
        this.livingdays = livingdays;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookingOrder_xc{" +
                "bookingorderid=" + bookingorderid +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", duepeoplename='" + duepeoplename + '\'' +
                ", duetopeoplephone='" + duetopeoplephone + '\'' +
                ", invoice=" + invoice +
                ", reneprice=" + reneprice +
                ", covercharge=" + covercharge +
                ", totalprices=" + totalprices +
                ", livingdays=" + livingdays +
                ", ordernum='" + ordernum + '\'' +
                ", houseid=" + houseid +
                ", userid=" + userid +
                ", ordertime=" + ordertime +
                ", status=" + status +
                ", amount=" + amount +
                ", mon='" + mon + '\'' +
                '}';
    }
}