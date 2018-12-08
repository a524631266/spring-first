package com.zhangll.c_inject.static_factory;

/**
 * MyStaticBean
 */
public class MyStaticBean {
    /**
     * 静态工厂创建实例
     * @return
     */
    public static UserService createService(){
        return new UserServiceImp3();
    }
}