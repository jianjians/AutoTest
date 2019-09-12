package com.course.testng;

import org.testng.annotations.Test;

//依赖测试
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1");
        throw new RuntimeException();
        //test1是test2的前置条件
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2");
    }

    @Test(dependsOnGroups = {""})
    public void test3(){
        System.out.println("test3");
    }


}
