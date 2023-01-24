package com.tweetoroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetoroo.api.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    
}
