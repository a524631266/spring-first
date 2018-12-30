package com.zhangll.atrybuildindg;

import com.zhangll.atrybuilding.service.BookDao;
import com.zhangll.atrybuilding.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    private static final String BOOKDAO = "bookdao";

    @Test
    public void spingcall() {
        String path = "com/zhangll/atrybuilding/service/bean.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(path);
        BookDao bs = ac.getBean(BOOKDAO, BookDao.class);
        bs.sayHelo();
    }
}