package com.algortithms.recursion;

/**
 * Re-implementing the Linear search from {@link LinearSearch} or {@link BetterLinearSearch}
 * as a recursive problem 
 *
 * @author neildcruz
 *
 */
public class RecursiveLinearSearch {

	
	private static int[ ] A = {1,2,3,45,11,9,11,39};
	private static int x = 11;
	
	//Just saving the max index here instead of using the 
	// long A.length - 1 notation every where
	private static int n = A.length - 1;
	
	public static void main(String[] args) {
		
		//Start condition search whole array
		int answer = recursiveLinearSearch(A, 0);
		
		System.out.println("Answer : " + answer);
	}
	
	/**
	 * Same as the linear search algorithm but an additional parameter
	 * of startIndex(of the subproblem)
	 * 
	 * Here, it is not necessary to pass A as an argument as it can easily
	 * be accessed as a static member of the class, but, this is just for clarity
	 * 
	 * @param A
	 * @param i
	 * @return
	 */
	public static int recursiveLinearSearch(int[] A,int i) {
		
		//Base case condition if full array has been scanned or x has been found
		// then return the answer without recursion
		if(i > n) {
			return -1;
		}else if(A[i] == x) {
			return i;
		}
		
		return recursiveLinearSearch(A, i+1);
	}
	
}
