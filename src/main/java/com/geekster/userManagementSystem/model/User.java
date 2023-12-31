package com.geekster.userManagementSystem.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private Integer userId;
    private String name;

    private String userName;
    private  String address;
    private Integer phone;

}
