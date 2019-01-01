package com.aop.c_aop_auto_self;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * 2.创建一个增强代码的切面类，用来给1中的原始对象 做增强处理，故而也是通知类，此处只要理解环绕通知就行，因为 环绕包含了前置和后置
 */
public class MyAspect implements MethodInterceptor {
    public void before() {
        System.out.println("鸡头33");
    }

    public void after() {
        System.out.println("凤尾33");
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("前3");
        Object obj = invocation.proceed();
        System.out.println("后3");
        return obj;
    }
}