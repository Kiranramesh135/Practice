package com.practice.java.newquestions;

public class Animal  {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }

    void walk() {
        System.out.print(" Cat walks");
    }

    public static void main(String[] args) {
        Animal a = new Cat();
//        a.walk();
    }
}

