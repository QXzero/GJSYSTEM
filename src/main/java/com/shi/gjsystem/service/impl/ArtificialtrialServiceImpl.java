package com.shi.gjsystem.service.impl;

import com.shi.gjsystem.mapper.TbQingMapper;
import com.shi.gjsystem.pojo.TbQing;
import com.shi.gjsystem.service.ArtificialtrialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: SXJ
 * @date: 2019-06-03 17:23
 */
@Service
public class ArtificialtrialServiceImpl implements ArtificialtrialService {

    @Resource
    private TbQingMapper tbQingMapper;
    //清单查询
    @Override
    public List<TbQing> findtbQingList(String status) {
        List<TbQing> tbQingList = tbQingMapper.findtbQingList(status);
        return tbQingList;
    }
    //清单删除
    @Override
    public int deleteQing(String qingNo) {
        return tbQingMapper.deleteQing(qingNo);
    }
    //清单放行
    @Override
    public int stautsByPrimaryKey(String qingNo,String stauts) {
        return tbQingMapper.stautsByPrimaryKey(qingNo,stauts);
    }
}
