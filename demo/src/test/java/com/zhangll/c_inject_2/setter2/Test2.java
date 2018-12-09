package com.zhangll.c_inject_2.setter2;



import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test2
 */
public class Test2 {


    @Test
    public void name() {

        ApplicationContext appl = new ClassPathXmlApplicationContext("com/zhangll/c_inject_2/setter2/bean.xml");
        Person person1 = appl.getBean("personId1", Person.class);// 正常注入方式
        Person person2 = appl.getBean("personId2", Person.class);// p命名
        Person person3 = appl.getBean("personId3", Person.class);// pel方式
        System.out.println("person1:"+person1);
        System.out.println("person2:"+person2);
        System.out.println("person3:"+person3);
    }
}