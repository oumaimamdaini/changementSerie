package com.spring.changementserie.Controller;

import com.spring.changementserie.Dto.UserDto;
import com.spring.changementserie.Entity.User;
import com.spring.changementserie.Response.LoginMsg;
import com.spring.changementserie.Service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServiceInterface userServiceInterface;
    @PostMapping(path="/save")
    public User createUser(@RequestBody User user) {

        return userServiceInterface.createUser(user);
    }
    /*@PostMapping(path="/login")
    public ResponseEntity<?> loginUser (@RequestBody UserDto login)
    {
        LoginMsg loginMsg = userServiceInterface.loginUser(login);
        return ResponseEntity.ok(loginMsg);
    }*/
}

