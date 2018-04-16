package com.kodilla.testing.com.kodilla.testing.forum.mock;

import com.kodilla.testing.com.kodilla.testing.forum.statistics.Forum;
import com.kodilla.testing.com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumMock {
    @Test
    public void firstMockTest() {
        //Given

        Statistics forumMock = mock(Statistics.class);
        Forum forum = new Forum();
        List<String> users = new ArrayList<>();
        users.add("Maciek");
        users.add("Szymon");

        int posts = 0;
        int commentsCount = 0;
        when(forumMock.postsCount()).thenReturn(posts);
        when(forumMock.commentsCount()).thenReturn(commentsCount);
        when(forumMock.usersNames()).thenReturn(users);


        //When

        forum.calculateAdvStatistics(forumMock);


        //Then

        Assert.assertEquals(0, forum.getPosts());
        Assert.assertEquals(2, forum.getUsersCount());
        Assert.assertEquals(0, forum.getCommentsCount());
    }
    @Test
            public void secondTest(){
        //Given

        int posts = 1000;
        int commentsCount = 10000;
        Statistics forumMock = mock(Statistics.class);
        Forum forum = new Forum();
        List<String> users = new ArrayList<>();


        for (int i = 0; i <= 99; i++) {
            users.add("Maciej");
        }
            when(forumMock.postsCount()).thenReturn(posts);
            when(forumMock.commentsCount()).thenReturn(commentsCount);
            when(forumMock.usersNames()).thenReturn(users);

            // When

            forum.calculateAdvStatistics(forumMock);

            //Then


            Assert.assertEquals(1000, forum.getPosts(), 0);
            Assert.assertEquals(100, forum.getUsersCount(), 9);
            Assert.assertEquals(10000, forum.getCommentsCount(), 0);
            Assert.assertEquals(10 , forum.getAverageCommentsPerPost(), 0);
            Assert.assertEquals(100 , forum.getAverageCommentsPerUser(), 0);
            Assert.assertEquals(10 , forum.getAveragePostsPerUser(), 0);

        }

    @Test
    public void thirdTest(){
        //Given

        int posts = 1000;
        int commentsCount = 0;
        Statistics forumMock = mock(Statistics.class);
        Forum forum = new Forum();
        List<String> users = new ArrayList<>();




        when(forumMock.postsCount()).thenReturn(posts);
        when(forumMock.commentsCount()).thenReturn(commentsCount);
        when(forumMock.usersNames()).thenReturn(users);

        // When

        forum.calculateAdvStatistics(forumMock);

        //Then


        Assert.assertEquals(1000, forum.getPosts());
        Assert.assertEquals(0, forum.getUsersCount());
        Assert.assertEquals(0, forum.getCommentsCount());
    }


    }

