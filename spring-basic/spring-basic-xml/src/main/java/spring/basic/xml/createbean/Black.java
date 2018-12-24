package spring.basic.xml.createbean;

/**
 * 演示 spring 通过 xml 方式创建bean
 *   1、通过构造函数方式创建bean实例
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-21 13:43
 * @since 1.0.0v
 */
public class Black {

    private String name;

    public Black(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("Black say: My color is " + name);
        return null;
    }
}
