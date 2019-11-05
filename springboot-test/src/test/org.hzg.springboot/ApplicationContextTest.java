package org.hzg.springboot;

import org.hzg.springboot.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hzgal on 2019-11-5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestBeanConfiguartion.class)
public class ApplicationContextTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testGetBean() {
        System.out.println(applicationContext.getBean(User.class));
        System.out.println(applicationContext.getBean(Runnable.class));
    }
}
