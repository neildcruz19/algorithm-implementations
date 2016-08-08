/**
 * 
 */
package com.algorithms.merge;

import java.util.Arrays;

/**
 * Extension of the merge sort algorithm in {@link MergeSort}
 * using {@link Integer.MAX_VALUE} as the sentinel
 * 
 * This the additional copying of left over elements can be done
 * away with
 * 
 * 
 * @author neildcruz
 *
 */
public class SentinelMergeSort {

	//Use an array as random as possible
	private static int[] A = {44, 1, 33, 11, 25, 99, 12, 13, 7 , 99 };
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Array before sort : ");
		System.out.println(Arrays.toString(A));
	
		sentinelMergeSort(A,0, A.length - 1);
		
		System.out.println("Array after sort : ");
		System.out.println(Arrays.toString(A));
	}
	
	
	public static void sentinelMergeSort(int[] A,int p,int r) {
		
		//Base case for recursion
		if(p >= r) {
			return;
		}
		
		//Find mid-point of array
		int q = (p + r)/2;
		
		//Recursive on left half
		sentinelMergeSort(A, p, q);
		
		//Recursive on right half
		sentinelMergeSort(A, q+1, r);
		
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
		int[] B = new int[n1 + 1];
		int[] C = new int[n2 + 1];
		for(int i = 0; i < n1; i++)
			B[i] = A[p + i];
		for(int j = 0; j < n2; j++)
			C[j] = A[q + 1 + j];
		
		//Set the sentinel at the end
		B[n1] = Integer.MAX_VALUE;
		C[n2] = Integer.MAX_VALUE;

		//Compare and merge back into original array
		int i = 0;
		int j = 0;
		
		//Go over elements until one of the arrays has been exhausted
		for(int k = p ; k <= r ; k++) {
			if(B[i] <= C[j]) {
				A[k] = B[i];
				i++;
			} else {
				A[k] = C[j];
				j++;
			}
		}
	}
}
