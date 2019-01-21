package app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

@SuppressWarnings("all")
public class App {
    /**
     * 动态编译代码,类似于在web上输入文本，然后服务器根据这些文本进行编译
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // // 方法1
        // JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
        // int result = jc.run(null, null, null,
        // "I:/家和工作记录/spring-first/dynamicCompiler/com.zhangll.demo1/src/app/HelloWorld.java");
        // System.out.println("reulst:" + result);

        // // 方法2 这个是最古老的做法
        // Runtime runt = Runtime.getRuntime();
        // Process process = runt
        // .exec("java -cp
        // I:/家和工作记录/spring-first/dynamicCompiler/com.zhangll.demo1/src/app/
        // HelloWorld");
        // InputStream in = process.getInputStream();
        // BufferedReader bis = new BufferedReader(new InputStreamReader(in));
        // String info = "";
        // System.out.println("info:" + info);
        // while ((info = bis.readLine()) != null) {
        // System.out.println(info);
        // }
        // 方法3 类加载器
        URL[] urls = new URL[] {
                new URL("file:" + "I:/家和工作记录/spring-first/dynamicCompiler/com.zhangll.demo1/src/app") };
        URLClassLoader loader = new URLClassLoader(urls);
        Class clazz = loader.loadClass("HelloWorld.java");
        Method main = clazz.getMethod("main", String[].class);
        main.invoke(null, (Object) new String[] { "a", "b" });
    }
}