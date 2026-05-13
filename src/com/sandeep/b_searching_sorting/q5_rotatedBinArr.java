package com.sandeep.b_searching_sorting;
/* Ascending-Sorted-array is there and its rotated, Find the target index in it- no duplicates there */

import java.util.Scanner;

public class q5_rotatedBinArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array - ");
        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);
        int l = arr.length;

        System.out.print("Enter Target - ");
        int tgt = com.sandeep.a0_lib.dsaLib.readInt(in);

        int p = getPivot(arr); //[0-->p] & [p+1 --> l-1] : two Sorted arrays
//        System.out.println(p); //testing

        int indx1 = binSearch(arr, tgt, 0, p); //finding tgt in 1st arr
        int indx2 = binSearch(arr, tgt, p+1, l-1);

//        System.out.println(indx1 + "\n" + indx2); //testing

        int indx = (indx1 == -1) ? indx2 : indx1;
        System.out.println("Index of Target : " + indx);
    }

    /* These fuction return pivot of Rotated-Sorted-Array */
    public static int getPivot(int[] arr){
        if (arr.length == -1) return -1;
        int s = 0, e = arr.length-1;
        int m = (s + e)/2;

        while (s != m){
            if (arr[s] < arr[m]) s = m;
            else if (arr[s] > arr[m]) e = m;

            m = (s+e)/2;
        }
        return m;
    }

    public static int binSearch(int[] arr, int tgt, int s, int e){
        while (s <= e){
            int m = (s+e)/2;

            if (arr[m] < tgt) s = m+1;
            else if (tgt < arr[m]) e = m-1;
            else return m;
        }
        return -1;
    }
}

// Algo- It uses 2 times binary search. Complexity - O(logN)