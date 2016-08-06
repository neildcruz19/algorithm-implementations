/**
 * 
 */
package com.algorithms.linear;

import com.algorithms.utils.Timer;

/**
 * This is a simple implementation of the Sentinel Search Algorithm
 * as explained in Algorithms Unlocked
 * 
 * 
 * @author neildcruz
 *
 */
public class SentinelSearch {

	//Input array - hard-coded for simplicity
	private static int[ ]  A = {1,2,3,45,11,9,11,39};
	
	//The element to be found in the array
	private static int x = 11;
	
	private static Timer timer = new Timer();
	
	
	public static void main(String[] args) {
		
		timer.start();
		
		int answer = sentinelSearch();
		
		timer.stop();
		timer.getTimeNano();
		
		System.out.println("Answer : " + answer);
	}
	
	public static int sentinelSearch() {
		
		//Save last element in a variable
		int last = A[A.length - 1];
		
		//Replace last element in array with the sentinel
		A[A.length - 1] = x;
		
		int i = 0;
		while(A[i] != x) {
			i++;
		}
		
		//Replace the sentinel with actual last element
		A[A.length - 1] = last;
		
		//If i < last index --> element was found before we reached
		// the sentinel
		//Border condition :
		// --> check if x was the last element which was
		// replaced by the sentinel
		if(i < (A.length -1) || A[A.length - 1] == x) {
			return i;
		}
		
		// Set the answer to NOT-FOUND
		// In this case setting it to -1 which 
		// is an invalid index location and
		// can be used to signify NOT-FOUND
		return -1;
	}
}
