package com.wxp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.wxp.model.AppPlugin;
import com.wxp.model.TargetApp;
import com.wxp.service.AppPluginService;
import com.wxp.service.ExampleService;



@Controller
@RequestMapping("/api")
public class AppPluginController {

	@Autowired
	private AppPluginService appPluginService;
	
	
	@RequestMapping("/query/applugins_debug")
	@ResponseBody
	public String showValue(){
		Map<String, Object> appPluginList = appPluginService.findAppPluginList();
		return JSON.toJSONString(appPluginList);
	}		
	
}
