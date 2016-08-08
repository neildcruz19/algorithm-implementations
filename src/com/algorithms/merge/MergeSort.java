/**
 * 
 */
package com.algorithms.merge;

import java.util.Arrays;

/**
 * 
 * Implementation of the merge sort algorithm as explained
 * in Algorithms unlocked
 * 
 * 
 * This implementation does not use the sentinel approach to 
 * notify that one of the merge arrays has been exhausted
 * 
 * 
 * @author neildcruz
 *
 */
public class MergeSort {

	//Use an array as random as possible
	private static int[] A = {44, 1, 33, 11, 25, 99, 12, 13, 7 , 99 };
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Array before sort : ");
		System.out.println(Arrays.toString(A));
	
		mergeSort(A,0, A.length - 1);
		
		System.out.println("Array after sort : ");
		System.out.println(Arrays.toString(A));
	}
	
	
	public static void mergeSort(int[] A,int p,int r) {
		
		//Base case for recursion
		if(p >= r) {
			return;
		}
		
		//Find mid-point of array
		int q = (p + r)/2;
		
		//Recursive on left half
		mergeSort(A, p, q);
		
		//Recursive on right half
		mergeSort(A, q+1, r);
		
		//Merge results
		merge(A,p,q,r);
	}


	/**
	 * Merge part of the merge sort algorithm
	 * @param A
	 * @param p
	 * @param q
	 * @param r
	 */
	private static void merge(int[] A, int p, int q, int r) {
		
		//Left array element length
		int n1 = q - p + 1;
		
		//Right array element length
		int n2 = r - q;
		
		
		//Copy to temporary arrays B,C
		int[] B = new int[n1];
		int[] C = new int[n2];
		for(int i = 0; i < n1; i++)
			B[i] = A[p + i];
		for(int j = 0; j < n2; j++)
			C[j] = A[q + 1 + j];

		//Compare and merge back into original array
		int k = p;
		int i = 0;
		int j = 0;
		
		//Go over elements until one of the arrays has been exhausted
		while (i < n1 && j < n2) {
			if(B[i] <= C[j]) {
				A[k] = B[i];
				i++;
			} else {
				A[k] = C[j];
				j++;
			}
			k++;
		}
		
		
		//TODO: Important !!! - Only one of the loops below will run
		//since in the previous loop one of the arrays has been exhausted
		//But, at this point we do not know which one has been exhausted
		//so copy any elements left in either of the sub-arrays
		
		//Copy any remaining elements from the left array
		while (i < n1) {
			A[k] = B[i];
			i++;
			k++;
		}
		
		//Copy any remaining elements from the right array
		while (j < n2) {
			A[k] = C[j];
			j++;
			k++;
		}
	}

}
