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
 * @description: 禁止出境
 * @author: SXJ
 * @date: 2019-06-04 23:38
 */
@Controller
public class NotGoController {
    @Resource
    ArtificialtrialService artificialtrialService;


    /**
     * @description: 禁止出境查询
     * @author: SXJ
     */
    @GetMapping(value = "/notgo")
    public String notgo(){
        return  "/notgo";
    }

    @RequestMapping("/notgolist")
    @ResponseBody
    public ResultMap<List<TbQing>> backContent(Page page, @RequestParam("limit") int limit){
        page.setRows(limit);
        String status="6";
        List<TbQing>  contentList = artificialtrialService.findtbQingList(status);
        return new  ResultMap<List<TbQing>>("",contentList,0,0);
    }

    /**
     * @description: 禁止出境(初审)查询
     * @author: SXJ
     */
    @GetMapping(value = "/notgo1")
    public String notgo1(){
        return  "/notgo1";
    }

    @RequestMapping("/notgolist1")
    @ResponseBody
    public ResultMap<List<TbQing>> notgolist1(Page page, @RequestParam("limit") int limit){
        page.setRows(limit);
        String status="4";
        List<TbQing>  contentList = artificialtrialService.findtbQingList(status);
        return new  ResultMap<List<TbQing>>("",contentList,0,0);
    }

    /**
     * @description: 禁止出境(复审)查询
     * @author: SXJ
     */
    @GetMapping(value = "/notgo2")
    public String notgo2(){
        return  "/notgo2";
    }

    @RequestMapping("/notgolist2")
    @ResponseBody
    public ResultMap<List<TbQing>> notgolist2(Page page, @RequestParam("limit") int limit){
        page.setRows(limit);
        String status="5";
        List<TbQing>  contentList = artificialtrialService.findtbQingList(status);
        return new  ResultMap<List<TbQing>>("",contentList,0,0);
    }

    /**
     * 清单禁止出境(人工审单初审)
     * @return
     */
    @RequestMapping("/notgoqing3")
    @ResponseBody
    public int notgoqing3(@RequestParam("qingNo") String qingNo){
        String status = "4";
        int i = artificialtrialService.stautsByPrimaryKey(qingNo,status);
        return i;
    }

    /**
     * 清单禁止出境(初审)
     * @return
     */
    @RequestMapping("/notgoqing1")
    @ResponseBody
    public int notgoqing1(@RequestParam("qingNo") String qingNo){
        String status = "5";
        int i = artificialtrialService.stautsByPrimaryKey(qingNo,status);
        return i;
    }

    /**
     * 清单禁止出境(复审)
     * @return
     */
    @RequestMapping("/notgoqing2")
    @ResponseBody
    public int notgoqing2(@RequestParam("qingNo") String qingNo){
        String status = "6";
        int i = artificialtrialService.stautsByPrimaryKey(qingNo,status);
        return i;
    }
}
