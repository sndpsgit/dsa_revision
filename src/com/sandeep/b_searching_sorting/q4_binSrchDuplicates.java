package com.sandeep.b_searching_sorting;

import java.util.Arrays;
import java.util.Scanner;

/* There duplicates value of target may present so, give starting and ending index of that target in
    Sorted Array
 */
public class q4_binSrchDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter arr - ");
        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);
        // System.out.println("Array = "+ Arrays.toString(arr)); //testing

        System.out.print("Enter target - ");
        int tgt = com.sandeep.a0_lib.dsaLib.readInt(in);

        int[] pos = {-1,-1};

        int i = com.sandeep.b_searching_sorting.q3_binSrch.binarySrch(arr, tgt);
        // System.out.println("i is = " + i); //testing

        {
            int s = i, e = i;
            while (s > 0 && arr[s-1] == tgt) s--;
            while (e < arr.length-1 && arr[e+1] == tgt) e++;
            pos[0] = s;
            pos[1] = e;
        }

        System.out.println("Target positions : " + Arrays.toString(pos));
    }
}

// Algo - Binary Search. Complexity : O(logN)