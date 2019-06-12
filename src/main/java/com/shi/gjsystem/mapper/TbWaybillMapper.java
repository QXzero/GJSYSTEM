package com.shi.gjsystem.mapper;

import com.shi.gjsystem.pojo.TbWaybill;
import com.shi.gjsystem.pojo.TbWaybillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWaybillMapper {
    int countByExample(TbWaybillExample example);

    int deleteByExample(TbWaybillExample example);

    int deleteByPrimaryKey(String waybillNo);

    int insert(TbWaybill record);

    int insertSelective(TbWaybill record);

    List<TbWaybill> selectByExample(TbWaybillExample example);

    TbWaybill selectByPrimaryKey(String waybillNo);

    int updateByExampleSelective(@Param("record") TbWaybill record, @Param("example") TbWaybillExample example);

    int updateByExample(@Param("record") TbWaybill record, @Param("example") TbWaybillExample example);

    int updateByPrimaryKeySelective(TbWaybill record);

    int updateByPrimaryKey(TbWaybill record);
}