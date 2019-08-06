/*
 * Copyright (c) 2005-2018 , FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package org.springframework.service;

import java.util.Objects;

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
    @Override
    public void sayHello2() {
        System.out.println(string+"  Hello2");
    }

	@Override
	public boolean equals(Object o) {
		System.out.println("进入equal方法");
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MyTestServiceImpl that = (MyTestServiceImpl) o;
		return string.equals(that.string);
	}

	@Override
	public int hashCode() {
		System.out.println("进入hashcode方法");
		return Objects.hash(string);
	}
}
