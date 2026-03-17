package com.example.dip;

import java.util.ArrayList;
import java.util.List;

public class MySQLDatabase implements Database {

    private final List<String> users = new ArrayList<>();

    @Override
    public void saveUser(String username) {
        users.add(username);
        System.out.println("User " + username + " saved to MySQL Database");
    }

    @Override
    public List<String> getAllUsers() {
        return new ArrayList<>(users);
    }
}