package com.jk.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -5110098530439064016L;
    private Integer userid;

    private String idcard;

    private String email;

    private String truename;

    private String sex;

    private Integer age;

    private Date bir;

    private String address;

    private String bloodtype;

    private String education;

    private String work;

    private String username;

    private String phone;

    private  Date usertime;


    /*积分*/
    private Integer integral;

    /*信用分*/
    private Integer num;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getUsertime() {
        return usertime;
    }

    public void setUsertime(Date usertime) {
        this.usertime = usertime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype == null ? null : bloodtype.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userid=" + userid +
                ", idcard='" + idcard + '\'' +
                ", email='" + email + '\'' +
                ", truename='" + truename + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", bir=" + bir +
                ", address='" + address + '\'' +
                ", bloodtype='" + bloodtype + '\'' +
                ", education='" + education + '\'' +
                ", work='" + work + '\'' +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", usertime=" + usertime +
                ", integral=" + integral +
                ", num=" + num +
                '}';
    }
}