package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu(){
        System.out.println("GroupsOnClass1中的stu运行了");
    }
     public void stu1(){
         System.out.println("GroupsOnClass1中的stu1运行了");
     }
     public void stu2(){
         System.out.println("----------------------------");
     }
}
