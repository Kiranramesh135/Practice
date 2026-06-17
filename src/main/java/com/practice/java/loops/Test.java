package com.practice.java.loops;
class A {


    void test1() {
        System.out.println("Test4()");
    }

}
class B extends A{

    void test1() {
        System.out.println("Test1()");
    }




}

public class Test {

    public static void main(String[] args) {
    A a = (A) new B();

    a.test1();
    }
}
