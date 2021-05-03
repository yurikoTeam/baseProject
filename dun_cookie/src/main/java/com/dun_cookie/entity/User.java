package com.dun_cookie.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String userid;
    private String username;
    private String password;
    private Date createTime;
    private String salt; //密码加盐
}
