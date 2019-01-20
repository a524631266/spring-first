package com.home.java.fundament.playground.reflection;

public class User {
    private int id;
    private int age;
    private String uname;

    public User() {
    }

    public User(int id, int age, String uname) {
        this.id = id;
        this.age = age;
        this.uname = uname;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUname() {
        return this.uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public User id(int id) {
        this.id = id;
        return this;
    }

    public User age(int age) {
        this.age = age;
        return this;
    }

    public User uname(String uname) {
        this.uname = uname;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", age='" + getAge() + "'" + ", uname='" + getUname() + "'" + "}";
    }

}