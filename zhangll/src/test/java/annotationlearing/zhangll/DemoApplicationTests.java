package annotationlearing.zhangll;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import annotationlearing.zhangll.one.controller.Persion;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	private ApplicationContext acc = new AnnotationConfigApplicationContext(MainConfig.class);

	@Test
	public void contextLoads() {
	}

	@Test
	public void onetest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {
		String[] names = acc.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println("name " + name);
		}
		Persion ps = (Persion) acc.getBean("person01");
		Persion ps2 = (Persion) acc.getBean("person01");
		System.out.println(ps == ps2);
		acc.getClass().getMethod("close", null).invoke(acc, null);
	}

	public void onetest2() {
		String[] names = acc.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println("name " + name);
		}
		Object da = acc.getBean("fb");
		System.out.println(da.getClass()); // class annotationlearing.zhangll.one.controller.Persion
		Object fb = acc.getBean("&fb"); // 获取工厂bean的方法
		System.out.println(fb.getClass()); // class annotationlearing.zhangll.one.factorybean.MyFactoryBean
	}

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		DemoApplicationTests dat = new DemoApplicationTests();
		// dat.onetest2();
		dat.onetest2();
	}

}
