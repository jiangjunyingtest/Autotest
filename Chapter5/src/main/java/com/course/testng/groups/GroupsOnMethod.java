package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    //组
    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端组的测试方法");
    }

    @Test(groups = "test")
    public void test2(){
        System.out.println("客户端组的测试方法");
    }

    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("这是服务端组运行之前的运行方法");
    }

    @AfterGroups("server")
    public void afterGroups(){
        System.out.println("这是服务端组运行之后的运行方法！！！！");
    }

   @BeforeGroups("test")
    public void beforeGroupson(){
        System.out.println("这是客户端组运行之前的运行方法");
    }

    @AfterGroups("test")
    public void afterGroupson(){
        System.out.println("这是客户端运行之后的运行方法！！！！");
    }
}
