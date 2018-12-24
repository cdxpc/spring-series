package spring.basic.anno.createbean;

import org.junit.Before;
import org.junit.Test;
import spring.basic.anno.AnnoBaseTest;
import spring.basic.anno.iocinit.IocInitConfig;

/**
 * 该类主要是用来跟踪spring IOC容器创建bean的几种方式
 *  1、常用注解的方式：
 *      @Bean, @Compance, @Repository, @Service, @Controller
 *  2、实现FactoryBean 接口的方式：
 *
 *  3、
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-24 14:53
 * @since 1.0.0v
 */
public class CreateBeanTest extends AnnoBaseTest {

    @Before
    public void setUp() {
        init(IocInitConfig.class);
    }

    @Test
    public void testInit() {

    }
}
