/**
 * 
 */
package com.algorithms.linear;

import com.algorithms.utils.Timer;

/**
 * This class is a simple implementation of the better linear search 
 * Algorithm as explained in Algorithms Unlocked
 * 
 * This algorithm corrects the flaw of the the previous algorithm
 * where it continues searching even when the answer is found
 * 
 * @author neildcruz
 *
 */
public class BetterLinearSearch {
	
	
	private static int[ ] A = {1,2,3,45,11,9,11,39};
	private static int x = 11;
	private static Timer timer = new Timer();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		timer.start();
		
		int answer = betterLinearSearch();
		
		timer.stop();
		timer.getTimeNano();
		
		System.out.println("Answer : " + answer);
	}
	
	public static int betterLinearSearch() {
		
		//Iterate through the array from left to right
		for (int i = 0; i < A.length; i++ ) {
			if(A[i] == x) {
				return i;
			}
		}

		// Set the answer to NOT-FOUND
		// In this case setting it to -1 which 
		// is an invalid index location and
		// can be used to signify NOT-FOUND
		return -1;
	}

}
