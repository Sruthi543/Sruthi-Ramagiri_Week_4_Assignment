import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    String name;
    int age;
    String department;

    Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}

public class EmployeeManager {
    Map<Integer, Employee> employees = new HashMap<>();

    void addEmployee(int id, String name, int age, String department) {
        Employee employee = new Employee(name, age, department);
        employees.put(id, employee);
    }

    Employee getEmployee(int id) {
        return employees.get(id);
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter department: ");
                    String department = scanner.next();
                    manager.addEmployee(id, name, age, department);
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int getID = scanner.nextInt();
                    Employee employee = manager.getEmployee(getID);
                    if (employee != null) {
                        System.out.println("Name: " + employee.name + ", Age: " + employee.age + ", Department: " + employee.department);
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

