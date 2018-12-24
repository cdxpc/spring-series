package spring.basic.xml.createbean;

/**
 * 通过调用静态工厂方法的方式
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-21 15:00
 * @since 1.0.0v
 */
public class ColorStaticFactory {

    // 工厂 - 静态方法
    public static Color getColor(String colorType) {
        if("blue".equals(colorType)) {
            return new Blue();
        } else {
            return new Green();
        }
    }
}
