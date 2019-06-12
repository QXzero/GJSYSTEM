package com.shi.gjsystem.mapper;

import com.shi.gjsystem.pojo.*;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.AbstractDocument;

public interface TbQingMapper {

    int addqing(TbQing tbQing);
    //人工审单,负面清单,清单查验
    List<TbQing> findtbQingList(@Param("stauts") String stauts);
    //通过关键字分页查询，返回总记录数
    public Integer selectPageCount(Page page);
    //清单删除
    public int deleteQing(@Param("qingNo")String qingNo);
    //清单放行,禁止出境
    public int stautsByPrimaryKey(@Param("qingNo") String qingNo,@Param("stauts") String stauts);
    //删除多表数据
    int deleteQingAll(@Param("id")String id);

}