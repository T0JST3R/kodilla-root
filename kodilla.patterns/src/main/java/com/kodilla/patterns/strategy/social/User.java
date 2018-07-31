package com.kodilla.patterns.strategy.social;

public abstract class User {
    private String name;
    private SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", socialPublisher=" + socialPublisher +
                '}';
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
