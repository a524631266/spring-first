package annotationlearing.zhangll.one.controller;

import org.springframework.stereotype.Controller;

public class Persion {
    private int age;
    private String name;

    public Persion() {
    }

    public Persion(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Persion age(int age) {
        this.age = age;
        return this;
    }

    public Persion name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " age='" + getAge() + "'" + ", name='" + getName() + "'" + "}";
    }

    public void start() {
        System.out.println("初始哈方法");
    }

    /**
     * 只有在单例模式下才会触发销毁
     */
    public void destroy() {
        System.out.println("销毁了");
    }
}