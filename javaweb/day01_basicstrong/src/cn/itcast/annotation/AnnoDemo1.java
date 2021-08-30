package cn.itcast.annotation;

/*
注解：
	* 概念：说明程序的。给计算机看的
	* 注释：用文字描述程序的。给程序员看的

	* 定义：注解（Annotation），也叫元数据。一种代码级别的说明。它是JDK1.5及以后版本引入的一个特性，与类、接口、枚举是在同一个层次。它可以声明在包、类、字段、方法、局部变量、方法参数等的前面，用来对这些元素进行说明，注释。
	* 概念描述：
		* JDK1.5之后的新特性
		* 说明程序的
		* 使用注解：@注解名称


	* 作用分类：
		①编写文档：通过代码里标识的注解生成文档【生成文档doc文档】
		②代码分析：通过代码里标识的注解对代码进行分析【使用反射】
		③编译检查：通过代码里标识的注解让编译器能够实现基本的编译检查

        编译：javac
        反编译：javap
 */
/**
 * 注解javadoc演示
 * @version 1.0
 * @author itcast
 * @since 1.5
 *
 *


 */
public class AnnoDemo1 {
    /**
     * 计算两数的和
     * @param a 整数
     * @param b 整数
     * @return 两数之和
     */
    public int add(int a ,int b){
        return a + b;
    }
}
