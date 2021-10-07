package com.biykcode.feignserver.controller;

import com.biykcode.feignserver.services.HelloInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloInterfaceImpl helloInterface;

    @GetMapping("/server/hello")
    public String hello() {
        return helloInterface.hello();
    }
}
