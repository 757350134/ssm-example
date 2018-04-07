package com.wxp.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
/*@Aspect*/
public class Aop {

	
	 @Pointcut("execution(* com.wxp.aop.TestAopMapper.*(..))")
	   public void pointCut(){
	       
	   }
	   
	   @Before("pointCut()")
	   public void begin(){
	       System.out.println("开启事务");
	   }
	   
	   @After("pointCut()")
	   public void close(){
	       System.out.println("关闭事务");
	   }
}
