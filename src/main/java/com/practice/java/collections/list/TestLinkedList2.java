package com.practice.java.collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList2 {
	
	public static void main(String[]args) {
		
		//Creating user defined class object
		
		Student s1 = new Student(101, "Sonu", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumanth", 24);
		
		//Creating array list
		
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//Getting Iterator
//		Iterator<Student> itr = list.iterator();
		ListIterator<Student> itr = list.listIterator();
		
		while(itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st.rollNo+" "+st.name+" "+st.age);
		}
		
		
		while(itr.hasPrevious()) {
			Student st = itr.previous();
			System.out.println(st.rollNo+" "+st.name+" "+st.age);
			
		}
			
		
	}

}


	
