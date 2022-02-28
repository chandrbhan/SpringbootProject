package com.dubey.example.services;

import com.dubey.example.entites.Users;

import java.util.List;

public interface UserServices {
    Users saveUsers(Users users);
    List<Users> getAllUsers();
    void deletedUsers(long id);
    Users updatedUsers(Users users,long id);
    Users getUsersById(long id);


}
