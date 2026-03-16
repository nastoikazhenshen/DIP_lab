package com.example.dip;

public class MongoDatabase implements Database {

    @Override
    public void saveUser(String username) {
        System.out.println("User " + username + " saved to MongoDB");
    }
}
