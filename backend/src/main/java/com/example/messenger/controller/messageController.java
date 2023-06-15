package com.example.messenger.controller;

import com.example.messenger.service.messageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class messageController {
    messageController(messageService service) {
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
