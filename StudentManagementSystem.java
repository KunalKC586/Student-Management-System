import java.util.HashMap;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private int age;
    private String course;

    public Student(String id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student ID: " + id +
               "\nName: " + name +
               "\nAge: " + age +
               "\nCourse: " + course;
    }
}

public class StudentManagementSystem {

    private static HashMap<String, Student> studentRecords = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Remove Student");
            System.out.println("4. View Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    viewStudent();
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        scanner.nextLine();
        String id = scanner.nextLine();

        if (studentRecords.containsKey(id)) {
            System.out.println("Error: A student with this ID already exists.");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, age, course);
        studentRecords.put(id, student);
        System.out.println("Student added successfully!");
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        scanner.nextLine();
        String id = scanner.nextLine();

        if (!studentRecords.containsKey(id)) {
            System.out.println("Error: Student not found.");
            return;
        }

        Student student = studentRecords.get(id);

        System.out.print("Enter new name (leave blank to keep unchanged): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            student.setName(name);
        }

        System.out.print("Enter new age (enter -1 to keep unchanged): ");
        int age = scanner.nextInt();
        if (age != -1) {
            student.setAge(age);
        }
        scanner.nextLine();

        System.out.print("Enter new course (leave blank to keep unchanged): ");
        String course = scanner.nextLine();
        if (!course.isEmpty()) {
            student.setCourse(course);
        }

        System.out.println("Student updated successfully!");
    }

    private static void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        scanner.nextLine();
        String id = scanner.nextLine();

        if (studentRecords.remove(id) != null) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Error: Student not found.");
        }
    }

    private static void viewStudent() {
        System.out.print("Enter Student ID to view: ");
        scanner.nextLine();
        String id = scanner.nextLine();

        Student student = studentRecords.get(id);
        if (student != null) {
            System.out.println("\n" + student);
        } else {
            System.out.println("Error: Student not found.");
        }
    }
}
