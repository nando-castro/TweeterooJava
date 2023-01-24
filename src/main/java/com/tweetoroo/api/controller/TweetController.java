package com.tweetoroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweetoroo.api.dto.TweetDTO;
import com.tweetoroo.api.model.Tweet;
import com.tweetoroo.api.service.TweetService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tweets")
public class TweetController {
    
    @Autowired
    private TweetService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public String createTweet(@RequestBody @Valid TweetDTO req){
        service.createTweet(req);
        return "OK";
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public Page<Tweet> findAll(@PageableDefault(page = 0, size = 5) @RequestParam String page){
      return service.findAll(page);
    }
}
