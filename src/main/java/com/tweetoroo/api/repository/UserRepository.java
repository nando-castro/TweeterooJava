package com.tweetoroo.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetoroo.api.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    
}
