package com.example.dijkstra.controller;
import java.util.List;

import com.example.dijkstra.model.User;
import com.example.dijkstra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
