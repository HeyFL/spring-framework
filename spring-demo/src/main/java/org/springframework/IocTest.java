package org.springframework;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.service.IMyTestService;

/**
 * 使用IDEA看注释的可以添加如下配置到IDEA的TODO配置中
 *
 * 步骤相关:
 * \bstep[0-9]{1,2}\b.*   -->   FF0000
 * \bstep[0-9]{1,2}.[1-9]{1,2}\b.*    ---> FF0096
 * \bstep[0-9]{1,2}.[1-9]{1,2}.[1-9]{1,2}\b.*     --->   FF00FF
 *
 * 待办相关:
 * \btodo chris\b.*   ---> FFFF00
 *
 * 星标:
 * ❤.*❤  ---> 00FFFF
 * \bheightLight\b.*   ---> FFFFFF
 *
 *
 * 代码查看:
 * 循环依赖解决方案请搜索:[☆.*☆]
 */
@SuppressWarnings("ALL")
public class IocTest {

    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("springioc.xml"));
        IMyTestService myTestBean = (IMyTestService) factory.getBean("myTestBean");
        myTestBean.sayHello();

    }

}
