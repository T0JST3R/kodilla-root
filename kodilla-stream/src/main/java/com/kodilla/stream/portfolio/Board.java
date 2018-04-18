package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Board {
    private final String name;
    private final List<TaskList> taskLists = new ArrayList<>();

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
     }

     public void addTaskList(TaskList taskList){

        taskLists.add(taskList);
     }

     public void removeTaskList(TaskList taskList){

        taskLists.remove(taskList);
     }

    @Override
    public String toString() {
        return "Board{" +
                "name='" + name + '\'' +
                ", taskLists=" + taskLists +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(name, board.name) &&
                Objects.equals(taskLists, board.taskLists);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, taskLists);
    }
}
