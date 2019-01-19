package com.home.java.fundament.playground.annotationlearning;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * METHOD ==> 类方法中 T
 * ElementType.TYPE ==>  类 接口 抽象类 注解中
 * package 包中定义
 */
/**
 * Retention 3 中状态 <br/>
 * 
 * 1. RUNTIME 在运行时有效 也就是说要反射机制是可以获取到的(即其他运行时程序获取到) ,这里尝试一下在其他两种状 态下是否可以用反射机制读取
 * <br/>
 * 
 * 2. ROURCE 在源文件中有效 编译器(javac.exe) <br/>
 * 
 * 3. CLASS 在class 文件中有效，即编译生成class文件 编译器(javac.exe) <br/>
 * 
 */
@Target(value = { ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface SxtAnnotation {
    // 如果没有定义默认值的话，在使用注解的过程中需要强制使用
    String studentName();

    // 设置默认值
    int age() default 1;

    // -1 代表不存在，这个是我们约定的
    int id() default -1;

    String[] schools() default { "青大", "北大" };
}