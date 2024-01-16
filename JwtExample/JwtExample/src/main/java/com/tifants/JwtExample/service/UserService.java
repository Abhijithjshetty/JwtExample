package com.tifants.JwtExample.service;

import com.tifants.JwtExample.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();
    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Abhi","abhi@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"subba","subba@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"guru","guru@gmail.com"));
    }
    public List<User> getUsers(){
        return this.store;
    }
}


