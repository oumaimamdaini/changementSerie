package com.spring.changementserie.Service.impl;

import com.spring.changementserie.Dto.Login;
import com.spring.changementserie.Entity.User;
import com.spring.changementserie.Repository.UserRepository;
import com.spring.changementserie.Response.LoginMsg;
import com.spring.changementserie.Service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class UserImplService implements UserServiceInterface {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(User user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepo.save(user);
    }


@Override
    public LoginMsg loginUser(Login login) {
        String msg = "";
        User user1 = userRepo.findByEmail(login.getLogin());
        if (user1 != null) {
            String password = login.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findByEmailAndPassword(login.getLogin(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginMsg("Login Success", true);
                } else {
                    return new LoginMsg("Login Failed", false);
                }
            } else {
                return new LoginMsg("password Not Match", false);
            }
        }else {
            return new LoginMsg("Email not exits", false);
        }
    }





}
