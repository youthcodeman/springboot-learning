package org.hzg.springboot.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hzgal on 2019-10-20.
 * 该类的作用是spring容器全部初始化成功之后的一次回调
 */
@Component
@Order(3)
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(strings.length);
        List args = Arrays.asList(strings);
        args.stream().forEach(
                temp -> {
                    System.out.println(temp);
                }
        );
        System.out.println("========================spring容器全部初始化完毕=========================");
    }
}
