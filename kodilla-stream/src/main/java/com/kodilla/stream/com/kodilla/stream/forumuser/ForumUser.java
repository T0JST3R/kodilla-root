package com.kodilla.stream.com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int uniqueID;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private  int postsQuantity;



    public ForumUser(int uniqueID, String username, char sex, int dayOfBirth , int monthOfBirth , int yearOfBirth , int postsQuantity) {
        this.uniqueID = uniqueID;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.postsQuantity = postsQuantity;

    }
    public int getUniqueID() {
        return uniqueID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueID=" + uniqueID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
