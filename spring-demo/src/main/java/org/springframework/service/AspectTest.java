/*
 * Copyright (c) 2005-2018 , FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package org.springframework.service;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
	public void before(){
		System.out.println("===========方法前===========");
	}
	@After("pointcut()")
	public void after(){
		System.out.println("===========方法后===========");
	}
}
