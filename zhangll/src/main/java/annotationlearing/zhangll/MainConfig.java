package annotationlearing.zhangll;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import annotationlearing.zhangll.condition.LinuxCondition;
import annotationlearing.zhangll.condition.WinCondition;
import annotationlearing.zhangll.importclass.Color;
import annotationlearing.zhangll.one.controller.Persion;
import annotationlearing.zhangll.one.factorybean.MyFactoryBean;
import annotationlearing.zhangll.one.filtertypes.MyFilterType;
import annotationlearing.zhangll.one.service.BookService;

/**
 * excludeFIlters代表排除那个类
 */
// @ComponentScan(value = "annotationlearing.zhangll.one", excludeFilters = {
// @Filter(type = FilterType.ANNOTATION, classes = { Service.class }) })
/**
 * 配置类中如果满足条件才能使得所有beans生效哦
 */
@Conditional(value = { LinuxCondition.class })
@Configuration
@ComponentScan(value = "annotationlearing.zhangll.one", includeFilters = {
        // @Filter(type = FilterType.ANNOTATION, classes = { Controller.class }),
        // @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = { BookService.class }),
        @Filter(type = FilterType.CUSTOM, classes = { MyFilterType.class }) }, useDefaultFilters = false)
@Import(Color.class)
public class MainConfig {
    /**
     * @Bean 代表一个生成的bean对象 默认是prototype
     * @Lazy 懒加载 用来表示容器启动的时候不自动装配bean @Scope("prototype") 多例，每次获取bean都要创建一个bean
     * @return
     */
    @Lazy
    // @Scope("prototype")
    @Bean(initMethod = "start", destroyMethod = "destroy")
    public Persion person01() {
        System.out.println("创建personbena"); // prototype模式下会多次打印
        return new Persion(11, "zhangll");
    }

    /**
     * conditional 满足条件就会注册bean
     */
    @Bean("bill")
    @Conditional(value = { WinCondition.class })
    public Persion person1() {
        return new Persion(20, "bill g");
    }

    @Bean("linus")
    @Conditional(value = { LinuxCondition.class })
    public Persion person2() {
        return new Persion(40, "linus 33");
    }

    @Bean
    public MyFactoryBean fb() {
        return new MyFactoryBean();
    }

}