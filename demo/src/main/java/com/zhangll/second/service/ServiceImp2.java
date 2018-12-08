package com.zhangll.second.service;

import com.zhangll.second.Dao.Dao;

/**
 * ServiceImp
 */
public class ServiceImp2 implements ServiceDemo{
    public  ServiceImp2(String name) {
        System.out.println("serivceimp构造器");
    }
    public Dao dao;
    /**
     * Dao 是一个接口,所以不需要用继承类,当然也可以用继承类
     * 但是会增加耦合,这里只要一个接口就可以了
     * @param dao the dao to set
     */
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public String getUser() {
        System.out.println("Serivce imp dddddddd");
        System.out.println(dao.getUser());
        return "has Handle dao user...";
    }
}