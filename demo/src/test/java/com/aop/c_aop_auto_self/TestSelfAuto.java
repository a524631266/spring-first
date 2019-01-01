package com.aop.c_aop_auto_self;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSelfAuto {
    @Test
    public void testself() {
        // 半自动意味着，我需要拿到aop代理类
        ApplicationContext apl = new ClassPathXmlApplicationContext("com/aop/c_aop_auto_self/bean.xml");
        UserService us = (UserService) apl.getBean("proxyservice");
        us.addBook();
        us.updateBook();
        us.deleteBook();
    }
}