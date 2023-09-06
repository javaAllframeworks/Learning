package com.java8.basicExamples;
import java.util.Arrays;
// Java program to print largest contiguous array sum
import java.io.*;
import java.util.*;

public class PossibleMaxArray {






	// Driver Code
	public static void main(String[] args)
	{
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		//int[] a ={-1,-2,5,-10};
		System.out.println("Maximum contiguous sum is "
				+ maxSubArraySum(a));
	}

	// Function Call
	static int maxSubArraySum(int a[])
	{
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE; 
		int max_ending_here	= 0;
		int[] finalArr= new int[size];
		int j=0;

		for (int i = 0; i < size; i++) {
			if(a[i] >= 0) {
				max_ending_here += a[i];				
				int jj=a[i];				
				finalArr[j] = jj;
				j=j+1;

			}
		}
		System.out.print("FinalArr..["+Arrays.toString(finalArr));

		return max_ending_here;
	}



}
