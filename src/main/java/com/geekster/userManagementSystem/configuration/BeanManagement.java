package com.geekster.userManagementSystem.configuration;

import com.geekster.userManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManagement {



    @Bean
    public List<User> getUserList(){
        return new ArrayList<>();
    }


}
