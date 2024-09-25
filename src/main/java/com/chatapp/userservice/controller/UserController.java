package com.chatapp.userservice.controller;

import com.chatapp.userservice.dto.UserRequest;
import com.chatapp.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/chatapp")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserRequest userRequest){
        return userService.saveUser(userRequest);
    }

}
