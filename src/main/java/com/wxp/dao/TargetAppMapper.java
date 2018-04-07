package com.wxp.dao;

import java.util.List;

import com.wxp.model.TargetApp;

public interface TargetAppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TargetApp record);

    int insertSelective(TargetApp record);

    TargetApp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TargetApp record);

    int updateByPrimaryKeyWithBLOBs(TargetApp record);

    int updateByPrimaryKey(TargetApp record);
    
    //查询所有
    List<TargetApp> findList();
}