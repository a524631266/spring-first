package annotationlearing.zhangll;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import annotationlearing.zhangll.listener.GlobalListener;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestListener {
    AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(GlobalListener.class);

    @Test
    public void name() {
        app.close();
    }
}