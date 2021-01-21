package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "da")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+"\n"+"age="+age);
    }

    @DataProvider(name="da")
    public Object[][] providerData(){
        Object[][] o= new Object[][]{
                {"aaa",20},
                {"sss",30},
                {"ssss",50},
                {"ssss",65}
        };
        return o;
    }
}
