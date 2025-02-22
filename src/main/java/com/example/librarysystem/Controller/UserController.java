/* 
package com.library.controller;

import com.library.model.User;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        if (userService.registerUser(user)) {
            return new ResponseEntity<>("註冊成功", HttpStatus.CREATED);  // 註冊成功
        } else {
            return new ResponseEntity<>("使用者已經註冊", HttpStatus.CONFLICT);  // 使用者已經註冊
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String phoneNumber, @RequestParam String password) {
        if (userService.loginUser(phoneNumber, password)) {
            return new ResponseEntity<>("登入成功", HttpStatus.OK);  // 登入成功
        } else {
            return new ResponseEntity<>("帳號或密碼錯誤", HttpStatus.UNAUTHORIZED);  // 登入失敗
        }
    }
}
*/