package com.home.java.fundament.playground;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.home.java.fundament.playground.annotationlearning.exercise.HomeField;
import com.home.java.fundament.playground.annotationlearning.exercise.HomeTable;
// import com.home.java.fundament.playground.annotationlearning.exercise.Student;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests2 {
	@Autowired
	private UserService us;

	@Test
	public void contextLoads() {
		us.put();
	}

	/**
	 * 使用反射读取注解的信息，模拟流程
	 * 
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 */
	@SuppressWarnings("all")
	@Test
	public void testParseStudentAnnotation() throws NoSuchFieldException, SecurityException {
		// Student student = new Student();
		// System.out.println(student); // { age='0', studentName='null', id='0'}
		try {
			Class clazz = Class.forName("com.home.java.fundament.playground.annotationlearning.exercise.Student");
			Annotation[] anots = clazz.getAnnotations();
			for (Annotation anot : anots) {
				System.out.println(anot + " -------------- \r\n");
			}

			HomeTable st = (HomeTable) clazz.getAnnotation(HomeTable.class);
			// get the value
			System.out.println(st.value());
			System.out.println("+++++++++++++++++++++++++++++++++");
			// // 获取类属性的注解
			// Field studentName = clazz.getDeclaredField("studentName");
			// HomeField homeField = (HomeField) studentName.getAnnotation(HomeField.class);
			// System.out.println(homeField.length());
			// System.out.println(homeField.datatype());
			// System.out.println(homeField.columnName());

			Field[] studentfields = clazz.getDeclaredFields();
			for (Field homefield : studentfields) {
				System.out.println("-----------------------------\r\n");
				HomeField hf = homefield.getAnnotation(HomeField.class);
				System.out.println(hf.columnName() + hf.datatype() + hf.length() + "\r\n");
			}
			System.out.println("++++++++++++++获取当个注解+++++++++++++++++++");
			// 获取单个属性注解
			Field stf = clazz.getDeclaredField("studentName");
			HomeField stff = stf.getAnnotation(HomeField.class);
			System.out.println(stff.columnName() + stff.datatype() + stff.length() + "\r\n");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
	}

	@Test
	public void testduotai() {
		System.out.println("---------fu---");
		Fu f = new Zi();
		System.out.println(f.num);
		f.show();
		System.out.println("---------zi---");
		Zi zi = (Zi) f;
		System.out.println(zi.num); // 100
		zi.show(); // 10
	}

	public static void main(String[] args) {
		// testduotai();
		System.out.println("1111");
	}
}

class Fu {
	int num = 10;

	public void show() {
		System.out.println(num);
	}
}

class Zi extends Fu {
	int num = 100;

	public void show() {
		System.out.println(num);
	}
}