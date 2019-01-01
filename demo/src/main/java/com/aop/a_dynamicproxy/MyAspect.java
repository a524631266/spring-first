package com.aop.a_dynamicproxy;

/**
 * 2.创建一个增强代码的切面类，用来给1中的原始对象 做增强处理，故而也是通知类，此处只要理解环绕通知就行，因为 环绕包含了前置和后置
 */
public class MyAspect {
    public void before() {
        System.out.println("鸡头");
    }

    public void after() {
        System.out.println("凤尾");
    }
}