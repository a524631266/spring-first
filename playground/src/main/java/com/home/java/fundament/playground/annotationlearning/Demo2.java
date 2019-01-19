package com.home.java.fundament.playground.annotationlearning;

public class Demo2 {
    /**
     * 一下为当注解中只有value时候,我们可以忽略 ${value =}这样的前缀 如果注解中value没有默认值，必须要提供一个数据
     */
    // @ZllAnnotationOnlyOne({ "a", "b" })
    // @ZllAnnotationOnlyOne("a")
    // @ZllAnnotationOnlyOne(value = "a")
    @ZllAnnotationOnlyOne(value = { "a", "b" })
    private void name() {
        System.out.println("hello my is zll");
    }
}