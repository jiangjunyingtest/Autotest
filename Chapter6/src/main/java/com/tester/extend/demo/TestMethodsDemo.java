package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals("{\n" +
                "    \"resCode\": \"1001\",\n" +
                "    \"resMsg\": \"account : yfms 不存在\"\n" +
                "}","{\n" +
                "    \"resCode\": \"1001\",\n" +
                "    \"resMsg\": \"account : yfms 不存在\"\n" +
                "}");
    }

    @Test
    public void test2(){
        Assert.assertEquals("{\n" +
                "    \"resCode\": \"1005\",\n" +
                "    \"resMsg\": \"参数: legalName不能为空\"\n" +
                "}","{\n" +
                "    \"resCode\": \"1005\",\n" +
                "    \"resMsg\": \"参数: legalName不能为空\"\n" +
                "}");
    }

    @Test
    public void test3(){
        Assert.assertEquals("{\n" +
                "    \"resCode\": \"0000\",\n" +
                "    \"resMsg\": \"提交成功\",\n" +
                "    \"data\": {\n" +
                "        \"statusCode\": \"2012\",\n" +
                "        \"statusMsg\": \"查询成功\",\n" +
                "        \"result\": {\n" +
                "            \"VerifyResult\": 1\n" +
                "        }\n" +
                "    }\n" +
                "}","{\n" +
                "    \"resCode\": \"0000\",\n" +
                "    \"resMsg\": \"提交成功\",\n" +
                "    \"data\": {\n" +
                "        \"statusCode\": \"2012\",\n" +
                "        \"statusMsg\": \"查询成功\",\n" +
                "        \"result\": {\n" +
                "            \"VerifyResult\": 1\n" +
                "        }\n" +
                "    }\n" +
                "}");
    }
    @Test
    public void logDemo(){
        Reporter.log("定义的日志");
        throw new RuntimeException("运行的异常");
    }
}
