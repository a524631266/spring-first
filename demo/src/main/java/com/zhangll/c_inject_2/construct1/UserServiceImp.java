package com.zhangll.c_inject_2.construct1;

/**
 * UserServiceImp
 */
public class UserServiceImp implements UserService {
    private String name;
    private int age;
    public UserServiceImp(String name,int age){
        this.name = name;
        this.age = age;
        
    }
    @Override
    public void addUser() {
        System.out.println("e_liftcycle adddd++++++++++++++");
    }
    @Override
    public String toString() {
        return "this name:" + name +";age:"+age;
    }

}