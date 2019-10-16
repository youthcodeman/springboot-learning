package org.hzg.springboot;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

import javax.swing.plaf.PanelUI;

/**
 * Created by hzgal on 2019-10-16.
 */
@SpringBootConfiguration
public class EncodingConvertConfiguration {

    @Bean
    @Conditional(GBKCondition.class)
    public EncodingConvert createGBKEncodingConvert() {
        return new GBKEncodingConvert();
    }

    @Bean
    @Conditional(UTF8Condition.class)
    public EncodingConvert createUTF8EncodingConvert() {
        return new UTF8EncodingConvert();
    }
}
