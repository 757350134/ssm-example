package com.wxp.service;

import java.util.List;
import java.util.Map;

import com.wxp.model.AppPlugin;
import com.wxp.model.TargetApp;

public interface AppPluginService {
	Map<String,Object> findAppPluginList();

	String getMessage();
}
