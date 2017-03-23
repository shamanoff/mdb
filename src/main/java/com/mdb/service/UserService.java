package com.mdb.service;

import com.mdb.model.User;
import com.mdb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public List<User>findByName(String name){
        return userRepository.findByName(name);
    }
}
