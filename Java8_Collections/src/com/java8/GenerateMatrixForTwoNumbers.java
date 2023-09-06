package com.java8;

import java.util.*;
class GenerateMatrixForTwoNumbers {
	public static void validArrangement(int M, int N)
	{
		// If N == 1 then the only
		// subarray possible is of length 1
		// therefore, the mean will
		// always be an integer

		if (N == 1) {
			for (int i = 1; i <= M; i++)
				System.out.println(i);
			return;
		}

		// If M is odd the valid
		// arrangement is not possible
		if (M % 2 == 1) {
			System.out.println(-1);
			return;
		}

		// Else print all the rows
		// such that all elements of each row
		// is either odd or even
		else {

			// Count for the rows
			for (int i = 1; i <= M; i++) {

				// Initialize num with i
				int num = i;

				// Count for the columns
				for (int j = 1; j <= N; j++) {
					System.out.print(num + " ");

					// As M is even,
					// even + even will give even
					// whereas odd + even gives odd
					num += M;
				}
				System.out.println();
			}
			return;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		int M = 2, N = 3;

		// Function call
		validArrangement(M, N);
	}
}



