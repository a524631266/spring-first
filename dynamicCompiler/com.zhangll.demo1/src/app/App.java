package app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class App {
    /**
     * ��̬�������,��������web�������ı���Ȼ�������������Щ�ı����б���
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // ����1
        JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
        int result = jc.run(null, null, null,
                "I:/�Һ͹�����¼/spring-first/dynamicCompiler/com.zhangll.demo1/src/app/HelloWorld.java");
        System.out.println("reulst:" + result);

        // ����2
        Runtime runt = Runtime.getRuntime();
        Process process = runt
                .exec("java -cp I:/�Һ͹�����¼/spring-first/dynamicCompiler/com.zhangll.demo1/src/app HelloWorld");
        InputStream in = process.getInputStream();
        BufferedReader bis = new BufferedReader(new InputStreamReader(in));
        String info = "";
        System.out.println("info:" + info);
        while ((info = bis.readLine()) != null) {
            System.out.println(info);
        }
    }
}