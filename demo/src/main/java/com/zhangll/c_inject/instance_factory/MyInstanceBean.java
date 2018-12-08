package com.zhangll.c_inject.instance_factory;

/**
 * MyStaticBean
 */
public class MyInstanceBean {
    /**
     * 实例工厂创建实例
     * @return
     */
    public UserService createService(){
        return new UserServiceImp();
    }
}