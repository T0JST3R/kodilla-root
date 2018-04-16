package com.kodilla.testing.com.kodilla.testing.forum.statistics;

public class Forum {
     int usersCount;
     int posts;
     int commentsCount;
     double averagePostsPerUser;
     double averageCommentsPerUser;
     double averageCommentsPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPosts() {
        return posts;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {


        // Computing users count
        int usersCount = statistics.usersNames().size();
        this.usersCount = usersCount;

        //Computing posts count
        int postsCount = statistics.postsCount();
        this.posts = postsCount;

        // Computing comments count
        int commentsCount = statistics.commentsCount();
        this.commentsCount = commentsCount;



        //Computing average posts/user
        if (postsCount > 0 && usersCount > 0) {

                double postsPerUser = postsCount / usersCount;
                this.averagePostsPerUser = postsPerUser;

        }
        else {
            double postsPerUser = 0;
            this.averagePostsPerUser = postsPerUser;
        }

        // Computing average comments/user
        if (commentsCount > 0 && usersCount > 0 ) {
            double commentsPerUser = commentsCount / usersCount;
            this.averageCommentsPerUser = commentsPerUser;
        } else {
            double commentsPerUser = 0;
            this.averageCommentsPerUser = commentsPerUser;
        }



        //Computing comments/post

        if (commentsCount > 0 && postsCount > 0) {
            double commentsPerPost = commentsCount / postsCount;
            this.averageCommentsPerPost = commentsPerPost;
        }
        else {
            double commentsPerPost = 0;

            this.averageCommentsPerPost = commentsPerPost;
        }
    }

    public void showStatistics() {

        System.out.println("Srednia komentarzy na post to: " + this.averageCommentsPerPost);
        System.out.println("Srednia komentarzy na uzytkownika to: " + this.averageCommentsPerUser);
        System.out.println("Srednia postow na uzytkownika to : " + this.averagePostsPerUser);
        System.out.println("Liczba komentarzy to : " + this.commentsCount);
        System.out.println("Liczba postow to : " + this.posts);
        System.out.println("Liczba uzytkownikow to : " + this.usersCount);
    }
}
