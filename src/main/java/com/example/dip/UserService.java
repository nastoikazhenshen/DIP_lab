package com.example.dip;

/**
 * High-level module.
 * According to DIP it depends on abstraction (Database),
 * not on concrete class like MySQLDatabase.
 * Database is injected through constructor.
 */
public class UserService {

    private final Database database;

    /**
     * Constructor Injection — this is the key to DIP.
     * We do NOT create database inside UserService anymore.
     */
    public UserService(Database database) {
        this.database = database;
    }

    /**
     * Registers a new user.
     * Now it works with ANY database that implements Database interface.
     */
    public void registerUser(String username) {
        database.saveUser(username);
    }
}