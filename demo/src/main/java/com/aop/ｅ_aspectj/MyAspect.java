package com.aop.ｅ_aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 2.创建一个增强代码的切面类，用来给1中的原始对象 做增强处理，故而也是通知类，此处只要理解环绕通知就行，因为 环绕包含了前置和后置
 */
public class MyAspect {
    // 前置通知
    public void beforead() {
        System.out.println("前置而已");
    }

    public void afterad(JoinPoint jp, Object reee) {
        System.out.println("后置通知 名称" + jp.getSignature().getName() + "return: \n" + reee);
    }

    public Object aroundad(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        Object obj = pjp.proceed();
        if (obj != null) {
            System.out.println("环绕后" + obj.toString());
        } else {
            System.out.println("环绕后");
        }
        return obj;
    }

    public void throwad(JoinPoint jp, Throwable ddd) {
        System.out.println("抛出异常" + ddd.getMessage());

    }

    public void afterad(JoinPoint jp) {
        System.out.println("最终通知");
    }
}