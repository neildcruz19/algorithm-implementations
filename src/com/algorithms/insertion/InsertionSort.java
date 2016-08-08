package com.algorithms.insertion;

import java.util.Arrays;

/***
 * Implementation of the insertion sort algorithm
 * 
 * @author neildcruz
 *
 */
public class InsertionSort {
	
	//Use an array as random as possible
	private static int[] A = {44, 1, 33, 11, 25, 12, 13, 7 , 99 };
	
	
	public static void main(String[] args) {
		System.out.println("Array before sort : ");
		System.out.println(Arrays.toString(A));
	
		insertionSort();
		
		System.out.println("Array after sort : ");
		System.out.println(Arrays.toString(A));
	}
	
	/**
	 * 
	 */
	public static void insertionSort() {
		
		//Check from second element to last element
		for(int i=1;i < A.length ; i++) {
			
			//The key to be inserted into the sorted array
			int key = A[i];
			
			//Sub-array
			int j = i - 1;
			while(j >= 0 && A[j] > key) {
				//Shift elements to the right until
				//the right spot is found to insert the key
				A[j+1] = A[j];
				j--;
			}
			
			//Insert the key in the correct position
			A[j + 1] = key;
		}
	}
}
