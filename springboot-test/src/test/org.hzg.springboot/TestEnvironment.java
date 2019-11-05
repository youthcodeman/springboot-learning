package org.hzg.springboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hzgal on 2019-11-5.  environment主要用来获取配置文件中的值，优先取测试环境下的配置文件，测试环境没有的话则取正式环境的配置文件
 *
 * @SpringBootTest 会加载整个spring的配置
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"app.version=1.0.0"})
public class TestEnvironment {

    @Autowired
    private ConfigurableEnvironment environment;

    @Before
    public void init() {
        System.out.println("test environment preparing................");
    }

    @Test
    public void getValue() {
        System.out.println(environment.getProperty("org.hzg"));
        System.out.println(environment.getProperty("app.version"));
    }
}
