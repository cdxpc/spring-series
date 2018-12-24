package spring.basic.xml.createbean;

/**
 * 演示 spring 通过 xml 方式创建bean
 *   2、通过静态工厂方式创建bean实例
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-21 13:41
 * @since 1.0.0v
 */
public class Green implements Color {

    private String name;

    public Green() {
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void myColor() {
        System.out.println("Green say: My color is " + name);
    }
}
