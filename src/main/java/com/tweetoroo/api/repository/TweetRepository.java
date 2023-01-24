package com.tweetoroo.api.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetoroo.api.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    public List<Tweet> findByUsername(String username);
    Page<Tweet> findAll(Pageable pageable);
}
