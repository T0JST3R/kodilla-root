package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class ShoppingClass implements Tasks {
    String whatToBuy;
    String taskName;
    double quantity;

    public ShoppingClass(String whatToBuy, String taskName, double quantity) {
        this.whatToBuy = whatToBuy;
        this.taskName = taskName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ShoppingClass{" +
                "whatToBuy='" + whatToBuy + '\'' +
                ", taskName='" + taskName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "buing " + whatToBuy + " in quantity " + quantity;
    }

    @Override
    public boolean isTaskExecuted() {
        if (quantity > 20){
            return false;
        }
        else return true;

    }
}
