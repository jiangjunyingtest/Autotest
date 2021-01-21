package com.course.testng.MultiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("test1Thread Id %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("test2Thread Id %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("test3Thread Id %s%n", Thread.currentThread().getId());
    }
}
