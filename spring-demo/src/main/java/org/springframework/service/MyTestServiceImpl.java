/*
 * Copyright (c) 2005-2018 , FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package org.springframework.service;

/**
 * @author caizq
 * @date 2019/4/2
 * @since v1.0.0
 */
public class MyTestServiceImpl implements IMyTestService {
	private String string;
	public MyTestServiceImpl(String string){
		this.string = string;
	}
    @Override
    public void sayHello() {
        System.out.println(string+"  Hello");
    }
}
