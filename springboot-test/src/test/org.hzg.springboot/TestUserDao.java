package org.hzg.springboot;

import org.hzg.springboot.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hzgal on 2019-11-5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserDao {

    @Autowired
    private UserDao userDao;

    @Test
    public void testAddUser() {
        userDao.addUser("zhangsan");
        userDao.addUser(null);
    }
}
