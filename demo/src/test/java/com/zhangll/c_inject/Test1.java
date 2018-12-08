package com.zhangll.c_inject;

import com.zhangll.c_inject.static_factory.MyStaticBean;
import com.zhangll.c_inject.static_factory.UserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test1
 */
public class Test1 {

    @Test
    public void name() {
        UserService service = MyStaticBean.createService();
        service.addUser();
    }

    @Test
    public void staticfactory() {

        ApplicationContext appl = new ClassPathXmlApplicationContext("com/zhangll/c_inject/static_factory/bean.xml");
        
        UserService service = appl.getBean("userServiceId", UserService.class);
        service.addUser();
    }

}