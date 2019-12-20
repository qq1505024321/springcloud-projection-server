package com.jk.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "t_poster")
public class PosterBean implements Serializable {

    private static final long serialVersionUID = -5110015530439062796L;

    private String id;
    private String imgname; //  图片名称
    private String company; //  公司名称
    private String imgurl;  //  跳转页面
    private Integer status; //  显示状态  1代表续约 2代表下架广告

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PosterBean{" +
                "id='" + id + '\'' +
                ", imgname='" + imgname + '\'' +
                ", company='" + company + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", status=" + status +
                '}';
    }
}
