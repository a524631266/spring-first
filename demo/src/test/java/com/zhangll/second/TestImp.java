package com.zhangll.second;

import com.zhangll.second.Dao.Dao;
import com.zhangll.second.Dao.DaoImp;
import com.zhangll.second.service.ServiceDemo;
import com.zhangll.second.service.ServiceImp;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 1.在做测试的时候发现默认运行会在项目的根目录,也就是demo下生成一个target目录
 * 这个目录中的classes 放置了java 以及 mian 目录下的所有文件,会自动加载到该目录中
 * class.getResource("/") 可以查看
 * 2.该test文件可以放在相同路径下,自动会加载到 target目录中的test-classes文件中
 * 3.ClassPathXmlApplicationContext 是 ApplicationContext的子类,可以用来装
 * 载配置
 */
// @RunWith(SpringRunner.class)
// @SpringBootTest
public class TestImp { 
    @Test
    public void test(){
        // 通过输出中的java Test Runner日志查看数据
        System.out.println(TestImp.class.getResource("/"));
        // 加载容器的时候自动会触发实例的构造方法,也就是说,此时会自动装配实例
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ServiceDemo adduser  = (ServiceDemo) context.getBean("secondid");
        System.out.println(adduser.getUser());
    }
    /**
     * beanfactory
     */
    @Test
    public void test2(){
        // 通过输出中的java Test Runner日志查看数据
        System.out.println(TestImp.class.getResource("/"));
        // 加载容器的时候自动会触发实例的构造方法,也就是说,此时会自动装配实例
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanFactory context = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        // 只有在getBean的时候才会初始化 也即是 BeanFactory是一个懒加载的工厂
        ServiceDemo adduser  = (ServiceDemo) context.getBean("secondid");
        System.out.println(adduser.getUser());
    }
    public static void main(String[] args) {
        // 最常用的手工装配以及注入
        ServiceImp DD =  new ServiceImp();
        DD.setDao(new DaoImp());
        DD.getUser();
    }
}