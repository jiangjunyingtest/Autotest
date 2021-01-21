package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    /*
    超时设置
     */
    @Test(timeOut = 2001)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }
}
