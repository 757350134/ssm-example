package com.wxp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wxp.dao.AppPluginMapper;
import com.wxp.model.AppPlugin;
import com.wxp.service.AppPluginService;

@Service("appPluginService")
@Transactional
public class AppPluginServiceImpl implements AppPluginService{

	@Autowired
	private AppPluginMapper mapper;
	@Override
	public Map<String,Object> findAppPluginList() {
		List<AppPlugin> appPluginList = mapper.findAppPluginList();
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("success", true);
		result.put("code", 0);
		result.put("msg", "ok");
		result.put("dataType", 1);//0无数据,1对象,2数组
		if(null!=appPluginList&&appPluginList.size()>=0) {
		   result.put("data", appPluginList);
		}
		return result;
	}

}
