package com.tweetoroo.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetoroo.api.model.Person;


public interface UserRepository extends JpaRepository<Person, Long> {
    
}
