package com.Assignment.HelloWorldRestAPI.controller;

import com.Assignment.HelloWorldRestAPI.service.HelloWorldService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldController {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private HelloWorldService helloWorldService;
    @Test
    public void helloWorldTest(){
//        when(helloWorldService.returnHelloWorld()).thenReturn("Mocking Service Layer");
//        this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("Mocking Service Layer")));
    }

    }
