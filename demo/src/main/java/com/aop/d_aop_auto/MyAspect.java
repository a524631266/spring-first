package com.aop.d_aop_auto;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 2.创建一个增强代码的切面类，用来给1中的原始对象 做增强处理，故而也是通知类，此处只要理解环绕通知就行，因为 环绕包含了前置和后置
 */
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("全自动前\n");
        Object obj = invocation.proceed();
        System.out.println("全自动后\n");
        return obj;
    }
}