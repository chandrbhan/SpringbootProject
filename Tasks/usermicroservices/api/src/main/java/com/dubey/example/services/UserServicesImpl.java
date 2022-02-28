package com.dubey.example.services;

import com.dubey.example.entites.Users;
import com.dubey.example.exception.ResourceNotFoundException;
import com.dubey.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users saveUsers(Users users) {
        return userRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public void deletedUsers(long id) {
        userRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Users","Id",id));
        userRepository.deleteById(id);

    }

    @Override
    public Users updatedUsers(Users users, long id) {
        Users existingUsers=userRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Users","Id",id));
        existingUsers.setFirstName(users.getFirstName());
        existingUsers.setLastName(users.getLastName());
        userRepository.save(existingUsers);
        return existingUsers;
    }

    @Override
    public Users getUsersById(long id) {
        return userRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Users","Id",id));
    }




}
