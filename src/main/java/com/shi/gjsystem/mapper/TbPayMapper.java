package com.shi.gjsystem.mapper;

import com.shi.gjsystem.pojo.TbPay;
import com.shi.gjsystem.pojo.TbPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPayMapper {
    int countByExample(TbPayExample example);

    int deleteByExample(TbPayExample example);

    int deleteByPrimaryKey(String payNo);

    int insert(TbPay record);

    int insertSelective(TbPay record);

    List<TbPay> selectByExample(TbPayExample example);

    TbPay selectByPrimaryKey(String payNo);

    int updateByExampleSelective(@Param("record") TbPay record, @Param("example") TbPayExample example);

    int updateByExample(@Param("record") TbPay record, @Param("example") TbPayExample example);

    int updateByPrimaryKeySelective(TbPay record);

    int updateByPrimaryKey(TbPay record);
}