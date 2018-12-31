package com.zhangll.c_inject_2.spel;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpel {
    @Test
    public void testSpel() {
        ApplicationContext apl = new ClassPathXmlApplicationContext("com/zhangll/c_inject_2/spel/bean.xml");
        UserService us = (UserService) apl.getBean("service");
        System.out.println(us);
    }
}