package com.Assignment.HelloWorldRestAPI.controller;
import com.Assignment.HelloWorldRestAPI.model.HelloResponse;
import com.Assignment.HelloWorldRestAPI.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;
    public HelloResponse helloResponse = new HelloResponse();

    /**
     * @returns JSON response as hello world and status as 200 (HttpStatus.OK)
     */
    @GetMapping("/hello")
    public ResponseEntity<HelloResponse> helloWorld() {
        String response;
        response = helloWorldService.returnHelloWorld();
        if (response.length() >= 1) {
            helloResponse.setResponse(response);
            helloResponse.setStatus(HttpStatus.OK.value());
        } else {
            helloResponse.setResponse("null");
            helloResponse.setStatus(HttpStatus.OK.value());
        }
        return new ResponseEntity<>(helloResponse, HttpStatus.OK);
    }

    /**
     * @param name, user can enter his/her name
     * @return hello + $name + how are you?
     */
    @GetMapping("/name/{name}")
    public ResponseEntity<HelloResponse> helloName(@PathVariable("name") String name) {
        helloResponse.setResponse("Hello " + name + " How are you?");
        helloResponse.setStatus(HttpStatus.OK.value());
        return new ResponseEntity<>(helloResponse, HttpStatus.OK);
    }
}


