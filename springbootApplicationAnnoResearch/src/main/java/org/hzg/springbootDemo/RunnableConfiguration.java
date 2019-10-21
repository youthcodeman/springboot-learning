package org.hzg.springbootDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hzgal on 2019-10-21.
 */
@Configuration
public class RunnableConfiguration {

    @Bean
    public Runnable createRunnable() {
        return () -> {};
    }
}
