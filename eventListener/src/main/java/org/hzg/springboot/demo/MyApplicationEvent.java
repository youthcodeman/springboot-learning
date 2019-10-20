package org.hzg.springboot.demo;

import org.springframework.context.ApplicationEvent;

/**
 * Created by hzgal on 2019-10-20.
 */
public class MyApplicationEvent extends ApplicationEvent{
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
