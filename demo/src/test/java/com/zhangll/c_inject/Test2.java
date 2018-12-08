package com.zhangll.c_inject;

import com.zhangll.c_inject.instance_factory.MyInstanceBean;
import com.zhangll.c_inject.instance_factory.UserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test1
 */
public class Test2 {

    @Test
    public void name() {
        UserService service = new MyInstanceBean().createService();
        service.addUser();
    }

    @Test
    public void normalfactory() {

        ApplicationContext appl = new ClassPathXmlApplicationContext("com/zhangll/c_inject/instance_factory/bean.xml");
        
        UserService service = appl.getBean("userServiceId", UserService.class);
        service.addUser();
    }
}