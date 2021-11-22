package com.company.service;

import com.company.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    void insertUser (User newUser);
    List<User> selectAllUser();
    User selectUserById(int id);
    void showDateUser ();

}
