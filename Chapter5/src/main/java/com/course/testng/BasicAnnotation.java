package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){

        System.out.println("这是测试用例1");
    }

   /*@Test
     public void testCase2(){
        System.out.println("这是测试用例2");
    }*/

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在方法之后运行的");
    }

    @BeforeClass
    public void beforeCalss(){
        System.out.println("BeforeClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterCalss(){
        System.out.println("AfterClass这是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
    /*
    testng测试套件运行顺序。(1)执行beforeSuite测试套件，(2)在执行BeforeClass，(3)在执行BeforeMethod，(4)在执行测试用例，
    (5)执行AfterMethod，(6)在执行AfterClass，(7)，最后执行afterSuite测试套件结束。
    如果有N个测试用例那么就会一直，执行(3)，(4)，(5)这三步，知道测试用例运行完成，之后才执行(6)和(7)
     */
}
