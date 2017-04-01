package com.mdb.controller;

import com.mdb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UserConroller {
    private final UserRepository userRepository;

    @Autowired
    public UserConroller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/delete")
    public View delete( String id){
        userRepository.delete(id);

        return new RedirectView("/index");

    }
}
