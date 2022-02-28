package com.dubey.example.controller;

import com.dubey.example.entites.Users;
import com.dubey.example.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userServices;


    //SAVE USERS
    @PostMapping
    public ResponseEntity<Users>saveUsers(@RequestBody Users users){
        return  new ResponseEntity<Users>(userServices.saveUsers(users), HttpStatus.CREATED);
    }

    //GET ALL USERS
    @GetMapping
    public List<Users>getAllUsers(){
        return userServices.getAllUsers();
    }




    //DELETE USER
    @DeleteMapping("{id}")
    public  ResponseEntity<String>deletedUsers(@PathVariable("id")long id){
        userServices.deletedUsers(id);
        return new ResponseEntity<String>("User deleted",HttpStatus.OK);
    }

    //UPDATE USER
    @PutMapping("{id}")
    public ResponseEntity<Users>updateUsers(@PathVariable("id")long id,@RequestBody Users users){
        return  new ResponseEntity<Users>(userServices.updatedUsers(users,id),HttpStatus.OK);
    }


    //Get users by id
    @GetMapping("{id}")
    public ResponseEntity<Users>getUserById(@PathVariable("id") long id){
        return new ResponseEntity<Users>(userServices.getUsersById(id),HttpStatus.OK);

    }


}
