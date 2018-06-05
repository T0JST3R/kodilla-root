package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class TaskList {
    private final List<Task> tasks = new ArrayList<>();
    String name;

    public TaskList(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskList taskList = (TaskList) o;
        return
                Objects.equals(tasks, taskList.tasks) &&
                Objects.equals(name, taskList.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tasks, name);
    }

    public void addTask(Task task){

        tasks.add(task);
    }

    public void removeTask(Task task){

        tasks.remove(task);
    }
}
