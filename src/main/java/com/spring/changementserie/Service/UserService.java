package com.spring.changementserie.Service;

import com.spring.changementserie.Dto.Login;
import com.spring.changementserie.Dto.UserDto;
import com.spring.changementserie.Response.LoginMsg;

public interface UserService {
    String addUser(UserDto userDto);
    LoginMsg loginUser (Login login);
    
}
