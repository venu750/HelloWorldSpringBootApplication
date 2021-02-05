package com.Assignment.HelloWorldRestAPI.service;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class HelloWorldServiceTest {
    private HelloWorldService helloWorldService=new HelloWorldService();
    @Test
    public void HelloWorldServiceTest(){
        Assert.assertEquals("Hello World",helloWorldService.returnHelloWorld());
        Assert.assertNotEquals(6,helloWorldService.returnHelloWorld().length());
    }
}
