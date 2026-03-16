# DIP Refactoring - User Management System

## What was wrong with the original design?
The original `UserService` class directly created and depended on the concrete `MySQLDatabase` class inside its constructor.  
This violated the **Dependency Inversion Principle (DIP)** because a high-level module (`UserService`) was tightly coupled to a low-level concrete implementation (`MySQLDatabase`).  
As a result, changing the database (to PostgreSQL, MongoDB, etc.) required modifying `UserService`, and unit testing was impossible without a real database connection.

## How the new design follows the Dependency Inversion Principle
1. Created an abstraction `Database` (interface).
2. `MySQLDatabase` and `MongoDatabase` now implement this interface.
3. `UserService` depends only on the `Database` abstraction, which is **injected through the constructor** (Constructor Injection).

Now the high-level module depends on an abstraction, not on concrete classes.  
Switching databases takes just 2 lines of code, and the system is fully testable with a `MockDatabase`.

## Result
The program works perfectly and produces the correct output:
