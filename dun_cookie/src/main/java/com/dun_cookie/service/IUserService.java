package com.dun_cookie.service;

import com.dun_cookie.entity.User;
import org.springframework.stereotype.Service;

/**
 * 用户服务类
 */
@Service
public interface IUserService {
    public User getUserById(String userid);
}
