package com.imooc.mysell;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class MysellApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(MysellApplicationTests.class);
    @Test
    void contextLoads() {
        String name ="imooc";
        String password = "123456";

        logger.debug("debug");
        logger.info("name:{},password:{}",name,password);
        logger.error("error");
        logger.warn("warn");
    }

}
