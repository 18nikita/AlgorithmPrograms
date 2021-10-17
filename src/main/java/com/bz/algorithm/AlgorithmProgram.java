package com.bz.algorithm;

public class AlgorithmProgram {
	public static void main(String[] args) {
		// declare array
		int[] a = { 36, 19, 29, 12, 5 };

		int temp;   //to perform swapping
		// loop for no. of passes(n-1)
		for (int i = 0; i < a.length; i++) {

			// loop to check adjustant numbers
			for (int j = 0; j < a.length - 1 - i; j++) {

				// to compare adjustance no.
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		//To print array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
