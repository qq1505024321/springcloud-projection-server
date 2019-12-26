package com.jk.controller;


import com.alibaba.fastjson.JSONObject;
import com.jk.model.HouseInfo_xc_es;
import com.jk.model.Houuser;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.MulticastSocket;
import java.util.Date;
import java.util.UUID;

@Controller
public class controller_xc {

    @Autowired
    private UserService userService;


    @Autowired
    private JavaMailSender mailSender;



    @RequestMapping("findShenHeInfo")
    @ResponseBody
    public JSONObject findFangjianById(Integer page, Integer limit){
        JSONObject json = userService.findFangjianById(page,limit);
        long code = 0;
        String msg = "";
        json.put("code",code);
        json.put("msg",msg);
        return json;
    }

    @Autowired(required=true)
    private ElasticsearchTemplate elasticsearchTemplate;
    @RequestMapping("updateStatus")
    @ResponseBody
    public Integer updateStatus(Integer num,Integer houseid){
        userService.updateStatus(num,houseid);
        HouseInfo_xc_es e = userService.getHouseInfoByHouseid(houseid);
        IndexQuery indexQuery = new IndexQueryBuilder().withId(Integer.toString(e.getHoseid())).withObject(e).build();
        elasticsearchTemplate.index(indexQuery);
        return 1;
    }



    @RequestMapping("sendmail")
    @ResponseBody
    public String sendmail ( Houuser houuser,String emails) throws Exception{

        //  生成UUID
        String code = UUID.randomUUID().toString().replaceAll("-", "");

        if (true){



            SimpleMailMessage message = new SimpleMailMessage();
            //发送人
            message.setFrom("3099328754@qq.com");
            //接收人
            message.setTo(emails);
            //主题
            message.setSubject("【小蜗房屋出租网】");
            //内容
                String content = houuser.getEmail()+",您好:\n" +
                        "您发布的房源已经通过审核\n" +
                        "请按照房东管理中心手册进行营业\n" +
                        "\n" +
                        " \n" +
                        "                                               小蜗房屋客服中心\n" +
                        "\n" +
                        " \n" +

                        "本邮件由系统自动发送，请勿直接回复！如有任何疑问，请联系我们的客服人员。\n" +
                        "联系方式：QQ：862815462";
                message.setText(content);

                mailSender.send(message);
                return "邮件已发送...请查收！<a href='../toshenhe'>点击返回</a>";

            }


        return "请检查数据！";



    }
}
