package org.hzg.springboot.applicationContextInitializer;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hzgal on 2019-10-20.
 * 该类实在容器刷新之前的一个回调，会将configurableApplicationContext传进来，我们可以进行一些操作
 *
 * 注解该类到spring容器中有两种方式
 * 1. SpringApplication.addInitializers(new MyApplicationContextInitializer());
 * 2. 通过配置文件context.initializer.classes
 * 3. 需要加载外部项目中的ApplicationContextInitializer的实现类的时候，和之前一样，只需要在外部项目中的/MTEA-INF/spring.factories中配置
 * org.springframework.context.ApplicationContextInitializer为key的类就行
 */

public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println(configurableApplicationContext.getBeanDefinitionCount());
        ConfigurableListableBeanFactory configurableListableBeanFactory = configurableApplicationContext.getBeanFactory();
        String[] beanDefNames = configurableListableBeanFactory.getBeanDefinitionNames();
        List beanDefNameList = Arrays.asList(beanDefNames);
        beanDefNameList.stream().forEach(
                beanDefName -> {
                    System.out.println(beanDefName);
                }
        );
    }
}
