package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user)
    {
        return userRepository.save(user);
    }


//    public User getUser()
//    {
//        return userRepository.getUser();
//    }


//    public List<User> getAllUsers()
//    {
//        return userRepository.getAllUsers();
//    }
//
//    public User getUserById(int userId)
//    {
//        return userRepository.getUserById(userId);
//    }
//
//    public User updateUser(int userId, User user)
//    {
//        return userRepository.updateUser(userId, user);
//    }
//
//    public User deleteUser(int userId)
//    {
//        return userRepository.deleteUser(userId);
//    }
}
