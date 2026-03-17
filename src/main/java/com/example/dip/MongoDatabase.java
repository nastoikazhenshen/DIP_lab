package com.example.dip;

import java.util.ArrayList;
import java.util.List;

public class MongoDatabase implements Database {

    private final List<String> users = new ArrayList<>();

    @Override
    public void saveUser(String username) {
        System.out.println("User " + username + " saved to MongoDB");
    }
    @Override
    public List<String> getAllUsers() {

        return new ArrayList<>(users);
    }
}
