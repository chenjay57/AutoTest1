package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }
    @AfterMethod
    public void aferMethod(){
        System.out.println("aferMethod这是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行的方法");
    }
    @AfterClass
    public void aferClass(){
        System.out.println("aferClass这是在类运行之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }
    @AfterSuite
    public void aferSuite(){
        System.out.println("aferSuite套件");
    }
}
