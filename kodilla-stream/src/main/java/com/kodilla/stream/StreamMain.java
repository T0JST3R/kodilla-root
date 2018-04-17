package com.kodilla.stream;


import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.com.kodilla.stream.person.People;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        List<ForumUser> users = new ArrayList<>();


        Map<Integer , ForumUser> userMap = forum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(s -> s.getDateOfBirth().getDayOfYear() < 1998)
                .filter(s -> s.getPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueID , s -> s ));

        userMap.entrySet().stream()
                .forEach(System.out::println);







    }
}
