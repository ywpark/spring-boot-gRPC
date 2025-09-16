package com.example.client.controller;

import com.example.client.service.grpc.HelloClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloClient helloClient;

    public HelloController(HelloClient helloClient) {
        this.helloClient = helloClient;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloClient.sendMessage(name);
    }

}
