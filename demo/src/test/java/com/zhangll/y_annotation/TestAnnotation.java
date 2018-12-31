package com.zhangll.y_annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    @Test
    public void testAnno() throws Exception {
        ApplicationContext apl = new ClassPathXmlApplicationContext("com/zhangll/y_annotation/bean.xml");
        BookService bs = (BookService) apl.getBean("serviceid");
        bs.addBook();
        System.out.println(bs);
        BookService bs2 = (BookService) apl.getBean("serviceid");
        System.out.println(bs2);
        // 利用反射关闭数据，反射是建立在class字节码上的
        apl.getClass().getMethod("close").invoke(apl);
    }

}