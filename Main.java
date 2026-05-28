import controller.EmployeeController;
import model.Employee;
import view.EmployeeView;

public class Main {

    public static void main(String[] args) {

        EmployeeController controller = new EmployeeController();

        EmployeeView view = new EmployeeView();

        while (true) {

            view.showMenu();

            int choice = view.getChoice();

            switch (choice) {

                case 1:

                    int id = view.getId();
                    String name = view.getName();
                    double salary = view.getSalary();

                    Employee e = new Employee(id, name, salary);

                    controller.addEmployee(e);

                    break;

                case 2:

                    controller.displayEmployees();

                    break;

                case 3:

                    int searchId = view.getId();

                    controller.searchEmployee(searchId);

                    break;

                case 4:

                    int updateId = view.getId();
                    double newSalary = view.getSalary();

                    controller.updateSalary( updateId,newSalary);

                    break;

                case 5:

                    int deleteId = view.getId();

                    controller.deleteEmployee(deleteId);

                    break;

                case 6:

                    System.out.println("Exiting...");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}