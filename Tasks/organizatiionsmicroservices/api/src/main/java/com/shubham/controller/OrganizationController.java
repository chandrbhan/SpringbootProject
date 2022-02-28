package com.shubham.controller;

import com.shubham.entites.Organizations;
import com.shubham.services.OrganizationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    @Autowired
    OrganizationServices organizationServices;


    @PostMapping
    public ResponseEntity<Organizations> saveOrgs(@RequestBody Organizations organizations){
        return  new ResponseEntity<Organizations>(organizationServices.saveOrgs(organizations), HttpStatus.CREATED);

    }


    @GetMapping
    public List<Organizations> getAllOrgs(){
        return organizationServices.getAllOrgs();

    }

    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteOrgs(@PathVariable("id")long id){
        organizationServices.deleteOrgs(id);
        return new ResponseEntity<String>("Organization Deleted",HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Organizations>updateOrgs(@PathVariable("id")long id,@RequestBody Organizations organizations){
        return  new ResponseEntity<Organizations>(organizationServices.updateOrgs(organizations,id),HttpStatus.OK);
    }

}
