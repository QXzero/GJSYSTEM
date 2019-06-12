package com.shi.gjsystem.service;

import com.shi.gjsystem.pojo.TbParam;

import java.util.List;

/**
 * @description:
 * @author: SXJ
 * @date: 2019-06-03 17:20
 */
public interface ParamService {
    //自动审单,负面规则
    List<TbParam> findParamLsit(String paramtype);
    //规则删除
    int deleteParam(String id);
    //添加规则
    public int paramadd(TbParam tbParam);

}
