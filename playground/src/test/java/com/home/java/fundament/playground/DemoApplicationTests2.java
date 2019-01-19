package com.home.java.fundament.playground;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.home.java.fundament.playground.annotationlearning.exercise.HomeField;
import com.home.java.fundament.playground.annotationlearning.exercise.HomeTable;
import com.home.java.fundament.playground.annotationlearning.exercise.Student;

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
	 */
	@Test
	public void testParseStudentAnnotation() {
		// Student student = new Student();
		// System.out.println(student); // { age='0', studentName='null', id='0'}
		try {
			Class clazz = Class.forName("com.home.java.fundament.playground.annotationlearning.exercise.Student");
			Annotation[] anots = clazz.getAnnotations();
			for (Annotation anot : anots) {
				System.out.println(anot + " -------------- \r\n");
			}

			HomeTable st = (HomeTable) clazz.getAnnotation(HomeTable.class);
			// 获取其值
			System.out.println(st.value());
			System.out.println("+++++++++++++++++++++++++++++++++");
			// // 获取类属性的注解
			// Field studentName = clazz.getDeclaredField("studentName");
			// HomeField homeField = (HomeField) studentName.getAnnotation(HomeField.class);
			// System.out.println(homeField.length());
			// System.out.println(homeField.datatype());
			// System.out.println(homeField.columnName());

			Field[] homefields = clazz.getFields();
			for (Field homefield : homefields) {
				HomeField hf = homefield.getAnnotation(HomeField.class);
				System.out.println(hf.columnName() + hf.datatype() + hf.length());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
	}
}
