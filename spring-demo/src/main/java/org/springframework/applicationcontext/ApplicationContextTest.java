package org.springframework.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.service.IMyTestService;

/**
 * @author caizq
 * @date 2019/6/1
 * @since v1.0.0
 */
public class ApplicationContextTest {
	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("springioc.xml");
		IMyTestService myTestBean = (IMyTestService) factory.getBean("myTestBean");
		myTestBean.sayHello();

	}
}
