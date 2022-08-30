package com.example;

public class Student {

    String name;
    int rollNumber;
    String address;

    public Student(String name, int rollNumber, String address){

        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;

    }

    public void display(){
        System.out.println("name = " + name);
        System.out.println("rollnumber = " + rollNumber);
        System.out.println("address = " + address);
    }
}
