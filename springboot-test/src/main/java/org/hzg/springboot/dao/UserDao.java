package org.hzg.springboot.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by hzgal on 2019-11-5.
 */
@Repository
public class UserDao {

    public Integer addUser(String userName) {
        System.out.println("userDao add user: userName=" + userName);
        return userName == null ? 0 : 1;
    }
}
