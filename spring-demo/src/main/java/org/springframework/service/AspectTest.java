/*
 * Copyright (c) 2005-2018 , FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package org.springframework.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @author caizq
 * @date 2019/8/1
 * @since v1.0.0
 */
@Aspect
@Order(9)
public class AspectTest {
	@Pointcut("execution(* sayHello())")
	private void pointcut(){

	}
	@Before("pointcut()")
	public void beforeTest(){
		System.out.println("===========方法前===========");
	}
	@After("pointcut()")
	public void afterTest(){
		System.out.println("===========方法后===========");
	}
	@Around("pointcut()")
	public Object aroundTest(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("=========beforeSubTest==========");
		Object o = null;
		try {
			o = proceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("=========afterSubTest==========");
		return o;
	}
}
