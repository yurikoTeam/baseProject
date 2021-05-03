package com.dun_cookie.dao;

import com.dun_cookie.entity.User;

public interface UserMapper {
    /**
     * 通过id获取用户基本信息
     * @param userid
     * @return
     */
    User getUserById(String userid);
}
