package view;

import java.util.Scanner;
import model.Employee;

public class EmployeeView {

    Scanner sc = new Scanner(System.in);

    public void showMenu() {

        System.out.println("\n===== Employee Management System =====");
        System.out.println("1. Add Employee");
        System.out.println("2. Display Employees");
        System.out.println("3. Search Employee");
        System.out.println("4. Remove Employee");
        System.out.println("5. Update Salary");
        System.out.println("6. Exit");
    }

    public int getChoice() {

        System.out.print("Enter Choice: ");
        return sc.nextInt();
    }

    public int getId() {

        System.out.print("Enter Employee ID: ");
        return sc.nextInt();
    }

    public String getName() {

        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        return sc.nextLine();
    }

    public double getSalary() {

        System.out.print("Enter Salary: ");
        return sc.nextDouble();
    }

    public void displayEmployees(Employee[] employees, int count) {

        System.out.println("\n----- Employee Records -----");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    employees[i].id + " | " +
                    employees[i].name + " | " +
                    employees[i].salary + " | " +
                    (employees[i].active ? "Active" : "Removed")
            );
        }
    }

    public void showMessage(String msg) {

        System.out.println(msg);
    }
}