package org.hzg.springboot;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import org.hzg.springboot.applicationContextInitializer.MyApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
    	SpringApplication app = new SpringApplication(App.class);
    	app.addInitializers(new MyApplicationContextInitializer());


    	ConfigurableApplicationContext context = app.run(args);

		context.stop();
    }
}
