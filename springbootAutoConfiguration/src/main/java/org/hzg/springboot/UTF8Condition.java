package org.hzg.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by hzgal on 2019-10-16.
 */
public class UTF8Condition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if(System.getProperty("file.encoding").toLowerCase().equals("utf-8")) {
            return true;
        }
        return false;
    }
}
