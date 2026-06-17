package com.practice.java.oldquestions;

public class SelectionSort {

	// We can create a java program to sort array elements using selection sort.
	// In selection sort algorithm, we search for the lowest element and arrange
	// it to the proper location. We swap the current element with the next
	// lowest number.
	
	public static int[] selectionSort() {
		
		int[] n = {7,4,9,2,3,1};
		for(int i=0;i<n.length-1;i++) {
			int index=i;
			for(int j=i+1;j<n.length;j++) {
				if(n[j]<n[index]) {
					index=j;
				}
			}
			int smallestNum = n[index];
			n[index] = n[i];
			n[i] = smallestNum;
		}
		return n;
	}
	
	public static void main(String[]args) {
		int[] sorted = selectionSort();
		for(int a:sorted) {
			System.out.print(a+" ");
		}
	}

}
