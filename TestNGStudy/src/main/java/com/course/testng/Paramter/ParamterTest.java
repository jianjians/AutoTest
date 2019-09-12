package com.course.testng.Paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//参数化测试
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void parameterTest(String name,int age){
        System.out.println("name="+name+";"+"age="+age);
    }

}
