package com.home.java.fundament.playground.annotationlearning.exercise;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 用来定义属性的特性
 */
@Target(value = { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface HomeField {
    // 列名
    String columnName();

    // 数据类型
    String datatype();

    // 数据长度
    int length();
}