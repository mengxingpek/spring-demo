package com.xinhuanet.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author mengxing
 * @Date 2018/9/7 下午9:13
 */


@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        System.out.println("entering hello()");
        return "mengxing";
    }

}
