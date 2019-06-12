package com.shi.gjsystem.service;

import com.shi.gjsystem.pojo.Page;
import com.shi.gjsystem.pojo.TbQing;
import com.shi.gjsystem.pojo.TbZong;

import java.util.List;

/**
 * @description:
 * @author: SXJ
 * @date: 2019-06-04 17:15
 */
public interface QingcheckService {
    //人工审单,负面清单,清单查验,
    List<TbQing> findtbQingList(String status);
    //清单查询
    List<TbZong> fingAllQingList();

    //分页数据
    List<TbZong>fingAllQingList(Page page);
    //分页数据总数
    Integer selectPageCount(Page page);
    //删除多表数据
    int deleteQingAll(String id);
}
