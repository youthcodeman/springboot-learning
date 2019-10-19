package org.hzg.springboot;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import org.hzg.springboot.aboutImport.Car;
import org.hzg.springboot.aboutImport.Cat;
import org.hzg.springboot.aboutImport.Jeep;
import org.hzg.springboot.aboutImport.MyConfiguration;
import org.hzg.springboot.beanDefinationRegistray.DemoBean;
import org.hzg.springboot.enableDemo.MyEnableUserConfuguration;
import org.hzg.springboot.enableDemo.UserConfiguration;
import org.hzg.springboot.importSelector.MyImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

//@EnableConfigurationProperties这个注解是用来启用一个特性的，这个特性可以把配置文件的属性注入到bean里面去
@EnableConfigurationProperties
@ComponentScan
@EnableAsync
@MyEnableUserConfuguration

//用来导入一个或多个类（被spring容器托管），或者配置类（其中的类都会被spring容器所托管）
//@Import({Cat.class, Jeep.class, MyConfiguration.class})

//MyImportSelector实现了ImportSelector，返回一个class类名的数组，spring会根据类名去加载其中的所有对象
//@Import(MyImportSelector.class)
public class App {
    public static void main( String[] args ) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class,args);
        System.out.println(configurableApplicationContext.getBean(TomcatConfiguration.class));
        configurableApplicationContext.getBean(Runnable.class).run();
        System.out.println("主线程执行了");
        System.out.println(configurableApplicationContext.getBeansOfType(UserConfiguration.class));

        System.out.println("=======================import===============================");
        System.out.println(configurableApplicationContext.getBean(Cat.class));
        System.out.println(configurableApplicationContext.getBean(Jeep.class));
        System.out.println(configurableApplicationContext.getBeansOfType(Car.class));

        System.out.println(configurableApplicationContext.getBeansOfType(DemoBean.class) + "=====importBeanDefinationRegistrary");
    }
}
