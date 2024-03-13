package com.spring.changementserie.Controller;

import com.spring.changementserie.Models.User;
import com.spring.changementserie.Service.impl.UserImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserImplService userImplService;
    @PostMapping(path="/createUser")
    public User createUser(@RequestBody User user) {

        return userImplService.createUser(user);
    }
    @PutMapping(path = "/update/{id}")
    public User update(@RequestBody User user,@PathVariable Integer id){
        return userImplService.update(user, id);
    }
    @DeleteMapping(path="/deleteUser/{id}")
    public void deleteUser(@PathVariable Integer id){
        userImplService.deleteUser(id);
    }
    @GetMapping(path="/getUserById/{idUser}")
    public Optional<User> getUserById(@PathVariable("idUser") Integer idUser ) {
        return userImplService.getUserById(idUser);
    }

    @GetMapping(path="/getAllUsers")
    public List<User> getAllUsers() {
        return userImplService.getAllUsers();
    }

}