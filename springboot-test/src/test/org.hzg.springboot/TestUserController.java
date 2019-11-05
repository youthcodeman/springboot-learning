package org.hzg.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzgal on 2019-11-5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestUserController {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testUserHome() {
        String content = testRestTemplate.postForObject("/user/home",null ,String.class);
        Assert.assertEquals("user home",content);
    }

    @Test
    public void testUserShow() {
        Integer tempId = 555;

        String content = testRestTemplate.postForObject("/user/show?id=" + tempId,null ,String.class);
        Assert.assertEquals("user show" + tempId,content);
    }
}
