package com.practice.java.serialization;

import java.io.*;

public class DeSerializeExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

       FileInputStream fis = new FileInputStream("src/main/java/com/practice/java/serialization/student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        System.out.println(s.id+" "+s.name);
    }
}
