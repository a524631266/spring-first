package com.zhangll.c_inject_2.setter2;

/**
 * UserServiceImp
 */
public class Person {
    private String name;
    private int age;
    private Address homeaddr;
    private Address workaddr;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the workaddr
     */
    public Address getWorkaddr() {
        return workaddr;
    }

    /**
     * @param workaddr the workaddr to set
     */
    public void setWorkaddr(Address workaddr) {
        this.workaddr = workaddr;
    }

    /**
     * @return the homeaddr
     */
    public Address getHomeaddr() {
        return homeaddr;
    }

    /**
     * @param homeaddr the homeaddr to set
     */
    public void setHomeaddr(Address homeaddr) {
        this.homeaddr = homeaddr;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:["+this.name+"];"+"age:["+this.age+"]" +
                "homeaddr:["+this.homeaddr+"]" + 
                "workaddr:["+this.workaddr+"]";
    }
    
}