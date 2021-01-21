package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /*
    异常测试。期望是失败的结果
     */

    //这是个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.println("失败的测试结果");
    }

    //这是个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptio(){
        System.out.println("这是期望的失败的测试结果");
        throw new RuntimeException();
    }
}
