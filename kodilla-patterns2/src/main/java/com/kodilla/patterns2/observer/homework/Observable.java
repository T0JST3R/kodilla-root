package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserwer(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();
}
