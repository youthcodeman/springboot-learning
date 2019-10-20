package org.hzg.springboot.demo;

import org.springframework.context.ApplicationListener;

/**
 * Created by hzgal on 2019-10-20.
 */
public class MyApplicationEventListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println("监听到事件：" + myApplicationEvent.getClass());
    }
}
