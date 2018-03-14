package com.cloud.helloworldcloud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello/one", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return new String("hello one");
    }
}