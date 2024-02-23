package com.spring.changementserie.Controller;

import com.spring.changementserie.Dto.Login;
import com.spring.changementserie.Dto.UserDto;
import com.spring.changementserie.Response.LoginMsg;
import com.spring.changementserie.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping(path="/save")
    public String saveUser(@RequestBody UserDto userDto) {

        String id=userService.addUser(userDto);
        return id;
    }
    @PostMapping(path="/login")
    public ResponseEntity<?> loginUser (@RequestBody Login login)
    {
        LoginMsg loginMsg = userService.loginUser(login);
        return ResponseEntity.ok(loginMsg);
    }
}

