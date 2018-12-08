package com.zhangll.c_inject.instance_factory;

/**
 * UserServiceImp
 */
public class UserServiceImp implements UserService {

    @Override
    public void addUser() {
        System.out.println("User normal Imp adddd++++++++++++++");
    }
    
}