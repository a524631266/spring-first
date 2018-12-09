package com.zhangll.e_lifecycle.after_aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * PostPressionDemo
 */
public class PostPressionDemo implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post before事件"+beanName+":"+bean);
        // return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
        return null;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post after事件"+beanName+":"+bean);
        // return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
        // apo 事务，验证，处理都是需要做的
        
        return Proxy.newProxyInstance(
            PostPressionDemo.class.getClassLoader(), 
            bean.getClass().getInterfaces(), 
            new InvocationHandler(){
            
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("代理方法111111");
                    Object obj = method.invoke(bean, args);
                    System.out.println("代理方法22222222222");
                    return obj;
                }
            }
        );
    }
  
    
}