package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Tasks {
    private String whatToBuy;
    private String taskName;
    private double quantity;

    ShoppingTask(String whatToBuy, String taskName, double quantity) {
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
    public void executeTask() {
        System.out.println("buing " + whatToBuy + " in quantity " + quantity);
    }

    @Override
    public boolean isTaskExecuted() {
        return quantity > 20;

    }
}
