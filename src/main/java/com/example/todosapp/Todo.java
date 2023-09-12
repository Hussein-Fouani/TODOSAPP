package com.example.todosapp;

import java.time.LocalDate;

public class Todo {

    private long id;
    private String userName;
    private String password;
    private LocalDate localDate;
    private boolean done;

    public Todo(long id, String userName, String password, LocalDate localDate, boolean done) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.localDate = localDate;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", localDate=" + localDate +
                ", done=" + done +
                '}';
    }
}
