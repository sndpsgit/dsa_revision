package com.sandeep.c_recursion;

import java.util.Arrays;
import java.util.Scanner;

public class q4_mergeTwoSortArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arr1 - ");
        int[] arr1 = com.sandeep.a0_lib.dsaLib.readArray(in);

        System.out.print("Enter arr2 - ");
        int[] arr2 = com.sandeep.a0_lib.dsaLib.readArray(in);

        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int l1 = arr1.length, l2 = arr2.length;
        int[] arr = new int[l1 + l2];

        int p1 = 0, p2 = 0;
        int i = 0;

        while (p1 < l1 && p2 < l2){
            if (arr1[p1] < arr2[p2]) {
                arr[i++] = arr1[p1++];
            } else {
                arr[i++] = arr2[p2++];
            }
        }

        if (p1 >= l1) { //means p1 exhausted, copy arr2 remaining elements
            for (int j = p2; j < l2; j++) arr[i++] = arr2[j];
        } else { //means p2 exhausted, copy arr1 remaining elements
            for (int j = p1; j < l1; j++) arr[i++] = arr1[j];
        }

        return arr;
    }
}
