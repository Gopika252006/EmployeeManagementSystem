package view;

import java.util.Scanner;

public class EmployeeView {

    Scanner sc = new Scanner(System.in);

    public void showMenu() {

        System.out.println("\n===== Employee Management =====");
        System.out.println("1. Add Employee");
        System.out.println("2. Display Employees");
        System.out.println("3. Search Employee");
        System.out.println("4. Update Salary");
        System.out.println("5. Delete Employee");
        System.out.println("6. Exit");
    }

    public int getChoice() {

        System.out.print("Enter Choice: ");
        return sc.nextInt();
    }

    public int getId() {

        System.out.print("Enter ID: ");
        return sc.nextInt();
    }

    public String getName() {

        sc.nextLine();

        System.out.print("Enter Name: ");
        return sc.nextLine();
    }

    public double getSalary() {

        System.out.print("Enter Salary: ");
        return sc.nextDouble();
    }
}