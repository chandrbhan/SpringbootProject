package com.dubey.cd.services;

import com.dubey.cd.entites.Tasks;

import java.util.List;

public interface TaskServices {
    Tasks saveTasks(Tasks tasks);
    List<Tasks>getAllTasks();
    void deleteTasks(long id);
    Tasks updateTasks(Tasks tasks,long id);
}
