package com.example.dip;

import java.util.List;

public interface Database {

    void saveUser(String username);

    List<String> getAllUsers();
}