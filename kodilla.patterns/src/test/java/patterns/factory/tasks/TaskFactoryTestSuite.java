package patterns.factory.tasks;

import com.kodilla.patterns.factory.tasks.TaskFactory;
import com.kodilla.patterns.factory.tasks.Tasks;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks paintingTask = taskFactory.createTask(TaskFactory.PAINTINGTASK);
        //Then
        System.out.println(paintingTask);
    }
    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks drivingTask = taskFactory.createTask(TaskFactory.DRIVINGTASK);
        //Then
        System.out.println(drivingTask);
    }
    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks shoppingTask = taskFactory.createTask(TaskFactory.SHOPPINGTASK);
        //Then
        System.out.println(shoppingTask);
    }
}
