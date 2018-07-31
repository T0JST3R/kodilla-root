package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String whatToBuy;
    private String taskName;
    private double quantity;
    private boolean isTaskExecuted = false;

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
         if (whatToBuy != null && quantity > 0 )
        System.out.println("buing " + whatToBuy + " in quantity " + quantity);
        isTaskExecuted = true;
     }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;

    }
}
