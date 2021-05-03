package com.dun_cookie.service.impl;

import com.dun_cookie.dao.UserMapper;
import com.dun_cookie.entity.User;
import com.dun_cookie.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("IUserService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(String userid) {
        return userMapper.getUserById(userid);
    }
}
