package com.aop.d_aop_auto;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {
    @Test
    public void testself() {
        // 全自动意味着，只需要获取目标类对象
        ApplicationContext apl = new ClassPathXmlApplicationContext("com/aop/d_aop_auto/bean.xml");
        UserService us = (UserService) apl.getBean("serviceid");
        us.addBook();
        us.updateBook();
        us.deleteBook();
    }
}