package patterns.factory.tasks;

import com.kodilla.patterns.factory.tasks.PaintingTask;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import com.kodilla.patterns.factory.tasks.Tasks;
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
        Tasks paintingTask = taskFactory.createTask(TaskFactory.PAINTINGTASK);
        //Then
        assertEquals("Paint", paintingTask.getTaskName());
        assertFalse(paintingTask.isTaskExecuted());


    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks drivingTask = taskFactory.createTask(TaskFactory.DRIVINGTASK);
        //Then
        assertEquals( "Drive" , drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks shoppingTask = taskFactory.createTask(TaskFactory.SHOPPINGTASK);
        //Then
        assertEquals( "Buy bananas" , shoppingTask.getTaskName());
        assertTrue( shoppingTask.isTaskExecuted());
    }
}
