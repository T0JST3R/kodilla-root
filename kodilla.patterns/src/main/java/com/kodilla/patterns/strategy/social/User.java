package com.kodilla.patterns.strategy.social;

public class User {
    String name;
    SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
    public String favouriteMedia(){
       return socialPublisher.share();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", socialPublisher=" + socialPublisher +
                '}';
    }
}
