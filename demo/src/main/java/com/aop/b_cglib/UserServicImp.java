package com.aop.b_cglib;

/**
 * 1.提供一个拥有接口的实现类，用来做增强方法功能
 */
public class UserServicImp {

    public void addBook() {
        System.out.println("a_dynamic add");
    }

    public void updateBook() {
        System.out.println("a_dynamic update");
    }

    public void deleteBook() {
        System.out.println("a_dynamic delete");
    }

}