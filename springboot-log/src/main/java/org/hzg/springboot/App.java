package org.hzg.springboot;

import org.hzg.springboot.dao.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 日志级别：trace，debug，info，warn，error，fatal，off（表示关闭日志）
 *
 * springboot默认的日志支持logback，只需要在classpath下面放一个logbak.xml 或者logback-spring.xml即可个性化定制自己的日志输出
 *
 * 更换log框架步骤
 * 1、在springboot-starter中排除已有的logging的starter
 * 2、引入想用的log框架的依赖
 * 3、在classpath下面新加新的日志框架的配置文件
 */
@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class,args);
        configurableApplicationContext.getBean(UserDao.class).log();
    }
}
