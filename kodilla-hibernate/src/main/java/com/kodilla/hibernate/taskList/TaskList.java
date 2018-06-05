package com.kodilla.hibernate.taskList;

import com.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLIST")
public class TaskList {
    int id;
    private String listName;
    private String description;
    private List<Task> tasks = new ArrayList<>();

    @OneToMany(targetEntity = Task.class,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "taskList")
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public TaskList() {
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
