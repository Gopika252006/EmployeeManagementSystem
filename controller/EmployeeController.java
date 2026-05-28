package controller;

import db.DBConnection;
import model.Employee;

import java.sql.*;

public class EmployeeController {

    Connection con = DBConnection.getConnection();

    public void addEmployee(Employee e) {

        try {

            String query = "INSERT INTO employee VALUES (?, ?, ?)";

            PreparedStatement ps =con.prepareStatement(query);

            ps.setInt(1, e.id);
            ps.setString(2, e.name);
            ps.setDouble(3, e.salary);

            ps.executeUpdate();

            System.out.println("Employee Added Successfully");

        } catch (Exception ex) {

            System.out.println(ex);
        }
    }

    public void displayEmployees() {

        try {

            Statement st = con.createStatement();

            ResultSet rs =  st.executeQuery("SELECT * FROM employee");

            System.out.println("\nEmployee Records");

            while (rs.next()) {

                System.out.println(rs.getInt(1) + " | " +rs.getString(2) + " | " +rs.getDouble(3));
            }

        } catch (Exception e) {

            System.out.println(e);
        }
    }

   
    public void searchEmployee(int id) {

        try {

            String query =  "SELECT * FROM employee WHERE id=?";

            PreparedStatement ps =con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println( rs.getInt(1) + " | " +rs.getString(2) + " | " + rs.getDouble(3));
            }
            else {

                System.out.println("Employee Not Found");
            }

        } catch (Exception e) {

            System.out.println(e);
        }
    }

  
    public void updateSalary(int id, double salary) {

        try {

            String query = "UPDATE employee SET salary=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Salary Updated");
            else
                System.out.println("Employee Not Found");

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public void deleteEmployee(int id) {

        try {

            String query = "DELETE FROM employee WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Employee Deleted");
            else
                System.out.println("Employee Not Found");

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}