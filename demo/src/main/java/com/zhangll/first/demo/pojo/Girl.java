package com.zhangll.first.demo.pojo;
/**
 * Girl
 */
public class Girl {

    private String name;
    private Integer age;
    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "age:"+age + ";name:" + name;
    }
}