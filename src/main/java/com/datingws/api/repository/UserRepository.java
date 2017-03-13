package com.datingws.api.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.datingws.api.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByEmail(String email); 

}
