package com.kodilla.spring.portfolio;

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

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getDoneList().tasks.add("Task1");
        board.getInProgressList().tasks.add("Task2");
        board.getToDoList().tasks.add("Task3");
//        Arrays.stream(board.getDoneList().tasks.toArray())
//                .forEach(System.out::println);
//        Arrays.stream(board.getInProgressList().tasks.toArray())
//                .forEach(System.out::println);

        board.getToDoList().tasks.forEach(System.out::println);
        board.getToDoList().tasks.forEach(System.out::println);
        board.getToDoList().tasks.forEach(System.out::println);


    }
}
