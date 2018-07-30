package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Tasks {
    private String taskName;
    private String whatToPaint;
    private String color;

    PaintingTask(String taskName, String whatToPaint, String color) {
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
    public void executeTask() {
        System.out.println("Painted " + whatToPaint + " In color" + color);
    }

    @Override
    public boolean isTaskExecuted() {
        return color.equals("white");
    }

}




