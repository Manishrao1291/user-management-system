package com.geekster.userManagementSystem.repositry;


import com.geekster.userManagementSystem.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositry {

    @Autowired
    List<User> userList;


    public  List<User> getUsers() {
        return userList;
    }

}
