package org.hzg.springboot.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by hzgal on 2019-11-1.
 */
@Component
public class UserDao {

    private Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void log() {
        logger.info("this is info log");
        logger.debug("this is debug log");
        logger.warn("this is warn log");
        logger.error("this is error log");
    }
}
