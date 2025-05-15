package com.example.demo.model;

public class User {
    private long id;
    private String name;
    private String surname;

    public User(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return id;
    }
}