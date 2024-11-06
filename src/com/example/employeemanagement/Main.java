package com.example.employeemanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        manager.addEmployee(new Employee(1,"Alice"));
        manager.addEmployee(new Employee(2,"Bob"));

        while(true){
            System.out.println("Choose an option : 1.Display , 2.Add , 3. Update , 4.Delete");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> manager.displayEmployees();
                case 2 -> {
                    System.out.println("Enter ID and Name : ");
                    int id = scanner.nextInt();
                    String name = scanner.next();
                    manager.addEmployee(new Employee(id,name));
                }
                case 3 -> {
                    System.out.println("Enter ID and new Name : ");
                    int id = scanner.nextInt();
                    String name = scanner.next();
                    manager.updateEmployee(id,name);
                }
                case 4 -> {
                    System.out.println("Enter ID to delete : ");
                    int id = scanner.nextInt();
                    manager.deleteEmployee(id);
                }
                default -> {
                    System.out.println("Invalid Choice");
                    return;
                }
            }
        }
    }
}
