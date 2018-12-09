package com.zhangll.e_lifecycle;



import com.zhangll.e_lifecycle.UserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test1
 */
public class Test2 {


    @Test
    public void normalfactory() {

        ClassPathXmlApplicationContext appl = new ClassPathXmlApplicationContext("com/zhangll/e_lifecycle/bean.xml");
        
        UserService service = appl.getBean("userServiceId", UserService.class);
        UserService service2 = appl.getBean("userServiceId", UserService.class);
        service.addUser();

        appl.close();
    }
}