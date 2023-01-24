package com.tweetoroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public Page<Tweet> findAll(String pageable){
        int page = Integer.parseInt(pageable);

        Pageable pages = PageRequest.of(page, 5, Sort.by("id").descending());
        return repository.findAll(pages);
    }
    
}
