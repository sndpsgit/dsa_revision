package com.sandeep.b_searching_sorting;

/*  Array given. Simply Sort it on basis of Algo */

import java.util.Arrays;
import java.util.Scanner;

public class q8_insertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arr - ");
        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);

        System.out.println("Sorted : " + Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr){
        int l = arr.length;

        for (int n = 1; n < l; n++){ //n- is index of Element to insert
            int i = n; //handovering index of Element i to insert - so n won't affected.

            while (i > 0 && arr[i-1] > arr[i]){
                //swap
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            }
        }

        return arr;
    }
}

/*  Algo - it sorts array by inserting one by one element in preceed (sub-sorted) array.
    Hence, Outer Array- for each N-1 Elements, Inner array checks over sub arrays and insert
    Complexity - O(N*N) */

