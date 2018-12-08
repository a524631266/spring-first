package com.zhangll.first.demo.controller;

import com.zhangll.first.demo.pojo.Zll2YmlProperty;
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
    @Autowired
    private Zll2YmlProperty zll2YmlProperty;

    @RequestMapping(value="/love",method = RequestMethod.GET)
    public String home() {
        return "<h1>my lover"+ name+ ",hhh!!</h1>";
    }
    
    @RequestMapping(value="/info",method = RequestMethod.GET)
    public String name2() {
        return zllYmlProperty.toString();
    }

    @RequestMapping(value="/info2",method = RequestMethod.GET)
    public String name3() {
        return zll2YmlProperty.toString();
    }
    
    private static String name2;
    @RequestMapping(value="/staticinfo",method = RequestMethod.GET)
    public String name4() {
        return name2;
    }
    /**
     * @param name2 the name2 to set
     * 使用 Value注入属性值,不需要setName,可以任意取值
     * 如下abcd也可以
     * 这是静态属性 注入方式
     */
    @Value("${staticzll2.name}")
    public void abcd(String name2) {
        HelloControl.name2 = name2;
    }

}
