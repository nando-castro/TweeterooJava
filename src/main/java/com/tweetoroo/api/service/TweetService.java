package com.tweetoroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetoroo.api.dto.TweetDTO;
import com.tweetoroo.api.model.Tweet;
import com.tweetoroo.api.repository.TweetRepository;

@Service
public class TweetService {

    @Autowired
    private TweetRepository repository;
    
    public void createTweet(TweetDTO req){
        repository.save(new Tweet(req));
    }
}
