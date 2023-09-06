package com.java8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TargetSumOfPairsInArray
{
static int getPairsCount(int[] arr, int n, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int pairs=0;
        for (int i=0; i<n; i++)
        {
              
            if (map.containsKey(target - arr[i]))
            {
                pairs += map.get(target - arr[i]);
            System.out.println("..."+(target - arr[i]));
                for (int j=1; j<=map.get(target - arr[i]); j++)
                    System.out.print("(" + (target-arr[i]) + "," + arr[i] + ") ");
            }
          
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
          
        }
        return pairs;
    }

    public static void main (String [] args)
    {
        int[] input = {1, 6, 3, 2, 5, 5, 7, 8, 4, 8, 2, 5, 9, 9, 1,12,-2,18,-8};
        int target = 10;
       System.out.println(getPairsCount(input , input.length , target));
       // removeDuplicates(input,target);
    }
}
