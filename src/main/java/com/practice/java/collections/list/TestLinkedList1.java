package com.practice.java.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList1 {
	
	
	
	public static void main(String[]args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Kiran");
		list.add("Shanta");
		list.add("Pavan");
		list.add("Kiran");
		list.iterator();
		
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
