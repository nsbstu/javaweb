package cn.itcast.annotation;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */
/*
* 在程序使用(解析)注解：获取注解中定义的属性值
		1. 获取注解定义的位置的对象  （Class，Method,Field）
		2. 获取指定的注解
			* getAnnotation(Class)
			//其实就是在内存中生成了一个该注解接口的子类实现对象

		            public class ProImpl implements Pro{
		                public String className(){
		                    return "cn.itcast.annotation.Demo1";
		                }
		                public String methodName(){
		                    return "show";
		                }
		            }
		3. 调用注解中的抽象方法获取配置的属性值

 */
@Pro(className = "cn.itcast.annotation.Demo1",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象，可以执行任意方法
        /*
        前提：不能任意改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
         */
    //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        /*

        public class ProImpl implements Pro{
             public String className(){
                return "cn.itcast.annotation.Demo1";
             }
             public String methodName(){
                return "show";
             }
        }

        */
        Pro an = reflectTestClass.getAnnotation(Pro.class);


        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);



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
