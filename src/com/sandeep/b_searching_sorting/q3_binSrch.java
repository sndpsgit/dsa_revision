package com.sandeep.b_searching_sorting;

/* Take Numbers from user in Ascending Order (!!condition!!), & take target.
  - Search using Binary Search (logN- complexity)
  - Print Floor n Ceil for the Target

  Learning : - Complexity of Binary Search (too good i.e. logN, but Array should be SORTED)
             - How bin-search ends- by finding floor n ceil
*/

import java.util.*;

public class q3_binSrch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Nums in sorted order - ");

        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);

        // Now we have arr - the sorted array, now get the target and find the index
        System.out.print("Please enter the target to find - ");
        int target = com.sandeep.a0_lib.dsaLib.readInt(in);

        int s = 0, e = arr.length - 1;
        int i = -1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (target > arr[m]) s = m + 1;
            else if (target < arr[m]) e = m - 1;
            else {
                i = m;
                break;
            }
        }

        System.out.println("Index of Target : " + i);
    }

    /* There method returns Index of target in Asc-sorted-Array using [BIN-Search-Algo] O(logN)
    *   It will return -1 if target not founds */
    public static int binarySrch(int[] arr, int tgt){
        int s = 0, e = arr.length-1;

        while (s <= e){

            int m = (s+e)/2;

            if (tgt > arr[m]) s = m + 1;
            else if (tgt < arr[m]) e = m-1;

            else return m;
        }
        return -1;
    }
}

/*  Algo - Binary Search. Complexity : O(logN) */
    
    
