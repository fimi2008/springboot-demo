package com.lionxxw.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Package com.lionxxw.boot.controller
 * Project springboot-demo
 *
 * Author lionxxw
 * Created on 2016/11/4 13:15
 * version 1.0.0
 */

@Controller
public class HelloController {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
