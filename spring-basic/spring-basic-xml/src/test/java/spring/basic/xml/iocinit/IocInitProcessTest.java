package spring.basic.xml.iocinit;

import org.junit.Before;
import org.junit.Test;
import spring.basic.xml.XmlBaseTest;

/**
 * 该类主要是用来跟踪spring IOC容器使用xml进行初始化过程的
 *      通过断点跟踪来研究spring IOC 容器是如何进行初始化的
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-18 15:32
 * @since 1.0.0v
 */
public class IocInitProcessTest extends XmlBaseTest {

    @Before
    public void setUp(){
        // 设置加载的配置文件所对应的模块，这里会加载classpath路径下的spring-iocinit.xml文件
        System.setProperty("moduleName", "iocinit");
        init();
    }

    @Test
    public void testInit() {

        // 从容器中获取指定名称的bean
        Car car = (Car) context.getBean("car");
        System.out.println("car = " + car);

    }
}
