package com.shi.gjsystem.service.impl;

import com.shi.gjsystem.mapper.TbQingMapper;
import com.shi.gjsystem.mapper.ZongMapper;
import com.shi.gjsystem.pojo.Page;
import com.shi.gjsystem.pojo.TbQing;
import com.shi.gjsystem.pojo.TbZong;
import com.shi.gjsystem.service.QingcheckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 清单查验
 * @author: SXJ
 * @date: 2019-06-04 17:16
 */
@Service
public class QingcheckServiceImpl implements QingcheckService {

    @Resource
    private TbQingMapper tbQingMapper;

    @Resource
    private ZongMapper zongMapper;

    //清单查验
    @Override
    public List<TbQing> findtbQingList(String status) {
        List<TbQing> tbQingList = tbQingMapper.findtbQingList(status);
        return tbQingList;
    }
    //多表联查
    @Override
    public List<TbZong> fingAllQingList(Page  page) {
        List<TbZong>list=zongMapper.selectPageList(page);
        return list;
    }
    //查询所有清单
    @Override
    public List<TbZong> fingAllQingList() {
        List<TbZong> QingAllList = zongMapper.fingAllQingList();
        return QingAllList;
    }
    //获取分页页数
    @Override
    public Integer selectPageCount(Page page) {
        return tbQingMapper.selectPageCount(page);
    }
    //清单删除(多表)
    @Override
    public int deleteQingAll(String id) {
        return tbQingMapper.deleteQingAll(id);
    }
}
