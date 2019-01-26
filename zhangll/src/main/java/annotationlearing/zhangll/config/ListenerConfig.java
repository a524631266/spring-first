package annotationlearing.zhangll.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import annotationlearing.zhangll.importclass.Color;

@ComponentScan("annotationlearing/zhangll/listener")
@Configuration
public class ListenerConfig {
    public Color name() {
        return new Color();
    }
}