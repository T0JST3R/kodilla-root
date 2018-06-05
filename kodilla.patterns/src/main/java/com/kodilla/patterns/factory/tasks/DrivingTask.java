package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Tasks {
    String name;
    String where;
    String using;

    @Override
    public String toString() {
        return "DrivingTask{" +
                "name='" + name + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                '}';
    }

    public DrivingTask(String name, String where, String using) {
        this.name = name;
        this.where = where;
        this.using = using;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public String getTaskName() {
        return name;
    }

    @Override
    public String executeTask() {
        return "Driving to " + where + " using " + using;
    }

    @Override
    public boolean isTaskExecuted() {
        if (using == null) {
            return false;
        } else
            return true;
    }
}
