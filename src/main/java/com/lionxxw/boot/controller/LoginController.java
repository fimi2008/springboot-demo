package com.lionxxw.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 登陆控制层
 * Package com.lionxxw.boot.controller
 * Project springboot-demo
 *
 * Author lionxxw
 * Created on 2016/11/4 11:17
 * version 1.0.0
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet() {
        System.out.println("login get");
        return "Login Page";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost() {
        System.out.println("login post");
        return "Login Post Request";
    }
}
