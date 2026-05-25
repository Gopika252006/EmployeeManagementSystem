package controller;

import model.Employee;

public class EmployeeController {

    Employee[] employees;
    int count;

    public EmployeeController(int size) {

        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(int id, String name, double salary) {

        employees[count++] = new Employee(id, name, salary);
    }

    public Employee[] getEmployees() {

        return employees;
    }

    public int getCount() {

        return count;
    }

   
    public Employee searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].id == id) {

                return employees[i];
            }
        }

        return null;
    }


    public String removeEmployee(int id) {

        Employee e = searchEmployee(id);

        if (e == null) {

            return "Employee Not Found";
        }

        e.active = false;

        return "Employee Removed Successfully";
    }

    public String updateSalary(int id, double newSalary) {

        Employee e = searchEmployee(id);

        if (e == null) {

            return "Employee Not Found";
        }

        e.salary = newSalary;

        return "Salary Updated Successfully";
    }
}