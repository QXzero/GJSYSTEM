package com.shi.gjsystem.controller;

import com.shi.gjsystem.pojo.Page;
import com.shi.gjsystem.pojo.ResultMap;
import com.shi.gjsystem.pojo.TbParam;
import com.shi.gjsystem.pojo.TbQing;
import com.shi.gjsystem.service.ParamService;
import org.apache.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: SXJ
 * @date: 2019-06-04 18:01
 */
@Controller
public class ParamController {

    @Resource
    ParamService paramService;

    /**
     * @description: 自动审单比例维护
     * @author: SXJ
     */

    @GetMapping(value = "zidongcheck")
    public String zidongcheck() {
        return "/param";
    }

    @RequestMapping("/getparam")
    @ResponseBody
    public ResultMap<List<TbParam>> getparam(Page page, @RequestParam("limit") int limit){
        System.out.println("backContent========================"+limit);
        page.setRows(limit);
        String paramtype="自动审单";
        System.out.println("page:"+page.toString());
        List<TbParam>  contentList=paramService.findParamLsit(paramtype);
        return new  ResultMap<List<TbParam>>("",contentList,0,0);
    }

    /**
     * @description: 负面清单规则维护
     * @author: SXJ
     */
    @GetMapping(value = "fumianguize")
    public String fumianguize() {
        return "/paramfumian";
    }

    @RequestMapping("/getparamfumian")
    @ResponseBody
    public ResultMap<List<TbParam>> getparamfumian(Page page, @RequestParam("limit") int limit){
        page.setRows(limit);
        String paramtype="负面清单";
        List<TbParam>  contentList = paramService.findParamLsit(paramtype);
        return new  ResultMap<List<TbParam>>("",contentList,0,0);
    }
    /**
     * 规则删除
     * @return
     */
    @RequestMapping("/delparam")
    @ResponseBody
    public int deleteQing(@RequestParam("id") String id){
        int i = paramService.deleteParam(id);
        return i;
    }

    //添加
    @GetMapping(value = "param-add")
    public String fumianadd() {
        return "/param-add";
    }

    @RequestMapping("/paramadd")
    @ResponseBody
    public int paramadd(HttpServletRequest request){
        String id = request.getParameter("id");
        String Pid = request.getParameter("Pid");
        String Param_type = request.getParameter("Param_type");
        String Param_code = request.getParameter("Param_code");
        String Param_value = request.getParameter("Param_value");
        System.out.println(id+Pid+Param_code+Param_type+Param_value);
        TbParam tbParam = new TbParam();
        tbParam.setId(id);
        tbParam.setPid(Pid);
        tbParam.setParamType(Param_type);
        tbParam.setParamCode(Param_code);
        tbParam.setParamValue(Param_value);
        tbParam.setCreateTime(new Date());
        int i = paramService.paramadd(tbParam);
        return i;
    }

}
