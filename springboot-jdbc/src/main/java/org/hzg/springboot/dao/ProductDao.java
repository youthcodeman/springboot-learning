package org.hzg.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

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

    /**
     * 默认只回滚运行时异常，非运行时异常不会回滚
     * 如果需要，则需要单独设置rollbackFor = Exception.class
     *
     * 设置对指定异常不进行回滚 noRollbackFor = NullPointerException.class
     *
     * @Transactional 只能直接标注在公有方法上
     */
    //@Transactional(rollbackFor = Exception.class)
    @Transactional(noRollbackFor = NullPointerException.class)
    public void addProductBatch(String ... names) throws FileNotFoundException {
        for(int i = 0; i < names.length; i++) {
            String sql = "insert into product (pname) values ('"+ names[i] +"')";
            jdbcTemplate.execute(sql);
        }
        if(true) {
            //throw new IllegalArgumentException("测试抛出参数异常");
            //throw new FileNotFoundException("文件未找到异常");
            throw new NullPointerException("空指针异常");
        }
    }
}
