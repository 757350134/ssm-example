package com.wxp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.wxp.service.ExampleService;



@Controller
@RequestMapping("/test")
public class ExampleController {

	@Autowired
	private ExampleService exampleService;
	
	
	@RequestMapping("/showValue")
	@ResponseBody
	public String showValue(){
		
		return exampleService.getValue();
	}		
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(){
		try {
			exampleService.update("fe0740b008b64a1bbfda6667855325e1");
		}catch (Exception e) {
          e.printStackTrace();
          return "更新失败!";
		}
		return "更新成功！";
	}
	@RequestMapping("/findList")
	@ResponseBody
	public  String findList(){
		String json = JSON.toJSONString(exampleService.findList());
		return json;
	}	
	
	@RequestMapping("/findAppPluginList")
	@ResponseBody
	public  String findAppPluginList(){
		String json = JSON.toJSONString(exampleService.findAppPluginList());
		return json;
	}
	

}
