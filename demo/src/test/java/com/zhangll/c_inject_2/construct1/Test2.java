package com.zhangll.c_inject_2.construct1;



import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test2
 */
public class Test2 {


    @Test
    public void name() {

        ApplicationContext appl = new ClassPathXmlApplicationContext("com/zhangll/c_inject_2/construct1/bean.xml");
        UserService service = appl.getBean("userServiceId", UserService.class);
        System.out.println(service);
    }
}