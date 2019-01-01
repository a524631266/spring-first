package com.aop.b_cglib;

import com.aop.a_dynamicproxy.UserServicImp;

public class UserServiceImpChild extends UserServicImp {
    public void query() {
        System.out.println("查询用户");
    }

    @Override
    public void addBook() {
        System.out.println("children add");
    }
}