package com.example.dip;

import java.util.List;

public class UserService {

    private final Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void registerUser(String username) {
        database.saveUser(username);
    }

    public void printAllUsers() {
        List<String> users = database.getAllUsers();

        if (users.isEmpty()) {
            System.out.println("No users registered yet.");
            return;
        }

        System.out.println("Registered users (" + users.size() + "):");
        for (int i = 0; i < users.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + users.get(i));
        }
        System.out.println("---");
    }
}
