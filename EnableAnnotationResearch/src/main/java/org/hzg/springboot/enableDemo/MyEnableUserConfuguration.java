package org.hzg.springboot.enableDemo;

import org.hzg.springboot.importSelector.MyImportSelector;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.AsyncConfigurationSelector;

import java.lang.annotation.*;

/**
 * Created by hzgal on 2019-10-17.
 * 自定义Enable**注解的话，需要有个接口实现ImportSelector，在这个接口中拿到注解的信息进行一些操作，同时返回一个String[] ,最后利用Import
 * 将这个接口绑定到注解上，添加注解以后就可以对注解绑定的bean进行实例化
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({MyImportSelector.class})
public @interface MyEnableUserConfuguration {

}
