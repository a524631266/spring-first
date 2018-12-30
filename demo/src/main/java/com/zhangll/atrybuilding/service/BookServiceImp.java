package com.zhangll.atrybuilding.service;

public class BookServiceImp implements BookService {

    public BookServiceImp() {
        System.out.println("构造一个book服务实例，这是在创建book dao 之后的");
    }

    /**
     * 静态创建一个BookDaoSHILI
     */
    public static BookDao createObject() {
        System.out.println("静态方法创建了一个bookdao实例");
        return new BookDaoImp();
    }

    @Override
    public void sayHello() {
        System.out.println("我的名字叫服务");
    }

}