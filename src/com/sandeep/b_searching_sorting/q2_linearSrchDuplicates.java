package com.sandeep.b_searching_sorting;
/*  User Enters Array (Simple Linear & duplicates possible) & target
*   Find indexes of target - return Array*/

import java.util.*;
import com.sandeep.a0_lib.dsaLib;

public class q2_linearSrchDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter arr - ");
        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);
        int l = arr.length;

        System.out.print("Enter tgt - ");
        int tgt = com.sandeep.a0_lib.dsaLib.readInt(in);

        ArrayList<Integer> pos = new ArrayList<>();

        for (int i = 0; i < l; i++){
            if (arr[i] == tgt) pos.add(i);
        }

        if (pos.size() == 0) System.out.println("Tgt not present");
        else System.out.println("Target Indexes : " + pos);
    }
}

/*  Algo- Linear Traversal. Complexity : O(N) */
