import org.chris.demo.service.IMyTestService;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class IocTest {

    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("springioc.xml"));
        IMyTestService myTestBean = (IMyTestService) factory.getBean("myTestBean");
        myTestBean.sayHello();

    }

}
