package org.example.employees;

public class Employee {

    static int id;
    String name;
    int employeeId;
    String department;
    double salary;

    public Employee(String name, String department, double salary){

            id++;
            employeeId = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
    }





    public void display(){
        System.out.println("Id = " + id);
        System.out.println("name = " + name);
        System.out.println("employeeId = " + employeeId);
        System.out.println("department = " + department);
        System.out.println("Salary = " + salary);

    }
}
