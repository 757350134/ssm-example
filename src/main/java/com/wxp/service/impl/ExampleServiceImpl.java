package com.wxp.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.wxp.dao.AppPluginMapper;
import com.wxp.dao.TargetAppMapper;
import com.wxp.model.AppPlugin;
import com.wxp.model.TargetApp;
import com.wxp.service.ExampleService;

@Service("exampleService")
@Transactional
public class ExampleServiceImpl implements ExampleService {

	
	@Autowired
	private TargetAppMapper targetAppMapper;
	
	@Autowired
	private AppPluginMapper appPluginMapper;

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TargetApp> findList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppPlugin> findAppPluginList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
