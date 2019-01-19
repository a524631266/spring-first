package com.home.java.fundament.playground.annotationlearning;

import lombok.Getter;
import lombok.Setter;

@SxtAnnotation(studentName = "jianglina", age = 10)
public class Demo1 {
    @Setter
    @Getter
    private int age;
    @Setter
    @Getter
    private String name;

    @SxtAnnotation(studentName = "zhangll")
    private void test1() {
        System.out.println("11111");
    }
}