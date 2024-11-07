package com.example.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void displayEmployees(){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }

    public void updateEmployee(int id, String newName){
        for(Employee employee : employees){
            if(employee.getId() == id){
                employee.setName(newName);
                return;
            }
        }
    }

    public void deleteEmployee(int id){
        employees.removeIf(employee -> employee.getId() == id);
    }

    // Search for an employee by ID
    public Employee searchEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null; // Return null if not found
    }
}
