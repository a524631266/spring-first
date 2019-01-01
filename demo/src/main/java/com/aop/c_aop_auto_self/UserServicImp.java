package com.aop.c_aop_auto_self;

/**
 * 1.提供一个拥有接口的实现类，用来做增强方法功能
 */
public class UserServicImp implements UserService {

    @Override
    public void addBook() {
        System.out.println("c_autoself add");
    }

    @Override
    public void updateBook() {
        System.out.println("c_autoself update");
    }

    @Override
    public void deleteBook() {
        System.out.println("c_autoself delete");
    }

}