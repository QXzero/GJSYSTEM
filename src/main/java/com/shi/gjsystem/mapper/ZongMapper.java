package com.shi.gjsystem.mapper;

import com.shi.gjsystem.pojo.Page;
import com.shi.gjsystem.pojo.TbZong;

import java.util.List;

/**
 * @description: 清单查询
 * @author: SXJ
 * @date: 2019-06-04 21:55
 */
public interface ZongMapper {
    //清单查询
    List<TbZong> fingAllQingList();


    //通过关键字分页查询数据列表
    public List<TbZong> selectPageList(Page page);

    //通过关键字分页查询，返回总记录数
    public Integer selectPageCount(Page page);
}
