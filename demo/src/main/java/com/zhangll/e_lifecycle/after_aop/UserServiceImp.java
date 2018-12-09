package com.zhangll.e_lifecycle.after_aop;

/**
 * UserServiceImp
 */
public class UserServiceImp implements UserService {

    @Override
    public void addUser() {
        System.out.println("e_liftcycle adddd++++++++++++++");
    }
    /**
     * 一般是初始化一些数据
     */
    public void myInit() {
        System.out.println("初始化....");
    }
    /**
     * 一般是初销毁
     */
    public void myDestroy() {
        System.out.println("销毁。。。。。。。。。。");
    }
}