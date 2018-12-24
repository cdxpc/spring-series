package spring.basic.xml.createbean;

/**
 * 通过调用实例工厂方法的方式
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-21 15:00
 * @since 1.0.0v
 */
public class ColorInstanceFactory {

    // 工厂 - 实例对象方法
    public Color getColor2(String colorType) {
        if("red".equals(colorType)) {
            return new Red();
        } else {
            return new Yellow();
        }
    }
}
