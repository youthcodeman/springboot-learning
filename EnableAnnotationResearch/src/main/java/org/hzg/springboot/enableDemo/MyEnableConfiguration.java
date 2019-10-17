package org.hzg.springboot.enableDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hzgal on 2019-10-17.
 */
@Configuration
public class MyEnableConfiguration {

    @Bean
    public UserConfiguration createUser1() {
        return new UserConfiguration("zhangsan",18);
    }

    @Bean
    public UserConfiguration createUser2() {
        return new UserConfiguration("lisi",20);
    }
}
