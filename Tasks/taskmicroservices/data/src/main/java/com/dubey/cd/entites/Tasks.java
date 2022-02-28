package com.dubey.cd.entites;

import javax.persistence.*;

@Entity
@Table(name = "tasks_table",catalog = "tasks_database")

public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String description;
    private  String work;

    public Tasks() {
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", work='" + work + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Tasks(Long id, String description, String work) {
        this.id = id;
        this.description = description;
        this.work = work;
    }
}
