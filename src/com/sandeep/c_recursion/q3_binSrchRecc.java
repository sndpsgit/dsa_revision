package com.sandeep.c_recursion;

/*  Perform Binary Search using Recursion */
import java.util.Scanner;

public class q3_binSrchRecc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arr - ");
        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);

        System.out.print("Enter tgt - ");
        int tgt = com.sandeep.a0_lib.dsaLib.readInt(in);

        System.out.println("Target index : " + binSrchRec(0, arr.length-1, arr, tgt));
    }

    public static int binSrchRec(int s, int e, int[] arr, int tgt){
        if (s > e) return -1;

        int m = (s+e)/2;

        if (arr[m] < tgt) return binSrchRec(m+1, e, arr, tgt);
        else if (tgt < arr[m]) return binSrchRec(s, m-1, arr, tgt);
        else return m;
    }
    /*  Here i just transformed While Loop -----> Rec fxn
    *   Rec Fxn (is like loop) it has
    *           - stopping condition
    *           - condition when ans found (can be return)
    *           - it can be used to join ans from sub calls to upper call (here return statement
    *   Simple */

}


