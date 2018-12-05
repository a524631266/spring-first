package com.zhangll.first.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * PostControl
 */
@RequestMapping("/post1")
@RestController
public class PostControl {
    @RequestMapping(method= RequestMethod.POST)
    public String name() {
        return "";
    }
    
}