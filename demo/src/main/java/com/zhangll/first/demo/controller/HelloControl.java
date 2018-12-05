package com.zhangll.first.demo.controller;

import com.zhangll.first.demo.pojo.ZllYmlProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloControl
 * RestController 
 * 
 */


@RestController 
@RequestMapping(value="/hello")
public class HelloControl {
    @Value("${zll.name}")
    private String name;
    @Autowired
    private ZllYmlProperty zllYmlProperty;

    
    @RequestMapping(value="/love",method = RequestMethod.GET)
    public String home() {
        return "<h1>my lover"+ name+ ",hhh!!</h1>";
    }
    
    @RequestMapping(value="/info",method = RequestMethod.GET)
    public String name2() {
        return zllYmlProperty.toString();
    }

}
