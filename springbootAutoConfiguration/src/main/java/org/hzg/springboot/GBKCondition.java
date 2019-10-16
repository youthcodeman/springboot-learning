package org.hzg.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Condition是一个接口，其中有个抽象方法matches，返回结果为true则表明类加载，反之类不加载
 * 它可以用在方法上，只对该方法起作用，还可以用在该类上面，对该类下面的所有bean起作用
 *
 * Created by hzgal on 2019-10-16.
 * 需要判断条件的类需要实现Condition接口，然后实现接口中的方法写匹配的逻辑
 * 最后只需要在需要加条件的类上标明注解来决定该类的加载条件    @Conditional(GBKCondition.class)
 */
public class GBKCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if(System.getProperty("file.encoding").toLowerCase().equals("gbk")) {
            return true;
        }
        return false;
    }
}
