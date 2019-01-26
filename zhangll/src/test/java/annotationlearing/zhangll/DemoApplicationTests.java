package annotationlearing.zhangll;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import annotationlearing.zhangll.one.controller.Persion;
import annotationlearing.zhangll.one.object.Car;
import annotationlearing.zhangll.one.object.Dog;

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

	/**
	 * 测试bean生命周期的功能
	 */
	public void beanLifeCircleTest() {
		Object bean = acc.getBean("person01");
		Object bean2 = acc.getBean("person01");
	}

	/**
	 * 测试bean生命周期2的功能
	 * 
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public void beanLifeCircleTest2() throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		// Object bean = acc.getBean(Car.class);
		// Object bean2 = acc.getBean(Car.class);
		Dog bean = acc.getBean(Dog.class);
		Dog bean2 = acc.getBean(Dog.class);
		System.out.println(bean == bean2);
		acc.getClass().getMethod("close", null).invoke(acc, null);
	}

	/**
	 * 获取环境变量的值, 因为property中的属性也在里面
	 */
	public void getEnvironmentInfo() {
		Environment a = acc.getEnvironment();
		System.out.println(a);
		String name = a.getProperty("zhangll.age");
		System.out.println(name);
		String name2 = a.getProperty("zhangll.age2");
		System.out.println(name2);
		String name3 = a.getProperty("zhangll.age3");
		System.out.println(name3);
	}

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		DemoApplicationTests dat = new DemoApplicationTests();
		// dat.onetest2();
		// dat.onetest2();
		// dat.beanLifeCircleTest();
		// dat.beanLifeCircleTest2();
		dat.getEnvironmentInfo();
	}

}
