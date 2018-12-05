package com.zhangll.first.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ZllYmlProperty
 */
@Component
@ConfigurationProperties(prefix="zll")
public class ZllYmlProperty {
    private String name;
    private Integer age;
    private String weight;
    private String height;
    // private Integer num;
    @Override
    public String toString() {
        return "Zll {" +
        "name='" + name + '\'' +
        ", height='" + height + '\'' +
        ", weight='" + weight + '\'' +
        ", age=" + age + 
        // ", num=" + num +
        '}';
    }

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
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }
    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
    // /**
    //  * @param num the num to set
    //  */
    // public void setNum(Integer num) {
    //     this.num = num;
    // }
}