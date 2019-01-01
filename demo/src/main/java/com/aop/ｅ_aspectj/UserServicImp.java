package com.aop.ｅ_aspectj;

/**
 * 1.提供一个拥有接口的实现类，用来做增强方法功能
 */
public class UserServicImp implements UserService {

    @Override
    public void addBook() {
        System.out.println("d_auto quanzidong add\n");
    }

    @Override
    public String updateBook() {
        System.out.println("d_auto quanzidong update\n");
        // int a = 1 / 0;
        return "天才";
    }

    @Override
    public void deleteBook() {
        System.out.println("d_auto quanzidong delete\n");
    }

}