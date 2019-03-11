package com.neri.jwt.nerijwt.repository;

import com.neri.jwt.nerijwt.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}
