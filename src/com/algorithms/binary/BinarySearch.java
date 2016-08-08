/**
 * 
 */
package com.algorithms.binary;

/**
 * This class implements the binary search algorithm
 * 
 * This assumes that the array/collection is already sorted
 * 
 * @author neildcruz
 *
 */
public class BinarySearch {

	
	private static int[] A = {1,2,3,4,5,6,7,11,12,13,14,15};
	private static int x = 14;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int answer = binarySearch();
		
		System.out.println("Answer : " + answer);
	}
	
	
	public static int binarySearch() {
		
		int p = 0;
		int r = A.length - 1;
		
		while(p<=r) {
			
			//Find the midpoint 
			//Using integer division to drop fractional values
			int q = (p + r)/2;
			
			if(A[q] == x) {
				return q;
			} else if (A[q] > x) {
				//Check sub-array to the left of the sub array 
				// being tested
				r = q - 1;
			} else {
				//Check sub-array to the right of the sub array 
				// being tested
				p = q + 1;
			}
		}
		
		// Invalid index to indicate that the element is not found
		// in the array
		return -1;
	}

}
