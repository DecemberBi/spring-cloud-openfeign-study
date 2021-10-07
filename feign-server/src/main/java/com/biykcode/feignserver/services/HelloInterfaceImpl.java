package com.biykcode.feignserver.services;

import com.biykcode.interfaces.HelloInterface;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloInterfaceImpl implements HelloInterface {

    @Override
    public String hello() {
        String world =  "hello world";
        System.out.println("feign-server implements hello print " + world);
        return world;
    }

}
