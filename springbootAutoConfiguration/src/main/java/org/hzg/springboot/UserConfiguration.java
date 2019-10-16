package org.hzg.springboot;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Created by hzgal on 2019-10-16.
 */
@SpringBootConfiguration
public class UserConfiguration {

    /**
     * 如果存在某个配置，则进行装配
     */
    @Bean
    @ConditionalOnProperty(name = "runnable.enable",havingValue = "true",matchIfMissing = true)
    public Runnable createRunnable() {
        return () -> {};
    }

    /**
     * 如果存在某个类，则进行装配
     */
    @Bean
    @ConditionalOnClass(EncodingConvert.class)
    public Runnable createRunnableConditionOnClass() {
        return ()-> {};
    }

    /**
     * 如果存在某个bean，则进行装配
     */
    @Bean
    @ConditionalOnBean(name = "createUTF8EncodingConvert")
    public Runnable crateRunnableConditionOnBean() {
        return () -> {};
    }
}
