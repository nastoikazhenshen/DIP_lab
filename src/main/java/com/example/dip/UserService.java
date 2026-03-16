package com.example.dip;

public class UserService {

    private final Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void registerUser(String username) {
        database.saveUser(username);
    }
}