package com.shi.gjsystem.service;

import com.shi.gjsystem.pojo.TbQing;

import java.util.List;

/**
 * @description:
 * @author: SXJ
 * @date: 2019-06-03 17:20
 */
public interface ArtificialtrialService {

    List<TbQing> findtbQingList(String status);

    int deleteQing(String qingNo);

    int stautsByPrimaryKey(String qingNo,String stauts);
}
