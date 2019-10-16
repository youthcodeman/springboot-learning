package org.hzg.springboot;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class,args);
        System.out.println(configurableApplicationContext.getBeansOfType(EncodingConvert.class));
        System.out.println(configurableApplicationContext.getBeansOfType(Runnable.class));
    }
}
