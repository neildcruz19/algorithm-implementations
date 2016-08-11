package com.algorithms.recursion;
/**
 * This example builds on the Factorial example in {@link Factorial}
 * 
 * This is an example of a bad recursive factorial even though the mathematics 
 * involved may be correct
 * 
 * n! = n*(n-1)*(n-2)*...2*1
 * 
 * Now multiplying both sides by (n+1)
 * 
 * 	(n+1)*n! = (n+1)*n*(n-1)*(n-2)*..2*1 --> (n+1)!
 * 
 *  Hence (n+1)*n! = (n+1)!
 * 
 *  n!= (n+1)!/(n+1)
 *  
 *  This will eventually lead to a stackoverflow B-) error
 * 
 * @author neildcruz
 *
 */
public class BadFactorial {

	private static int n = 6;
	
	public static void main(String[] args) {
		long answer = badFactorial(n);
		
		System.out.println(n + "! = " + answer);
	}
	
	public static long badFactorial(int n) {
		
		//Base case still the same
		if(n == 0) {
			return 1;
		}
		
		// The recursion in this case, does not lead to the base
		// case as n will keep increasing in each recursion and
		// will never reach the base case of 0
		return badFactorial(n+1)/(n+1);
	}
}
