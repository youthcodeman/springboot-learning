package org.hzg.springboot;


import org.hzg.springboot.dao.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.*;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import redis.clients.jedis.Jedis;

/**
 *
 *  AOP开发流程
 *  1：spring-boot-starter-aop，加入依赖，默认就开启了AOP的支持
 *  2：写一个Aspect，封装横切关注点（日志，监控等等），需要配置通知（前置通知、后置通知等等）和 切入点（哪些包的哪些类的哪些方法等等）
 *  3：这个Aspect需要纳入到spring容器管理，并且需要加入@Aspect
 *
 *  spring.aop.auto配置项决定是否启用AOP，默认启用
 *
 *  默认是使用基于JDK的动态代理来实现AOP
 *  spring.aop.proxy-target-class=false 或者不配置，表示使用JDK的动态代理
 *  =true表示使用cglib
 *  如果配置了false，而类没有接口，则依然使用cglib
 */
@SpringBootApplication
@EnableAspectJAutoProxy
//@EnableRedis      两种方式启动mydis stater 第一种注解的方式，在EnableRedis 中import自定义的配置类  第二种交给springboot自动扫描在自定义stater的resource目录下
//新建 /META-INF/spring.factories 增加配置项org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.edu.spring.boot.redis.RedisAutoConfiguration
public class App {
    public static void main( String[] args ) throws Exception{
    	SpringApplication app = new SpringApplication(App.class);
        ConfigurableApplicationContext configurableApplicationContext = app.run(args);
        configurableApplicationContext.getBean(UserDao.class).addUser("zhangsan","123456");

        //测试自定义rediss stater
        Jedis jedis = (Jedis)configurableApplicationContext.getBean("createJedis");
        jedis.set("111","foobar");
        jedis.get("111");
    }
}
