package com.dubey.cd.services;

import com.dubey.cd.entites.Tasks;
import com.dubey.cd.exception.ResourceNotFoundException;
import com.dubey.cd.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServicesImpl implements TaskServices {

    @Autowired
    private TaskRepository taskRepository;


    @Override
    public Tasks saveTasks(Tasks tasks) {
        return taskRepository.save(tasks);
    }

    @Override
    public List<Tasks> getAllTasks() {
        return (List<Tasks>) taskRepository.findAll();
    }

    @Override
    public void deleteTasks(long id) {
        taskRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Tasks","Id",id));
        taskRepository.deleteById(id);


    }

    @Override
    public Tasks updateTasks(Tasks tasks, long id) {
        Tasks existingTasks=taskRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Tasks","Id",id));
        existingTasks.setDescription(tasks.getDescription());
        existingTasks.setWork(tasks.getWork());
        taskRepository.save(existingTasks);
        return existingTasks;
    }
}
