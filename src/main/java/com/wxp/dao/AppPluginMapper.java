package com.wxp.dao;

import java.util.List;

import com.wxp.model.AppPlugin;

public interface AppPluginMapper {
    
  //查询所有
    List<AppPlugin> findAppPluginList();
}