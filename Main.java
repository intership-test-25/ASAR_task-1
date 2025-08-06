// Interface - Abstraction
interface Employee {
    public abstract void work();
    public abstract double getSalary();
}

// Base class - Encapsulation
class Person {
    private String name;  // Encapsulated field
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Derived class - Inheritance + Polymorphism
class Developer extends Person implements Employee {
    private double salary;

    public Developer(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing code.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

class Manager extends Person implements Employee {
    private double salary;

    public Manager(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the team.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer("Suresh", 28, 75000);
        Employee mgr = new Manager("Ramesh", 35, 90000);

        dev.work();  // Runtime polymorphism
        System.out.println("Salary: $" + dev.getSalary());

        mgr.work();  // Runtime polymorphism
        System.out.println("Salary: $" + mgr.getSalary());
    }
}
