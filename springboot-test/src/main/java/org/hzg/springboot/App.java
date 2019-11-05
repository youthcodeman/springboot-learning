package org.hzg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * springboot 开启测试步骤
 * 1、首先需要引入test的相关依赖
 * 2、需要在测试类上加@RunWith(SpringRunner.class) @SpringBootTest 这两个注解
 * 3、需要在测试方法上加 @Test 注解
 *
 */
@SpringBootApplication
public class App {
    public static void main( String[] args ) {
    	SpringApplication app = new SpringApplication(App.class);
    	ConfigurableApplicationContext context = app.run(args);
    }
}
