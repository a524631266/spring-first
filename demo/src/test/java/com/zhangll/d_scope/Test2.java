package com.zhangll.d_scope;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test1
 */
public class Test2 {


    @Test
    public void normalfactory() {

        ApplicationContext appl = new ClassPathXmlApplicationContext("com/zhangll/d_scope/bean.xml");
        
        UserService service = appl.getBean("userServiceId", UserService.class);
        UserService service2 = appl.getBean("userServiceId", UserService.class);
        System.out.println(service);//UserServiceImp@41ee392b
        System.out.println(service2);//UserServiceImp@1e67a849
        System.out.println("++++++++++++++++++++++");
        UserService service3 = appl.getBean("userServiceId2", UserService.class);
        UserService service4 = appl.getBean("userServiceId2", UserService.class);
        System.out.println(service3);// UserServiceImp@57d5872c
        System.out.println(service4);// UserServiceImp@57d5872c
    }
}