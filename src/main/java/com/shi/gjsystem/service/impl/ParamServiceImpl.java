package com.shi.gjsystem.service.impl;

import com.shi.gjsystem.mapper.TbParamMapper;
import com.shi.gjsystem.pojo.TbParam;
import com.shi.gjsystem.pojo.TbQing;
import com.shi.gjsystem.service.ArtificialtrialService;
import com.shi.gjsystem.service.ParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: SXJ
 * @date: 2019-06-03 17:23
 */
@Service
public class ParamServiceImpl implements ParamService {

    @Resource
    private TbParamMapper tbParamMapper;

    @Override
    public List<TbParam> findParamLsit(String paramtype) {
        List<TbParam> tbParamList = tbParamMapper.findparamList(paramtype);
        return tbParamList;
    }

    //规则删除
    @Override
    public int deleteParam(String id) {
        return tbParamMapper.deleteParam(id);
    }

    @Override
    public int paramadd(TbParam tbParam) {
        return tbParamMapper.paramadd(tbParam);
    }
}
