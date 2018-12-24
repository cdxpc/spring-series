package spring.basic.xml;

import org.junit.After;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * xml方式测试基类
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-20 9:03
 * @since 1.0.0v
 */
public class XmlBaseTest {

    protected ClassPathXmlApplicationContext context;

    // IOC 容器创建完成之后，就可以使用 appclication context
    protected void init() {

        // spring 对配置文件是支持使用spEL和OGNL表达式的
        String path = "classpath*:spring-${moduleName}.xml";

        // 调用有参数构造，默认会调用setConfigLocation()方法和refresh() 方法
        // context = new ClassPathXmlApplicationContext(path);

        // 调用无参构造，必须显示的调用setConfigLocation()方法和refresh() 方法
        context = new ClassPathXmlApplicationContext();
        context.setConfigLocation(path);
        context.refresh();
    }

    @After
    public void destroy() {
        // 关闭 IOC 容器
        context.close();
    }
}
