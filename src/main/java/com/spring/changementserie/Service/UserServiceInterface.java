package com.spring.changementserie.Service;

import com.spring.changementserie.Dto.UserDto;
import com.spring.changementserie.Entity.User;
import com.spring.changementserie.Response.LoginMsg;

public interface UserServiceInterface {

   // LoginMsg loginUser (UserDto login);

    User createUser(User user);
}
