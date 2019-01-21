package com.home.java.fundament.playground;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.home.java.fundament.playground.reflection.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SuppressWarnings("all")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReflectionTest {
    /**
     * 反射机制获取 同一个类型的数据
     * 
     * @throws ClassNotFoundException
     */
    @Test
    public void demo1() throws ClassNotFoundException {
        String clspath = "com.home.java.fundament.playground.reflection.User";
        // jvm 会创建一个 clzz对象用来反映或者反射原类的所有信息
        // 镜子里面的东西是不真实的，所以clazz与clazz2其实是同一个东西
        Class clazz = Class.forName(clspath);
        // hascode
        System.out.println(clazz.hashCode()); // id
        Class clazz2 = Class.forName(clspath);
        System.out.println(clazz2.hashCode());// 与上面
    }

    /**
     * 获取类对象的三种方式
     */
    @Test
    public void demo2() throws ClassNotFoundException {
        String clspath = "com.home.java.fundament.playground.reflection.User";
        // 方式1 通过Class.forName获取
        Class clazz = Class.forName(clspath);
        // 方式2 ,通过类 的.class获取
        Class string = String.class;
        // 方式3 , 通过对象获取
        Class string2 = clspath.getClass();
        System.out.println(string.hashCode() + "" + string2.hashCode());
    }

    /**
     * 特殊数组是否一样
     */
    @Test
    public void demo3() throws ClassNotFoundException {
        int[] arr1 = new int[10];
        int[] arr2 = new int[20];
        System.out.println(arr1.getClass().hashCode() == arr2.getClass().hashCode()); // true;
        int[][] arr3 = new int[10][23];
        System.out.println(arr1.getClass().hashCode() == arr3.getClass().hashCode()); // false
    }

    /**
     * 操作 利用反射api获取类的信息 类的名字，方法，构造器
     * 
     * @throws ClassNotFoundException
     * @throws SecurityException
     * @throws NoSuchFieldException
     * @throws NoSuchMethodException
     */
    @Test
    public void getInfo()
            throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException {
        Class clazz = Class.forName("com.home.java.fundament.playground.reflection.User");
        // 获取包含全限定路径的名称
        System.out.println(clazz.getName()); // com.home.java.fundament.playground.reflection.User
        // 获取类名
        System.out.println(clazz.getSimpleName()); // User
        // a) 获取属性
        // 1.获取public属性
        clazz.getFields();
        // 2.获取所有属性,也就是所有被定义的属性
        clazz.getDeclaredFields();
        // 3.指定属性
        clazz.getDeclaredField("age");

        // b) 获取方法 把 field改成method，declare代表为所有，默认为public属性
        // 获取所欲方法
        Method[] mes = clazz.getDeclaredMethods();
        for (Method d : mes) {
            System.out.println(d.getName());
        }
        // 获取构造器 把field改成 import java.lang.reflect.Constructor;
        // c) 获取默认构造器
        clazz.getConstructors();
        // 获取有类型的构造器
        clazz.getConstructor(int.class, int.class, String.class);
    }

    /**
     * 通过反射创建对象
     * 
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     */
    @Test
    public void setnew() throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<User> clazz = (Class<User>) Class.forName("com.home.java.fundament.playground.reflection.User");
        // User对象必须要有一个默认构造器，否者 newInstance 报错
        // 1.通过newInstance创建对象
        System.out.println("111111111111111\r\n");
        User user = (User) clazz.newInstance();
        System.out.println(user);
        // 2.通过有参构造创建方法
        System.out.println("222222222222222\r\n");
        Constructor cls2 = clazz.getDeclaredConstructor(int.class, int.class, String.class);
        User user2 = (User) cls2.newInstance(100, 23, "zll");
        System.out.println(user2);
        // 3.通过method设置属性
        System.out.println("33333333333333\r\n");
        User user3 = clazz.newInstance();
        Method setName = clazz.getDeclaredMethod("setUname", String.class);
        setName.invoke(user3, "jln");
        System.out.println(user3);
        // 4.通过反射写属性，即使属性为private也可i，只要设置accessable
        System.out.println("44444444444\r\n");
        User user4 = clazz.newInstance();
        Field fn = clazz.getDeclaredField("uname");
        fn.setAccessible(true);
        fn.set(user4, "aba");
        System.out.println(user4);

    }
}
