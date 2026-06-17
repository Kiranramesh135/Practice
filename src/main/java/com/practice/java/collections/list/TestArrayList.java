package com.practice.java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	
	
	
	public static void main(String[]args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kiran");
		list.add("Shanta");
		list.add("Pavan");
		list.add("Kiran");
		
		for(String obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("===========================");
		
		//Traversing the list through iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
	}

}
