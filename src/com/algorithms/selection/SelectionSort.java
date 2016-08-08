package com.algorithms.selection;

import java.util.Arrays;

/**
 * This is an implementation of the Selection
 * Sort algorithm as explained in Algorithms Unlocked
 *
 * @author neildcruz
 *
 */
public class SelectionSort {

	
	//Use an array as random as possible
	private static int[] A = {44, 1, 33, 11, 25, 12, 13, 7 , 99 };
	
	
	public static void main(String[] args) {
		
		//Call the selection sort procedure
		System.out.println("Array before sort : ");
		System.out.println(Arrays.toString(A));
		selectionSort();
		System.out.println("Array after sort : ");
		System.out.println(Arrays.toString(A));
		
	}
	
	
	public static void selectionSort() {
		
		// TODO: Important!! Here we do not need to loop to the 
		// last element in the array but only the second last, since,
		// If, n -1 elements are in sorted order then the last element is
		// automatically in the sorted order
		for (int i = 0; i < A.length - 1; i ++) {
			
			// Set smallest index to the first element in 
			// the sub array
			int smallest = i;
			
			
			// Set j to look for elements from the next element from i
			for (int j = i + 1; j < A.length; j++) {
				//If A[j] is smaller than A[smallest]
				// then set j as the smallest index
				if(A[j] < A[smallest]) {
					smallest = j;
				}
			}
			
			// After the iterating over the sub-array,
			// we have the smallest index for the sub-array
			// Now, swap A[i] with A[smallest]
			// Using a temp variable to perform the swap
			int temp = A[i];
			A[i] = A[smallest];
			A[smallest] = temp;
		}
		
	}
	
	
}
