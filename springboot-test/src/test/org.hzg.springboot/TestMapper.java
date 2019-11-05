package org.hzg.springboot;

import org.hzg.springboot.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hzgal on 2019-11-5. 这里用来测试接口
 */
@RunWith(SpringRunner.class)
public class TestMapper {

    @MockBean
    private UserMapper userMapper;

    @Test(expected = NullPointerException.class)
    public void testUserMapper() {
        BDDMockito.given(userMapper.cresteUser("admin")).willReturn(Integer.valueOf(1));
        BDDMockito.given(userMapper.cresteUser("")).willReturn(Integer.valueOf(0));
        BDDMockito.given(userMapper.cresteUser(null)).willThrow(NullPointerException.class);

        Assert.assertEquals(Integer.valueOf(1),userMapper.cresteUser("admin"));
        Assert.assertEquals(Integer.valueOf(0),userMapper.cresteUser(""));
        Assert.assertEquals(Integer.valueOf(0),userMapper.cresteUser("admin"));
    }
}
