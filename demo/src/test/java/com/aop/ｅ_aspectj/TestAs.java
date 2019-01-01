package com.aop.ｅ_aspectj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAs {
    @Test
    public void testAspj() {
        ApplicationContext apl = new ClassPathXmlApplicationContext("com/aop/ｅ_aspectj/bean.xml");
        UserService us = (UserService) apl.getBean("serviceid");
        us.addBook();
        us.updateBook();
        us.deleteBook();
    }
}