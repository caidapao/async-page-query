package com.caidapao.asyncpagequery;

import com.caidapao.asyncpagequery.entity.User;
import com.caidapao.asyncpagequery.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AsyncPageQueryApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        userService.listUser(new User().setUserId("1213"));
    }

}
