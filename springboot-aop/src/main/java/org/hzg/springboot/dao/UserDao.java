package org.hzg.springboot.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by hzgal on 2019-10-30.
 */
@Repository
public class UserDao {

    public void addUser(String userName,String password) {
        System.out.println("添加用户成功，用户名： " + userName + " 用户密码：" + password);
    }
}
