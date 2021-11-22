package com.company.service.implementation;

import com.company.model.User;
import com.company.repository.UserRepository;
import com.company.service.UserService;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class UserServiceImplementation implements UserService {

    Logger logger;

    UserRepository userRepository= new UserRepository();

    @Override
    public void insertUser(User newUser) {
        userRepository.insertUser(newUser);
    }

    @Override
    public List<User> selectAllUser() {
        return userRepository.selectAllUser();
    }

    @Override
    public User selectUserById(int id) {
        User userById = userRepository.selectUserById(id).orElseThrow(IllegalStateException::new);
        this.showUser(userById);
        return userById;
    }


    private void showUser (User user){
        System.out.println("valor obtener por ID -> ".concat(user.toString()));
    }

    @Override
    public void showDateUser() {

        List<User> listUser= this.selectAllUser();
        for (User particularUser: listUser){
            System.out.println(particularUser.toString());

            System.out.println("Id= " + particularUser.getId()
                    + " Is Subscription= " + particularUser.isSubscription()
                    + " Credit = " + particularUser.getCredit());
        }


    }
}
