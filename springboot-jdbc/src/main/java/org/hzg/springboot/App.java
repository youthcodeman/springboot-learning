package org.hzg.springboot;

import java.sql.Connection;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import com.zaxxer.hikari.HikariDataSource;
import org.hzg.springboot.dao.ProductDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@SpringBootApplication
@EnableTransactionManagement
public class App {
    public static void main( String[] args ) throws Exception{
    	SpringApplication app = new SpringApplication(App.class);
        ConfigurableApplicationContext configurableApplicationContext = app.run(args);
        System.out.println(configurableApplicationContext.getBean(DataSource.class));
//
//        DataSource ds = configurableApplicationContext.getBean(DataSource.class);
//        Connection conn = ds.getConnection();
//    	System.out.println(conn.getCatalog());
//    	conn.close();

        //configurableApplicationContext.getBean(ProductDao.class).addProduct("shoes");
        configurableApplicationContext.getBean(ProductDao.class).addProductBatch("111","2222","333","4444");
    }
}
