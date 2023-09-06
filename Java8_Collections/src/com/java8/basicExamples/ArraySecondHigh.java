package com.java8.basicExamples;

public class ArraySecondHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,1,0,5,22,8,55};
		System.out.println(findSecondHighest(arr));
		String s1 = "Java"; // "Java" String created in pool and reference assigned to s1

		String s2 = "Java"; //s2 also has the same reference to "Java" in the pool

		if(s1 == s2) {
			System.out.println("== equals");
		}
	}
	private static int findSecondHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}
}
