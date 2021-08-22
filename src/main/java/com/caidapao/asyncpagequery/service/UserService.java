package com.caidapao.asyncpagequery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caidapao.asyncpagequery.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author caixuan
 * @date 2021/8/13 10:29
 **/
public interface UserService extends IService<User> {

    List<User> listUser(User user);
}
