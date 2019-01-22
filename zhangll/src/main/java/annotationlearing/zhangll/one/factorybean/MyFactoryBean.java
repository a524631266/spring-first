package annotationlearing.zhangll.one.factorybean;

import org.springframework.beans.factory.FactoryBean;

import annotationlearing.zhangll.one.controller.Persion;

public class MyFactoryBean implements FactoryBean<Persion> {

    @Override
    public Persion getObject() throws Exception {
        return new Persion(100, "factorybean");
    }

    @Override
    public Class<Persion> getObjectType() {
        return Persion.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
