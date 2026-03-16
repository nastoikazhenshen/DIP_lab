package com.example.dip;

/**
 * Concrete implementation for MongoDB.
 * Also implements the same Database interface.
 */
public class MongoDatabase implements Database {

    @Override
    public void saveUser(String username) {
        System.out.println("User " + username + " saved to MongoDB");
    }
}
