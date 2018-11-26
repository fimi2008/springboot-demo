package com.lionxxw.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package com.lionxxw.boot
 * Project springboot-demo
 *
 * Author lionxxw
 * Created on 2016/11/4 10:53
 * version 1.0.0
 */
@RestController
@RequestMapping("/classPath")
public class ApplicationDemo {
    @RequestMapping("/methodPath")
    public String method() {
        return "mapping url is /classPath/methodPath";
    }
}
