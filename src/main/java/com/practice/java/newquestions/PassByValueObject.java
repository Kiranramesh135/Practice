package com.practice.java.newquestions;

class Employee {
    String name;
}

public class PassByValueObject {

    static void changeName(Employee emp) {
        emp.name = "John";

        System.out.println(emp.name);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Kiran";

        changeName(e);

        System.out.println(e.name);
    }
}