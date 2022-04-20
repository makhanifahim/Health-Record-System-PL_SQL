package com.example.healthrecordsystemfinal.controller;

import com.example.healthrecordsystemfinal.entity.User;
import com.example.healthrecordsystemfinal.repository.userRepository;
import com.example.healthrecordsystemfinal.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

    @Autowired
    public userRepository userRepo;

    @Autowired
    private userService userServ;

    @PostMapping("/login")
    public int regiUser(@RequestBody User user) {

        User us=userServ.user(user);
        return us.getId();
    }
    @PostMapping("/getalluser")
    public List<User> findAllUsers(){
        return userServ.getDetails();
    }

    @PostMapping("/find")
    public String  loginUser(@RequestBody User user) {
        return userServ.findUser(user.getUsername(),user.getPassword());
    }



}
