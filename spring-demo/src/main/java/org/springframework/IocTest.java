package org.springframework;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.service.IMyTestService;

/**
 * 各step标签着色代码:
 * \bstep[0-9]{1,2}\b.*   -->   FF0000
 * \bstep[0-9]{1,2}.[1-9]{1,2}\b.*    ---> FF0096
 * \bstep[0-9]{1,2}.[1-9]{1,2}.[1-9]{1,2}\b.*     --->   FF00FF
 *
 * \btodo chris\b.*   ---> FFFF00
 * ❤.*❤  ---> 00FFFF
 */
@SuppressWarnings("ALL")
public class IocTest {

    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("springioc.xml"));
        IMyTestService myTestBean = (IMyTestService) factory.getBean("myTestBean");
        myTestBean.sayHello();

    }

}
