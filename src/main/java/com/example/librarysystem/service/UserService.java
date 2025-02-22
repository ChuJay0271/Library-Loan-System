/* 
package com.example.librarysystem.service;

import com.example.librarysystem.model.User;
import com.example.librarysystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(String phoneNumber, String password, String userName) {
        User user = new User();
        user.setPhoneNumber(phoneNumber);
        user.setPassword(password);  // 請在這裡處理密碼加鹽和雜湊
        user.setUserName(userName);
        user.setRegistrationTime(LocalDateTime.now());
        return userRepository.save(user);
    }

    public User getUserByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }
}
*/