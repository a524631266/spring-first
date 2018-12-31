package com.zhangll.c_inject_2.pnamespace;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPnamespace {
    @Test
    public void TestPnamespace() throws Exception {
        ApplicationContext apl = new ClassPathXmlApplicationContext("com/zhangll/c_inject_2/pnamespace/bean.xml");
        UserServiceImp usi = apl.getBean("service", UserServiceImp.class);
        System.out.println(usi);
        apl.getClass().getMethod("close").invoke(apl);
    }
}