package com.course.testng;

import org.testng.annotations.Test;

public class ignoreTest {

    @Test
    public void ignore1(){
        System.out.println("1执行了");
    }

    //忽略测试
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("2执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("3执行了");
    }
}
