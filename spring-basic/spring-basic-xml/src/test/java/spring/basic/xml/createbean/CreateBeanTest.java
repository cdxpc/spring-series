package spring.basic.xml.createbean;

import org.junit.Before;
import org.junit.Test;
import spring.basic.xml.XmlBaseTest;

/**
 * xml方式 spring IOC容器创建bean的几种方式
 *  1、构造器方式
 *  2、静态工厂方法方式
 *  3、实例工厂方法方式
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-21 16:23
 * @since 1.0.0v
 */
public class CreateBeanTest extends XmlBaseTest {

    @Before
    public void setUp(){
        // 设置加载的配置文件所对应的模块，这里会加载classpath路径下的spring-createbean.xml文件
        System.setProperty("moduleName", "createbean");
        init();
    }

    @Test
    public void testCreateBean() {
        System.out.println("----------构造函数方式----------");
        // 从容器中获取通过构造函数方式创建的bean
        Black black = (Black) context.getBean("black");
        black.toString();

        System.out.println("----------静态工厂方法----------");
        // 从容器中获取通过静态工厂方法方式创建的bean
        Blue blue = (Blue) context.getBean("blue");
        Green green = (Green) context.getBean("green");
        blue.myColor();
        green.myColor();

        System.out.println("----------实例工厂方法----------");
        // 从容器中获取通过实例工厂方法方式创建的bean
        Red red = (Red) context.getBean("red");
        Yellow yellow = (Yellow) context.getBean("yellow");
        red.myColor();
        yellow.myColor();
    }

}
