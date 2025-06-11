package com.practice.java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList3 {
	
	public static void main(String[]args) {
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Ravi"); 
		al1.add("Vijay");
		al1.add("Ajay");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		//Adding second list to the first list
		al1.addAll(al2);
		
		System.out.println("List size : "+al1.size());
		System.out.println(al1.contains("Ajay1"));
		System.out.println(al1.indexOf("Ravi"));
		
		Iterator<String> itr = al1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		al1.removeAll(al2);
		
		System.out.println("=====================");
		
		Iterator<String> itr1 = al1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
	}

}

