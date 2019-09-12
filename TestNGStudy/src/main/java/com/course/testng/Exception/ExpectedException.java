package com.course.testng.Exception;

import org.testng.annotations.Test;
//异常测试
public class ExpectedException {
//    在期望结果为某一个日常的时候
//    如：预期结果就是这个异常

    //测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaild(){
        System.out.println("runTimeExceptionFailed");
    }

    //成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("runTimeExceptionSuccess");
        throw new RuntimeException();
    }
}
