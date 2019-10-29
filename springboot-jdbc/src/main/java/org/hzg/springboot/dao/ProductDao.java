package org.hzg.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by hzgal on 2019-10-30.
 */
@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(String name) {
        String sql = "insert into product (pname) values ('"+ name +"')";
        jdbcTemplate.execute(sql);
    }
}
