package com.algorithms.binary;

/**
 * This class is an extension of {@link BinarySearch}
 * using recursion instead of loops to solve the problem
 * 
 * @author neildcruz
 *
 */
public class RecursiveBinarySearch {

	
	private static int[] A = {1,2,3,4,5,6,7,11,12,13,14,15};
	private static int x = 14;
	
	public static void main(String[] args) {
		
		//Start recursion with entire array
		int answer = recursiveBinarySearch(0, A.length - 1);
		
		System.out.println("Answer : " + answer);
		
	}
	
	public static int recursiveBinarySearch(int p, int r) {
		
		//Base case return not found
		if (p > r) {
			return -1;
		}
		
		//Find mid-point of array
		int q = (p + r)/2;
		
		//If found then return the index
		if (A[q] == x) {
			return q;
		} else if (A[q] > x) {
			//Recursive left sub-array
			return recursiveBinarySearch(p, q - 1);
		} else {
			//Recursive right sub-array
			return recursiveBinarySearch(q + 1, r);
		}
		
	}
	
}
