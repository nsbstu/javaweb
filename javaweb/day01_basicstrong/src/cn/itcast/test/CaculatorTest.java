package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.crypto.spec.PSource;
import java.net.PortUnreachableException;

public class CaculatorTest {


    /*
    初始化方法：
    用于资源申请，所以测试方法在执行之前都会执行该方法

     */
    @Before
    public void init(){
        System.out.println("init.....");
    }

    /*
   释放资源的方法
   在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close.....");
    }

    /*
    测试add方法
     */
    @Test
    public void testAdd(){
        //System.out.println("我被执行了");
        //int i = 3/0;
        //创建队象
        Calculator c = new Calculator();
        //调用
        int result = c.add(1,2);
        System.out.println("testAdd....");
        //3.断言：我断言这个结果是3
        Assert.assertEquals(3,result);
    }
    @Test
    public void testSub(){
        //创建队象
        System.out.println("testSub....");
        Calculator c = new Calculator();
        //调用
        int result = c.sub(1,2);
        //System.out.println(result);
        //3.断言：我断言这个结果是3
        Assert.assertEquals(-1,result);
    }
}
