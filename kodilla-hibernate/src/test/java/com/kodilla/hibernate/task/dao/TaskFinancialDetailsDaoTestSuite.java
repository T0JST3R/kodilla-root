package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {
    @Autowired
    TaskFinancialDetailsDao taskFinancialDetailsDao;
    @Test
    public void testFinbByPaid(){
        //Given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal("1231") , false);
        //When
        taskFinancialDetailsDao.save(taskFinancialDetails);
        List<TaskFinancialDetails> list = taskFinancialDetailsDao.findByPaid(false);

        //Then
        Assert.assertEquals(1 , list.size());

        //CleanUp

        taskFinancialDetailsDao.delete(list.get(0).getId());
    }

}
