package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Bean
    public Board board(){
        return new Board(taskList1() , taskList2() , taskList3());
    }
    @Bean
    public TaskList taskList1(){
        TaskList taskList1 = new TaskList();
        taskList1.tasks.add("Task 1");
        return taskList1;
    }
    @Bean
    public TaskList taskList2(){
        return new TaskList();
    }
    @Bean
    public TaskList taskList3(){
        return new TaskList();
    }
}
