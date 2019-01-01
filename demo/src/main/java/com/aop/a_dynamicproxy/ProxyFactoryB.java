package com.aop.a_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.aop.b_cglib.UserServiceImpChild;

/**
 * 整合切面对象和目标类的过错，同时也叫做给目标类织入通知的过错
 */
public class ProxyFactoryB {
    public static UserService create() {
        // 1. 创建目标
        UserService us = new UserServicImp();
        // 2. 创建切面
        MyAspect ms = new MyAspect();
        // 3. 织入
        UserService Nus = (UserService) Proxy.newProxyInstance(ProxyFactoryB.class.getClassLoader(),
                us.getClass().getInterfaces(), new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        ms.before();
                        Object obj = method.invoke(us, args);
                        ms.after();
                        return obj;
                    }
                });
        return Nus;
    }

    /**
     * 这里唯一的不同是获取接口的地方 直接通过接口获取类型
     * 
     * @return
     */
    public static UserService create2() {
        UserService us = new UserServiceImpChild();
        MyAspect ms = new MyAspect();

        UserService Nus = (UserService) Proxy.newProxyInstance(ProxyFactoryB.class.getClassLoader(),
                new Class[] { UserService.class }, new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        ms.before();
                        Object obj = method.invoke(us, args);
                        ms.after();
                        return obj;
                    }
                });
        return Nus;
    }
}