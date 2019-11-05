package org.hzg.springboot;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by hzgal on 2019-11-5. 加了TestConfiguration注解的类只能在test环境下被加载
 */
@TestConfiguration
public class TestBeanConfiguartion {

    @Bean
    public Runnable cretaeRunnable() {
        return () -> {};
    }
}
