package org.hzg.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hzgal on 2019-10-19.
 */
@Configuration
public class RunnableConfiguration {

    @Bean
    public Runnable createRunnable() {
        return () -> {};
    }

    @Bean
    public User createUser() {
        return new User();
    }
}
