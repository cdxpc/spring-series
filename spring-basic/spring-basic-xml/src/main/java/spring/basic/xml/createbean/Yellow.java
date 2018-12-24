package spring.basic.xml.createbean;

/**
 * 演示 spring 通过 xml 方式创建bean
 *  3、通过实例工厂方式创建bean实例
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-21 13:41
 * @since 1.0.0v
 */
public class Yellow implements Color {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void myColor() {
        System.out.println("Yellow say: My color is " + name);
    }
}
