package com.tweetoroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetoroo.api.dto.UserDTO;
import com.tweetoroo.api.model.Person;
import com.tweetoroo.api.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public void signUp(UserDTO req){
        repository.save(new Person(req));
    }
}