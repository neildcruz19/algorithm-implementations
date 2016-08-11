package com.algorithms.recursion;

/**
 * Factorial implementation using recursion
 * 
 * To solve a problem using recursion, 2 properties must hold
 * 1. There must be a base case where the solution can be obtained without
 * 	  recursion
 * 2. Each recursive call must be a smaller subset of the same problem leading
 *    towards the base case
 *    
 *  Problem : n!
 *  
 *  Now n! = n*(n-1)*(n-2)*(n-3)....2*1
 *  (n-1)! = (n-1)*(n-2)*(n-3)*....2*1
 *  
 *  I.E n! = n*(n-1)!
 *  
 *  So on n! = n*(n-1)*(n-2)!
 *  
 *  Base case: 0! = 1
 *  
 * 
 * @author neildcruz
 *
 */
public class Factorial {
	
	private static int n = 6;

	public static void main(String[] args) {
		long answer = factorial(n);
		
		System.out.println(n + "! = " + answer);
	}
	
	public static int factorial(int n) {
		
		//Base case
		if(n == 0) {
			return 1;
		}
		
		//Recursive break down of the problem
		return n*factorial(n-1);
	}
	
}
