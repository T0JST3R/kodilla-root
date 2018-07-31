package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String whatToPaint;
    private String color;
    private boolean isTaskExecuted = false;

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
        if (whatToPaint != null && color != null) {
            System.out.println("Painted " + whatToPaint + " In color" + color);
            isTaskExecuted = true;
        }
        else {
            System.out.println("What to paint or color not defined");
        }
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }

}




