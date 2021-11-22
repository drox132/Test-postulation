package com.company.repository;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    List<User> listUser = new ArrayList<>();

    public void insertUser (User newUser) {
        listUser.add(newUser);
    }

    public List<User> selectAllUser(){
        return listUser;
    }

    public Optional<User> selectUserById(int id){

        return listUser.stream().filter(particularUser -> particularUser.getId()==id).findFirst();


    }



}
