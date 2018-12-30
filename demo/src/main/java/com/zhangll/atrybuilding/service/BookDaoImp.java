package com.zhangll.atrybuilding.service;

public class BookDaoImp implements BookDao {

    @Override
    public void addBook() {
        System.out.println("DI 添加 book");
    }

    public BookDaoImp() {
        System.out.println("构造一个DaoImp实例");
    }

    @Override
    public void addUser() {
        System.out.println("添加一个用户");
    }

    @Override
    public void sayHello() {
        System.out.println("我的名字叫dao");
    }

}