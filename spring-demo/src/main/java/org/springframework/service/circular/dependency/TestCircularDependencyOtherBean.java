package org.springframework.service.circular.dependency;

public class TestCircularDependencyOtherBean {

	private ITestCircularDependencyBean testCircularDependencyBean;
	public TestCircularDependencyOtherBean(ITestCircularDependencyBean testCircularDependencyBean){
		this.testCircularDependencyBean= testCircularDependencyBean;
	}
}
