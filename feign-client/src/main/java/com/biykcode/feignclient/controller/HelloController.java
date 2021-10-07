package com.biykcode.feignclient.controller;

import com.biykcode.interfaces.HelloInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class HelloController {

    @Autowired
    private HelloInterface helloInterface;

    @GetMapping("/hello")
    public String hello() {
        String world = helloInterface.hello();
        System.out.println("feign-client invoke hello, return " + world);
        return world;
    }
}
