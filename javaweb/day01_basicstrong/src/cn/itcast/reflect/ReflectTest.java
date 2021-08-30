package cn.itcast.reflect;

import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象，可以执行任意方法
        /*
        前提：不能任意改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
         */
       /* Person p = new Person();
        p.eat();*/
       /* Student stu = new Student();
        stu.sleep();*/
        //1.加载配置文件
        //1.1创建properties对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件
        //获取这个class文件的类加载器
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        //getResourceAsStream获取文件的字节流
        //getResource获取文件的路径
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        //把字节流传进去
        // void load(InputStream inStream)
        // 从输入流中读取属性列表（键和元素对）。
        pro.load(is);


        //2.获取配置文件中的定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.加载类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);

    }
}
