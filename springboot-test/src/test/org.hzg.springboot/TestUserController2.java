package org.hzg.springboot;

import org.hzg.springboot.controller.UserController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created by hzgal on 2019-11-5.  WebMvcTest是一个内嵌的web环境，可以用来测试http请求
 *
 * @WebMvcTest 不会加载整合spring容器，所以如果单独需要依赖别的bean  需要自己去mock
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class TestUserController2 {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUserHome() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/user/home")).andExpect(MockMvcResultMatchers.status().isOk());
        mockMvc.perform(MockMvcRequestBuilders.post("/user/home")).andExpect(MockMvcResultMatchers.status().isOk()).
                andExpect(MockMvcResultMatchers.content().string("user home"));
    }

    @Test
    public void testUserShow() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/user/show").param("id","400")).andExpect(MockMvcResultMatchers.status().isOk());
        mockMvc.perform(MockMvcRequestBuilders.post("/user/show").param("id","400")).andExpect(MockMvcResultMatchers.status().isOk()).
                andExpect(MockMvcResultMatchers.content().string("user show400"));
    }
}
