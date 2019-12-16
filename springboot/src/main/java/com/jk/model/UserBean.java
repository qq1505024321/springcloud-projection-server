package com.jk.model;

import java.io.Serializable;

public class UserBean implements Serializable {

    private static final long serialVersionUID = -5694228298841473728L;
    private Integer userid;

    private String  username;

    private String  password;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
