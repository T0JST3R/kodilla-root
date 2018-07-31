package patterns.factory.tasks;

import com.kodilla.patterns.factory.tasks.PaintingTask;
import com.kodilla.patterns.factory.tasks.ShoppingTask;
import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        assertEquals("Paint", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());


    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        assertEquals("Drive", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        assertEquals("Buy bananas", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }
}
