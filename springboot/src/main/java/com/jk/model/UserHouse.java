package com.jk.model;

import java.io.Serializable;

public class UserHouse implements Serializable {

    private static final long serialVersionUID = -5694228298841414589L;

    private Integer id;

    private Integer userid;

    private Integer houseid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getHouseid() {
        return houseid;
    }

    @Override
    public String toString() {
        return "UserHouse{" +
                "id=" + id +
                ", userid=" + userid +
                ", houseid=" + houseid +
                '}';
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }
}
