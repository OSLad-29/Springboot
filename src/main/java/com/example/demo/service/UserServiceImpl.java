package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final FakeRepo fakeRepo;

    @Autowired
    public UserServiceImpl(FakeRepo fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public String addUser(String name, String surname) {
        long id = (long) (Math.random() * 1000);
        fakeRepo.insertUser(id, name, surname);
        return name + " added";
    }

    @Override
    public String removeUser(long id) {
        String name = fakeRepo.deleteUser(id);
        return name != null ? name + " removed" : "User not found";
    }

    @Override
    public String getUser(long id) {
        String name = fakeRepo.findUserById(id);
        return name != null ? "hello " + name : "User not found";
    }
}