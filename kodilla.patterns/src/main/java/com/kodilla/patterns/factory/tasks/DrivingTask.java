package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String name;
    private String where;
    private String using;
    private boolean isTaskExecuted = false;

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

        if (where != null && using != null) {
            System.out.println("Driving to " + where + " using " + using);

            isTaskExecuted = true;
        }
        else {
            System.out.println("Destination or vehicle not defined");
        }

    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
