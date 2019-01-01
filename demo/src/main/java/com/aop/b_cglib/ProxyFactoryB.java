package com.aop.b_cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * 整合切面对象和目标类的过错，同时也叫做给目标类织入通知的过错
 */
public class ProxyFactoryB {
    public static UserServicImp create() {
        // 1. 创建目标
        UserServicImp us = new UserServicImp();
        // 2. 创建切面
        MyAspect ms = new MyAspect();
        // 3. 创建一个cgl 其只是创建目标类的子类，因此其父类应该是
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(us.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            // InvocationHandler 等效
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy mpropy) throws Throwable {
                ms.before();
                // 方法1
                Object obj = method.invoke(us, args);
                // 方法2
                // mpropy.invokeSuper(proxy, args);
                ms.after();
                return obj;
            }
        });
        UserServicImp Nus = (UserServicImp) enhancer.create();
        return Nus;
    }
}