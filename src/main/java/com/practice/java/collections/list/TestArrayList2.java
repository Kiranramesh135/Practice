package com.practice.java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {
	
	public static void main(String[]args) {
		
		//Creating user defined class object
		
		Student s1 = new Student(101, "Sonu", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumanth", 24);
		
		//Creating array list
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//Getting Iterator
		Iterator<Student> itr = list.iterator();
		
		while(itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st.rollNo+" "+st.name+" "+st.age);
		}
		
	}

}

class Student {
	
	int rollNo;
	String name;
	int age;
	
	Student(int rollNo, String name, int age) {
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
	
}
