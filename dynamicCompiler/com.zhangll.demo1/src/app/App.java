package app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class App {
    /**
     * 动态编译代码,类似于在web上输入文本，然后服务器根据这些文本进行编译
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // 方法1
        JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
        int result = jc.run(null, null, null,
                "I:/家和工作记录/spring-first/dynamicCompiler/com.zhangll.demo1/src/app/HelloWorld.java");
        System.out.println("reulst:" + result);

        // 方法2
        Runtime runt = Runtime.getRuntime();
        Process process = runt
                .exec("java -cp I:/家和工作记录/spring-first/dynamicCompiler/com.zhangll.demo1/src/app HelloWorld");
        InputStream in = process.getInputStream();
        BufferedReader bis = new BufferedReader(new InputStreamReader(in));
        String info = "";
        System.out.println("info:" + info);
        while ((info = bis.readLine()) != null) {
            System.out.println(info);
        }
    }
}