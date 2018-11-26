package com.lionxxw.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package com.lionxxw.boot
 * Project springboot-demo
 *
 * Author lionxxw
 * Created on 2016/11/4 10:06
 * version 1.0.0
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String index() {
        return "Index Page";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
