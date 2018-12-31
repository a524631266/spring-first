package com.zhangll.c_inject_2.collection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollTest {
    @Test
    public void cooltesty() {
        ApplicationContext apl = new ClassPathXmlApplicationContext("com/zhangll/c_inject_2/collection/bean.xml");
        CollData cd = (CollData) apl.getBean("coll");
        System.out.println(cd);
    }
}