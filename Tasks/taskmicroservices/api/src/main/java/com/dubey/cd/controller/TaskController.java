package com.dubey.cd.controller;

import com.dubey.cd.entites.Tasks;
import com.dubey.cd.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskServices taskServices;

    @PostMapping
    public ResponseEntity<Tasks>saveTasks(@RequestBody Tasks tasks){
        return  new ResponseEntity<Tasks>(taskServices.saveTasks(tasks), HttpStatus.CREATED);

    }


    @GetMapping
    public List<Tasks> getAllTasks(){
        return taskServices.getAllTasks();

    }

    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteTasks(@PathVariable("id")long id){
        taskServices.deleteTasks(id);
        return new ResponseEntity<String>("Task Deleted",HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Tasks>updateTasks(@PathVariable("id")long id,@RequestBody Tasks tasks){
        return  new ResponseEntity<Tasks>(taskServices.updateTasks(tasks,id),HttpStatus.OK);
    }
}
