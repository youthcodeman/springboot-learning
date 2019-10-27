package org.hzg.springboot;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;


/**
 *  更换web容器
 *  springboot web默认使用的是tomcat作为web容器
 *  可以更换成jetty
 *  步骤：
 *  1：排除
 *  <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-starter-tomcat</artifactId>
 依赖
 2：加入jetty依赖
 <dependency>
 <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-starter-jetty</artifactId>
 </dependency>

 ==========================================================================================================================
 静态资源可访问路径
 classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/static/", "classpath:/public/
 修改默认静态资源访问路径使用spring.resources.static-locations=
 *
 */

@SpringBootApplication
@ServletComponentScan
public class App {
    public static void main( String[] args ) {
		SpringApplication.run(App.class,args);
    }
}
