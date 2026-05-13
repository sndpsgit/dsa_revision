package com.sandeep.b_searching_sorting;

/*  Array given. Simply Sort it on basis of Algo */

import java.util.Arrays;
import java.util.Scanner;

public class q6_bubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arr - ");
        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);

        System.out.println("Sorted : " + Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        int l = arr.length;

        for (int n = l-1; n >= 0; n--){
            for (int i = 0; i < n; i++){ //bit tricky to judge- how much time to loop- take example for clarity
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}

/*  Algo - Bubble Sort -- > Traverse the array, take bigger one to end : do these for N-1 times
*   Complexity : Outer Loop (for placing bigger ones to end) * Inner Loop (Compares each other)
*               O(N ^ 2) */
