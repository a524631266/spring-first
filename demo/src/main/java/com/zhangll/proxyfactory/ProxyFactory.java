package com.zhangll.proxyfactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object createPerson() {
        // 1. Person1 必须要有接口的，否者getInterfaces() 的数量为0 ，也就无法装配到代理对象中
        Person1 person = new Person1();
        System.out.println(person.getClass().getInterfaces().length);
        return Proxy.newProxyInstance(Person1.class.getClassLoader(), person.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("吃东西之前要洗手" + proxy.getClass());
                        // 2. 这里要有person实例，需要提前创建好person或者
                        Object obj = method.invoke(person, args);
                        System.out.println("吃东西之后要洗碗" + proxy.getClass());
                        return obj;
                    }
                });
    }
}