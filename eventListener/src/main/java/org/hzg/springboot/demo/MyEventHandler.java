package org.hzg.springboot.demo;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by hzgal on 2019-10-20.
 */
@Component
public class MyEventHandler {

    /**
     * 这里参数任意，但是不能为空，表示的其参数为我们所定义的参数的事件，该监听器都可以监听到
     * @param myApplicationEvent
     */
    @EventListener
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println("MyEventHandler监听到事件：" + myApplicationEvent.getClass());
    }

    /**
     * 监听Spring的事件
     * @param event
     */
    @EventListener
    public void contextStopEventListener(ContextStoppedEvent event) {
        System.out.println("应用停止事件：" + event.getClass());
    }
}
