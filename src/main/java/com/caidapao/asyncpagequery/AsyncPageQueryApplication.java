package com.caidapao.asyncpagequery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.caidapao.asyncpagequery.mapper")
public class AsyncPageQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsyncPageQueryApplication.class, args);
    }

}
