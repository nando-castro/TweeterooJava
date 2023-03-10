package com.tweetoroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweetoroo.api.dto.UserDTO;
import com.tweetoroo.api.service.UserService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth")
public class UserController {
    
    @Autowired
    private UserService service;

    @PostMapping("/sign-up")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String signUp(@RequestBody @Valid UserDTO req){
        service.signUp(req);
        return "OK";
    }
}
