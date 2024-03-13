package com.mahesh.userserviceApp.Controller;

import com.mahesh.userserviceApp.Model.User;
import com.mahesh.userserviceApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    User createUser(@RequestBody User user){

        return userService.addNewUser(user);

    }

    @GetMapping("/getAll")
    List<User> getAllUser(){
        return userService.getAllUser();
    }
}
