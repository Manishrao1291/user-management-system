package com.geekster.userManagementSystem.service;


import com.geekster.userManagementSystem.model.User;
import com.geekster.userManagementSystem.repositry.UserRepositry;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepositry userRepositry;

    public  List<User> getAllUsers() {
        return userRepositry.getUsers();
    }

    public String createUser(User user) {
        List<User> originalList = getAllUsers();
        originalList.add(user);
        return "New user added";
    }
    public User getUserById(Integer userId) {
        List<User> userList = getAllUsers();
        return userList.get(userId);
    }

    public String updateUserById(Integer userId) {
        List<User> userList = getAllUsers();
        for (User user : userList) {
            if(user.getUserId().equals(userId)){
                user.setUserName("Manish");
                user.setUserId(5);
                user.setName("Sachin");
            }
        }
        return "User update successfully";

    }

    public String deleteUserById(Integer userId) {
        List<User> userList = getAllUsers();
        userList.remove((int)userId);
        return "user removed successfully";
    }

}
