package com.dun_cookie.controller;

import com.dun_cookie.entity.User;
import com.dun_cookie.service.IUserService;
import com.dun_cookie.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value="/login",method=RequestMethod.POST,consumes="application/json") //application/x-www-form-urlencoded
    @ResponseBody
    public Object selectUser(@RequestParam(value="userid") String userid, @RequestParam(value="password") String password) {
        User user = userService.getUserById(userid);
        if (user != null && password != null && password.equals(user.getPassword())) {
            return true;
        }
        return false;
    }
}
