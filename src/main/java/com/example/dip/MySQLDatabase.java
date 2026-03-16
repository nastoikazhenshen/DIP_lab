package com.example.dip;

public class MySQLDatabase implements Database {

    @Override
    public void saveUser(String username) {
        // In real project this would connect to MySQL,
        // but for the task we just print
        System.out.println("User " + username + " saved to MySQL Database");
    }
}