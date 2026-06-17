package com.practice.java.oldquestions;

public class BubbleSort {

	// We can create a java program to sort array elements using bubble sort.
	// Bubble sort algorithm is known as the simplest sorting algorithm.

	// In bubble sort algorithm, array is traversed from first element to last
	// element. Here, current element is compared with the next element. If
	// current element is greater than the next element, it is swapped.

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 6, 4, 2 };
		int[] sorted = bubbleSort(arr);

		for (int a : sorted) {
			System.out.print(a + " ");
		}

	}

	public static int[] bubbleSort(int[] arr) {

		int n = arr.length;
		int temp;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

		return arr;
	}

}
