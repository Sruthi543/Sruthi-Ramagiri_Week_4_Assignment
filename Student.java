import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(String name, int age) {
        Student student = new Student(name, age);
        students.add(student);
    }

    void removeStudent(String name) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                students.remove(student);
                break;
            }
        }
    }

    void displayStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    manager.addStudent(name, age);
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String removeName = scanner.next();
                    manager.removeStudent(removeName);
                    break;
                case 3:
                    manager.displayStudents();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}