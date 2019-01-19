package com.home.java.fundament.playground.annotationlearning;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(value = { ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ZllAnnotationOnlyOne {
    String[] value();
}