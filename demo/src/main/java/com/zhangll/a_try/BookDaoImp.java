package com.zhangll.a_try;

public class BookDaoImp implements BookDao {

    @Override
    public void addBook() {
        System.out.println("DI 添加 book");
    }

    public BookDaoImp() {
        System.out.println("构造一个DaoImp实例");
    }

}