import org.chris.demo.service.IMyTestService;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 各step标签着色代码:
 * \bstep[0-9]{1,2}\b.*   -->   FF0200
 * \bstep[0-9]{1,2}.[1-9]{1,2}\b.*    ---> FF00D1
 * \bstep[0-9]{1,2}.[1-9]{1,2}.[1-9]{1,2}\b.*     --->   FFE800
 */
public class IocTest {

    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("springioc.xml"));
        IMyTestService myTestBean = (IMyTestService) factory.getBean("myTestBean");
        myTestBean.sayHello();

    }

}
