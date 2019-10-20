package org.hzg.springboot;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import org.hzg.springboot.demo.MyApplicationEvent;
import org.hzg.springboot.demo.MyApplicationEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.DelegatingApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListenerMethodProcessor;


/**
 * 1. 自定义事件需要继承ApplicationEvent抽象类
 * 2. 自定义事件监听器，需要实现ApplicationListener接口
 * 3. 将监听器加入到spring容器中（通过EventListener注解同样可以实现（原理见DelegatingApplicationListener，大致就是根据该注解找方法，然后生成一个ApplicationEventListener），
 * 通过配置文件也可以context.listener.classes（原理见DelegatingApplicationListener，大致流程就是根据该配置找到相应的Listener并实例化） ）
 * 4. 发布事件
 */
@SpringBootApplication
public class App {
    public static void main( String[] args ) {
    	SpringApplication app = new SpringApplication(App.class);
		ConfigurableApplicationContext configurableApplicationContext = app.run(args);
		configurableApplicationContext.addApplicationListener(new MyApplicationEventListener());
		configurableApplicationContext.publishEvent(new MyApplicationEvent(new Object()));

		configurableApplicationContext.stop();
    }
}
