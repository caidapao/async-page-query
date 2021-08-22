package com.caidapao.asyncpagequery.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caidapao.asyncpagequery.entity.User;
import com.caidapao.asyncpagequery.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author caixuan
 * @date 2021/8/13 20:23
 **/
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser(User user) {
        LambdaQueryWrapper<User> userLambdaQueryWrapper = Wrappers.lambdaQuery();
        Page<User> userPage = new Page<>(0 , 10);
        IPage<User> userIPage = userMapper.selectPage(userPage , userLambdaQueryWrapper);
        System.out.println("总页数： "+userIPage.getPages());
        System.out.println("总记录数： "+userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);

        Wrapper<User> queryWrapper = new QueryWrapper<>();
        return userMapper.selectList(queryWrapper);
    }

}
