package annotationlearing.zhangll.one.object;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    public Dog() {
        System.out.println("创建一个dog");
    }

    // jsr250 在创建一个bean并设置好属性之后的通知
    @PostConstruct
    public void init() {
        System.out.println("dog init....");
    }

    // jsr250 在销毁之前的通知
    @PreDestroy
    public void destroy() {
        System.out.println("dog destroy.....");
    }
}