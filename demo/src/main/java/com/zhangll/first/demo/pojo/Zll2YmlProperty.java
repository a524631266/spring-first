package com.zhangll.first.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Zll2YmlProperty
 * 比较特别的是setName方法为小写字体的name属性注入方法
 * set +　name 
 * 可以测试用setNam 或者 setname 都无法注入属性
 * Component 为开发者无法确定改类是Service Controller  repository
 */
// @Controller
@Component
@ConfigurationProperties(prefix="zll2")
public class Zll2YmlProperty {
    private String name;
    private Integer age;
    private String weight;
    private String height;
    private Girl girl;

    @Override
    public String toString() {
        return "Zll2Properties{" +
        "name='" + name + '\'' +
        ", height='" + height + '\'' +
        ", weight='" + weight + '\'' +
        ", age=" + age +
        ", girl=" + girl +
        '}';
    }
    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    /**
     * @param girl the girl to set
     */
    public void setGirl(Girl girl) {
        this.girl = girl;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }
    /**
     * @param name the name to set
     */ 
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
    
}