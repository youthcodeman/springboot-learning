package org.hzg.springboot;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * 主要的目的在于加载第三方依赖库或者自定义的外部依赖中的bean，加载流程是该注解@Import了一个名叫AutoConfigurationImportSelector的类，
 * 这个类是一个实现了ImportSelector接口的类，最终返回一个String[],里面保存的是需要加载的类的全限定名。同时，该注解还支持外部类加载时的
 * 过滤功能（利用类名和类类型两种方式），还有是否启动EnableConfiguration功能的配置项spring.boot.enableautoconfiguration
 */
@EnableAutoConfiguration(excludeName={"org.hzg.springboot.Role"})
@ComponentScan
public class App {
    public static void main( String[] args ) {
        SpringApplication springApplication = new SpringApplication(App.class);
        ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
        System.out.println(configurableApplicationContext.getBean("createRunnable"));
        System.out.println(configurableApplicationContext.getBean(User.class));
        System.out.println(configurableApplicationContext.getBean(Role.class));
    }
}
