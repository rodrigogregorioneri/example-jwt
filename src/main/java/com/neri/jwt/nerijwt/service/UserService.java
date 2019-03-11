package com.neri.jwt.nerijwt.service;

import com.neri.jwt.nerijwt.model.User;
import com.neri.jwt.nerijwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService  {

    @Autowired
    private UserRepository repository;

    public User createUser(User user) {
        return repository.save(user);
    }


    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }


}
