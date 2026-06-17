package com.practice.java.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet1 {
	public static void main(String args[]){  
		  //Creating and adding elements  
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.iterator();
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
}
