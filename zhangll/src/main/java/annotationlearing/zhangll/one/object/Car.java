package annotationlearing.zhangll.one.object;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Car implements InitializingBean, DisposableBean {
    public Car() {
        System.out.println("创建Car");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁car");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("设置car完成");
    }

}