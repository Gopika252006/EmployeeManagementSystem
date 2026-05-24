import controller.EmployeeController;
import view.EmployeeView;
import model.Employee;

public class Main {

    public static void main(String[] args) {

        EmployeeController controller = new EmployeeController(10);
        EmployeeView view = new EmployeeView();

        while (true) {

            view.showMenu();

            int choice = view.getChoice();

            switch (choice) {

                case 1:

                    int id = view.getId();
                    String name = view.getName();
                    double salary = view.getSalary();

                    controller.addEmployee(id, name, salary);

                    view.showMessage("Employee Added Successfully");

                    break;

                case 2:

                    view.displayEmployees(
                            controller.getEmployees(),
                            controller.getCount()
                    );

                    break;

                case 3:

                    int searchId = view.getId();

                    Employee e = controller.searchEmployee(searchId);

                    if (e != null) {

                        view.showMessage(
                                e.id + " | " +
                                e.name + " | " +
                                e.salary
                        );
                    }
                    else {

                        view.showMessage("Employee Not Found");
                    }

                    break;

                case 4:

                    int removeId = view.getId();

                    view.showMessage(
                            controller.removeEmployee(removeId)
                    );

                    break;

                case 5:

                    int updateId = view.getId();
                    double newSalary = view.getSalary();

                    view.showMessage(
                            controller.updateSalary(updateId, newSalary)
                    );

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