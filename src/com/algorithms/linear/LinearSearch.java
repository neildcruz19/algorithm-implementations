/**
 * 
 */
package com.algorithms.linear;

import com.algorithms.utils.Timer;

/**
 * This class is a simple implementation of the linear search 
 * aglorithm as explained in Algorithms Unlocked
 * 
 * @author neildcruz
 *
 */
public class LinearSearch {
	
	
	private static int[ ] A = {1,2,3,45,11,9,11,39};
	private static int x = 11;
	private static Timer timer = new Timer();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Set the answer to NOT-FOUND
		// In this case setting it to -1 which 
		// is an invalid index location and
		// can be used to signify NOT-FOUND
		int answer = -1;
		
		timer.start();
		//Iterate through the array from left to right
		for (int i = 0; i < A.length; i++ ) {
			if(A[i] == x) {
				answer = i;
			}
		}
		timer.stop();
		timer.getTimeNano();
		System.out.println("Answer : " + answer);
	}

}
