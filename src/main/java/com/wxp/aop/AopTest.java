package com.wxp.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
	/*ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
	@Test
	public  void test1() {
		//排除拦截
		UserService us =  (UserService) ac.getBean("userServiceImpl");
		us.save();
		//拦截目标
		TestAopMapper aop=  (TestAopMapper) ac.getBean("aopImpl");
		aop.save();
		
	}
	
	@Test
	public void test2() {
		AopUtils us =  (AopUtils) ac.getBean("aopUtils");
		us.noStatic();
	}*/
}
