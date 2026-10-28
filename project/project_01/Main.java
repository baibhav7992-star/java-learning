package project.project_01;

import java.util.Scanner;

class Book {
    int id;
    String name;
    boolean issued;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.issued = false;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b1 = new Book(101, "Java");
        Book b2 = new Book(102, "Python");
        Book b3 = new Book(103, "C++");

        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nID\tName\tStatus");

                    System.out.println(b1.id + "\t" + b1.name + "\t"
                            + (b1.issued ? "Issued" : "Available"));

                    System.out.println(b2.id + "\t" + b2.name + "\t"
                            + (b2.issued ? "Issued" : "Available"));

                    System.out.println(b3.id + "\t" + b3.name + "\t"
                            + (b3.issued ? "Issued" : "Available"));
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    int issueId = sc.nextInt();

                    if (issueId == b1.id && !b1.issued) {
                        b1.issued = true;
                        System.out.println("Book issued successfully!");
                    } else if (issueId == b2.id && !b2.issued) {
                        b2.issued = true;
                        System.out.println("Book issued successfully!");
                    } else if (issueId == b3.id && !b3.issued) {
                        b3.issued = true;
                        System.out.println("Book issued successfully!");
                    } else {
                        System.out.println("Book unavailable or invalid ID!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int returnId = sc.nextInt();

                    if (returnId == b1.id && b1.issued) {
                        b1.issued = false;
                        System.out.println("Book returned successfully!");
                    } else if (returnId == b2.id && b2.issued) {
                        b2.issued = false;
                        System.out.println("Book returned successfully!");
                    } else if (returnId == b3.id && b3.issued) {
                        b3.issued = false;
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Invalid ID or book not issued!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}



