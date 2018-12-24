package spring.basic.anno.iocinit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用@Configuration 注解来标识该类为一个配置类，等同于xml方式的 bean.xml文件
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-18 15:17
 * @since 1.0.0v
 */
@Configuration
public class IocInitConfig {

    @Bean
    public Car car() {
        return new Car("奔驰");
    }

}
