package org.hzg.springboot.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hzgal on 2019-10-20.
 * 该类的作用是spring容器全部初始化成功之后的一次回调
 */
@Component
@Order(2)
public class MyCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {

        System.out.println("=====spring容器全部初始化完毕,当前时间是：=====" + LocalDateTime.now().toString());
    }
}
