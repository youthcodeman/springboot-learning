package org.hzg.springboot;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by hzgal on 2019-10-17.
 */
@Component
public class AsyncDemo implements Runnable {

    @Override
    @Async
    public void run() {
        for(int i = 0;i < 100;i++) {
            System.out.println("这是第" + (i + 1) + "次输出" );
        }
    }
}
