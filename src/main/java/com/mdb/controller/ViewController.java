package com.mdb.controller;

import com.mdb.model.User;
import com.mdb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class ViewController {


    private final UserRepository userRepository;

    @Autowired
    public ViewController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping({"/", "/index"})
    public ModelAndView main() {

        ModelAndView mv = new ModelAndView("index");
        List<User> users = userRepository.findAll();
        Collections.reverse(users);
        mv.addObject("users", users);
        return mv;
    }

    @PostMapping("/save")
    public ModelAndView save( User user) {
        ModelAndView mv = new ModelAndView("index");
        if(!user.isEmpty(user)){
        userRepository.insert(user);
        List<User> users = userRepository.findAll();
        Collections.reverse(users);
        mv.addObject("users", users);
        return mv;}
        else {
            List<User> users = userRepository.findAll();
            Collections.reverse(users);
            mv.addObject("users", users);
            return mv;
        }

    }

}
