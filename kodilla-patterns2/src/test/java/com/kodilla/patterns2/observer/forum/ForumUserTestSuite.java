package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        // Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);

        //When
        javaHelpForum.addPost("Hello ! can u help me with for loop?");
        javaHelpForum.addPost("Better use while loop in this case");
        javaToolsForum.addPost("Help pls , my mySQL doesn't want to work!!!! :C");
        javaHelpForum.addPost("Why while? is it better?");
        javaToolsForum.addPost("When i try to log in i got 'bad credentials' message.");
        //Then

        assertEquals(3 , johnSmith.getUpdateCount());
        assertEquals(2 , ivoneEscobar.getUpdateCount());
        assertEquals(5 , jessiePinkman.getUpdateCount());
    }

}