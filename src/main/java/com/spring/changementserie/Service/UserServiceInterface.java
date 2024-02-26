package com.spring.changementserie.Service;

import com.spring.changementserie.Dto.Login;
import com.spring.changementserie.Entity.User;
import com.spring.changementserie.Response.LoginMsg;

public interface UserServiceInterface {

    LoginMsg loginUser (Login login);

    User createUser(User user);
}
