package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Tasks {
    String taskName;
    String whatToPaint;
    String color;

    public PaintingTask(String taskName, String whatToPaint, String color) {
        this.taskName = taskName;
        this.whatToPaint = whatToPaint;
        this.color = color;
    }

    @Override
    public String toString() {
        return "PaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "Painted " + whatToPaint + " In color" + color;
    }

    @Override
    public boolean isTaskExecuted() {
        if (color == "white") {
            return false;
        }
        else return true;
    }
}
