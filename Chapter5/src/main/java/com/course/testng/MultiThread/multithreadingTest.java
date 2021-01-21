package com.course.testng.MultiThread;

import org.testng.annotations.Test;

public class multithreadingTest {
    int n= 1;
    @Test(invocationCount = 10,threadPoolSize = 2)
    /*
    invocationCount表示执行次数，threadPoolSize表示线程池大小
     */
    public void test(){
        System.out.println("前-------------");
        System.out.printf("Thread Id %s%n",Thread.currentThread().getId());
        System.out.println("后-------------");
        System.out.println("执行第"+n+++"次");
    }
}
