package com.shi.gjsystem.mapper;

import com.shi.gjsystem.pojo.TbEnterprise;
import com.shi.gjsystem.pojo.TbEnterpriseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEnterpriseMapper {
    int countByExample(TbEnterpriseExample example);

    int deleteByExample(TbEnterpriseExample example);

    int deleteByPrimaryKey(String cbecodeinsp);

    int insert(TbEnterprise record);

    int insertSelective(TbEnterprise record);

    List<TbEnterprise> selectByExample(TbEnterpriseExample example);

    TbEnterprise selectByPrimaryKey(String cbecodeinsp);

    int updateByExampleSelective(@Param("record") TbEnterprise record, @Param("example") TbEnterpriseExample example);

    int updateByExample(@Param("record") TbEnterprise record, @Param("example") TbEnterpriseExample example);

    int updateByPrimaryKeySelective(TbEnterprise record);

    int updateByPrimaryKey(TbEnterprise record);
}