package com.course.testng;

import org.testng.annotations.Test;

//依赖测试
public class DeoendTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

    /*
    test2依赖test1.如果test1出现异常test2也运行不了。
     */
}
