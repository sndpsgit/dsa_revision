package com.sandeep.c_recursion;

/*  Take N from user - the Nth element of fib seried to calculate.
* */

import java.util.*;

public class q1_fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N (The Nth Element of Fib) you want - ");
        int n = com.sandeep.a0_lib.dsaLib.readInt(in);

        System.out.println("Nth Element of Fib : " + recFib(n));
    }

    public static int recFib(int n){
        if(n <= 1) return n;

        return recFib(n-1) + recFib(n-2);
    }
}

/*  Algo- here I used recursion algo & each fx(n) splits for 2 fxns- and hence more 2... so on
*   For N- it goes upto N-1, N-2, N-3,..,1. So Total N Steps
*   Total fxns called are 2 + 2^2 + 2^3 + .......+ 2^(N-1) which gonna equal to roughly 2^N fxn calls
*   Complexity : Hence, O(2^N) */

