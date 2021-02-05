package com.Assignment.HelloWorldRestAPI.service;

import org.springframework.stereotype.Service;

@Service
/**
 * Simple method which returns HelloWorld
 */
public class HelloWorldService {
    public String returnHelloWorld(){
        return "Hello World";
    }
}
