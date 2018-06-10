package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {

        // Given

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getDoneList().getTasks().add("Task1");
        board.getInProgressList().getTasks().add("Task2");
        board.getToDoList().getTasks().add("Task3");
//        Arrays.stream(board.getDoneList().tasks.toArray())
//                .forEach(System.out::println);
//        Arrays.stream(board.getInProgressList().tasks.toArray())
//                .forEach(System.out::println);
        //Then
        board.getToDoList().getTasks().forEach(System.out::println);
        Assert.assertEquals(2 , board.getToDoList().getTasks().size());






    }
}
