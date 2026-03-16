package com.example.dip;

public class Main {
    public static void main(String[] args) {

        Database mysqlDb = new MySQLDatabase();
        UserService service1 = new UserService(mysqlDb);
        service1.registerUser("Alice");

        Database mongoDb = new MongoDatabase();
        UserService service2 = new UserService(mongoDb);
        service2.registerUser("Bob");

        Database mock = new MockDatabase();
        UserService service = new UserService(mock);
        service.registerUser("TestUser");

        System.out.println("\nRefactoring completed successfully!");
    }
}