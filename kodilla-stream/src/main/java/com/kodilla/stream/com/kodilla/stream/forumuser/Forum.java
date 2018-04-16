package com.kodilla.stream.com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public  class Forum {
    List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1 , "Waldemar", 'M' , 13 , 12 , 1995 ,4));
        userList.add(new ForumUser(2, "Krzysztof", 'M' , 1 ,12, 1990 , 4));
        userList.add(new ForumUser(3 , "Maciej" , 'M', 21 , 11 , 1993, 0));
        userList.add(new ForumUser(3 , "Ewa" , 'F', 25 , 11 , 1986 , 100));
        userList.add(new ForumUser(3 , "Natalia" , 'F', 27 , 11 , 1974 , 20));
    }

    public List<ForumUser> getUserList(){
        ArrayList<ForumUser> list = new ArrayList<>(userList);
        return list;
    }
}
