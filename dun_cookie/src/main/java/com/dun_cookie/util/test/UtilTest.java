package com.dun_cookie.util.test;

import com.dun_cookie.entity.User;
import com.dun_cookie.util.ValidateUtil;

public class UtilTest {
    public static void main(String[] args) {
        ValidateUtil validateUtil = new ValidateUtil();
        User user = new User();
        user.setUserid("100001");
        System.out.println(validateUtil.isEmpty(user));
    }
}
