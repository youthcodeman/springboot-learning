package org.hzg.springboot.aboutImport;

import org.springframework.context.annotation.Bean;

/**
 * Created by hzgal on 2019-10-17.
 */
public class MyConfiguration {

    @Bean
    public Car createCar() {
        return new Car();
    }

    @Bean
    public Car createCar1() {
        return new Car();
    }
}
