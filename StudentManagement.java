import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String specialization;

    public Student(String name, int age, String specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getspecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", specialization: " + specialization;
    }
}

public class StudentManagement {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter student specialization:");
        String specialization = scanner.nextLine();

        Student student = new Student(name, age, specialization);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {

            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}