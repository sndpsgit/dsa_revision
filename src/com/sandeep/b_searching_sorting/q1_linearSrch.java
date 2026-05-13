package com.sandeep.b_searching_sorting;

/* - Take Total Nos from user (size of array)
   - Take input of numbers (to the array)
   - Take num to search (target)
   - Search by traversing the Array
   Note- No duplicate values
*/

import java.util.*;

public class q1_linearSrch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Array - ");
        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);

        System.out.print("Please enter number to find - ");
        int target = com.sandeep.a0_lib.dsaLib.readInt(in);

        int indexT = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) indexT = i;
        }
        System.out.println("Target index : "+ indexT);
    }
}

/*  Algo- Linear Searching. Complexity : O(N)*/
