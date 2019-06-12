package com.shi.gjsystem.controller;

import com.shi.gjsystem.pojo.Page;
import com.shi.gjsystem.pojo.ResultMap;
import com.shi.gjsystem.pojo.TbQing;
import com.shi.gjsystem.service.ArtificialtrialService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 清单查验
 * @author: SXJ
 * @date: 2019-06-04 17:20
 */
@Controller
public class qingfumianController {

    @Resource
    ArtificialtrialService artificialtrialService;

    @GetMapping(value = "qingfumian")
    public String qingfumian(){
        return  "/fumianlist";
    }

    @RequestMapping("/fumianlist")
    @ResponseBody
    public ResultMap<List<TbQing>> qingcheck(Page page, @RequestParam("limit") int limit){
        System.out.println("backContent========================"+limit);
        page.setRows(limit);
        String status="2";
        System.out.println("page:"+page.toString());
        List<TbQing>  contentList=artificialtrialService.findtbQingList(status);
        return new  ResultMap<List<TbQing>>("",contentList,0,0);
    }
}
