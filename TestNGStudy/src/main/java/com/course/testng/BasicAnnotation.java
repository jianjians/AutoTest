package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本得注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Thread id:%s%n",Thread.currentThread().getId());

        System.out.println("testCase1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Thread id:%s%n",Thread.currentThread().getId());

        System.out.println("testCase2");
    }

    //方法之前之后运行beforemethod/aftermethod
    @BeforeMethod
    public void beforetestCase1(){
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterTestCase1(){
        System.out.println("afterMethod");
    }

    //类运行之前运行的
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
}
