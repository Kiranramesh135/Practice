package com.practice.java.loops;

public class Temp {

    int length;
    int breadth;
    int height;

    Temp(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    Temp(int side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
    }

    void volume() {
        System.out.println("Volume = "+length*breadth*height);
    }
    public static void main(String[] args) {
        Temp b = new Temp(3,4,5);
        b.volume();

        Temp cube = new Temp(5);
        cube.volume();

    }
}

