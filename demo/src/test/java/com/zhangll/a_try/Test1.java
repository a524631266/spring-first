package com.zhangll.a_try;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void oldcall() {
        BookService bs = new BookServiceImp();
        bs.addBook();
    }

    @Test
    public void spingcall() {
        String path = "com/zhangll/a_try/bean.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(path);
        BookService bs = (BookService) ac.getBean("bookser");
        bs.addBook();
    }
}