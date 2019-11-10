package com.imooc.mysell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MysellApplication {

    public static void main(String[] args) {
        /*Properties properties = new Properties();*/

        SpringApplication.run(MysellApplication.class, args);
    }

}
