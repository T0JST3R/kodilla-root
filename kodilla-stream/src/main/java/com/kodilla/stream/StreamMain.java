package com.kodilla.stream;


import com.kodilla.stream.com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.YEARS;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        List<ForumUser> users = new ArrayList<>();


        Map<Integer , ForumUser> userMap = forum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(s -> YEARS.between(s.getDateOfBirth() , LocalDate.now() ) >= 20 )
                .filter(s -> s.getPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueID , s -> s ));

        userMap.entrySet().stream()
                .forEach(System.out::println);



        //POEMBEAUTIFIER


        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemDecorator decorator = () -> System.out.println("text".toUpperCase());
        PoemDecorator decorator1 = () -> System.out.println("DwaRazyDwa".toLowerCase());
        PoemDecorator decorator2 = () -> System.out.println("      CzyPiencDwa     ".trim());
        PoemDecorator decorator3 = () -> System.out.println("Czy plus dwa = czterdziesci".substring(0 , 20) + "y");
        poemBeautifier.beautifier(decorator);
        poemBeautifier.beautifier(decorator1);
        poemBeautifier.beautifier(decorator2);
        poemBeautifier.beautifier(decorator3);


        //even generator

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);





    }
}
