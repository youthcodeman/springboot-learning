package org.hzg.springboot;

import java.util.*;

import org.hzg.springbootDemo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication 的默认包扫描路径是当前包及其子包，所以如果需要额外的指定扫描包路径的话，需要用scanBasePackages属性来指定
 *
 * @SpringBootApplication 同样可以对类进行排除，有两种方式1 根据类来排除exclude 2 根据类的全限定类名来排除excludeName
 */
@SpringBootApplication(scanBasePackages = "org.hzg",exclude = User.class)
public class App {

	@Value("${server.host:localhost}")
	private String serverHost;

    public static void main( String[] args ) {


    	SpringApplication app = new SpringApplication(App.class);
    	app.setBannerMode(Banner.Mode.OFF);
		Map<String, Object> defaultProperties = new HashMap<>();
		defaultProperties.put("server.host","192.168.0.100");
    	app.setDefaultProperties(defaultProperties);

    	ConfigurableApplicationContext context = app.run(args);
    	System.out.println(context.getBean(Runnable.class));
		//System.out.println(context.getBean(User.class));

		System.out.println(context.getEnvironment().getProperty("server.host"));
		System.out.println(context.getBean(App.class).serverHost);

    	context.close();
    }
}
