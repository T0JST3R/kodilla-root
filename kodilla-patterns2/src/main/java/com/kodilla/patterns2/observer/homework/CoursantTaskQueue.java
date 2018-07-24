package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class CoursantTaskQueue implements Observable {
    private final String name;
    private List<Observer> observers;
    private List<String> tasks;

    public CoursantTaskQueue(String name) {
        this.name = name;
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);

        }
    }

    @Override
    public void registerObserwer(Observer observer) {
        observers.add(observer);
    }

    public void addTask(String string) {
        tasks.add(string);
        notifyObservers();
    }
}
