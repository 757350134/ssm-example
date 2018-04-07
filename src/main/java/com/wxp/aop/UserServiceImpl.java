package com.wxp.aop;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

	@Override
	public void query() {

		System.out.println("查询成功！");
	}

	@Override
	public void save() {

		System.out.println("save成功！");
	}

	
}
