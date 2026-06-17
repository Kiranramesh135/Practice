package com.practice.java.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {

    public static void main(String[] args) throws IOException {

        Student s = new Student(1,"Karan");

        FileOutputStream fos = new FileOutputStream("src/main/java/com/practice/java/serialization/student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);

        fos.close();
        oos.close();
    }
}
