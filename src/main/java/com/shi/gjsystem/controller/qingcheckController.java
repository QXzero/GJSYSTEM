package com.shi.gjsystem.controller;

import com.shi.gjsystem.pojo.Page;
import com.shi.gjsystem.pojo.ResultMap;
import com.shi.gjsystem.pojo.TbQing;
import com.shi.gjsystem.pojo.TbZong;
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
 * @description: 清单查验
 * @author: SXJ
 * @date: 2019-06-04 17:20
 */
@Controller
public class qingcheckController {

    @Resource
    QingcheckService qingcheckService;

    @Resource
    ArtificialtrialService artificialtrialService;

    /**
     * @description: 清单查验查询
     * @author: SXJ
     */
    @GetMapping(value = "qingchayan")
    public String qingchayan(){
        return  "/qingcheck";
    }

    @RequestMapping("/qingcheck")
    @ResponseBody
    public ResultMap<List<TbQing>> qingcheck(Page page, @RequestParam("limit") int limit){
        System.out.println("backContent========================"+limit);
        page.setRows(limit);
        System.out.println("page:"+page.toString());
        String status = "3";
        List<TbQing>  contentList=qingcheckService.findtbQingList(status);
        return new  ResultMap<List<TbQing>>("",contentList,0,0);
    }
    /**
     * @description: 清单查验
     * @author: SXJ
     */
    @RequestMapping("/checkchayan")
    @ResponseBody
    public int checkchayan(@RequestParam("qingNo") String qingNo){
        String status = "3";
        int i = artificialtrialService.stautsByPrimaryKey(qingNo,status);
        return i;
    }

    /**
     * @description: 查询清单
     * @author: SXJ
     */

    @GetMapping(value = "qingchaxun")
    public String qingchaxun(){
        return  "/qing-list";
    }

    @RequestMapping("/fingAllQingList")
    @ResponseBody
    public ResultMap<List<TbZong>> fingAllQingList(Page page, @RequestParam("limit") int limit){
        System.out.println("backContent========================"+limit);
        page.setRows(limit);
        System.out.println("page:"+page.toString());
        List<TbZong>  contentList = qingcheckService.fingAllQingList(page);
        int totals=qingcheckService.selectPageCount(page);
        page.setTotalRecord(totals);
        return new  ResultMap<List<TbZong>>("",contentList,0,totals);
    }

    /**
     * 删除清单
     * @return
     */
    @RequestMapping("/delqinglist")
    @ResponseBody
    public int deleteQing(@RequestParam("id") String id){
        int i = qingcheckService.deleteQingAll(id);
        return i;
    }
    /**
     * 清单放行查询
     * @return
     */

    @GetMapping(value = "fangxinglist")
    public String fangxinglist(){
        return  "/fangxinglist";
    }

    @RequestMapping("/fangxingchaxun")
    @ResponseBody
    public ResultMap<List<TbQing>> fangxingchaxun(Page page, @RequestParam("limit") int limit){
        System.out.println("backContent========================"+limit);
        page.setRows(limit);
        System.out.println("page:"+page.toString());
        String status = "7";
        List<TbQing>  contentList=qingcheckService.findtbQingList(status);
        return new  ResultMap<List<TbQing>>("",contentList,0,0);
    }
}
