package com.lionxxw.boot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 * Package com.lionxxw.boot.controller
 * Project springboot-demo
 *
 * Author lionxxw
 * Created on 2016/11/4 11:09
 * version 1.0.0
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping("/{username}")
    public String userProfile(@PathVariable("username") String username) {
        return String.format("user %s", username);
    }

    @RequestMapping("/posts/{id}")
    public String post(@PathVariable("id") int id) {
        return String.format("post %d", id);
    }
}
