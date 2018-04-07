package com.wxp.aop;

import org.springframework.stereotype.Component;

@Component
public class AopUtils {

	private static AopUtils u=new AopUtils();
	
	public static AopUtils getInstance() {
		return u;
	}
	
	public static void getMessage() {
		System.out.println("get message!");
	}
	
	public void noStatic() {
		getMessage();
		System.out.println("no static method!");
	}
}
