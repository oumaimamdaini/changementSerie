package com.spring.changementserie.Service.impl;

import ch.qos.logback.classic.encoder.JsonEncoder;
import com.spring.changementserie.Dto.Login;
import com.spring.changementserie.Dto.UserDto;
import com.spring.changementserie.Entity.Profil;
import com.spring.changementserie.Entity.User;
import com.spring.changementserie.Repository.UserRepository;
import com.spring.changementserie.Response.LoginMsg;
import com.spring.changementserie.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class UserImpl implements UserService {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDto userDto) {
        User user=new User(
                userDto.getId(),
                userDto.getNom(),
              userDto.getLogin(),
                this.passwordEncoder.encode(userDto.getPassword())


        );
        userRepo.save(user);
        return user.getNom();
    }
    UserDto userDto;
    @Override
    public LoginMsg loginUser(Login login) {
        String msg = "";
        User user1 = userRepo.findByLogin(login.getLogin());
        if (user1 != null) {
            String password = login.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findByLoginAndPassword(login.getLogin(), encodedPassword);
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
