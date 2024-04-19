package com.LVQT.quickstart.Controller;

import com.LVQT.quickstart.Model.User;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/v1")
@RestController
public class UserController {

    private List<User> users = new ArrayList<User>();

    @PostMapping("/user")
    public User create(@RequestBody User user){
        users.add(user);
        return user;
    }

    @GetMapping("/users")
    public List<User> getAll(){
        return users;
    }

}
