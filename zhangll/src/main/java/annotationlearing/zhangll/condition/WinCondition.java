package annotationlearing.zhangll.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WinCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment ct = context.getEnvironment();
        System.out.println("-------->" + ct.getProperty("user.name"));
        System.out.println("-------->" + ct.getProperty("os.name"));
        return ct.getProperty("os.name").toLowerCase().contains("win") ? true : false;
    }

}