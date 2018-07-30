package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Tasks {
    private String name;
    private String where;
    private String using;

    @Override
    public String toString() {
        return "DrivingTask{" +
                "name='" + name + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                '}';
    }

    DrivingTask(String name, String where, String using) {
        this.name = name;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return name;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving to " + where + " using " + using);
    }

    @Override
    public boolean isTaskExecuted() {
        return null == using;
    }
}
