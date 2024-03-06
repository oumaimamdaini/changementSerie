package com.spring.changementserie.Controller;

import com.spring.changementserie.Dto.UserDto;
import com.spring.changementserie.Models.User;
import com.spring.changementserie.Service.UserServiceInterface;
import com.spring.changementserie.Service.impl.UserImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserImplService userImplService;
    @PostMapping(path="/save")
    public User createUser(@RequestBody User user) {

        return userImplService.createUser(user);
    }
    /*@PostMapping(path="/login")
    public ResponseEntity<?> loginUser (@RequestBody UserDto login)
    {
        LoginMsg loginMsg = userServiceInterface.loginUser(login);
        return ResponseEntity.ok(loginMsg);
    }*/
    @PutMapping(path = "/update/{id}")
    public User update(@RequestBody User user,@PathVariable Integer id){
        return userImplService.update(user, id);
    }
   /* @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable Integer id) {
        UserDto updatedUser = userImplService.update(user,id);
        return ResponseEntity.ok(updatedUser);/*
    }*/
    @DeleteMapping(path="/deleteUser/{id}")
    public void deleteUser(Integer id){
        userImplService.deleteUser(id);
    }
}

