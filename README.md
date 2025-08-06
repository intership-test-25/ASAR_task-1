# 💼 Employee Management System - OOPS in Java

This is a simple Java program that demonstrates the **4 pillars of Object-Oriented Programming (OOPS)** using a basic Employee Management System.

---

## 🚀 Features

- Uses an `Employee` interface to define abstract behavior
- Implements two employee types: `Developer` and `Manager`
- Inherits shared properties from a `Person` superclass
- Demonstrates abstraction, encapsulation, inheritance, and polymorphism

---

## 🧠 OOPS Concepts Demonstrated

| Pillar         | How it's used                                           |
|----------------|--------------------------------------------------------|
| **Abstraction**   | `Employee` interface hides implementation details        |
| **Encapsulation** | `Person` class uses private fields and public getters   |
| **Inheritance**   | `Developer` and `Manager` inherit from `Person`         |
| **Polymorphism**  | Interface references call overridden methods at runtime |

---

## 📂 Project Structure

```plaintext
Main.java          // Main class to run the application
README.md          // This file

## 📌 How to Run
Make sure you have Java installed.

javac Main.java
java Main
Expected Output:

Suresh is writing code.
Salary: $75000.0
Ramesh is managing the team.
Salary: $90000.0

## **📘 UML Class Diagram**


         <<interface>>
         Employee
         ---------------
         +work(): void
         +getSalary(): double
               ▲
               |
         ---------------
         |             |
    Developer      Manager
         ▲             ▲
         |             |
         ---------------
           Person
         ---------------
        -name: String
        -age: int
        ---------------
        +getName(): String
        +getAge(): int


**📄 License**
This project is open-source.

**🙋‍♂️ Author**
**A.Maity** Final Year B.Tech Student (Cyber Security)
The Neotia University
