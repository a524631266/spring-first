package com.zhangll.second.Dao;

/**
 * DaoImp
 */
public class DaoImp implements Dao{
    public DaoImp(){
        System.out.println("创建DaoIMp");
    }
    @Override
    public String getUser() {
        System.out.println("Dao imp user,.....");
        return "Dao has insert now";
    }

    
}