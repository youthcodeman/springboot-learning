package org.hzg.springboot;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDateTime;

/**
 * Created by hzgal on 2019-10-27.
 */
@WebListener
public class MyWebContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("app start at " + LocalDateTime.now().toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("app down at " + LocalDateTime.now().toString());
    }
}
