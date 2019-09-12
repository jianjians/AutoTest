package com.course.testng.groups;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
//参数化方法有三种：1.xml  2.单个dataprovider  3.多个dataprovider
public class DataProviderTest {

    //dataProvider和name必须一样，否则找不到
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.print("name="+name+";"+"age="+age);
    }

    //支撑根据方法来进行参数传递
    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"chenjialu",10},{"lisi",20},{"wangwu",30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void  test1(String name,int age){
        System.out.print("test1:"+name);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2:"+name);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] o = null;
        if (method.getName().equals("test1")){
            o = new Object[][]{
                    {"zhangsan",20},{"lisi",30}
            };
        }else if (method.getName().equals("test2")){
            o = new Object[][]{
                    {"wangwu",15},{"zhaoliu",25}
            };
        }
        return o;
    }

}
