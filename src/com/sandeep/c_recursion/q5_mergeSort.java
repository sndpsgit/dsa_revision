package com.sandeep.c_recursion;

import java.util.Arrays;
import java.util.Scanner;

public class q5_mergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arr - ");
        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);

        System.out.println("Sorted Array : " + Arrays.toString(mergeSort(0, arr.length-1, arr)));
    }

    public static int[] mergeSort(int s, int e, int[] arr){
        if (s == e) return new int[]{arr[s]};

        int m = (s+e)/2;

        int[] arr1 = mergeSort(s, m, arr);
        int[] arr2 = mergeSort(m+1, e, arr);

        return merge(arr1, arr2);
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int l1 = arr1.length, l2 = arr2.length;
        int[] arr = new int[l1 + l2];

        int p1 = 0, p2 = 0;
        int i = 0;

        while (p1 < l1 && p2 < l2){
            if (arr1[p1] < arr2[p2]) arr[i++] = arr1[p1++];
            else arr[i++] = arr2[p2++];
        }

        if (p1 >= l1) { //means p1 exhausted, copy arr2 remaining elements
            for (int j = p2; j < l2; j++) arr[i++] = arr2[j];
        } else { //means p2 exhausted, copy arr1 remaining elements
            for (int j = p1; j < l1; j++) arr[i++] = arr1[j];
        }

        return arr;
    }
}
