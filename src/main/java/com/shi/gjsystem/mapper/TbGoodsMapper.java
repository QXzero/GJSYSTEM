package com.shi.gjsystem.mapper;

import com.shi.gjsystem.pojo.TbGoods;
import com.shi.gjsystem.pojo.TbGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsMapper {
    int insert( TbGoods tbGoods);

    int countByExample(TbGoodsExample example);

    int deleteByExample(TbGoodsExample example);

    //int insert(TbGoods record);

    int insertSelective(TbGoods record);

    List<TbGoods> selectByExample(TbGoodsExample example);

    int updateByExampleSelective(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);

    int updateByExample(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);
}