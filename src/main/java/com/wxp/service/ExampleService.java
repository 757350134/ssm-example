package com.wxp.service;

import java.util.List;

import com.wxp.model.AppPlugin;
import com.wxp.model.TargetApp;

public interface ExampleService {

	public String getValue();
	
	void update(String id);
	
	List<TargetApp> findList();
	
	List<AppPlugin> findAppPluginList();
	
	

}
