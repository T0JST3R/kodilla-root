package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String name;
    private int updatesCounter;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(CoursantTaskQueue coursantTaskQueue) {
        System.out.println("Tasks queue: " + coursantTaskQueue.getName() + " has been updated! " + name + " total tasks to check: " + coursantTaskQueue.getTasks().size());
        updatesCounter++;
    }

    public String getName() {
        return name;
    }

    public int getUpdatesCounter() {
        return updatesCounter;
    }
}
