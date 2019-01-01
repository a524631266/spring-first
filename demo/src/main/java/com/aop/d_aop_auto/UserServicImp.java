package com.aop.d_aop_auto;

/**
 * 1.提供一个拥有接口的实现类，用来做增强方法功能
 */
public class UserServicImp implements UserService {

    @Override
    public void addBook() {
        System.out.println("d_auto quanzidong add\n");
    }

    @Override
    public void updateBook() {
        System.out.println("d_auto quanzidong update\n");
    }

    @Override
    public void deleteBook() {
        System.out.println("d_auto quanzidong delete\n");
    }

}