package com.zhangll.e_lifecycle.before_aop;

/**
 * UserService
 */
public interface UserService {

    public void addUser();
    // 如果在postbefore中写aop逻辑，需要在接口中写上初始化接口，否则会在bean的init周期中找不到，因为我们使用的是
    // 接口对象，而不是实例对象，同时可以发现，postbefore默认会在新的对象中注入初始化方法
    public void myInit();
}