package com.example.messenger.controller;

import com.example.messenger.service.userService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class userController {
    userController(userService service) {
    }
}
