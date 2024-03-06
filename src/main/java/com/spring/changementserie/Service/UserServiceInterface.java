package com.spring.changementserie.Service;

import com.spring.changementserie.Models.User;

public interface UserServiceInterface {

   // LoginMsg loginUser (UserDto login);

    User createUser(User user);
    void deleteUser(Integer id);
    User update(User user , Integer id);
}
