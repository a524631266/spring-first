package com.zhangll.first.demo.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestControl
 */
@Controller
public class TestControl {
    
    @RequestMapping("/hello")
    public String helloHtml(HashMap<String,Object> map) {
        map.put("hello","欢迎进入ＨＴＭＬ页面");
        return "/index2";
    }

}