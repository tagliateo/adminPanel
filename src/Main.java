
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        do {
            System.out.println("\n=== Student Record Management System === ");
            System.out.println("\n1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Edit Student");
            System.out.println("4. Find Student");
            System.out.println("5. List Students");
            System.out.println("6. Exit Program");
            System.out.println("\nEnter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.nextInt();
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("\nEnter Student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.println("\nEnter Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.println("\nEnter Student Age: ");
                    int studentAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("\nEnter Student Gender: ");
                    String studentGender = scanner.nextLine();
                    System.out.println("\nEnter Student Grade: ");
                    String studentGrade = scanner.nextLine();
                    StudentManagement.addStudent(studentID, studentName, studentAge, studentGender, studentGrade);
                    break;
                case 2:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    System.out.print("Enter new gender: ");
                    String newGender = scanner.nextLine();
                    System.out.print("Enter new grade: ");
                    String newGrade = scanner.nextLine();
                    StudentManagement.updateStudent(updateId, newName, newAge, newGender, newGrade);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    System.out.print("Enter student ID to delete: ");
                    String deleteName = scanner.nextLine();
                    System.out.print("Enter student ID to delete: ");
                    String deleteAge = scanner.nextLine();
                    System.out.print("Enter student ID to delete: ");
                    String deleteGender = scanner.nextLine();
                    System.out.print("Enter student ID to delete: ");
                    String deleteGrade = scanner.nextLine();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Enter student ID to find: ");
                    String findId = scanner.nextLine();
                    System.out.print("Enter student ID to find: ");
                    String findName = scanner.nextLine();
                    System.out.print("Enter student ID to find: ");
                    String findAge = scanner.nextLine();
                    System.out.print("Enter student ID to find: ");
                    String findGender = scanner.nextLine();
                    System.out.print("Enter student ID to find: ");
                    String findGrade = scanner.nextLine();
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Listing all students: ");
                    break;
                case 6:
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        } while (choice != 6); {
            scanner.close();
        }

    }





    class Student{
        String name;
        String id;
        int age;
        String gender;
        String grade;

//      Constructor
        public Student(String name, String id, String gender, String grade, int age) {
            this.name = name;
            this.id = id;
            this.gender = gender;
            this.grade = grade;
            this.age = age;
        }
    }

    class StudentManagement{
        static ArrayList<Student> students = new ArrayList<>();
        static int totalStudents = 0;

        static void addStudent(String name, String id, int age, String gender, String grade){
            Student newStudent = new Student(name, id, gender, grade, age);
            students.add(newStudent);
            totalStudents++;
            System.out.println("Student added successfully");
        }

        static void updateStudent(String name, String id, int age, String gender, String grade){
            for (Student student : students) {
                if (student.name.equals(name) && student.id.equals(id) && student.age == age) {
                    student.gender = gender;
                    student.grade = grade;
                    System.out.println("Student updated successfully");
                }
            }
        }

        static void showAllStudents(){
            for (Student student : students) {
                System.out.println(student);
            }
        }
        static void showStudent(String name){
            for (Student student : students) {
                if (student.name.equals(name)) {
                    System.out.println(student);
                    break;
                }
            }
            System.out.println("Error");
        }

        static void removeStudent(String id){
            for (Student student : students) {
                if (student.id.equals(id)) {
                    students.remove(student);
                    totalStudents--;
                    System.out.println("Student removed successfully");
                }
            }
        }

    }






}