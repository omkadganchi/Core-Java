package com.april2;

	import java.util.Scanner;

class menuDriven_TestStudent {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()

        // Creating an array of Student objects
        student[] db = new student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i+1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number for student " + (i+1) + ": ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // Consume newline left by nextInt()

            System.out.print("Enter marks for student " + (i+1) + ": ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // Consume newline left by nextInt()

            db[i] = new student(name, roll, marks);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to show database");
            System.out.println("Press 4 to exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left by nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter name for new student: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter roll number for new student: ");
                    int roll = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left by nextInt()

                    System.out.print("Enter marks for new student: ");
                    int marks = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left by nextInt()

                    // Add the new student to the database
                    student newStudent = new student(name, roll, marks);
                    // Expand array size
                    student[] newDB = new student[db.length + 1];
                    // Copy elements from old array to new array
                    System.arraycopy(db, 0, newDB, 0, db.length);
                    // Add new student to the end
                    newDB[db.length] = newStudent;
                    // Update reference
                    db = newDB;
                    break;
                case 2:
                    System.out.print("Enter index of student to delete: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left by nextInt()

                    // Check if index is valid
                    if (index >= 0 && index < db.length) {
                        // Create a new array to hold students without the one to be deleted
                        student[] tempDB = new student[db.length - 1];
                        // Copy elements from db to tempDB skipping the one to be deleted
                        System.arraycopy(db, 0, tempDB, 0, index);
                        System.arraycopy(db, index + 1, tempDB, index, db.length - index - 1);
                        // Update reference
                        db = tempDB;
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.println("Database:");
                    for (student student : db) {
                        System.out.println("Name: " + student.getName());
                        System.out.println("Roll: " + student.getRollNo());
                        System.out.println("Marks: " + student.getMarks());
                        System.out.println("Degree: " + student.getDegree());
                        System.out.println(); // Adding a newline for readability
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close(); // Closing scanner
    }
}

    