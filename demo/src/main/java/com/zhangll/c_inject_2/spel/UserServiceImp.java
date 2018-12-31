package com.zhangll.c_inject_2.spel;

/**
 * UserServiceImp
 */
public class UserServiceImp implements UserService {
    private String name = "zhangll";
    private String age;
    private Number pi;

    @Override
    public void addUser() {
        System.out.println("e_liftcycle adddd++++++++++++++");
    }

    /**
     * @return the pi
     */
    public Number getPi() {
        return pi;
    }

    /**
     * @param pi the pi to set
     */
    public void setPi(Number pi) {
        this.pi = pi;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", age='" + getAge() + "'" + ", pi='" + getPi() + "'" + "}";
    }

}