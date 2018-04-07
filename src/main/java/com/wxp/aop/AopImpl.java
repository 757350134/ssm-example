package com.wxp.aop;

import org.springframework.stereotype.Component;

@Component
public class AopImpl implements TestAopMapper{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("this is dao save()！");
	}

}
