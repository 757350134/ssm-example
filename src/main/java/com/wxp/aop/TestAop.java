package com.wxp.aop;

import javax.annotation.Resource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect 
public class TestAop{

	@Around("execution(* com.wxp.aop..*(..)) and ! execution(* com.wxp.aop.UserService.*(..))")
	public Object around(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("拦截方法"+pj.toString());
		pj.proceed();
		return null;
	}
}
