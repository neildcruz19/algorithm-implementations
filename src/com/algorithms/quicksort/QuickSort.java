/**
 * 
 */
package com.algorithms.quicksort;

import java.util.Arrays;

/**
 * 
 * Implementation of the quick sort algorithm as explained in Algorithms
 * Unlocked
 * 
 * @author neildcruz
 *
 */
public class QuickSort {

	// Use an array as random as possible
	private static int[] A = { 44, 1, 33, 11, 25, 12, 13, 7, 99 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Array before sort : ");
		System.out.println(Arrays.toString(A));
	
		quickSort(A,0, A.length - 1);
		
		System.out.println("Array after sort : ");
		System.out.println(Arrays.toString(A));
	}

	public static void quickSort(int[] A, int p, int r) {

		// Base condition
		if (p >= r) {
			return;
		}

		int q = partition(A, p, r);
		quickSort(A, p, q - 1);
		quickSort(A, q + 1, r);
	}

	/**
	 * Partition method for quick sort
	 * 
	 * @param A
	 * @param p
	 * @param r
	 * @return
	 */
	private static int partition(int[] A, int p, int r) {
		int q = p;
		for (int u = p; u < r; u++) {
			if (A[u] <= A[r]) {
				int temp = A[q];
				A[q] = A[u];
				A[u] = temp;
				q++;
			}
		}
		int temp = A[q];
		A[q] = A[r];
		A[r] = temp;
		System.out.println(Arrays.toString(A));
		return q;
	}

}
