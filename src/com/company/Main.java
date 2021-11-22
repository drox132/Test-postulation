package com.company;

import com.company.model.User;
import com.company.repository.UserRepository;
import com.company.service.implementation.UserServiceImplementation;

public class Main {

    public static void main(String[] args) {


        UserServiceImplementation userServiceImplementation=new UserServiceImplementation();
        UserRepository userRepository=new UserRepository();



        userServiceImplementation.insertUser(new User(1,true,5000));
        userServiceImplementation.insertUser(new User(2,false,10000));
        userServiceImplementation.showDateUser();
        userServiceImplementation.selectUserById(1);


    }
}
