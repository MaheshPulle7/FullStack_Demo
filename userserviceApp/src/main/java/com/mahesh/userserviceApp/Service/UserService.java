package com.mahesh.userserviceApp.Service;

import com.mahesh.userserviceApp.Model.User;
import com.mahesh.userserviceApp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addNewUser(User user){

        return userRepository.save(user);
    }

    public List<User> getAllUser(){

        return userRepository.findAll();
    }

//    public User deleteAUser(){
//
//        return userRepository.delete();
//    }



}
