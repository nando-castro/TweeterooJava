package com.tweetoroo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetoroo.api.dto.TweetDTO;
import com.tweetoroo.api.model.Tweet;
import com.tweetoroo.api.service.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tweets")
public class TweetController {
    
    @Autowired
    private TweetService service;

    @PostMapping
    public String createTweet(@RequestBody @Valid TweetDTO req){
        service.createTweet(req);
        return "OK";
    }

    @GetMapping()
    public List<Tweet> getTweets(){
        return service.findAllTweets();
    }
}
