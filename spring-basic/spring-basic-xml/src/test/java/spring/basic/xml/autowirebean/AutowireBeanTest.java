package spring.basic.xml.autowirebean;

import org.junit.Before;
import org.junit.Test;
import spring.basic.xml.XmlBaseTest;

/**
 * spring bean 的自动装配方式测试
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-20 10:40
 * @since 1.0.0v
 */
public class AutowireBeanTest extends XmlBaseTest {

    @Before
    public void setUp() {
        System.setProperty("moduleName", "autowire");
        init();
    }

    @Test
    public void test01() {
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
