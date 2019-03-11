package com.neri.jwt.nerijwt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection="user")
public class User {

    private @Id
    String id = UUID.randomUUID().toString().toUpperCase();
    @Indexed
    private  String email;
    private  String name;
    private  String password;

}
