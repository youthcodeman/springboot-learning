package org.hzg.springboot.beanDefinationRegistray;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * Created by hzgal on 2019-10-19.
 * Import 同样可以导入实现了ImportBeanDefinitionRegistrar接口的类，效果和ImportSelector，区别在于ImportBeanDefinitionRegistrar的接口参数有BeanDefinitionRegistry
 * 对象，可以自己手动注入类
 */
public class RegistryBeanByBeanDefinationRegistrary implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(DemoBean.class);
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        beanDefinitionRegistry.registerBeanDefinition("demoBean",beanDefinition);
    }
}
