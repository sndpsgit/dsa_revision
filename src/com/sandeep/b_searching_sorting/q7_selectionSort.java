package com.sandeep.b_searching_sorting;

/*  Array given. Simply Sort it on basis of Algo */

import java.util.Arrays;
import java.util.Scanner;

public class q7_selectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arr - ");
        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);

        System.out.println("Sorted : " + Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){
        int l = arr.length;

        for (int n = l-1; n > 0; n--){
            int indexOfBigger = 0;

            for (int i = 1; i <= n; i++){ //bit tricky to judge- how much time to loop- take example for clarity
                if (arr[indexOfBigger] < arr[i]) indexOfBigger = i;
            }

            //swap
            int temp = arr[n];
            arr[n] = arr[indexOfBigger];
            arr[indexOfBigger] = temp;
        }
        return arr;
    }
}

/*  Algo - it sorts array by selecting max among Sub-arrays & placing it to it's right place from behing.
    Hence, Outer Array- for each N-1 Elements, Inner array checks bigger over sub arrays.
    Complexity - O(N*N) */