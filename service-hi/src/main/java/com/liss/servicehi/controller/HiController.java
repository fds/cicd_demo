package com.liss.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value( "${server.port}" )
    private String port;

    @GetMapping("/hi")
    public String hi() {
        return "hello , port is " + port;
    }
}
