package com.kodilla.stream.portfolio;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private final String title;
    private final String description;
    private final User assignedUser;
    private final User Creator;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(String title, String description, User assignedUser, User creator, LocalDate created, LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.assignedUser = assignedUser;
        Creator = creator;
        this.created = created;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public User getCreator() {
        return Creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignedUser=" + assignedUser +
                ", Creator=" + Creator +
                ", created=" + created +
                ", deadline=" + deadline +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(title, task.title) &&
                Objects.equals(description, task.description) &&
                Objects.equals(assignedUser, task.assignedUser) &&
                Objects.equals(Creator, task.Creator) &&
                Objects.equals(created, task.created) &&
                Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, description, assignedUser, Creator, created, deadline);
    }
}
