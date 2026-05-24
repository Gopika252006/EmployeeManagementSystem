package model;

public class Employee {

    public int id;
    public String name;
    public double salary;
    public boolean active;

    public Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.active = true;
    }
}