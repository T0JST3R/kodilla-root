package com.kodilla.patterns2.observer.forum.homework;

import com.kodilla.patterns2.observer.homework.*;
import org.junit.Assert;
import org.junit.Test;

public class TasksQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        CoursantTaskQueue task1 = new FirstCoursantQueue();
        CoursantTaskQueue task2 = new SecondTaskQueue();
        CoursantTaskQueue task3 = new ThirdTasksQueue();
        Mentor matuesz = new Mentor("Mateusz");
        Mentor kamil = new Mentor("Kamil");
        task1.registerObserwer(matuesz);
        task1.registerObserwer(kamil);
        task2.registerObserwer(matuesz);
        task3.registerObserwer(matuesz);
        task3.registerObserwer(kamil);
        //When
        task1.addTask("TASKONE!");
        task2.addTask("TASKTWO!");
        task3.addTask("TASKTHREE!");

        Assert.assertEquals(3 , matuesz.getUpdatesCounter());
        Assert.assertEquals(2 , kamil.getUpdatesCounter());
    }
}
