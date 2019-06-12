package com.shi.gjsystem.mapper;

import com.shi.gjsystem.pojo.TbParam;
import com.shi.gjsystem.pojo.TbParamExample;
import java.util.List;

import com.shi.gjsystem.pojo.TbQing;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
import scala.collection.immutable.Page;

import javax.swing.text.AbstractDocument;

public interface TbParamMapper {
    List<TbParam> findByType(String paramtype);

    List<TbParam> findparamList(@Param("paramtype") String paramtype);

    List<TbParam> findQingList();
    //通过关键字分页查询数据列表
    public List<AbstractDocument.Content> selectPageList(Page page);

    //通过关键字分页查询，返回总记录数
    public Integer selectPageCount(Page page);
    //规则删除
    public int deleteParam(@Param("id") String id);
    //规则添加
    public int paramadd(TbParam tbParam);
}