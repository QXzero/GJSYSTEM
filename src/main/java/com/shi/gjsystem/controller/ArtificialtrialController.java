package com.shi.gjsystem.controller;

import com.shi.gjsystem.pojo.Page;
import com.shi.gjsystem.pojo.ResultMap;
import com.shi.gjsystem.pojo.TbQing;
import com.shi.gjsystem.service.ArtificialtrialService;
import com.shi.gjsystem.service.QingcheckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 人工审单
 * @author: SXJ
 * @date: 2019-06-03 17:17
 */
@Controller
public class ArtificialtrialController {

    @Resource
    ArtificialtrialService artificialtrialService;

    @GetMapping(value = "orderlist")
    public String orderlist(){
        return  "/order-list";
    }

    @RequestMapping("/backContent")
    @ResponseBody
    public ResultMap<List<TbQing>> backContent(Page page, @RequestParam("limit") int limit){
        System.out.println("backContent========================"+limit);
        page.setRows(limit);
        String status="1";
        System.out.println("page:"+page.toString());
        List<TbQing>  contentList=artificialtrialService.findtbQingList(status);
        return new  ResultMap<List<TbQing>>("",contentList,0,0);
    }

    /**
     * 删除清单
     * @return
     */
    @RequestMapping("/delqing")
    @ResponseBody
    public int deleteQing(@RequestParam("qingNo") String qingNo){
        int i = artificialtrialService.deleteQing(qingNo);
        return i;
    }

    /**
     * 清单放行
     * @return
     */
    @RequestMapping("/fangxing")
    @ResponseBody
    public int fangxingQing(@RequestParam("qingNo") String qingNo){
        String status = "7";
        int i = artificialtrialService.stautsByPrimaryKey(qingNo,status);
        return i;
    }
}
