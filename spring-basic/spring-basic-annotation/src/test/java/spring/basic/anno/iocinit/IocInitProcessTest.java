package spring.basic.anno.iocinit;

import org.junit.Before;
import org.junit.Test;
import spring.basic.anno.AnnoBaseTest;

/**
 * 该类主要是用来跟踪spring IOC容器使用注解进行初始化过程的
 *      通过断点跟踪来研究spring IOC 容器是如何进行初始化的
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-18 15:32
 * @since 1.0.0v
 */
public class IocInitProcessTest extends AnnoBaseTest {

    @Before
    public void setUp() {
        // System.setProperty("spring.profiles.active", "dev");
        init(IocInitConfig.class);
    }

    @Test
    public void testInit() {

        // 从容器中获取指定名称的bean
        Car car = (Car) context.getBean("car");
        System.out.println("car = " + car);

    }
}
