package com.aop.a_dynamicproxy;

/**
 * 1.提供一个拥有接口的实现类，用来做增强方法功能
 */
public class UserServicImp implements UserService {

    @Override
    public void addBook() {
        System.out.println("a_dynamic add");
    }

    @Override
    public void updateBook() {
        System.out.println("a_dynamic update");
    }

    @Override
    public void deleteBook() {
        System.out.println("a_dynamic delete");
    }

}