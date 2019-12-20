package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.model.PosterBean;
import com.jk.util.OSSClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PosterController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("queryAdvertising")
    @ResponseBody
    public JSONObject queryAdvertising(int page, int rows, PosterBean poster){
        Query query = new Query();
        JSONObject json = new JSONObject();

        if(poster.getCompany() != null && !"".equals(poster.getCompany())){
            query.addCriteria(Criteria.where("company").regex(poster.getCompany()));
        }
        if (poster.getStatus()!=null&& !"".equals(poster.getStatus())) {
            query.addCriteria(Criteria.where("status").is(poster.getStatus()));
        }

        long zongshu = mongoTemplate.count(query, PosterBean.class);
        query.skip((page-1)*rows);
        query.limit(rows);

        List<PosterBean> list = mongoTemplate.find(query,PosterBean.class);
        json.put("rows", list);
        json.put("total", zongshu);
        return json;
    }

    @RequestMapping("toAddAdvertising")
    public String toAddAdvertising(){
        return "addAdvertising";
    }

    /**
     * OSS阿里云上传图片
     * @return
     */
    @RequestMapping("updaloadImg")
    @ResponseBody
    public Map uploadImg(MultipartFile imgfile)throws IOException {
        if (imgfile == null || imgfile.getSize() <= 0) {
            throw new IOException("file不能为空");
        }
        OSSClientUtil ossClient=new OSSClientUtil();
        String name = ossClient.uploadImg2Oss(imgfile);
        String imgUrl = ossClient.getImgUrl(name);
        //String[] split = imgUrl.split("\\?");
        //System.out.println("图片url："+imgUrl);
        Map map = new HashMap();
        map.put("imgUrl",imgUrl);
        return map;
    }

    @RequestMapping("addAdvertising")
    @ResponseBody
    public void addAdvertising(PosterBean poster){
        poster.setStatus(2);
        mongoTemplate.save(poster);
    }

    @RequestMapping("updAdvertising")
    @ResponseBody
    public Integer updAdvertising(PosterBean poster){
        Query query = new Query();
        Criteria criteria = new Criteria();
        query.addCriteria(Criteria.where("id").is(poster.getId()));
        Update update = new Update();
        update.set("status",poster.getStatus());
        mongoTemplate.updateFirst(query,update,PosterBean.class);
        return 1;
    }

}
