package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static String LISTNAME = "List1";
    private static String DESCRIPTION = "Description1";

    @Test
    public void testFindByListName() {
        //Given
        TaskList list = new TaskList(LISTNAME, DESCRIPTION);


        //When
        taskListDao.save(list);
        List<TaskList> listn1 = taskListDao.findByListName(LISTNAME);


        //Then
        Assert.assertEquals(1, listn1.size());

        //CleanUp

        taskListDao.delete(listn1.get(0));


    }

    @Test

    public void testTaskListDaoSaveWithTasks() {

        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some enties", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal("14"), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal("155"), false);
        task.setTaskFinancialDetails(tfd);
        task.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME , "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);


        //Given

        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then

        Assert.assertNotEquals(0 , id);

        //CleanUp

        taskListDao.delete(id);
    }


}
