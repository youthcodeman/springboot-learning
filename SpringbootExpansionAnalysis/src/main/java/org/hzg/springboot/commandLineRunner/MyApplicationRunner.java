package org.hzg.springboot.commandLineRunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by hzgal on 2019-10-21.这个类和实现了CommandLineRunner接口的类的效果一样，区别在于参数不同
 * ApplicationArguments 是对参数做了封装将--name=value封装成一个map，我们可以根据name来获取value
 */
@Component
@Order(5)
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("spring 容器全部初始化完毕：" + MyApplicationRunner.class.getName());
    }
}
