package com.shi.gjsystem.mapper;

import com.shi.gjsystem.pojo.TbOrders;
import com.shi.gjsystem.pojo.TbOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrdersMapper {
    TbOrders findByOrderNo(String ordersNo);

    int countByExample(TbOrdersExample example);

    int deleteByExample(TbOrdersExample example);

    int deleteByPrimaryKey(String ordersNo);

    int insert(TbOrders record);

    int insertSelective(TbOrders record);

    List<TbOrders> selectByExample(TbOrdersExample example);

    TbOrders selectByPrimaryKey(String ordersNo);

    int updateByExampleSelective(@Param("record") TbOrders record, @Param("example") TbOrdersExample example);

    int updateByExample(@Param("record") TbOrders record, @Param("example") TbOrdersExample example);

    int updateByPrimaryKeySelective(TbOrders record);

    int updateByPrimaryKey(TbOrders record);
}