package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)
    public void testSuccess () throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("timeoutSuccess");
    }

    @Test(timeOut = 1000)
    public void testFailed () throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("timeoutFailed");
    }
}
