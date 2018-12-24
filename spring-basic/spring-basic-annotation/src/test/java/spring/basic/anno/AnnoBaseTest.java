package spring.basic.anno;

import org.junit.After;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StringUtils;

/**
 * 注解方式测试基类
 *
 * @author keivn.chen <https://github.com/cdxpc>
 * @create 2018-12-20 9:31
 * @since 1.0.0v
 */
public class AnnoBaseTest {

    protected AnnotationConfigApplicationContext context;
    protected String env;

    // IOC 容器创建完成之后，就可以使用 appclication context
    protected void init(Class<?> config) {
        context = new AnnotationConfigApplicationContext();
        if (env != null && !"".equals(env)) {
            // 通过指定或配置的方式来激活某个或某些配置生效， 多个直接使用,分割  例如： spring.profiles.active = dev,test
            String[] envs = StringUtils.commaDelimitedListToStringArray(env);
            context.getEnvironment().setActiveProfiles(envs);
        }
        context.register(config);
        context.refresh();
    }

    @After
    public void destroy() {
        // 关闭 IOC 容器
        context.close();
    }
}
