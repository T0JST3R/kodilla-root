package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String DRIVINGTASK = "Driving task";
    public final static String PAINTINGTASK = "Painting task";
    public final static String SHOPPINGTASK = "Shopping task";
    public Tasks createTask(String task){
        switch (task){
            case DRIVINGTASK:
                return new DrivingTask("Drive" , "Poland" , "Bus");
            case PAINTINGTASK:
                return new PaintingTask("Paint" , "Picture" , "Blue");
            case SHOPPINGTASK:
                return new ShoppingClass("Bananas" , "buyBananas" , 2.0);
                default: return null;
        }
    }
}
