package com.jk.controller;

import com.jk.model.TreeBean;
import com.jk.service.TreeService;
import com.jk.util.TreeBeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class TreeController {

    @Autowired
    private TreeService treeService;

    @RequestMapping("queryTree")
    @ResponseBody
    public  List<TreeBean> queryTree(){


        List<TreeBean> list  = treeService.queryTree();

        list = TreeBeanUtil.getFatherNode(list);


        return list ;
    }
}
