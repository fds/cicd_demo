package com.liss.serviceclient.controller;


import com.liss.serviceclient.client.HiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HiController {

    @Autowired
    HiClient hiClient;

    @GetMapping("/hiclient")
    public String dc() {
        return hiClient.hi();
    }

}