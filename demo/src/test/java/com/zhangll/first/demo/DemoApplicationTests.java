package com.zhangll.first.demo;

import com.zhangll.second.service.ServiceDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
        // 加载容器的时候自动会触发实例的构造方法,也就是说,此时会自动装配实例
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ServiceDemo adduser  = (ServiceDemo) context.getBean("secondid");
        System.out.println(adduser.getUser());
	}

}
