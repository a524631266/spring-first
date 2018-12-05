package com.zhangll.first.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloControl
 */
@RestController
public class HelloControl {
    @RequestMapping("/")
    public String home() {
        return "Hello Wold zhangll!!";
    }
    public static void main(String[] args) {
        
    }
}
