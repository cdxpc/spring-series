package spring.basic.anno.iocinit;

/**
 * 实体类对象，用来演示作为spring IOC 容器中的bean
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-18 15:13
 * @since 1.0.0v
 */
public class Car {

    private String name;

    public Car() {}

    public Car(String name) {
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
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
