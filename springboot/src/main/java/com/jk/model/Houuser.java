package com.jk.model;

import java.io.Serializable;

public class Houuser  implements Serializable {

    private static final long serialVersionUID = 1049352009838946675L;

    private Integer id;

    private String username;

    private String loginnumber;

    private String userphone;

    private Integer stutas;

    private Integer emailstate;

    private String emailcode;

    private String email;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getLoginnumber() {
        return loginnumber;
    }

    public void setLoginnumber(String loginnumber) {
        this.loginnumber = loginnumber == null ? null : loginnumber.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public Integer getStutas() {
        return stutas;
    }

    public void setStutas(Integer stutas) {
        this.stutas = stutas;
    }

    public Integer getEmailstate() {
        return emailstate;
    }

    public void setEmailstate(Integer emailstate) {
        this.emailstate = emailstate;
    }

    public String getEmailcode() {
        return emailcode;
    }

    public void setEmailcode(String emailcode) {
        this.emailcode = emailcode == null ? null : emailcode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}