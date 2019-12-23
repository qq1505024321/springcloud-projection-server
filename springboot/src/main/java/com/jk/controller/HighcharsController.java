package com.jk.controller;

import com.jk.model.*;
import com.jk.service.HighcharsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author ccl
 * @create 2019/12/23
 * @since 1.0.0
 */
@Controller
public class HighcharsController {

    @Autowired
    private HighcharsService highcharsService;

    @RequestMapping("toShow")
    public String toShow(){
        return "showview";
    }

    @RequestMapping("queryVisitorCount")
    @ResponseBody
    public List<Visitor> queryVisitorCount(){
        List<Visitor> list = highcharsService.queryVisitorCount();
      /*  for (int i=0; i<list.size();i++){
            System.out.println(list.get(i)+"=======================list==");
        }*/

        return list;
    }

    @RequestMapping("queryUserCount")
    @ResponseBody
    public List<UserBean> queryUserCount(){
        List<UserBean> list = highcharsService.queryUserCount();
       /* for (int i=0; i<list.size();i++){
            System.out.println(list.get(i)+"=======================list==");
        }*/

        return list;
    }

    @RequestMapping("queryHouseCount")
    @ResponseBody
    public List<Houseinfo> queryHouseCount(){
        List<Houseinfo> list = highcharsService.queryHouseCount();
       /* for (int i=0; i<list.size();i++){
            System.out.println(list.get(i)+"=======================list==");
        }*/

        return list;
    }

    @RequestMapping("queryOrderCount")
    @ResponseBody
    public List<BookingOrder_xc> queryOrderCount(){

        List<BookingOrder_xc> list = highcharsService.queryOrderCount();
       /* for (int i=0; i<list.size();i++){
            System.out.println(list.get(i)+"=======================list==");
        }*/

        return list;
    }

    @RequestMapping("tomain2")
    public String tomain2(){
        return "main2";
    }

 /*   @RequestMapping("queryTree2")
    @ResponseBody
    public List<TreeBean> queryTree2(Integer id){
        return list;
    }*/

}