package com.aop.a_dynamicproxy;

public class UserServiceImpChild extends UserServicImp {
    public void query() {
        System.out.println("查询用户");
    }

    @Override
    public void addBook() {
        System.out.println("children add");
    }
}