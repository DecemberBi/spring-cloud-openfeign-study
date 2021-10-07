package com.biykcode.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feign-server")
public interface HelloInterface {

    @GetMapping("/get")
    String hello();

}
